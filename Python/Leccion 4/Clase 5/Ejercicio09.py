#Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese ena frase, se le
# devolcerá la misma frase pero sin espacios en blanco, y
# además un contador de cuántos caracteres tiene la frase
# (sin contar los espacios en blanco)
#Ejemplo: frase = vivir por siempre en paz
#         frase = final vivirporsiempreenpaz
#         N° de caracteres 20

frase1 = input("Ingrese una frase: ")
frase2 = ""
for i in frase1:
    if i != " ":
        frase2 += i
frase2
print(f'\nFrase sin espacios: {frase2}')
print( f'N° de caracteres:  {len(frase2)}')