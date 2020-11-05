import java.util.*;

public class Fase1App {

	public static void main(String[] args) {
		
		// Crear 6 variables tipus String
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		
		// Crear e inicialitzar Scanner
		Scanner newcity = new Scanner(System.in);
		
		// Imprimir en consola la demanda
		System.out.println("Introdueix el nom de 6 ciutats:");
		
		// Guardar cada ciutat introduïda en una variable String
		ciutat1 = newcity.nextLine();	// Barcelona
		ciutat2 = newcity.nextLine();	// Madrid	
		ciutat3 = newcity.nextLine();	// Valencia
		ciutat4 = newcity.nextLine();	// Malaga
		ciutat5 = newcity.nextLine();	// Cadis
		ciutat6 = newcity.nextLine();	// Santander
		
		// Tancar Scanner
		newcity.close();
		
		// Imprimir en consola el nom de les 6 ciutats
		System.out.println("Les 6 ciutats introduïdes són:\n" + 
			String.join(", ", ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6));
		
		//Les 6 ciutats introduïdes són:
		//Barcelona, Madrid, Valencia, Malaga, Cadis, Santander

		
		
		
		

/*		//Versió alternativa:
		
		// Crear e inicialitzar un Array de 6 Strings
		String [] ciutats = new String[6];
		// Crear e inicialitzar Scanner
		Scanner newcity = new Scanner(System.in);
		
		// Guardar cada ciutat introduïda en el següent String de l'Array amb un loop
		for(int i = 0; i < 6; i++){
			System.out.println("Introdueix el nom d'una ciutat:");
			ciutats[i] = newcity.nextLine();
		}
		
		// Imprimir en consola el nom de les 6 ciutats
		System.out.println("Les 6 ciutats introduïdes són:\n" + String.join(", ", ciutats));
		
		//Les 6 ciutats introduïdes són:
		//Barcelona, Madrid, Valencia, Malaga, Cadis, Santander

*/
		
	}

}
