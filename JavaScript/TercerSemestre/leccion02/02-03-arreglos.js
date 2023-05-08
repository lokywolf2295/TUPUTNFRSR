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