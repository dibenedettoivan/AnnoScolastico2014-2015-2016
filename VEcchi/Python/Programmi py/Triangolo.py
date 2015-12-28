'''Di Benedetto Ivan
Domanda #10) Acquisire 3 numeri reali, verificare se possano rappresentare i lati
di un triangolo, e in caso affermativo determinare se si tratti di
un triangolo equilatero, isoscele o scaleno (per verificare se i tre
numeri possono essere lati di un triangolo devono essere verificate
tutte le seguenti condizioni: a < b + c, b < a + c, c < a + b).'''

a =input("Digita il primo numero: ")
b =input("Digita il secondo numero: ")
c =input("Digita il terzo numero: ")

if a < b + c and b < a + c and c <a + b:
    print "Bene, sono i lati di un tiangolo."
    if a == b and b == c and a == c:
        print "Si tratta di un triangolo equilatero."
    else:
        if a == b or a == c or b == c:
            print "Si tratta di un triangolo isoscele."
        elif a != b and a != c and b != c:
             print "Si tratta di un triangolo scaleno"
else:
    print "Non esiste un triangolo con quei lati."
