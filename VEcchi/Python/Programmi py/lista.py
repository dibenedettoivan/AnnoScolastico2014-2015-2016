# -*- coding: cp1252 -*-
import random

lista = []

x1 = input("Scrivi un numero:")

while x1 > 0:
    lista.append(x1)
    x1 = input("Scrivi un numero(termina con 0): ")
print lista


quantoSeiLunga = len(lista)

print "La lista è lunga,", quantoSeiLunga

qualeCancello = input ("Quale elemento cancello? ")

if len(lista) > qualeCancello:
    del lista[qualeCancello]

print lista

esisteValore = input ("Quale elemento cerco? ")

if esisteValore in lista:
    print ("Trovato.")
    i = 0
    while i < len(lista):
        if lista[i] == esisteValore:
            print "La posizione è ", i
        i = i + 1
else:
    print ("Non trovato.")

quantiElementi = input ("Quanti numeri casuali vuoi? ")

listaCasuali = range(quantiElementi)

'''print listaCasuali'''

i = 0
limInf = 1
limSup = 50
while i < len(listaCasuali):
    x = limInf + random.random() * (limSup - limInf)
    print x
    listaCasuali[i] = int(x)
    i = i + 1
print listaCasuali
