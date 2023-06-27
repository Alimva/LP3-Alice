class Shape2D:

    def __init__(self,altura,largura):
        self.altura = altura
        self.largura = largura
        
    
    def __valida(self, altura,largura):
        if(altura < 0 and largura < 0):
            raise ValueError("Valores inválidos!!!")
        
    def print_shape(self):
        raise NotImplementedError("A classe precisa imprimir a forma")
    

    def area(self):
        raise NotImplementedError("A classe precisa calcular a area")
    

    def perimetro(self):
        raise NotImplementedError("A classe precisa calcular o perimetro")

class Retangulo(Shape2D):
    def __init__(self,altura,largura):
        Shape2D.__init__(self,altura,largura)
        
    def print_shape(self):
        print(f"Altura = {self.altura}\nLargura = {self.largura}");

    def area(self):
        return self.altura *self.largura
    
    def perimetro(self):
        return 2*(self.altura+self.largura)


class Quadrado(Shape2D):
    def __init__(self,largura,altura):
        Shape2D.__init__(self,altura, largura)
        
    def print_shape(self):
        print(f"Lado = {self.altura}");

    def area(self):
        return self.largura ** 2
    
    def perimetro(self):
        return 4 * self.largura

class Circulo(Shape2D):
    def __init__(self, raio):
        Shape2D.__init__(self,raio, 0)
    
    def area(self):
        return (self.altura**2)*3.14
    
    def perimetro(self):
        return 2*self.altura*3.14

class Triangulo(Shape2D):
    def __init__(self, altura, lado):
        Shape2D.__init__(self,altura, lado)
        
    def area(self):
        return (self.largura * self.altura)/2
    
    def perimetro(self):
        return 3 * self.largura
    

if __name__ == '__main__':
    q = Quadrado(2,2)
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