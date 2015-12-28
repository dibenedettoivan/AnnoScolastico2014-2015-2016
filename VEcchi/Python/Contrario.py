a = raw_input("Digita una stringa: ")
b = ""

i = len(a) - 1
while i >= 0:
    b += a[i]
    i -= 1

print b
