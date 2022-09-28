#Ejercicio 7: Juego adivina el número
# Realizar un juego para adivinar un número. Para ello se debe
# generar un número aleatorio entre 1 - 100, y luego ir pidiendo
# números indicando "es mayor" o "es menor" según sea mayor o menor
# con respecto a N. El proceso termina cuando el usuario acierta
# y allí se debe mostrar el número de intentos.

import random #primero importo el modulo random

#seguidamente espesifico cuales van a ser mis variables
intentos = 0
minNumber = 0
maxNumber = 20

#luego coloco un mensaje para el usuario y creo la opcion de que el mismo pueda poner su nombre
print("Hola! cual es tu nombre?:  ")
nombreusuario = input()

#utiliso desde el modulo random la función randint y nombro mis 2 variables
numero = random.randint (minNumber, maxNumber)
print("Bueno, " + nombreusuario + ", estoy pensando en un número entre " + str(minNumber) + " y " + str(maxNumber))

#Bucle del Juego función que se ejecuta cada segundo y ejecuta las condiciones del juego
while intentos <6: #le doy el parametro de a cantidad de intentos que puede el usuario realizar como maximo
    print ("Adivina el Número que estoy pensando: ")
    guess = input () #esta es el numero que va colocar el usuario
    guess = int(guess) #para poder utilizar el numero hay que convertirlo en entero

    intentos = intentos + 1 #cada vez que realice un ingreso de numero se sumará un intento hasta llegar al 6

    if guess < numero: #si el numero ingresado es menor al que piensa la pc
        print ("Tu número es demasiado bajo.")
    if guess > numero: #si el numero ingresado es mayor al que piensa la pc
        print ("Tu número es demasiado alto")
    if guess == numero: #si el numero ingresado es correcto se cierra el bucle
        break
if guess  == numero: #si el numero ingresado es correcto se imprimirá el mensaje abajo detallado
    intentos = str(intentos) #para poder usar la cantidad de intentos se deberá primero convertirlo a "str" (string = mensajes entre "")
    print ("Buen Trabajo. " + nombreusuario + "! tu has adivinado mi número en " + intentos + " Intentos")
if guess != numero: #el signo "!=" significa es diferente   #si el numero ingresado es diferente al pensado ...
    numero = str(numero) #convertir la variable numero a "str"
    print("No, el numero que estaba pensado era " + numero) #concadenamos el mensaje impreso con el numero que la pc pensó para que el usuario sepa cual era
