class Shape2D:

    def __valida_valores(self):
        raise NotImplementedError("A classe precisa verificar os seus valores")
        
    def print_shape(self):
        raise NotImplementedError("A classe precisa imprimir a forma")
    

    def area(self):
        raise NotImplementedError("A classe precisa calcular a area")
    

    def perimetro(self):
        raise NotImplementedError("A classe precisa calcular o perimetro")
    
class Retangulo(Shape2D):
    def __init__(self,altura,largura):
        if self.__valida_valores(altura,largura):
            self.altura = altura
            self.largura = largura
        else:
            self.altura = 0
            self.largura = 0
    
    def __valida_valores(self,altura,largura):
        if(altura < 0 and largura < 0):
            raise ValueError("Valores inválidos!!!")
        else:
            return True
        
    def print_shape(self):
        print(f"Altura = {self.altura}\nLargura = {self.largura}");

    def area(self):
        return self.altura *self.largura
    
    def perimetro(self):
        return 2*(self.altura+self.largura)


class Quadrado(Shape2D):
    def __init__(self,lado):
        if self.__valida_valores(lado):
            self.lado = lado
        else:
            self.lado = 0
    
    def __valida_valores(self,lado):
        if(lado < 0):
            raise ValueError("Valor inválido!!!")
        
    def print_shape(self):
        print(f"Lado = {self.altura}");

    def area(self):
        return self.lado ** 2
    
    def perimetro(self):
        return 4 * self.lado

class Circulo(Shape2D):
    def __init__(self, raio):
        if self.__valida_valores(raio):
            self.raio = raio
        else:
            self.raio = 0

    def __valida_valores(self,raio):
        if(raio < 0):
            raise ValueError("Valor inválido!!!")
    
    def area(self):
        return (self.raio**2)*3.14
    
    def perimetro(self):
        return 2*self.raio*3.14

class Triangulo(Shape2D):
    def __init__(self, altura, lado):
        if self.__valida_valores(lado, altura):
            self.altura = altura
            self.lado = lado
        else:
            self.altura = 0
            self.lado = 0

    def __valida_valores(self,lado,altura):
        if(lado < 0 or altura < 0):
            raise ValueError("Valor inválido!!!")
        
    def area(self):
        return (self.lado * self.altura)/2
    
    def perimetro(self):
        return 3 * self.lado
    

if __name__ == '__main__':
    q = Quadrado(2)
    t = Triangulo(2,3)
    r = Retangulo(2,3)
    c = Circulo(2)

    print(f"Area do quadrado q = {q.area()}")
    print(f"Area do triangulo t = {t.area()}")
    print(f"Area do retangulo r = {r.area()}")
    print(f"Area do circulo c = {c.area()}\n\n")

    print(f"Perimetro do quadrado q = {q.perimetro()}")
    print(f"Perimetro do triangulo t = {t.perimetro()}")
    print(f"Perimetro do retangulo r = {r.perimetro()}")
    print(f"Perimetro do circulo c = {c.perimetro()}")