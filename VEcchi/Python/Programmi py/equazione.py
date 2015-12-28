#Equazione
#Di Benedetto Ivan
import math


def discriminante(a, b, c):
    return b * b - (4 * a * c)
a = input("Inserisci il coefficiente di x^2: ")
b = input("Inserisci il coefficiente di x: ")
c = input("Inserisci la costante: ")
dis = discriminante(a, b, c)
x1 = 0
x2 = 0

if dis < 0:
    print "Non ci sono soluzioni"
elif dis == 0:
    x1 = -b/(2*a)
    x2 = x1
    print "Soluzioni coincidenti"
else:
    x1 = (-b -math.sqrt(dis))/(2*a)
    x2 = (-b +math.sqrt(dis))/(2*a)
print "S={" +str(x1)+","+str(x2)+"}" + " " + "Equazione di secondo grado completa intera"

