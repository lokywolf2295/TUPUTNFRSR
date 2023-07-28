import psycopg2 # Librería para conectarse a la BD de PostgreSQL

conexion = psycopg2.connect(
    user='postgres',
    password='root',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion: # Crear cursor para ejecutar sentencias SQL en PostgreSQL
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)' # Placeholder
            valores = ('Carlos', 'Lara', 'clara@mail.com') # Tupla de valores
            cursor.execute(sentencia, valores)  # Ejecutar sentencia SQL
            # conexion.commit() # Confirmar cambios en la BD
            registros_insertados = cursor.rowcount
            print(f'Los Registros insertados son: {registros_insertados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    # Cerrar cursor
    conexion.close()

# https://www.psycopg.org/docs/usage.htm