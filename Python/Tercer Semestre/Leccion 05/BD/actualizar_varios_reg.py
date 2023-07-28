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
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'  # Placeholder
            valores = (
                ('Juan Carlos', 'Roldan', 'jcroldan@mail.com', 6),
                ('Romina', 'Ayala', 'rayala@mail.com', 7)
            )  # Es una Tupla de tuplas
            cursor.executemany(sentencia, valores)  # Ejecutar sentencia SQL
            registros_actualizados = cursor.rowcount
            print(f'Los Registros actualizados son: {registros_actualizados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    # Cerrar cursor
    conexion.close()

# https://www.psycopg.org/docs/usage.htm
