/**
 * {@link Videospiel} ist ein {@link Medium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team, PR2-Team, PR2-Team
 * @version SoSe 2017
 */
class Videospiel implements Medium {
	/**
	 * Das System, auf dem das Spiel lauffähig ist
	 */
	private String _system;

	/**
	 * Ein Kommentar zum Medium
	 */
	private String _kommentar;

	/**
	 * Der Titel des Mediums
	 */
	private String _titel;

	/**
	 * Initialisiert ein neues Videospiel.
	 * 
	 * @param titel
	 *            Der Titel des Spiels
	 * @param kommentar
	 *            Ein Kommentar zum Spiel
	 * @param system
	 *            Die Bezeichnung des System
	 * 
	 * @require titel != null
	 * @require kommentar != null
	 * @require system != null
	 * 
	 * @ensure getTitel() == titel
	 * @ensure getKommentar() == kommentar
	 * @ensure getSystem() == system
	 */
	public Videospiel(String titel, String kommentar, String system) {
		assert titel != null : "Vorbedingung verletzt: titel != null";
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		assert system != null : "Vorbedingung verletzt: system != null";
		_titel = titel;
		_kommentar = kommentar;
		_system = system;
	}

	@Override
	public String getMedienBezeichnung() {
		return "Videospiel";
	}

	/**
	 * Gibt das System zurück, auf dem das Spiel lauffähig ist.
	 * 
	 * @return Das System, auf dem das Spiel ausgeführt werden kann.
	 * 
	 * @ensure result != null
	 */
	public String getSystem() {
		return _system;
	}

	@Override
	public String getKommentar() {
		return _kommentar;
	}

	@Override
	public String getTitel() {
		return _titel;
	}

}
