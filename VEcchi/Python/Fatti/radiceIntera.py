def radiceIntera(n):
    k = 1
    
    while(k * k <= n):
        k = k + 1
    
    return k - 1

x = input("Inserisci il numero da cui vuoi la radice: ")
y = radiceIntera(x)

print "La radice quadrata e': ",radiceIntera(x)
