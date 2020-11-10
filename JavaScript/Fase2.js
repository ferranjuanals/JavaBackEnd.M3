
// Crear 6 variables tipus String amb les ciutats
var ciutat1 = "Barcelona",
    ciutat2 = "Madrid",
    ciutat3 = "Valencia",
    ciutat4 = "Malaga",
    ciutat5 = "Cadis",
    ciutat6 = "Santander";

// Passar els Strings a Array
var arrayCiutats = [ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6];

// Ordenar l'Array
arrayCiutats.sort();

// Imprimir en consola els noms ordenats de les 6 ciutats 
document.getElementById("fase2").innerHTML = "Les 6 ciutats ordernades alfabeticament: " + arrayCiutats;
