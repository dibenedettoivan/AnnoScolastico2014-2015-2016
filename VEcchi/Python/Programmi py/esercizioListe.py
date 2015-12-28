# -*- coding: cp1252 -*-
'''Realizzare un programma in grado di produrre una lista di numeri casuali
di lunghezza parametrica.
Produrre e verificare una funzione di ricerca ingenua in grado di cercare la
prima posizione di un valore nella lista di numeri casuali.
Prudurre una funzione in grado di riordinari i dati nella lista
Produrre una funzione di ricerca efficiente che sfruttando il fatto che lista
ordinata esegue una ricerca "intelligente" arrivando alla posizione del valore
in modo più efficiente.
Puoi consegnare fino a tre diverse versioni dello stesso programma.'''

import random

     
def ricercaDicotomica(miaLista, v):
  sx = 0
  dx = len(miaLista)-1
  while sx <= dx:
    cen = (sx + dx) / 2
    if v < miaLista[cen]:
      dx = cen-1
    elif v > miaLista[cen]:
      sx = cen+1
    else:
      return cen
  return -1

def ordinaLista(miaLista):
    for i in range(len(miaLista)):
        for j in range(i, len(miaLista)):
                       if miaLista[i] > miaLista[j]:
                           ppc = miaLista[i]
                           miaLista[i] = miaLista[j]
                           miaLista[j] = ppc

         
def ricercaIngenua(Lista, q):
    for i in range(len(Lista)):
        if Lista[i] == q:
            return i
        
    return "Non trovato."
        

def creaLista(n):
    print "Ecco la lista di numeri casuali come da te richiesto."
    Lista = range(n)
    
    for x in range(n):
        Lista[x] = random.randint(0, 1000)
    return Lista

quantiElementi = input("Di quanti elementi vuoi che crei la lista? Digita un numero:  ")
miaLista = creaLista(quantiElementi)

print miaLista



q = input("Di quale numero vuoi che ti dia la posizione? ")



print "La posizione cercata è: ", ricercaIngenua(miaLista, q)
ordinaLista(miaLista)
print "Ecco la tua lista in ordine: ", miaLista

v = input("Quale numero vuoi cercare? ")
ricercaDicotomica(miaLista, v)
print "Il numero che cercavi è in posizione", ricercaDicotomica(miaLista, v)
