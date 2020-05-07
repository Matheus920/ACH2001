/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   2020102 - Luciano Digiampetri                                 **/
/**                                                                 **/
/**   Terceiro Exercício-Programa                                   **/
/**                                                                 **/
/**   Matheus Moreira da Silva                   11796490           **/
/**                                                                 **/
/**   07/05/2020                                                    **/
/*********************************************************************/

/*
	Jogo da Velha - programa para verificar o status de um jogo.
	
	Lista de Status calculado:
    0 - Jogo não iniciado: o tabuleiro está 'vazio', isto é sem peças X e O;
    1 - Jogo encerrado1: o primeiro jogador (que usa as peças X) é o ganhador;
    2 - Jogo encerrado2: o segundo jogador (que usa as peças O) é o ganhador;
    3 - Jogo encerrado3: empate - todas as casas do tabuleiro estão preenchidas com X e O, mas nenhum dos jogadores ganhou;
    4 - Jogo já iniciado e em andamento: nenhuma das alternativas anteriores.	
*/

public class JogoDaVelha {
	static final char pecaX = 'X';
	static final char pecaY = 'O';
	static final char espacoVazio = ' ';

	/*
		Determina o status de uma partida de Jogo da Valha
		
		Entrada:
			tabuleiro - matriz 3x3 de caracteres representando uma partida valida de Jogo da Velha
			
		Saída:
			um inteiro contendo o status da partida (valores válidos de zero a quatro)
	*/
	static int verificaStatus(char[][] tabuleiro) {
        int status = -1;

        /*  
            O arranjo contadores servirá para contar o número de cada uma das peças
            suas posições equivalem respectivamente a: peça X, peça O, espaço vazio
        */
        int contadores[] = {0, 0, 0};
        
        /*  
            O primeiro laço checa por uma vitória em cada uma das linhas, além de
            armazenar o número de espaços vazios no tabuleiro
        */
        for(int i = 0; i < tabuleiro.length; i++){
            contadores[0] = 0;
            contadores[1] = 0;
            for(int j = 0; j < tabuleiro[0].length; j++){
                if(tabuleiro[i][j] == pecaX) contadores[0]++;
                else if(tabuleiro[i][j] == pecaY) contadores[1]++;
                else contadores[2]++;
            }
            /* 
                Após a checagem de cada linha é verificado se o número necessário
                de peças em sequência foi atingido                   
            */
            if(contadores[0] == 3) status = 1;
            else if(contadores[1] == 3) status = 2;
        }

        if(status != 1 && status != 2){

            /*  Caso uma vitória não seja detectada nas linhas, o segundo laço
                procura por uma vitória nas colunas
            */
            for(int j = 0; j < tabuleiro[0].length; j++){
               contadores[0] = 0;
               contadores[1] = 0;
               for(int i = 0; i < tabuleiro.length; i++){
                    if(tabuleiro[i][j] == pecaX) contadores[0]++;
                    else if(tabuleiro[i][j] == pecaY) contadores[1]++;
                }
                /* 
                    Após a checagem de cada coluna é verificado se o número necessário
                    de peças em sequência foi atingido                   
                */
                if(contadores[0] == 3) status = 1;
                else if(contadores[1] == 3) status = 2; 
            }

            if(status !=1 && status != 2) {
                /*
                    Caso uma vitória não seja detectada nas colunas, o terceiro
                    laço procura por uma vitória na diagonal principal
                */
                contadores[0] = 0;
                contadores[1] = 0;

                for(int i = 0; i < tabuleiro.length; i++){
                    for(int j = 0; j < tabuleiro[0].length; j++){
                        if(i == j){
                            if(tabuleiro[i][i] == pecaX) contadores[0]++;
                            else if(tabuleiro[i][i] == pecaY) contadores[1]++;
                        }   
                    }
                }

                /* 
                    Após a checagem da diagonal principal é verificado se o número necessário
                    de peças em sequência foi atingido                   
                */
                if(contadores[0] == 3) status = 1;
                else if(contadores[1] == 3) status = 2;
                else {
                    /* 
                        Caso uma vitória não seja detectada na diagonal principal,
                        o quarto laço procura por uma vitória na diagonal secundária
                    */
                       
                    contadores[0] = 0;
                    contadores[1] = 0;

                    for(int i = 0; i < tabuleiro.length; i++){
                        for(int j =0; j < tabuleiro[0].length; j++){
                            /* 
                                Obtido a partir da fórmula dos elementos de uma diagonal
                                secundária (i = n - j - 1, onde n é a ordem da matriz)
                            */    
                            if(i == (tabuleiro.length - j - 1)){
                                if(tabuleiro[i][j] == pecaX) contadores[0]++;
                                else if(tabuleiro[i][j] == pecaY) contadores[1]++;
                            }
                        }
                    }

                    /* 
                        Após a checagem da diagonal secundária é verificado se o número necessário
                        de peças em sequência foi atingido                   
                    */
                    if(contadores[0] == 3) status = 1;
                    else if(contadores[1] == 3) status = 2;
                    else {
                        /* 
                            Caso uma vitória não seja detectada, é necessário usar o número
                            de espaços vazios no tabuleiro para decidir se há um empate, se
                            o jogo ainda não foi iniciado ou se está em andamento
                        */
                        // Para o caso de não haver espaços vazios, o jogo foi empatado
                        if(contadores[2] == 0) status = 3;
                        // Para o caso de todos os espaços estarem vazios, o jogo não iniciou
                        else if(contadores[2] == 9) status = 0;
                        // Havendo espaços vazios, mas não sendo todos, o jogo está em andamento
                        else status = 4;
                    }
                }
            }
        }

        return status;
	}
	
	/*
		Apenas para seus testes. ISSO SERÁ IGNORADO NA CORREÇÃO
	*/
	public static void main(String[] args) {
		// escreva seu código (para testes) aqui

		char[][] tab0 = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		char[][] tab1 = {{'X','O','X'},{'O','O',' '},{'X','X','X'}};
		char[][] tab2 = {{'O','X','O'},{'X','O','O'},{'O',' ','O'}};
		char[][] tab3 = {{'O','X','X'},{'X','O','O'},{'O','X','X'}};
		char[][] tab4 = {{' ',' ',' '},{'X','O','X'},{' ',' ',' '}};

		System.out.println("Status calculado: " + verificaStatus(tab0));
		System.out.println("Status esperado para o tabuleiro0: 0\n");

		System.out.println("Status calculado: " + verificaStatus(tab1));
		System.out.println("Status esperado para o tabuleiro1: 1\n");

		System.out.println("Status calculado: " + verificaStatus(tab2));
		System.out.println("Status esperado para o tabuleiro2: 2\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab3));
		System.out.println("Status esperado para o tabuleiro1: 3\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab4));
		System.out.println("Status esperado para o tabuleiro4: 4\n");
		

	}
}
