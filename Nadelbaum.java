import java.util.*;

public class Nadelbaum{

	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die gewünschte Höhe ein: ");
		int hoehe = scanner.nextInt();
		int leerzeichen = hoehe - 1;
		int anzahlZeichen = 1;
		
		// Baum - Aeußereschleife 
		for(int i = 0; i < hoehe; i++)
		{
			//Schleife für den Hintergrund
			for(int j = 0; j < hoehe - 1 - i; j++)
			{
				System.out.print(".");
			}
			//Schleife für das Baumdetail
			for(int k = 0; k < anzahlZeichen; k++)
			{
				System.out.print("*");
				System.out.println("HalloWelt");
			}
			//nachjedem Schleifendurchgang um 2 zeichen erhoehen
			anzahlZeichen +=2;
			
			//rest hintergrund nach dem Baumdetail 
			for(int l = 0; l < hoehe - 1 - i; l++)
			{
				System.out.print(".");
			}
				// nächste Zeile 
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