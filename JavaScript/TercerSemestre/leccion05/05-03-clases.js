//let persona3 = new Persona3("Juan", "Perez"); //no se permite crear un objeto antes de haber definido o inicializado la clase que le permite hacer la instancia.

//Clase Padre
class Persona{ //por convención se usa mayúscula en el nombre de la clase
    static contadorObjetosPersona = 0; //atributo de nuestra clase
    email = 'Valor default email'; //atributo de nuestros objetos

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        Persona.contadorObjetosPersona++;
        console.log('Se incrementa el contador: ' + Persona.contadorObjetosPersona);
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

    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }

    //Sobreescribiendo el método de la clase Padre (Object)
    toString(){ //Regresa un string
        //Se aplica polimorfismo (multiples formas en tiempo de ejecución)
        //el método que se ejecuta depende si es una referencia de tipo padre o de tipo hijo
        return this.nombreCompleto();
    }

    static saludar(){
        console.log("Saludos desde método static");
    }

    static saludar2(persona){
        console.log(persona.nombre + ' ' + persona.apellido);
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

    //Sobreescritura: redefinir el método en la clase hija
    nombreCompleto(){
        return super.nombreCompleto() + ', ' + this._departamento;
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
console.log(empleado1.nombreCompleto());

//Object.prototype.toString //prototype permite agregar metodos y atributos de manera dinamica a una clase
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); //no es posible llamar un método static desde un objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona); //no debemos acceder por referencia al objeto, sino que debemos acceder por medio de la clase
console.log(Persona.contadorObjetosPersona); //podemos acceder a un atributo static desde la clase padre
console.log(Empleado.contadorObjetosPersona); //podemos acceder a un atributo static desde la clase hija

console.log(persona1.email);
console.log(empleado1.email); //se hereda el atributo de la clase padre
console.log(Persona.email); //no se puede acceder a un atributo de un objeto porque no es static