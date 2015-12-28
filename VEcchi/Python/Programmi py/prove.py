def potenza(N, K):
    P = 1
    cont = 0
    while cont < K:
        P = P*N
        cont = cont + 1
    return P

base = input("Base: ")
esponente = input("Esponente: ")

print potenza(base, esponente)
