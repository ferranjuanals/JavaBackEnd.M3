
// Crear Array amb 6 Strings amb les ciutats
var arrayCiutats = ["Barcelona", "Madrid", "Valencia", "Malaga", "Cadis", "Santander"];
		
// Crear Array de tanta llargada com ciutats hi ha
var ciutats = new Array(arrayCiutats.length);
var text = "";


// For loop iterant per la primera dimensió de l'Array ciutats
for(var i=0; i<ciutats.length; i++) {
    
    ciutats[i] = new Array(arrayCiutats[i].length);	// La mida de cada Array és la llargada de cada String
    
    var z = arrayCiutats[i].length - 1;				// Iterador per retrocedir en els char de cada String de arrayCiutats
    
    
    // For loop iterant per la segona dimensió de l'Array ciutats
    for(var j=0; j<ciutats[i].length; j++) {
        
        var city = arrayCiutats[i].split("");	// Crear Array amb els char de cada String de arrayCiutats
        
        ciutats[i][j] = city[z];				// Guardar el valor en decrement de city en la posició en increment de ciutats
        
        z--;									// Retrocedir una posició en els char de city
    }
    
    // Guardar els nous Arrays amb els noms invertits
    text += "El nom invertit de " + arrayCiutats[i] + " es: " + ciutats[i].join("") + "<br>";
}
// Imprimir els nous Arrays amb els noms invertis
document.getElementById("fase4").innerHTML = text;
