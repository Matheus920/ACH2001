/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   2020102 - Luciano Digiampetri                                 **/
/**                                                                 **/
/**   Primeiro Exercício-Programa                                   **/
/**                                                                 **/
/**   Matheus Moreira da Silva                   11796490           **/
/**                                                                 **/
/**   26/03/2020                                             	    **/
/*********************************************************************/

/*
	Caixa eletrônico das Ilhas Weblands, com estoque ilimitado de cédulas
	de B$50,00, B$10,00, B$5,00 e B$1,00.
*/
public class CaixaEletronico {
	// Número de cédulas de B$50,00
	static int n50;
	
	// Número de cédulas de B$10,00
	static int n10;

	// Número de cédulas de B$5,00
	static int n5;
	
	// Número de cédulas de B$1,00
	static int n1;


	/*
		Determina a quantidade de cada nota necessária para totalizar
		um determinado valor de retirada, de modo a minimizar a quantidade
		de cédulas entregues.
		
		Abastece as variáveis globais n50,n10, n5 e n1 com seu respectivo
		número de cédulas.
		
		Parâmetro:
			valor - O valor a ser retirado
	*/
	static void fazRetirada(int valor) {	
		// Zerando variáveis antes do início da lógica
		n50 = n10 = n5 = n1 = 0;

		/* 
			Para caso do valor fornecido ser menor do que zero, um erro é gerado e,
			por padrão, as variáveis globais são preenchidas com -1 para indicar
			que o erro ocorreu. 
		
		*/
		if(valor < 0){
			n50 = n10 = n5 = n1 = -1;
			return;
		}
		
		/*
			Para cada uma das possíveis cédulas é feita uma checagem se é possível
			utilizá-la para alcançar o valor solicitado pelo cliente. Em caso afirmativo,
			uma célula é tirada e o valor é descontado, então a checagem se repete, até 
			que não seja possível e passe então para a próxima cédula em ordem decrescente. 
			Ao fim, é obtido o mínimo necessário de cédulas.

		*/
		while((valor-50) >= 0){
			// Equivale a "n50 = n50 + 1;"
			n50++;
			// Equivale a "valor = valor - 50;"
			valor -= 50;			
		}
		while((valor-10) >= 0){
			n10++;
			valor -= 10;
		}
		while((valor-5) >= 0){
			n5++;
			valor -= 5;
		}
		while((valor-1) >= 0){
			n1++;
			valor -= 1;
		}				
		
	}
	
	/*
		Apenas para seus testes. ISSO SERÁ IGNORADO NA CORREÇÃO
	*/
	public static void main(String[] args) {
		// escreva seu código (para testes) aqui

		// Exemplo de teste:
		fazRetirada(3);
		System.out.println("Notas de 50: "+n50);
		System.out.println("Notas de 10: "+n10);
		System.out.println("Notas de 5:  "+n5);
		System.out.println("Notas de 1:  "+n1);
		fazRetirada(50);
		System.out.println("Notas de 50: "+n50);
		System.out.println("Notas de 10: "+n10);
		System.out.println("Notas de 5:  "+n5);
		System.out.println("Notas de 1:  "+n1);
	}
}
