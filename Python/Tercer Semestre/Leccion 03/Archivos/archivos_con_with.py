from ManejoArchivos import ManejoArchivos

# MANEJO DE CONTEXTOS CON WITH (CONTEXT MANAGER): sintaxis simplificada, abre y cierra el archivo
# with open('prueba.txt','r', encoding='utf8') as archivo: # con with no es necesario cerrar el archivo, ya que lo hace automaticamente
    # print(archivo.read())  # lee la totalidad del archivo
# No hace falta mi el try, except y finally
# En el contexto de with lo que se ejecuta de manera automatica
# Utiliza diferentes métodos: __enter__ este es el que se ejecuta al inicio y abre el archivo
# Ahora el siguiente metodo es: __exit__ este es el que se ejecuta al final y cierra el archivo

with ManejoArchivos('prueba.txt') as archivo: # probamos la clase ManejoArchivos pasandole como nombre de archivo prueba.txt
    print(archivo.read())