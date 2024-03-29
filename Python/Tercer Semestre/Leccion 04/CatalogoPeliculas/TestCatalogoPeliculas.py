from dominio.Pelicula import Pelicula
from servicio.CatalogoPeliculas import CatalogoPeliculas as cp

opcion = None
while opcion != 4:
    try:
        print('Opciones:')
        print('1. Agregar pelicula')
        print('2. Listar las peliculas')
        print('3. Eliminar catálogo de peliculas')
        print('4. Salir')
        opcion = int(input('Digite una opcion de menú (1-4): '))

        if opcion == 1:
            nombre_pelicula = input('Ingrese el nombre de la pelicula: ')
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_pelicula(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_Peliculas()
    except Exception as e:
        print(f'Ocurrio un error de tipo: {e}')
        opcion = None
    else:
        print('Salimos del programa')