def suma(a,b):
    c=a+b
    return c

def resta(a,b):
    c=a-b
    return c

def calculo(a,b,c):
    resultado1 = a+b-c
    pregunta = input("multiplicar o dividir:")
    if pregunta == "multiplicar":
        total = a*b*c
    if pregunta == "dividir":
        total = a/b/c
    return resultado1,total
