class Pi {
	static void calculoDoValorDePi(int iteracoes)
	{
		double meuPI = 4; // valor inicial de pi ("primeira iteracao")
		int sinal = -1;
		double divisor = 3;

		for (int i=2;i<=iteracoes;i++){
			meuPI += sinal * 4.0/divisor; // atualiza o valor de pi
			divisor += 2; // incrementa o valor do divisor
			sinal *= -1; // inverte o sinal da variavel sinal
		}
		
		System.out.println("("+iteracoes+") pi: " + meuPI);
	}

	public static void main(String[] args){
		calculoDoValorDePi(1);
		calculoDoValorDePi(2);
		calculoDoValorDePi(3);
		calculoDoValorDePi(4);
		calculoDoValorDePi(5);

	}
}
