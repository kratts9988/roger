ano = 2024

ehBissexto = (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0)

if ehBissexto:
    print("O ano é bissexto.")
else:   
    print("O ano não é bissexto.")
