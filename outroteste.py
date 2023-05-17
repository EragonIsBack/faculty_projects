lista=[1,2,"palavra",4]

while True:
    a=int(input("digite a função desejada \n 1 para ver a lista \n 2 para adicionar a lista \n 3 para remover um item da lista \n 4 para sair \n"))

    if a == 1:
        print(f"{lista} \n")

    elif a == 2:
        b=int(input("deseja adicionar numeros ou letras? \n 1 para numeros ou 2 para letras \n"))
        if b == 1:
            c=int(input("qual o numero a ser adicionado? \n"))
            lista.append(c)
            print(f"o item {c} foi adicionado a lista. \n")
        elif b == 2:
            d=str(input("qual as letras ou palavra a ser adicionada? \n"))
            lista.append(d)
            print(f"o item {d} foi adicionado a lista. \n")
            
    elif a == 3:
        print(lista)
        e=int(input("qual item voce deseja retirar da lista? \n"))
        del lista[e]
        
    elif a == 4:
        print("encerrando o programa... \n")
        break
