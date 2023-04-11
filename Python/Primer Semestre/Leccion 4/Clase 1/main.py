#Lista = ariel , liliana, natalia, osvaldo

nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1]) #imprime el ultimo elemento de la lista 


#recorremos de 0 a 2
print(nombres[0:2])

#ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3]) #Indices a mostrar 0,1,2

#desde el indice indicado hasta el final
print(nombres[1:]) #Indices a mostrar 1,2,3

#modificamos un valor 
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)

#Iterar una lista 
for nombre in nombres: #nombre es singular(iterador), la lista es plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

#Preguntamos cuantos elementos tiene
print(len(nombres)) #le pasamos como parametro la lista

#agregamos un elemento a la lista
nombres.append('Marcelo')
print(nombres)

#Insertar un elemento en un indice específico
nombres.insert(1, 'Alberto') #es necesario SIEMPRE ingresar como parametros un entero, y luego el objeto a insertar
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

#Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)

#Eliminar el ultimo elemento
nombres.pop()
print(nombres)

#eliminar un indice específico
del nombres[2] #del significa delete (eliminar)
print(nombres)

#eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

#Eliminar la lista
del nombres
print(nombres) #salta error porque la lista fué eliminada