'''Di Benedetto Ivan.
Domanda #8) Acquisire una sequenza di numeri positivi, la cui conclusione
sara' indicata dal valore 0, e stampare il quadrato di ciascuno di essi'''

num = input("Inserisci un numero(0 per chiudere): ")

while num > 0:
    print num **2
    num = input("Inserisci un numero(0 per chiudere)")
