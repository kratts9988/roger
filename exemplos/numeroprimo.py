numero = 7
ehPrimo = True

for i in range(2, numero):
    if numero % i == 0:
        ehPrimo = False
        break

if ehPrimo:
    print("O número é primo.")
else:
    print("O número não é primo.")