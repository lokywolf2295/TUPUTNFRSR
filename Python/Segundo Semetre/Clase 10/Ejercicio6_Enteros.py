'''
Ingresar "N" numeros, visualizar la suma de los numeros pares de la lista,
cuantos numeros pares existen y cual es el promedio de los numeros impares
'''

sumaPares = sumaImpares = conteoPares = conteoImpares = promedioImpares = 0

nElementos = int(input('Digite la cantidad de elementos a ingresar: '))

for i in range(nElementos):
    i += 1
    num = int(input(f'Digite el elemento {i}: '))
    if (num % 2) == 0:
        print(f'El numero {num} es par')
        sumaPares = sumaPares + num
        conteoPares += 1
    else:
        print(f'El numero {num} es impar')
        sumaImpares = sumaImpares + num
        conteoImpares += 1

if conteoPares == 0:
    print('No se han ingresado numeros pares')
else:
    print(f'La suma de los numeros pares es: {sumaPares}')
    print(f'El conteo de los numeros pares es: {conteoPares}')

if conteoImpares == 0:
    print('No se han ingresado numeros impares')
else:
    promedioImpares = sumaImpares / conteoImpares
    print(f'El promedio de los numeros impares es: {promedioImpares}')