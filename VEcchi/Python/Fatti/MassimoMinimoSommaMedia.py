def MassimoMinimoSommaMedia():
    esci = 1
    massimo = 0
    minimo = 0
    somma = 0
    media = 0
    cont = 1
    
    while (esci > 0):
        a = input("Inserisci un valore (digita 0 per terminare): ")
        
        if a > 0:
            if a > massimo:
                massimo = a
            if cont == 1:
                minimo = a
            elif a < minimo:
                minimo = a
            somma = somma + a
            media = somma / cont
            cont = cont + 1
            
        else:
            esci = 0
            
    print "Massimo valore inserito:", massimo
    print "Minimo valore inserito:", minimo
    print "Somma dei valori inseriti:", somma
    print "Media dei valori inseriti:", media

MassimoMinimoSommaMedia()
