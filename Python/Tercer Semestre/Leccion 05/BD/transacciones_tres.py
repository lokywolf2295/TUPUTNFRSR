import psycopg2 as bd# Librería para conectarse a la BD de PostgreSQL

conexion = bd.connect(
    user='postgres',
    password='root',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)' # Placeholder
            valores = ('Alex', 'Rojas', 'arojas@mail.com') # Tupla de valores
            cursor.execute(sentencia, valores)  # Ejecutar sentencia SQL

            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s' # Placeholder
            valores = ('Juan Carlos', 'Roldan', 'jroldan@mail.com', 1) # Es una Tupla
            cursor.execute(sentencia, valores)  # Ejecutar sentencia SQL

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close() # Cerrar cursor
    print('Termina la transacción')

# https://www.psycopg.org/docs/usage.html