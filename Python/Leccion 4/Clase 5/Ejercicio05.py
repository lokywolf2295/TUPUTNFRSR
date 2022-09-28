# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

num = int(input('Digite un número entero: '))

if num <= 0:
    print('El número debe ser mayor a cero')
else:
    factorial = 1

    for i in range(num):
        i += 1
        factorial = factorial * i
    print(f'El Factorial de {num} es: {factorial}')