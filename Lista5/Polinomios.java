class Polinomios {

static double[] somaPolinomios(double[] primeiroPolinomio, double[] segundoPolinomio){
	double[] soma = new double[primeiroPolinomio.length];
	for(int i = 0; i < soma.length; i++){
		soma[i] = primeiroPolinomio[i] + segundoPolinomio[i];
	}

	return soma;
}

public static void main(String[] args){
	double[] soma = somaPolinomios(new double[]{1.4, 2, 5}, new double[]{3, -2, 4});

	for(int i = 0; i< soma.length; i++){
		System.out.print(soma[i] + " ");
	}
} 

}
