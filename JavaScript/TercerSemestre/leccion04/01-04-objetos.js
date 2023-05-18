let x = 10; //variable de tipo primitiva
console.log(x.length);

console.log("Tipos Primitivos");
//Objeto
let persona = { //se le asigna un espacio en memoria al objeto
    nombre: "Juan",
    apellido: "Perez",
    email: "jperez@gmail.com",
    edad: 28,
    idioma: "ES",
    get lang(){
        return this.idioma.toUpperCase(); //toUpperCase convierte a mayusculas las letras minusculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ //metodo o función en JavaScript
        return this.nombre + " " + this.apellido; //this hace referencia al objeto
    },
    get nombreEdad(){ //get es una palabra reservada para obtener un valor
        return "El nombre es: "+this.nombre + ", Edad: " + this.edad;
    }
    
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

console.log("Ejecutando con un objeto")
//Otra forma de acceder a los atributos de un objeto
let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = "Carlos";
persona2.direccion = "Saturno 15";
persona2.tel = "55443322";
console.log(persona2.tel);

console.log("Creamos un nuevo objeto");
console.log(persona["apellido"]); //Accedemos como si fuera un arreglo

console.log("Utilizando el metodo for in");
//for in
for (nombrePropiedad in persona){  //nombrePropiedad es una variable que se crea en tiempo de ejecución
    console.log(nombrePropiedad);
    console.log(persona[nombrePropiedad]);
}

console.log("Cambiando y eliminando propiedades a un objeto");
//Agregar propiedades a un objeto
persona.apellido = "Carballo"; //Ya existe la propiedad tel, solo se modifica
console.log(persona);

//Eliminar una propiedad
console.log(persona.tel);
persona.tel = "65432134"; //Creamos la propiedad tel
console.log(persona.tel);
delete persona.tel;
console.log(persona.tel); //eliminamos la propiedad tel

//Distintas formas de imprimir un objeto
//Número 1: la más sencilla: concatenar cada valor de cada propiedad
console.log("Distintas formas de imprimir un objeto forma 1: ");
console.log(persona.nombre + ", " + persona.apellido + ", " + persona.email + ", " + persona.edad);

//Número 2: Utilizando un ciclo for in
console.log("Distintas formas de imprimir un objeto forma 2: ");
for (nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Número 3: Utilizando el método Object.values(objeto)
console.log("Distintas formas de imprimir un objeto forma 3: ");
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: Utilizando el método JSON.stringify(objeto)
console.log("Distintas formas de imprimir un objeto forma 4: ");
let personaString = JSON.stringify(persona);
console.log(personaString);

//Usamos el metodo get
console.log("Usamos el metodo get");
console.log(persona.nombreEdad);

console.log("Usamos el metodo get para Idiomas");
console.log(persona.lang);

//Usamos el metodo set
console.log("Usamos el metodo set para Idiomas");
persona.lang = "en";
console.log(persona.lang);

function Persona3(nombre, apellido, email){ //Función constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + " " + this.apellido;
    }
}
let padre = new Persona3("Juan", "Perez", "jperez@gmail.com"); //new crea un nuevo objeto
padre.nombre = "Carlos";//modificamos el valor de la propiedad nombre
console.log(padre.nombreCompleto()); //Utilizamos el método nombreCompleto
console.log(padre);

let madre = new Persona3("Laura", "Quintero", "lquintero@gmail.com");
console.log(madre);

//Difetentes formas de crear objetos en JavaScript
//Caso Obejto 1
let miObjeto = new Object(); //Esta es una opción formal
//Caso Obejto 2
let miObjeto2 = {}; //Esta es la forma brebe y más recomendada

//Caso Cadenas 1
let miCadena1 = new String("Hola"); //Esta es una opción formal
//Caso Cadenas 2
let miCadena2 = "Hola"; //Esta es la forma brebe y más recomendada

//Caso Numeros 1
let miNumero1 = new Number(1); //Esta es una opción formal no recomendable
//Caso Numeros 2
let miNumero2 = 1; //Esta es la forma brebe y más recomendada

//Caso Boolean 1
let miBoolean1 = new Boolean(true); //Esta es una opción formal
//Caso Boolean 2
let miBoolean2 = true; //Esta es la forma brebe y más recomendada

//Caso Arreglos 1  
let miArreglo1 = new Array(); //Esta es una opción formal
//Caso Arreglos 2
let miArreglo2 = []; //Esta es la forma brebe y más recomendada

//Caso Funciones 1
let miFuncion1 = new Function(); //Esta es una opción formal
//Caso Funciones 2
let miFuncion2 = function(){}; //Esta es la forma brebe y más recomendada
