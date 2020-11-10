
// Crear Array amb 6 Strings amb les ciutats
arrayCiutats = ["Barcelona", "Madrid", "Valencia", "Malaga", "Cadis", "Santander"];
		
// Cambiar la lletra 'a' dels noms per '4' amb un loop for
for(var i=0; i<6; i++) {
    arrayCiutats[i] = arrayCiutats[i].replace(/a/g, "4");
}

// Ordenar l'Array
arrayCiutats.sort();

// Imprimir en consola els noms canviats i ordenats de les 6 ciutats
document.getElementById("fase3").innerHTML = "Les 6 ciutats amb el nom canviat ordernades alfabeticament: " + arrayCiutats;
