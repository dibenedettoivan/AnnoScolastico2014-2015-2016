a = input("Quanti numeri vuoi inserire: ")
pari = True

for n in range(0, a):
    dig = input("Digita il numero: ")

    if dig % 2 == 1 or dig < 0:
        pari = False

if pari:
    print "Tutti positivi e pari"
else:
    print "NO!!"
