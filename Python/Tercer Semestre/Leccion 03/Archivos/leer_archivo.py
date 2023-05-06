try:
    archivo = open('prueba.txt', 'r', encoding='utf8')  # la r es para hacer referencia a Read (leer)
    # print(archivo.read())  # lee la totalidad del archivo
    print(archivo.read(16))  # lee los primeros 16 caracteres del archivo
    print(archivo.read(10))  # lee los siguientes 10 caracteres del archivo
    print(archivo.readline())  # lee la primera linea del archivo continuando con el texto si ya tiene un read
    print(archivo.readline())  # lee la segunda linea del archivo continuando con el texto.
except Exception as e:
    print(e)
finally:
    archivo.close()  # cerramos el archivo
