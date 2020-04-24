/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   2020102 - Luciano Digiampetri                                 **/
/**                                                                 **/
/**   Segundo Exercício-Programa                                    **/
/**                                                                 **/
/**   Matheus Moreira da Silva                  11796490            **/
/**                                                                 **/
/**   16/04/2020                                                    **/
/*********************************************************************/

/*
	Cálculo para raiz quadrada
*/
public class Raiz {
	/*
		Calcula a raiz quadrada de um valor, com uma determinada
		precisão. Retorna esse valor, ou -1 quando:
		
		* a < 0
		* epsilon <= 0
		* epsilon >= 1
		
		Parâmetro:
			a - valor cuja raiz quadrada será calculada
			epsilon - precisão do cálculo
	*/
	static double raizQuadrada(double a, double epsilon) {
		/* 
            Em caso de a < 0 ou epsilon <= 0 ou epsilon >=1
            o método de Newton não se aplica, resultando em
            um erro.           
        */
        if(a < 0 || epsilon <= 0 || epsilon >=1) return -1;

        /* 
            Se a = 0, o método de Newton também não se aplica,
            resultando no retorno padrão de 0 como raiz quadrada.           
        */
        if(a == 0) return 0;
    

        /* 
            Para iniciar o cálculo da raiz, as primeiras iterações
            são feitas manualmente para que se possa comparar
            futuramente com o valor de epsilon.           
        */
        double valorAnterior = a/2;
        double valorAtual = 0.5 * (valorAnterior + (a/valorAnterior));


        /*
            Enquanto a distância entre as iterações for maior que
            a precisão especificada as iterações continuam, sempre
            armazenando o valor atual e o valor anterior. 
        */
        while(modulo(valorAtual - valorAnterior) >= epsilon){
            valorAnterior = valorAtual;
            valorAtual = 0.5 * (valorAnterior + (a/valorAnterior));
        }


        /*
            O valor atual retornado é o primeiro que satisfaz
            | valorAtual - valorAnterior | < epsilon, tal como
            pede a definição do Método de Newton.
        */
        return valorAtual;        
	}

    /*
        Calcula o módulo de um dado número a partir da definição
        matémática:

        * a, se a >= 0
        * -a, se a < 0

        Parâmetro:
            valor - indica o número que se deseja calcular
            o módulo.
    */

    static double modulo(double valor){
        if(valor >= 0) return valor;
        else return valor * (-1);
    }


	/*
		Apenas para seus testes. ISSO SERÁ IGNORADO NA CORREÇÃO
	*/
	public static void main(String[] args) {
		// escreva seu código (para testes) aqui

		// Exemplo de teste:
		double valor = 1;
		double precisao = 0.001;
		System.out.println("Raiz de : "+valor+" = "+raizQuadrada(valor, precisao));
	}
}
