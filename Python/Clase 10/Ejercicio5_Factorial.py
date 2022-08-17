
# Calcular el factorial de un numero mayor o igual que cero

rta = False

while rta != True:
    num = int(input('Digite un número entero: '))

    if num <= 0:
        print('El número debe ser mayor a cero')
        rta = False
    else:
        factorial = 1

        for i in range(num):
            i += 1
            factorial = factorial * i
        print(f'El Factorial de {num} es: {factorial}')
        rta = True