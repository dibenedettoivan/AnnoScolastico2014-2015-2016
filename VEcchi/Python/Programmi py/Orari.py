'''Di Benedetto Ivan
Domanda #11) Acquisire una coppia di numeri e verificare se possano rappresentare un
orario del giorno (es. 22 e 45 sono un orario mentre 25 e 33 no).'''

h = input("Inserisci l'ora: ")
m = input("Inserisci i minuti: ")

if 0 <= h < 24 and 0 <= m < 60:
    print "Orario corretto"
    print h, ":",m
else:
    print "Con questi numeri non posso creare un orario."
