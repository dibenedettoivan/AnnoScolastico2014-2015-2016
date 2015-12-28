def divisione(d, d1):
    ris = 0
    
    if d1 > 0:
        while(d >= 0):
            ris = ris + 1
            d = d - d1
        return ris - 1
    
d = input("Inserisci il numero da dividere: ")
d1 = input("Quante volte lo divido? ")
    
print "Il risultato della divisione e': ", divisione(d, d1)

