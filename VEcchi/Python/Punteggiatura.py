str1 = "prova"
punti = ",.;:!?"
somma = 0

while len(str1) > 0:
    str1 = raw_input("Inserisci stringhe contenenti caratteri di punteggiatura: ")
    if len(str1) >0:
        for i in range(0, len(str1)):
            for j in range(0, len(punti)):
                if str1[i] == punti[j]:
                    somma += 1
print somma
