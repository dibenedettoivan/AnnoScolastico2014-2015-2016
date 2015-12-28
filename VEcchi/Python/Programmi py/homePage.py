# -*- coding: cp1252 -*-
def homePage(a, b):
    return "http://" + a + "/~" + b
a = raw_input("Inserisci il tuo dominio: ")
b = raw_input("Inserisci il tuo cognome: ")

print "La tua homePage è': ", homePage(a, b)


