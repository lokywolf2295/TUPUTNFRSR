
let nombre = process.env.NOMBRE || 'Sin nombre'; //si no existe el nombre, se le asigna el valor de 'Sin nombre' por defecto
let web = process.env.MI_WEB || 'No tengo web';

console.log('Hola ' + nombre); 
//como primera vez tenemos que agregar el nombre en la terminal de la siguiente manera:
// $env:NOMBRE="Carlos";
console.log('Mi web es: ' + web);