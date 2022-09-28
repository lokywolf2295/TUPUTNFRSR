# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro de un rango, por ejemplo:
# Suma de números pares del 2 al 30
# suma = 240

numero = list(range(2, 30))
i = 0
suma = 0
for i in numero: 
    if i % 2 == 0: 
        suma = suma + i
print(f"el valor final de la suma es {suma}")
