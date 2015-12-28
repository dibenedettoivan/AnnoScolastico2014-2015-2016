def email(a, b, c):
    return a[0] + "." + b + "@" + c 
a = raw_input("Inserisci il tuo nome: ")
b = raw_input("Inserisci il tuo cognome: ")
c = raw_input("Inserisci il tuo dominio email: ")
print "Ecco la tua mail: ", email(a, b, c)
