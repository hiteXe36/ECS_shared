/**
 * {@link Videospiel} ist ein {@link Medium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team, PR2-Team, PR2-Team
 * @version SoSe 2017
 */
abstract class AbstractVideospiel implements Medium
{
    /**
     * Das System, auf dem das Spiel lauffähig ist
     */
    private String _system;
    private String _titel;
    private String _kommentar;
    private final int _basispreis;

    /**
     * Initialisiert ein neues Videospiel.
     * 
     * @param titel Der Titel des Spiels
     * @param kommentar Ein Kommentar zum Spiel
     * @param system Die Bezeichnung des System
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public AbstractVideospiel(String titel, String kommentar, String system)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert system != null : "Vorbedingung verletzt: system != null";
        _titel = titel;
        _kommentar = kommentar;
        _system = system;
        _basispreis = 200;
    }
    /**
     * Gibt zurueck, ob es sich bei dem Medium
     * um ein PCVideospiel oder Konsolenvideospiel handelt
     * @return bezeichnung
     */
    public abstract String getMedienBezeichnung();

    /**
     * Gibt das System zurück, auf dem das Spiel lauffähig ist.
     * 
     * @return Das System, auf dem das Spiel ausgeführt werden kann.
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        return _system;
    }

    public String toString()
    {
        return getFormatiertenString();
    }

    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\nSystem: "+_system + "    " + "Titel: " + _titel
                + "\n" + "    " + "Kommentar: " + _kommentar + "\n" + "    ";
    }
    /**
     * Berechnet die Mietgebühr in Eurocent für eine angebene Mietdauer in Tagen
     * 
     * @param mietTage Die Anzahl der Ausleihtage eines Mediums
     * @return Die Mietgebühr in Eurocent als Geldbetrag
     * @require mietTage > 0
     * @ensure result != null
     */
    public Geldbetrag berechneMietgebuehr(int miettage)
    {
    	Geldbetrag betrag = Geldbetrag.get(_basispreis + getPreisnachTagen(miettage));
    	return betrag;
    	
    }

	public String getTitel()
	{
		return _titel;
	}

	public void setTitel(String titel)
	{
		_titel = titel;
	}

	public String getKommentar()
	{
		return _kommentar;
	}

	public void setKommentar(String kommentar)
	{
		_kommentar = kommentar;
	}
	
	/**
	 * @return Preis nach Tagen
     * @require tage > 0
     * Einschubmethode
     */
   //Schablonenmethode
	public abstract int getPreisnachTagen(int tage);
	

}
