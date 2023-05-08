//let autos = new Array('BMW', 'Mercedes Benz', 'Volvo'); // Forma antigua de declarar un arreglo (array)

const autos = ['Ferrari', 'Renault', 'BMW']; // Forma moderna de declarar un arreglo (array)
console.log(autos);

//Recorremos los elementos del arreglo de manera manual
console.log(autos[0]);
console.log(autos[2]);

//Recorremos los elementos del arreglo de manera automática
for (let i = 0; i < autos.length; i++) {
    console.log('Indice '+i+': '+autos[i]);
}

//Modificamos los elementos del arreglo
autos[1] = 'Mercedes Benz';
console.log(autos[1]);

//Agregamos un nuevo elemento al arreglo
autos.push('Audi'); // Agrega el elemento al final del arreglo
console.log(autos);

//Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porsche';
console.log(autos);

//Tercera forma de agregar elementos al arreglo teniendo CUIDADO de no sobreescribir un elemento
autos[6] = 'Volvo'; // Agrega el elemento en la posición 6 del arreglo
console.log(autos); // Imprime los elementos del arreglo y los elementos vacíos porque la posición 5 no existe

//Como preguntar si una variable es un arreglo
console.log(Array.isArray(autos)); // Imprime true si la variable es un arreglo

//Segunda forma de preguntar si una variable es un arreglo
console.log(autos instanceof Array); // Imprime true si la variable es una instancia  de la clase Array