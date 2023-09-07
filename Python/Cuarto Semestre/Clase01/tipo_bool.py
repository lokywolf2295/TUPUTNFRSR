# Bool contiene los valores de True y False
# Los tipos numéricos, es falce para el 0 (cero) y True para cualquier otro valor
valor = 0
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

valor = 15
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

# Tipo string -> False '', True demás valores
valor = ''
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f'valor: {valor}, resultado: {resultado}')

# Tipo coleccion -> False para colecciones vacias
# Tipo coleccion -> True para todas las demás
# Lista
valor = []
resultado = bool(valor)
print(f'valor de una lista vacía: {valor}, resultado: {resultado}')

valor = [2, 3, 4]
resultado = bool(valor)
print(f'valor de una lista con elementos: {valor}, resultado: {resultado}')

# Tupla
valor = ()
resultado = bool(valor)
print(f'valor de una tupla vacía: {valor}, resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f'valor de una tupla con elementos: {valor}, resultado: {resultado}')

# Diccionario
valor = {}
resultado = bool(valor)
print(f'valor de un diccionario vacío: {valor}, resultado: {resultado}')

valor = {'a': 1, 'b': 2}
resultado = bool(valor)
print(f'valor de un diccionario con elementos: {valor}, resultado: {resultado}')

# Sentencias de control con bool
if bool(''):
    print('Regresa verdadero')
else:
    print('Regresa falso')

# Ciclos
variable = 17
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')