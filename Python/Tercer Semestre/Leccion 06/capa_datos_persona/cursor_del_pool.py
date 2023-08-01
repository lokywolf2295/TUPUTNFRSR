from logger_base import log
from conexion import Conexion


class CursorDelPool:
    def __init__(self, pool):
        self._conexion = None
        self._cursor = None

    def __enter__(self):
        log.debug('Inicio del método with __enter__')
        self._conexion = Conexion.obtenerConexion()
        self._cursor = self._conexion.cursor()
        return self._cursor

    def __exit__(self, exc_type, exc_val, exc_tb):
        self.cursor.close()
        self.cursor = None
        return False