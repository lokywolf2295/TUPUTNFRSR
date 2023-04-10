class NumerosIgualesException (Exception): # Extiende de la otra clase
    def __int__(self, mensaje):
        self.mensaje = mensaje