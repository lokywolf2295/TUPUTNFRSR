import psycopg2  # Librería para conectarse a la BD de PostgreSQL

conexion = psycopg2.connect(
    user='postgres',
    password='root',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion:  # Crear cursor para ejecutar sentencias SQL en PostgreSQL
        with conexion.cursor() as cursor:
            sentencia = 'DELETE FROM persona WHERE id_persona IN %s'  # Placeholder
            entrada = input('Digite los números de registros a eliminar (separados por coma): ')
            valores = (tuple(entrada.split(',')),)  # Es una Tupla de tuplas
            cursor.execute(sentencia, valores)  # Ejecutar sentencia SQL
            registros_eliminados = cursor.rowcount
            print(f'Los Registros eliminados son: {registros_eliminados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    # Cerrar cursor
    conexion.close()

# https://www.psycopg.org/docs/usage.htm
