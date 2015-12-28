def Potenza(n, k):
    if n <= 0:
        print "Inserire un valore maggiore di 0."
    elif k < 0:
        print "Inserisci un esponente maggiore o uguale a 0."
    else:
        ris = 1
        
        while(k > 0):
            ris = ris * n
            k = k - 1
            
        return ris

n = input("Numero da elevare a potenza: ")
k = input("L'esponente è? ")

print "La potenza e':", Potenza(n, k)
