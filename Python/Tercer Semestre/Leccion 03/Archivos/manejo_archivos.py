# Declaramos una variable

try:
    archivo = open("prueba.txt", "w", encoding='utf8')  # la w es para hacer referencia a Write (escribir)
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt\n")
    archivo.write("Los acentos son importantes para las palabras\n")
    archivo.write(
        "como por ejemplo: acción, ejecución y producción\n")  # esta linea al pasarse al txt ocaciona error por falta del encoding
    archivo.write("Con esto terminamos")
except Exception as e:
    print(e)
finally:  # el finally se ejecuta siempre, haya o no haya error
    archivo.close()  # cerramos el archivo
# archivo.write('Todo quedo perfecto'): esto es un error porque el archivo ya esta cerrado
