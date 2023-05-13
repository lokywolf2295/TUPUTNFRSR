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

//Otra forma de acceder a los atributos de un objeto
let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = "Carlos";
persona2.direccion = "Saturno 15";
persona2.tel = "55443322";
console.log(persona2.tel);

console.log(persona["apellido"]); //Accedemos como si fuera un arreglo

//for in
for (nombrePropiedad in persona){  //nombrePropiedad es una variable que se crea en tiempo de ejecución
    console.log(nombrePropiedad);
    console.log(persona[nombrePropiedad]);
}