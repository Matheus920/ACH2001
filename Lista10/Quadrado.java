public class Quadrado extends FormaGeometrica {

    double lado;

    double perimetro(){
        return lado*4;
    }

    double area(){
        return lado*lado;
    }
}
