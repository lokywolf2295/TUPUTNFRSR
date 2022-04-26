miVariable = 3
print(miVariable)
print(type(miVariable)) # type permite ver el tipo de variable

miVariable = "a"
print(miVariable)
print(type(miVariable))

miVariable = 3.5
print(miVariable)
print(type(miVariable))

x = 10
y = 2 
z = x + y

#mostrar literal (se escriben nombreDeLaVariable y ultimos3NumerosDelId)
print(id(x)) #imprime el id de la variable (el espacio o casilla de la memoria)
print(id(y))
print(id(z))

# Tipos de datos = Integer String Float y Boolean
a: str = "Hola alumnos" # luego del : lo que se coloca es referencia del tipo de variable 
print(type(a))
print(a)
b: int = 10
print(type(b))
print(b)
c : float = 10.5
print(type(c))
print(c)
d: bool = True # True and False van con la primera Letra en mayuscula
print(type(d))
print(d)

#Procesar la entrada del usuario
#función input

resultado = input("Ingrese un numero: ") #Regresa un dato tipo string
print(resultado)

#Conversion de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))

suma = numero1 + numero2
print("El resultado de la suma es: ", suma)