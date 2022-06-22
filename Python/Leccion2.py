# En esta clase veremos la sentencia if/else
condicion = 10
if condicion == True:
    print('condicion Verdadera')
elif condicion == False:
    print('Condicion Falsa')
else:
    print('Condicion sin especificar')

num = int(input('Digite un numero en el rango del 1 al 3: '))
numTexto = ''
if num == 1:
    mumTexto = 'Numero uno'
elif num == 2:
    mumTexto = 'Numero dos'
elif num == 3:
    mumTexto = 'Numero tres'
else:
    numTexto = 'Has ingresado un numero fuera de rango'
print(F'El numero ingresado es: {num} - {numTexto}')


condicion = True
# if condicion:
#     print('Cndicion verdadera')
# else:
#     print('Condicion Falsa')
print('Condicion Verdadera') if condicion else print('Condicion Falsa')