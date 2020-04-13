class Cores {
	static void cor(int identificador){
		switch(identificador){
			case 1: 
				System.out.println("Verde");
				break;
			case 2: 
				System.out.println("Amarelo");
				break;
			case 3:
				System.out.println("Azul");
				break;
			case 4:
				System.out.println("Branco");
				break;
			default:
				System.out.println("Identificador inválido");
		}

	}

	public static void main(String[] args){
		cor(1);
		cor(2);
		cor(3);
		cor(4);
		cor(5);
	}
}
