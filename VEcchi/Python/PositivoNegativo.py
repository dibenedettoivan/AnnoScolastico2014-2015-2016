e = True
a = 0
n = 0

while True:
    n = input("Digita un numero: ")
    if n < 0 or n > 0:
        if a != 0:
            if(n < 0 and a < 0) or (n > 0 and a > 0):
                e = False
        a = n
    else:
        break

if e:
    print "Ok"
else:
    print "NO"
