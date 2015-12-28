# -*- coding: cp1252 -*-
'''Di Benedetto Ivan.
Domanda #6) Scrivi uno script python in grado di acquisire
un numero e stamparne il valore assoluto (il valore assoluto
di un numero positivo è il numero stesso,
il valore assoluto di un numero negativo è il suo opposto).'''

n = input("Inserisci un numero di cui vuoi il valore assoluto: ")

if n >= 0:
    print "Il valore assoluto è",n
else:
    print "Il valore assoluto è",-n
