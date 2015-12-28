# -*- coding: cp1252 -*-
#Legge il primo numero

numero = input("Prossimo numero: ")
massimo= numero
minimo = numero
somma = numero
contatore = 1
while numero != 0:
   
    if numero > massimo:
        massimo = numero
        
    if numero < minimo:
        minimo = numero
    numero = input("Prossimo numero: ")
    somma = somma + numero
    contatore = contatore + 1

        
print "Finito"
print "Il massimo vale: ", massimo
print "Il minimo vale: ", minimo
print "La somma del totale è: ", somma
media = 1.0 * somma / contatore
print "La media è: ", media
