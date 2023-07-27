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
            sentencia = 'SELECT * FROM persona'
            cursor.execute(sentencia)  # Ejecutar sentencia SQL
            registros = cursor.fetchall()  # Obtener todos los registros de la consulta
            print(registros)

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    # Cerrar cursor
    conexion.close()

# https://www.psycopg.org/docs/usage.html