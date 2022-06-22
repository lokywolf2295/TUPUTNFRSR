# Ejercicio 5: Sistema de Calificaciones

"""
    El objetivo del programa será crear un sistema de calificaciones de la siguiente manera:

    Le pedimos al usuario que ingrese un valor del 0 al 10. 

    Luego si ingreso 9 o 10 imprimimos A

    Entre 8 y menor a 9 imprimimos B

    Entre 7 y menor a 8 imprimimos C

    Entre 6 y menor a 7 imprimimos D

    Entre 0 y menor a 6 imprimimos F

    De lo contrario el valor ingresado es incorrecto
"""
calificacion = int(input('Ingrese una calificacion: '))
nota = None
if 9 <= calificacion <= 10:
    nota = "A"
elif 8 <= calificacion < 9:
    nota = "B"
elif 7 <= calificacion < 8:

    nota = "C"
elif 6 <= calificacion < 7:
    nota = "D"
elif 0 <= calificacion < 6:
    nota = "F"
else:
    nota = "Incorrecta"
print(f"Su calificacion es: {nota}")
