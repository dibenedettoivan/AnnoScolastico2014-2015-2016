# -*- coding: utf-8 -*-
n = 0
somma = 0
cont = 0
a = input("Quanti numeri vuoi inserire? ")

for i in range(0, a):
    n = input("Digita un numero: ")
    if n % 3 == 0:
        somma += n
        cont += 1

print "La media dei numeri inseriti (non calcolando i numeri che non sono divisibili per 3) è:", somma / cont
