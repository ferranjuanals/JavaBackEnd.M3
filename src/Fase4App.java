
public class Fase4App {
	
	public static void main(String[] args) {
		
		// Crear Array amb 6 Strings amb les ciutats
		String[] arrayCiutats = {"Barcelona", "Madrid", "Valencia", "Malaga", "Cadis", "Santander"};
		
		// Crear Array bidimensional amb tants Arrays com ciutats hi ha
		char[][] ciutats = new char[arrayCiutats.length][];
		
		
		// For loop iterant per la primera dimensió de l'Array ciutats
		for(int i=0; i<ciutats.length; i++) {
			
			ciutats[i] = new char[arrayCiutats[i].length()];	// La mida de cada Array és la llargada de cada String
			
			int z=arrayCiutats[i].length() - 1;					// Iterador per retrocedir en els char de cada String de arrayCiutats
			
			
			// For loop iterant per la segona dimensió de l'Array ciutats
			for(int j=0; j<ciutats[i].length; j++) {
				
				char[] city = arrayCiutats[i].toCharArray();	// Crear Array amb els char de cada String de arrayCiutats
				
				ciutats[i][j] = city[z];						// Guardar el valor en decrement de city en la posició en increment de ciutats
				
				z--;											// Retrocedir una posició en els char de city
			}
			
			// Imprimir en consola els nous Arrays amb els noms invertis
			System.out.println("El nom invertit de " + arrayCiutats[i] + " és: " + new String(ciutats[i]));
		}
		
	}

}
