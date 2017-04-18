import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;
//import java.util.Map;

import org.junit.Test;
//Die in den TestfÃ¤llen verwendeten assert-Anweisungen werden Ã¼ber
//einen sogenannten statischen Import bereitgestellt, zum Beispiel:
//import static org.junit.Assert.assertEquals;
//
// Um die Annotation @Test verwenden zu kÃ¶nnen, muss diese importiert
// werden: import org.junit.Test;

/**
 * Diese Klasse testet die Implementation des VerleihService.
 */
public class VerleihServiceImplTest
{
    private Kunde _homer;
    private Kunde _roger;
    private Kunde _brian;

    
    private KundenstammService _kundenstamm = new KundenstammServiceImpl(new ArrayList<Kunde>());
	private MedienbestandService _medienbestand = new MedienbestandServiceImpl(new ArrayList<Medium>());
	
	private Medium medium = new CD("Sound of Silence","TEST", "Disturbed", 293);
	private Medium medium2 = new DVD("Braveheart", "Sehr gut", "Mel Gibson", 244);
	private Medium medium3 = new DVD("Rogue One: A Star Wars Story", "richtig gut!", "Mel Gibson", 234);

    private Medium _abbey;
    private Medium _bad;
    private Medium _shape;
   
    private VerleihService _verleihService = new VerleihServiceImpl(_kundenstamm, _medienbestand, new ArrayList<Verleihkarte>());
    
    private Datum _datum = Datum.heute();

    
    public VerleihServiceImplTest()
    {
        setUpKunden();
        setUpMedien();
        setUpVerleihService();
    }

    @Test
    // Alle Testmethoden erhalten die Annotation @Test. DafÃ¼r mÃ¼ssen diese nicht
    // mehr mit test im Namen beginnen. Dies wird jedoch aus Gewohnheit
    // oft weiter verwendet.
    public void testKundenstamm()
    {
        assertTrue(_verleihService.kundeImBestand(_homer));
        assertTrue(_verleihService.kundeImBestand(_roger));
        assertTrue(_verleihService.kundeImBestand(_brian));

        Kunde marge = new Kunde(Kundennummer.get(123459), "Marge", "Bouvier");
        assertFalse(_verleihService.kundeImBestand(marge));
    }

    @Test
    public void testAmAnfangIstNichtsVerliehen()
    {
        assertTrue(_verleihService.sindAlleNichtVerliehen(_medienbestand
                .getMedien()));
        for (Kunde kunde : _kundenstamm.getKunden())
        {
            assertTrue(_verleihService.istVerleihenMoeglich(kunde,
                    _medienbestand.getMedien()));
        }
    }

    @Test
    public void testNochEinTestFall1()
    {
    	List<Medium> medienListe = _medienbestand.getMedien();
    	_medienbestand.fuegeMediumEin(medium);
    	_medienbestand.fuegeMediumEin(medium2);
    	_medienbestand.fuegeMediumEin(medium3);  	
        _verleihService.verleiheAn(_homer, medienListe, _datum);
        
    	assertEquals(3, _verleihService.getVerleihkarten().size());
    }

    @Test
    public void testNochEinTestFall2()
    {	
    	List<Medium> medienListe = _medienbestand.getMedien();
    	_medienbestand.fuegeMediumEin(medium);
    	_medienbestand.fuegeMediumEin(medium2);
    	_medienbestand.fuegeMediumEin(medium3);
    	    	
        _verleihService.verleiheAn(_homer, medienListe, _datum);
        _verleihService.nimmZurueck(medienListe, _datum);
        assertEquals(0, _verleihService.getVerleihkarten().size());		
    }

    @Test
    public void testNochEinTestFall3()
    {
    }

    private void setUpKunden()
    {
        _homer = new Kunde(Kundennummer.get(123456), "Homer", "Simpson");
        _roger = new Kunde(Kundennummer.get(123457), "Roger", "Smith");
        _brian = new Kunde(Kundennummer.get(123458), "Brian", "Griffin");

        List<Kunde> testkunden = new ArrayList<Kunde>();
        testkunden.add(_homer);
        testkunden.add(_roger);
        testkunden.add(_brian);
        _kundenstamm = new KundenstammServiceImpl(testkunden);
    }

    private void setUpMedien()
    {
        _abbey = new CD("Abbey Road", "Meisterwerk", "Beatles", 44);
        _bad = new CD("Bad", "not as bad as the title might suggest",
                "Michael Jackson", 48);
        _shape = new CD("The Colour And The Shape", "bestes Album der Gruppe",
                "Foo Fighters", 46);

        List<Medium> _medien = new ArrayList<Medium>();
        _medien.add(_abbey);
        _medien.add(_bad);
        _medien.add(_shape);
        _medienbestand = new MedienbestandServiceImpl(_medien);
    }

    private void setUpVerleihService()
    {
        _verleihService = new VerleihServiceImpl(_kundenstamm, _medienbestand,
                new ArrayList<Verleihkarte>());
    }
}
