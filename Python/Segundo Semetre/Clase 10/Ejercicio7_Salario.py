'''
Dadas las horas trabajadas de 5 personas y la tarifa de pago,
calcular el salario y la sumatoria de todos los salarios
'''

horas = tarifa = salario = suma = 0

for i in range(5):
    i += 1
    print(f'Salario del Empleado {i}')
    horas = int(input('Ingrese las horas trabajadas: '))
    tarifa = float(input('Ingrese la tarifa por hora: '))
    salario = horas*tarifa
    print(f'El salario es: {salario}')
    suma = suma + salario
    print('')

print(f'La suma de todos los salarios es: {suma}')