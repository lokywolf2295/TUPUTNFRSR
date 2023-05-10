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