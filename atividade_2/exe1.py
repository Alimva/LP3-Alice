def media(teste):
    m = 0

    for i in range(len(teste)):
        m += teste[i]
    
    return m/10

def desvio_padrao(teste,media):
    dv = 0

    for i in range(len (teste)):
        dv += (media - teste[i]) ** 2
    
    return dv/10
    
def leitura(media, desvio):
    
    if(desvio > (media/10)):
        print(f"Leitura incorreta pois {desvio} e maior que {media/10}")
    
    else:
        print(f"Leitura correta pois {desvio} e menor que {media/10}")


teste1 = [10,10,10,10,10,10,10,10,10,10]
teste2 = [1,2,1,2,1,2,1,2,1,2]
teste3 = [7,9,10,11,13,14,15,16,17,18]

m1 = media(teste1)
m2 = media(teste2)
m3 = media(teste3)

dv1 = desvio_padrao(teste1,m1)
dv2 = desvio_padrao(teste2,m2)
dv3 = desvio_padrao(teste3,m3)

leitura(m1,dv1)
leitura(m2,dv2)
leitura(m3,dv3)





