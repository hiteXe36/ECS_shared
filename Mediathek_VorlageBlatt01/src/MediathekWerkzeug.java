import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Das Gesamtwerkzeug der Mediathek, das die anderen Werkzeuge zusammenfasst.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2017
 */
class MediathekWerkzeug
{
    /**
     * Die UI der Mediathek.
     */
    private MediathekUI _mediathekUI;

    /**
     * Der Kundenstamm.
     */
    private final KundenstammService _kundenstamm;

    /**
     * Der Medienbestand.
     */
    private final MedienbestandService _medienbestand;

    /**
     * Der Service zum Verleihen und Zurücknehmen von Medien.
     */
    private final VerleihService _verleihService;

    /**
     * Das AusleihWerkzeug.
     */
    private final AusleihWerkzeug _ausleihWerkzeug;

    /**
     * Initialisiert ein neues MediathekWerkzeug.
     * 
     * @param medienbestand der Medienbestand
     * @param kundenstamm die Kunden
     * @param verleihService Service um Medien zu verleihen.
     * 
     * @require medienbestand != null
     * @require kundenstamm != null
     * @require verleihService != null
     */
    public MediathekWerkzeug(MedienbestandService medienbestand,
            KundenstammService kundenstamm, VerleihService verleihService)
    {
        assert medienbestand != null : "Vorbedingung verletzt: medienbestand != null";
        assert kundenstamm != null : "Vorbedingung verletzt: kundenstamm != null";
        assert verleihService != null : "Vorbedingung verletzt: verleihService != null";

        _medienbestand = medienbestand;
        _kundenstamm = kundenstamm;
        _verleihService = verleihService;

        // Erzeuge Subwerkzeuge
        _ausleihWerkzeug = new AusleihWerkzeug(_medienbestand, _kundenstamm,
                _verleihService);

        // Erzeuge UI für dieses Werkzeug
        _mediathekUI = new MediathekUI(_ausleihWerkzeug.getUIPanel());

        registriereUIAktionen();
    }

    /**
     * Registriert die Aktionen an der UI, die bei bestimmten Benutzeraktionen
     * ausgeführt werden sollen.
     */
    private void registriereUIAktionen()
    {
        registriereZeigeAusleiheAktion();
    }

    /**
     * Registriert die Aktion, die ausgeführt wird, um die Ausleihe anzuzeigen.
     */
    private void registriereZeigeAusleiheAktion()
    {
        _mediathekUI.getAusleiheButton().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                _mediathekUI.zeigeAusleihe();
            }
        });
    }

    /**
     * Zeigt das Mediathek-Hauptfenster an.
     */
    public void zeigeFenster()
    {
        _mediathekUI.zeigeFenster();
    }
}
