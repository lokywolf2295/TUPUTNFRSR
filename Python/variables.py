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


#Operadores Aritmeticos


operandoA = 8                                                                     
operandoB = 5                                                                     
suma = operandoA + operandoB                                                      
print(f'El resultado de la suma es: {suma}')                                      
                                                                                  
resta = operandoA - operandoB                                                     
print(f'El resultado de la resta es: {resta}')                                    
                                                                                  
multiplicacion = operandoA * operandoB                                            
print(f'El resultado de la multiplicacion es: {multiplicacion}')                  
                                                                                  
division = operandoA / operandoB                                                  
print(f'El resultado de la division es: {division}')                              
                                                                                  
division = operandoA // operandoB                                                 
print(f'El resultado de la division (int) es: {division}')                        
                                                                                  
modulo = operandoA % operandoB                                                    
print(f'El residuo de la division es: {modulo}')

#Solicitamos el ingreso de los valores
alto = int(input("ingrese la altura del rectangulo: "))
ancho = int(input("ingrese el ancho del rectangulo: "))

#calculamos los datos requeridos
area = alto * ancho
perimetro = (alto+ancho) * 2

#imprimimos los resultados obtenidos
print("El area del rectangulo es: ", area)
print(f'El perimetro del rectangulo es: {perimetro}')


#Operadores de Asignación


miVariable3 = 10 #lo que hacemos es asignar un valor a la variable
print(miVariable3)

#incremento con reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

#otra forma de reasignación
miVariable3 +=1
print(miVariable3)

miVariable3 = miVariable3 - 1
print(miVariable3)

miVariable3 -=1
print(miVariable3)

miVariable3 *=1
print(miVariable3)

miVariable3 /=1
print(miVariable3)


#operadores de Comparacion

b = 4
d = 2

resultado = b == d #comprobamos si son iguales
print(resultado)


#operadores Diferente
resultado = b != d 
print(resultado)


#operadores Menor
resultado = b < d 
print(resultado)


#operadores mayor
resultado = b > d 
print(resultado)


#operadores mayor o igual
resultado = b >= d 
print(resultado)


#operadores menor o igual
resultado = b <= d 
print(resultado)

a = 1
b = 2

if a < b:
    print(" b es mayor que a")
else:
    print("a es mayor que b")


alto = int(input("ingrese la altura del rectangulo: "))
ancho = int(input("ingrese el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto+ancho) * 2
print("El area del rectangulo es: ", area)
print(f'El perimetro del rectangulo es: {perimetro}')


num = int(input("la edad del usuario: ")) #ingreso edad por usuario
if num >= 18 :
    print(f"Eres mayor de edad ")
else:
    print(f"Eres menor de edad ")


num = int(input("ingrese un numero: ")) #ingreso numero por usuario
print(f"el residuo de la division es: {num % 2}")
if num % 2 == 0:
    print(f"el numero {num} es par ")
else:
    print(f"el numero {num} es impar ")