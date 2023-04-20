def print_tab(tab):
    
    for i in range(len(tab)):
        for j in range(len(tab[i])):
            print(f"{tab[i][j]}", end = " ")
        print()


def verifica (x,y,tab):
    if x < 0 or x > (len(tab)-1):
        print("Posicao invalida. Tente novamente\n")
        return False
    elif y < 0 or y > (len(tab[x])-1):
        print("Posicao invalida. Tente novamente\n")
        return False
    elif tab[x][y] != "-" and tab[x][y] != "@":
        print("Oops! Voce ja atirou aqui. Tente novamente\n")
        return False
    
    print("Posicao valida\n")
    return True


def cria_tab():
    tab = []
    
    for i in range(5):
        aux = []
        for j in range(5):
            aux.append("-")
        tab.append(aux)
    return tab


def cria_navio(gabarito):

    x, y = map(int, input("Entre com as coordenadas: ").split(" "))
    

    while(verifica(x,y,gabarito) == False):
        x, y = map(int, input().split())

    gabarito[x][y] = "@"
    return 1


def tiro(gabarito,tab):
    x, y = map(int, input("Entre com as suas coordenadas: ").split(" "))

    while(verifica(x,y,tab) == False):
        x, y = map(int, input("Entre com as suas coordenadas: ").split(" "))
        
    
    if(gabarito[x][y] == '@'):
        print("Voce acertou um navio!")
        tab[x][y] = "X"
        return -1
    else:
        print("Nao tem nada aqui.")
        tab[x][y] = "O"
        return 0;


gabarito1 = cria_tab()
gabarito2 = cria_tab()
tab1 = cria_tab()
tab2 = cria_tab()
navio1 = navio2 = 0

print("Vamos Jogar Batalha Naval!!")
print("Vamos comecar colocando os seus navios no tabuleiro")


while(navio1 < 3):
    print(f"Entre com as coordenada {navio1} dos seus navios jogador 1: ")
    navio1 += cria_navio(gabarito1)
    print(navio1)

while(navio2 < 3):
    print(f"Entre com as coordenada {navio2} dos seus navios jogador 2: ")
    navio2 += cria_navio(gabarito2)


print("Agora nosso jogo pode comecar!")

while(navio2 > 0):

    print("Turno do Jogador 1")
    navio1 += tiro(gabarito2,tab1)
    print_tab(tab1)

    if(navio1 == 0):
        break

    print("Turno do Jogador 2")
    navio2 += tiro(gabarito1,tab2)
    print_tab(tab2)

if(navio1 == 0):
    print("Parabens Jogador 1! Voce ganhou")

elif(navio2 == 0):
    print("Parabens Jogador 2! Voce Ganhou!")

