str1 = raw_input("Inserisci una frase: ")
vocali = "AEIOUaeiou"
somma = 0
space = ' '

for i in range(0, len(str1)):
    if str1[i] == space:
        for j in range(0, len(vocali)):
            if vocali[j] == str1[i - 1]:
                somma += 1
print somma
