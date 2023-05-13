let x = 10; //variable de tipo primitiva
console.log(x.length);

//Objeto
let persona = { //se le asigna un espacio en memoria al objeto
    nombre: "Juan",
    apellido: "Perez",
    email: "jperez@gmail.com",
    edad: 28,
    nombreCompleto: function(){ //metodo o función en JavaScript
        return this.nombre + " " + this.apellido; //this hace referencia al objeto
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());