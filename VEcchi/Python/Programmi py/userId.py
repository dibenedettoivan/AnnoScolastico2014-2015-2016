def userId(a, b):
    return a[0:3] + b[0:7]
a = raw_input("Inserisci il tuo nome: ")
b = raw_input("Inserisci il tuo cognome: ")

print "Ecco il tuo userId: ", userId(a, b)
