package switchCase;

import java.util.Scanner;

public class PrjLanche {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int lanche;
		
		System.out.println("Digite um valor de 1 a 5 referente ao seu lanche: ");
		lanche= ler.nextInt();
		
		switch(lanche) {
			case 1:
				System.out.println("O lanche escolhido � um Cachorro quente de R$8.00.");
				break;
			case 2:
				System.out.println("O lanche escolhido � um Cheeseburger de R$12.00.");
				break;
			case 3:
				System.out.println("O lanche escolhido � um  X-Salada de R$15.00.");
				break;
			case 4:
				System.out.println("O lanche escolhido � um Misto quente de R$11.00.");
				break;
			case 5:
				System.out.println("O lanche escolhido � um P�o na chapa de R$6.00.");
				break;
			default:
				System.out.println("O lanche escolhido n�o existe no cat�logo.");
		}
		ler.close();
	}
}
