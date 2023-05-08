// Tipos de Datos en JavaScript

/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/

var nombre = "Ariel"; // Tipo Str
console.log(nombre);
console.log(typeof nombre);
var numero = 3000; // Tipo Numérico
console.log(numero);
console.log(typeof numero);
var objeto = {
  nombre: "Ariel",
  apellido: "Betancud",
  telefono: "2614567893",
};
console.log(objeto);
console.log(typeof objeto);

// Tipo de dato clase
class Persona {
  constructor(nombre, apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}

console.log(typeof Persona);

// Tipo de dato undefined
var x = undifined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; // null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

// Tipo de dato array y Empty String
var autos = ["Citroen","Audi","BMW","Ford"];
console.log(autos); 
console.log(typeof autos); // Preguntamos que tipo de dato es: object

var z;
console.log(z);
