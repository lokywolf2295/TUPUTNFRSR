import psycopg2 as bd# Librería para conectarse a la BD de PostgreSQL

conexion = bd.connect(
    user='postgres',
    password='root',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    conexion.autocommit = False # Desactivar el auto guardadp en la BD # se abre la transacción
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)' # Placeholder
    valores = ('Carlos', 'Lara', 'clara@mail.com') # Tupla de valores
    cursor.execute(sentencia, valores)  # Ejecutar sentencia SQL

    sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s' # Placeholder
    valores = ('Juan', 'Juarez', 'jcjuarez@mail.com', 1) # Es una Tupla
    cursor.execute(sentencia, valores)  # Ejecutar sentencia SQL

    conexion.commit() # Se cierra la transacción
    print('Termina la transacción')

except Exception as e:
    conexion.rollback() # Revertir cambios en la BD
    print(f'Ocurrió un error: {e}')
finally:
    # Cerrar cursor
    conexion.close()

# https://www.psycopg.org/docs/usage.html