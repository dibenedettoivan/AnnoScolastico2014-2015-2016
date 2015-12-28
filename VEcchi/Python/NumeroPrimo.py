i = input("Inserisci il numero da analizzare: ")

def IlPrimo(a):
    div = a - 1
    res = True
    
    while(div > 1):
        if a % div == 0:
            res = False
        div = div - 1
        
    return res

def NumeroPrimo(a):
    if IlPrimo(a):
        print "Il numero", a, "e' un numero primo."
    else:
        print "Il numero", a, "non e' un numero primo."

NumeroPrimo(i)
