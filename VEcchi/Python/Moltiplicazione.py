def moltiplica(a, b):
    ris = 0
    
    while (b > 0):
        ris = ris + a
        b = b - 1
    return ris

a = input ("Inserisci un numero da moltiplicare: ")
b = input ("Quante volte lo moltiplico?: ")

print "Il risultato della moltiplicazione e': ", moltiplica(a, b)

