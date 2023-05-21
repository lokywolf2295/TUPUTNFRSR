class Persona{ //por convención se usa mayúscula en el nombre de la clase
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    
    get nombre(){
        return this._nombre;
    }
}

let persona1 = new Persona("Juan", "Perez");
console.log(persona1.nombre);
//console.log(persona1);
let persona2 = new Persona("Carlos", "Lara");
console.log(persona2.nombre);
//console.log(persona2);