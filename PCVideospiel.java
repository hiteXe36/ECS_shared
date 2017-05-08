
public class PCVideospiel extends AbstractVideospiel
{

	public PCVideospiel(String titel, String kommentar, String system)
	{
		super(titel, kommentar, system);
	}
    
    /**
     * 
     * @require tage > 0
     * @see AbstractVideospiel#getPreisnachTagen(int)
     * Einschubmethode
     */
    @Override
	public int getPreisnachTagen(int miettage)
	{
    	assert miettage > 0 : "Vorbedingung verletzt: tage > 0";
    	int preisNachTagen = 0;
    	miettage = miettage - 7;
    	if(miettage <=0)
    	{
    		return preisNachTagen;
    	}
    	else 
    	{
    		int gebuehrJeAngefangeneFuenfTage = 500;
    		int anzahl = 1;
    		while(miettage > 4)
    		{
    			anzahl++;
    			miettage = miettage-5;
    		}
    		
    		preisNachTagen = anzahl * gebuehrJeAngefangeneFuenfTage; 
    		return preisNachTagen;
    	}
	}
    
    /**
     * Gibt zurueck, ob es sich bei dem Medium
     * um ein PCVideospiel oder Konsolenvideospiel handelt
     * @return bezeichnung
     */
    @Override
    public String getMedienBezeichnung()
    {
        return "PC Videospiel";
    }

}
