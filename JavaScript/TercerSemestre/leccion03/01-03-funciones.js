miFuncion(8, 2); //El concepto de hoisting mueve las funciones al inicio 
//del código para que podamos hacer llamados a la misma antes de su definición

//Definicion de una función
function miFuncion(a, b) {
    console.log("Sumamos: " + (a + b));
}

//Llamada a una función
miFuncion(2, 3);

//Uso de la palabra reservada return
function miFuncion2(a, b) {
    return a + b;
}

let resultado = miFuncion2(2, 9);
console.log(resultado);

//Funciones de tipo expresión o anónima
let x = function (a, b) {return a + b}; //necesita cierre con punto y coma
resultado = x(5,6) //al llamarla se pone la variable y paréntesis
console.log(resultado);