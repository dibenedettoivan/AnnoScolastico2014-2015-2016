def password(a, b):
    return a[0:3] + b[0:3]
a = raw_input("Digita il tuo nome: ")
b = raw_input("Digita il tuo cognome: ")

print "Ecco la tua password: ", password(a, b)
