# Declaramos una variable

try:
    archivo = open("prueba.txt", "w", encoding='utf8')  # la w es para hacer referencia a Write (escribir)
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt\n")
    archivo.write("Los acentos son importantes para las palabras\n")
    archivo.write("como por ejemplo: acción, ejecución y producción\n")  # esta linea al pasarse al txt ocaciona error por falta del encoding
    archivo.write('Las letras que recive archivo.write() son: \nr read leer, \na append añadir, \nw write escribir, \nx crea un archivo,')
    archivo.write("\nt esta para texto o text, \nb archivos binarios, \nr+ y w+ son iguales read and write leer y escribir\n")
    archivo.write("Saludos a todos los alumnos de la Tecnicatura Universitaria en Programación\n")
    archivo.write("Con esto terminamos")
except Exception as e:
    print(e)
finally:  # el finally se ejecuta siempre, haya o no haya error
    archivo.close()  # cerramos el archivo
# archivo.write('Todo quedo perfecto'): esto es un error porque el archivo ya esta cerrado
