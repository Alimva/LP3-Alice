import random

def lancamento(dado):
    dado[0] = random.randrange(1,7)
    dado[1] = random.randrange(1,7)
    return dado

def fase_1(dado):
    resul = dado[0]+dado[1]

    if(resul == 7 or resul == 11):
        ganhou = True
        fase = False
    
    elif(resul == 2 or resul == 3 or resul == 12):
        ganhou = False
        fase = False
    else:
        ganhou = False
        fase = True
    
    return ganhou, fase

def fase_2 (dado, ponto):
    resul = dado[0]+dado[1]

    if(resul == ponto):
        win = True
        stop = True
    
    if(resul == 7):
        win = False
        stop = True
    
    return win, stop

dados=[0,0]
ganhou = False
dados = lancamento(dados)
ganhou,fase = fase_1(dados)
print(f"Dado 1: {dados[0]} Dado 2: {dados[1]}")
print("Soma", dados[0]+dados[1])

if(fase == True):
    ganhou = False
    stop = False
    print("Iniciando a segunda fase")
    ponto = dados[0]+dados[1]
    while(stop == False):
        dados = lancamento(dados)
        ganhou,stop = fase_2(dados,ponto)
        print(f"Dado 1: {dados[0]} Dado 2: {dados[1]}")
        print("Soma", dados[0]+dados[1])

if(ganhou == True):
    print("Parabens!! Voce ganhou!!")

else:
    print("Que pena, voce perdeu.")
