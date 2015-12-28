'''Di Benedetto Ivan.
Domanda #7) Acquisire un numero reale e verificare se appartiene
all'intervallo [0, 1]'''

num = input("Inserisci un numero da controllare: ")

if num >= 0 and num <= 1:
    print "Il numero e' copreso tra 0 e 1."
else:
    print "Il numero non e' compreso tra 0 e 1."
