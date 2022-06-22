# Ejercicio 3: Calcular estación del año

"""Pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12, luego le decimos en que año esta:

Verano: 1,2,3
Otoño: 4,5,6
Invierno: 7,8,9
Primavera: 10,11,12

En el ejercicio utilizo None: esto indica que la variable aun no tiene asignado valor"""

mes = int(input("Ingrese un mes del año con números: "))
estacion = None

if mes == 1 or mes == 2 or mes == 3:
    estacion = "Verano"
elif mes == 4 or mes == 5 or mes == 6:
    estacion = "Otoño"
elif mes == 7 or mes == 8 or mes == 9:
    estacion = "Invierno"
elif mes == 10 or mes == 11 or mes == 12:
    estacion = "Primavera"
else:
    estacion = "El mes es incorrecto"

print(f"En el mes {mes} estamos en la estación {estacion}")
