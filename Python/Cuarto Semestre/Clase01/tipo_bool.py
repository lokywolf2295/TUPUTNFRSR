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