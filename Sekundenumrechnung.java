package aufgabenblatt_02;
import java.util.*;


public class Sekundenumrechnung {

	//Zustandsfelder
	public int tage;
	public int stunden;
	public int minuten;
	public int sekunden;
	public int rest;
	public int anfangswert;

	//Konstruktor
	public Sekundenumrechnung()
	{

	}

	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie einen beliebigen Sekundenwert ungleich Null ein: ");

		int eingabe = scanner.nextInt();
		int tage = eingabe / 86000;
		int rest = eingabe % 86000;
		int stunden = rest / 3600;
		rest = rest % 3600;
		int minuten = rest / 60;
		int sekunden = rest % 60;

		System.out.println("Ihre Eingabe entspricht: " +tage +" Tage(n) " +stunden +":" +minuten +":" +sekunden);

		scanner.close();
	}

}
