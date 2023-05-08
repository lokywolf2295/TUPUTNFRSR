//while
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log("Fin del ciclo while");

//do while
let contador2 = 0;
do{
    console.log(contador2);
    contador2++;
}while(contador2 < 3);
console.log("Fin del ciclo do while");

//for
for(let contador3 = 0; contador3 < 3; contador3++){
    console.log(contador3);
}
console.log("Fin del ciclo for");

//Palabra reservada break
for(let contador3 = 0; contador3 < 3; contador3++){
    if(contador3 % 2 == 0){
        console.log(contador3); //Muestra solo el numero par
        break;
    }
}
console.log("Termina el ciclo al encontrar el primer número par");

//Palabra reservada continue
for(let contador3 = 0; contador3 <= 10; contador3++){
    if(contador3 % 2 !== 0){
        continue; //Salta a la siguiente iteración
    }
    console.log(contador3); //Muestra todos los numeros pares
}
console.log("Termina el ciclo");

//Etiqutas label
inicio:
for(let contador3 = 0; contador3 <= 10; contador3++){
    if(contador3 % 2 !== 0){
        break inicio; //corta la ejecución del ciclo
    }
    console.log(contador3); //Muestra el primer numero par
}
console.log("Termina el ciclo");