str1 = "prova"
somma = 0

while len(str1) > 0:
    
    str1 = raw_input("Inserisci le stringhe che vuoi e termina con una stringa vuota: ")
    
    if len(str1) > 0:
        
        if (ord(str1[0]) >= 65 and ord(str1[0]) <= 90):
            somma += len(str1)

print somma

#ord utilizza il codice ASCII per dare un valore ad un carattere
