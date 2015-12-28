'''Di Benedetto Ivan
Acquisire un numero intero n, che si assume essere positivo,
e stampare tutti i numeri dispari tra 1 e n'''

n = input("Inserisci il numero di cui chiedi la successione: ")
disp = 1

while disp <= n:
    print disp
    disp = disp + 2
