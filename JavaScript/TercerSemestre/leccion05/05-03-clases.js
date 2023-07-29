//let persona3 = new Persona3("Juan", "Perez"); //no se permite crear un objeto antes de haber definido o inicializado la clase que le permite hacer la instancia.

//Clase Padre
class Persona{ //por convención se usa mayúscula en el nombre de la clase
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    
    //Métodos get y set
    get nombre(){
        return this._nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }
}

//Clase Hija
class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido); //llama al constructor de la clase padre
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }
}

let persona1 = new Persona("Juan", "Perez");
console.log(persona1.nombre);
persona1.nombre = "Juan Carlos";
console.log(persona1.nombre);
console.log(persona1.apellido);
persona1.apellido = "Ramos";
console.log(persona1.apellido);
//console.log(persona1);
let persona2 = new Persona("Carlos", "Lara");
console.log(persona2.nombre);
persona2.nombre = "María Laura";
console.log(persona2.nombre);
console.log(persona2.apellido);
persona2.apellido = "Quintero";
console.log(persona2.apellido);
//console.log(persona2);

//el profesor agrega los metodos get and set de apellido y comenta la linea 1

let empleado1 = new Empleado("María", "Giménez", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombre);