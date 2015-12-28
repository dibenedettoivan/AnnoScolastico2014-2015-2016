a = raw_input("Inserisci il tuo nome: ")
b = raw_input("Inserisci il tuo cognome: ")
c = raw_input("Inserisci il tuo dominio: ")

def email(a, b, c):
    return a[0] + "." + b + "@" + c 

# -*- coding: cp1252 -*-
def homePage(a, b):
    return "http://" + a + "/~" + b

def userId(a, b):
    return a[0:3] + b[0:7]

def password(a, b):
    return a[0:3] + b[0:3]

print "Ecco la tua mail. ", email(a, b, c)
print "Ecco la tua homePage: ", homePage(c, b)
print "Ecco il tuo userId: ", userId(a, b)
print "Ecco la tua password: ", password(a, b)
