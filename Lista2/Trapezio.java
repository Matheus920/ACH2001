class Trapezio {

	static double areaTrapezio(double baseMaior, double baseMenor, double altura){
		return (((baseMaior+baseMenor)*altura)/2);
	}

	static double areaRetangulo(double base, double altura){
		double area = areaTrapezio(base,base,altura);
		System.out.println("Area do retangulo: " + area);
		return areaTrapezio(base,base,altura);
	}

	static double areaQuadrado(double lado){
		double area = areaRetangulo(lado, lado);
		return area;	
	}

	public static void main(String[] args){
		areaRetangulo(11, 27);
		System.out.println(areaQuadrado(2));
	}

}
