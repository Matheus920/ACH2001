public class Retangulo extends FormaGeometrica {
    
    double comprimento, largura;

    double area(){
        return comprimento * largura;
    }
    
    double perimetro(){
        return 2 * comprimento + 2 * largura;
    }

}
