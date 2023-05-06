# Declaramos una variable

try:
    archivo = open("prueba.txt", "w")  # la w es para hacer referencia a Write (escribir)
except Exception as e:
    print(e)
finally: # el finally se ejecuta siempre, haya o no haya error
    archivo.close() # cerramos el archivo