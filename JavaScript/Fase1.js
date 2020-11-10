
// Crear 6 variables tipus String
var ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
    
function myFunction() {
    // Guardar cada ciutat introduida en una variable String
    ciutat1 = document.getElementById("city1").value;	// Barcelona
    ciutat2 = document.getElementById("city2").value;	// Madrid	
    ciutat3 = document.getElementById("city3").value;	// Valencia
    ciutat4 = document.getElementById("city4").value;	// Malaga
    ciutat5 = document.getElementById("city5").value;	// Cadis
	ciutat6 = document.getElementById("city6").value;	// Santander
	
	var ciutats = [ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6];
	
    // Imprimir el nom de les 6 ciutats
    document.getElementById("fase1").innerHTML = "Les 6 ciutats introduides son: " + ciutats;
}
