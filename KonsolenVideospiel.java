
public class KonsolenVideospiel extends AbstractVideospiel
{
		
	public KonsolenVideospiel(String titel, String kommentar, String system)
	{
		super(titel, kommentar, system);
	}
	
    /**
     * Gibt zurueck, ob es sich bei dem Medium
     * um ein PCVideospiel oder Konsolenvideospiel handelt
     * @return bezeichnung
     */
    @Override
    public String getMedienBezeichnung()
    {
        return "Konsolen Videospiel";
    }
    /**
     * @require miettage > 0
     * @see AbstractVideospiel#getPreisnachTagen(int)
     * Einschubmethode
     */
    @Override
	public int getPreisnachTagen(int miettage)
	{
    	assert miettage > 0 : "Vorbedingung verletzt: tage > 0";
    	int gebuehrJeDreiTage = 700 ;
		return miettage / 3 * gebuehrJeDreiTage;
	}

}
