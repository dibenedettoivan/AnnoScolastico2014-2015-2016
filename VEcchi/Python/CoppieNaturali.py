def CoppieNaturali(a):
    div = 1
    
    if a > 0:
        while(div ** 2 < a):
            if (a % div) == 0:
                print a / div, "*", div
            div = div + 1
    else:
        print "Impossibile analizzare 0."

j = input("Inserisci il numero da analizzare: ")

print "Le coppie di numeri naturali sono:"
CoppieNaturali(j)

