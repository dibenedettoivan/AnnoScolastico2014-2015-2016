j = input("Inserire il numero da scomporre in fattori primi: ")

def isPrime(a):
    div = a - 1
    res = True

    while(div > 1):
        if a % div == 0:
            res = False
        div = div - 1

    return res

def scomposizione(a):
    if a > 1:
        p = 2
        
        while(a > 1):
            if isPrime(p):
                if a % p == 0:
                    print p
                    a = a / p
                else:
                    p = p + 1
            else:
                p = p + 1
    else:
        print "Inserire un numero maggiore di 1."

scomposizione(j)
