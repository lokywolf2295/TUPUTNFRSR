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

//Funciones de tipo self-invoking
(function (a, b) { //este tipo de funciones no puede ser llamada mas de una vez ya que no fué asignada a una variable
    console.log('Ejecutando la función: ' + (a + b));
})(3, 4); //necesita cierre con punto y coma

console.log(typeof miFuncion); //imprime el tipo de dato de la variable

//Funciones como objetos
function miFuncion3(a, b) {
    console.log(arguments); //imprime la cantidad de argumentos que recibe la función
}//las funciones son objetos por eso podemos utilizar el punto para acceder a sus propiedades
// como por ejemplo arguments.length que reemplaza el codigo anterior

miFuncion3(2, 3, 4, 5, 6, 7, 8, 9, 10);

//toString() convierte un objeto a string
var miFuncionTexto = miFuncion.toString();
console.log(miFuncionTexto);

//Funciones tipo flecha (introducidad en Echma 6/ es6)
const sumarFuncionTipoFlecha = (a, b) => a + b; //no necesita return ni llaves
resultado = sumarFuncionTipoFlecha(3, 5);
console.log(resultado);

//Diferencia entre Parametros y Argumentos
//Parametros son las variables que se definen en la firma de la función
//Argumentos son los valores que se pasan a la función al momento de llamarla
let sumar = function (a = 4, b = 5) { //se le puede asignar un valor por defecto a los parametros
    console.log(arguments[0]); //imprime el primer argumento que recibe la función
    console.log(arguments[1]); //imprime el segundo argumento que recibe la función
    return a + b + arguments[2]; //imprime la suma de los argumentos que recibe la función
}
resultado = sumar(3, 5, 8); //al llamar la función se le pasan los argumentos
console.log(resultado);

//Suma de todos los argumentos que recibe la función
let respuesta = sumarTodo(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); //al llamar la función se le pasan los argumentos
console.log(respuesta);
function sumarTodo() {
    let suma = 0;
    for (let i = 0; i < arguments.length; i++) {
        suma += arguments[i]; //arguments es un arreglo que contiene todos los argumentos que recibe la función
    }
    return suma;
}

//Tipos primitivos
let k = 10;//variable global
function cambiarValor(a) { //Paso por valor
    a = 20; //variable local
}

cambiarValor(k);
console.log(k); //imprime 10 porque la variable local no afecta a la variable global

const persona = { //variable global
    nombre: 'Juan',
    apellido: 'Perez'
}

function cambiarValorObjeto(p1) { //Paso por referencia
    p1.nombre = 'Carlos'; //variable local pero afecta a la variable global debido a que se utiliza el . haciendo referencia al objeto
    p1.apellido = 'Lara'; //variable local
}

cambiarValorObjeto(persona);
console.log(persona); //imprime Carlos Lara porque la variable local afecta a la variable global