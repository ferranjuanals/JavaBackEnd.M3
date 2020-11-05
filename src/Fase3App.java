import java.util.*;

public class Fase3App {
	
	public static void main(String[] args) {
		
		// Crear Array amb 6 Strings amb les ciutats
		String[] arrayCiutats = {"Barcelona", "Madrid", "Valencia", "Malaga", "Cadis", "Santander"};
		
		// Cambiar la lletra 'a' dels noms per '4' amb un loop for
		for(int i=0; i<6; i++) {
			arrayCiutats[i] = arrayCiutats[i].replace('a', '4');
		}
		
		// Ordenar l'Array
		Arrays.sort(arrayCiutats);
		
		// Imprimir en consola els noms canviats i ordenats de les 6 ciutats
		System.out.println("Les 6 ciutats amb el nom canviat ordernades alfabèticament:\n" + String.join(", ", arrayCiutats));
		
//		Les 6 ciutats amb el nom canviat ordernades alfabèticament:
//		B4rcelon4, C4dis, M4drid, M4l4g4, S4nt4nder, V4lenci4

	}

}
