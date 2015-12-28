saldoIniziale = float(input("Digita l'importo dell'investimento: "))
anni = int(input("Digita il numero di anni: "))
tasso = float(input("Digita il tasso come percentuale: "))
#tasso = tasso / 100
interessiTotali = 0.0
print(tasso)
print ("%4s%16s%11s%14s" % \
       ("Anno", "Saldo Iniziale", "Interessi", "Saldo finale"))

for anno in range(1, anni + 1):
    interessi = saldoIniziale * tasso
    saldoFinale = saldoIniziale + interessi
    print ("%4d%16.2f%11.2f%14.2f" % \
           (anno, saldoIniziale, interessi, saldoFinale))
    saldoIniziale = saldoFinale
    interessiTotali += interessi

print("Saldo finale: $%0.2f" % saldoFinale)
print("Totale interessi maturati : $%0.2f" % interessiTotali)
