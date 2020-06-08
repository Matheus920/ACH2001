import java.lang.Math;

public class Circulo extends FormaGeometrica {
    double raio;

    double area(){
        return Math.PI * raio * raio;
    }

    double perimetro(){
        return 2 * Math.PI * raio;
    }
}
