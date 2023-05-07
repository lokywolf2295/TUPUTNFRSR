class ManejoArchivos:
    def __init__(self, nombre):
        self.nombre = nombre

    def __enter__(self):
        print('Obtenemos el recurso'.center(50,'-'))
        self.nombre = open(self.nombre, 'r', encoding='utf8') # Encapsulamos el codigo dentro del método
        return self.nombre

    def __exit__(self, tipo_excepcion, valor_excepcion, traza_error):
        print('Cerramos el recurso'.center(50,'-'))
        if self.nombre:
            self.nombre.close()
        print('tipo de excepcion: ', tipo_excepcion)
        print('valor de excepcion: ', valor_excepcion)
        print('traza de excepcion: ', traza_error)
        return True