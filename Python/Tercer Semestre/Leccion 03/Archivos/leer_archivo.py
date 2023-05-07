try:
    archivo = open('prueba.txt', 'r', encoding='utf8')  # la r es para hacer referencia a Read (leer)
    # print(archivo.read())  # lee la totalidad del archivo
    # print(archivo.read(16))  # lee los primeros 16 caracteres del archivo
    # print(archivo.read(10))  # lee los siguientes 10 caracteres del archivo
    # print(archivo.readline())  # lee la primera linea del archivo continuando con el texto si ya tiene un read
    # print(archivo.readline())  # lee la segunda linea del archivo continuando con el texto.

    # vamos a iterar el archivo, cad una de las lineas
    # for linea in archivo:
        # print(linea): iteramos todos los elementos del archivo

    #print(archivo.readlines()) # accedemos al archivo como si fuera una lista, imprimiendo todas sus lineas

    # Anexamos informacion, copiamos el archivo prueba.txt en otro
    archivo2 = open('copia.txt', 'a', encoding='utf8')
    archivo2.write(archivo.read())  # copiamos el archivo prueba.txt en otro

except Exception as e:
    print(e)
finally:
    archivo.close()  # cerramos el primer archivo
    archivo2.close()  # cerramos el segundo archivo

print('Se ha terminado el proceso de leer y copiar archivos')