import psycopg2 as bd# Librería para conectarse a la BD de PostgreSQL

conexion = bd.connect(
    user='postgres',
    password='root',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    conexion.autocommit = False # Desactivar el auto guardadp en la BD
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)' # Placeholder
    valores = ('Maria', 'Esperanza', 'mesperanza@mail.com') # Tupla de valores
    cursor.execute(sentencia, valores)  # Ejecutar sentencia SQL
    print('Termina la transacción')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    # Cerrar cursor
    conexion.close()

# https://www.psycopg.org/docs/usage.html