import java.util.*;

public class Fase2App {

	public static void main(String[] args) {
		
		// Crear 6 variables tipus String amb les ciutats
		String ciutat1 = "Barcelona",
				ciutat2 = "Madrid",
				ciutat3 = "Valencia",
				ciutat4 = "Malaga",
				ciutat5 = "Cadis",
				ciutat6 = "Santander";
		
		// Passar els Strings a Array
		String[] arrayCiutats = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6};
		
		// Ordenar l'Array
		Arrays.sort(arrayCiutats);
		
		// Imprimir en consola els noms ordenats de les 6 ciutats 
		System.out.println("Les 6 ciutats ordernades alfabèticament:\n" + String.join(", ", arrayCiutats));
		
		//Les 6 ciutats ordernades alfabèticament:
		//Barcelona, Cadis, Madrid, Malaga, Santander, Valencia
		
	}
	
}