try:
    archivo = open('prueba.txt', 'r', encoding='utf8')  # la r es para hacer referencia a Read (leer)
    print(archivo.read())  # lee la totalidad del archivo
except Exception as e:
    print(e)
finally:
    archivo.close()  # cerramos el archivo
