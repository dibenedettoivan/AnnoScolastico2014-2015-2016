# -*- coding: utf-8 -*-
somma = 0
eccezione = 0

while True:
    n = input ("Digita il numero: ")

    if (n % 3 == 0 and n > 0) or (n % 2 == 0 and n < 0):
        somma += n

    else:
        eccezione += n
        break

print "La somma dei numeri inseriti è:", somma
print "Il numero che non rispetta le condizioni è:", eccezione
