# Ejercicio 4 Etapas de la vida

"""
    Ejercicio 4: Etapas de Vida

    Haremos un programa que cuando el usuario ingrese su edad le diga, o imprima la etapa de su vida en una breve oración: 

    0 a 10 La infancia es increíble y bella

    10 a 19 Tienes muchos cambios, mucho que estudiar 
    20 a 29 = Amor y comienza el trabajo

    Para las siguientes etapas, deberás completarlo...
"""

edad = int(input('Ingrese su edad: '))
etapa = None
if 0 < edad < 10:
    etapa = "La infancia es increible y bella"
elif 10 <= edad <= 19:
    etapa = "Tienes muchos cambios, mucho que estudiar"
elif 20 <= edad <= 29:
    etapa = "Amor y comienzo del trabajo"
elif 30 <= edad <= 39:
    etapa = "Trabajo y familia, comienza a aprender algunas canas"
elif 40 <= edad <= 49:
    etapa = "La vida tiene otras tonalidades"
elif 50 <= edad <= 59:
    etapa = "Mucha experiencia encima"
elif 60 <= edad <= 69:
    etapa = "Que lindos los nietos"
elif 70 <= edad <= 79:
    etapa = "Estas?"
print(f"si tu edad es: {edad} tu estado es: {etapa}")
