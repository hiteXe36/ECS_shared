import java.util.*;

public class NadelbaumMitStamm{

	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die gew�nschte H�he ein: ");
		int hoehe = scanner.nextInt();
		int leerzeichen = hoehe - 1;
		int anzahlZeichen = 1;
		
		// Baum - Aeu�ereschleife 
		for(int i = 0; i < hoehe; i++)
		{
			//Schleife f�r den Hintergrund
			for(int j = 0; j < hoehe - 1 - i; j++)
			{
				System.out.print(".");
				System.out.println("HalloWelt");
			}
			//Schleife f�r das Baumdetail
			for(int k = 0; k < anzahlZeichen; k++)
			{
				System.out.print("*");
			}
			//nachjedem Schleifendurchgang um 2 zeichen erhoehen
			anzahlZeichen +=2;
			
			//rest hintergrund nach dem Baumdetail 
			for(int l = 0; l < hoehe - 1 - i; l++)
			{
				System.out.print(".");
			}
				// n�chste Zeile 
				System.out.println();
				
		}
		//Baumstamm
		for(int i = 0; i < hoehe / 3; i++)
		{
			for(int j = 0; j < hoehe - 1; j++)
		{
			System.out.print(".");
		}
			System.out.println("|");
			for(int j = 0; j < hoehe - 1; j++)
		{
			System.out.print(".");
		}
		}

		scanner.close();
	}


}