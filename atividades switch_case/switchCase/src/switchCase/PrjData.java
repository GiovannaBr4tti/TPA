package switchCase;

import java.util.Scanner;

public class PrjData {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int d, m;
				
		System.out.println("Digite o seu dia de nascimento: ");
		d= ler.nextInt();
		
		System.out.println("Digite o seu m�s de nascimento: ");
		m= ler.nextInt();
		
		switch(m) {
		case 1:
			if(d<=20) {
				System.out.println("Seu signo � capric�rnio.");
			}else 
			System.out.println("Seu signo � aqu�rio");
			break;
		case 2:
			if(d<=19) {
				System.out.println("Seu signo � aqu�rio.");
			}else 
			System.out.println("Seu signo � peixes");
			break;
		case 3:
			if(d<=20) {
				System.out.println("Seu signo � peixes.");
			}else 
			System.out.println("Seu signo � �ries");
			break;
		case 4:
			if(d<=20) {
				System.out.println("Seu signo � �ries.");
			}else 
			System.out.println("Seu signo � touro");
			break;
		case 5:
			if(d<=20) {
				System.out.println("Seu signo � touro.");
			}else 
			System.out.println("Seu signo � g�meos");
			break;
		case 6:
			if(d<=20) {
				System.out.println("Seu signo � g�meos.");
			}else 
			System.out.println("Seu signo � c�ncer");
			break;
		case 7:
			if(d<=21) {
				System.out.println("Seu signo � c�ncer.");
			}else 
			System.out.println("Seu signo � le�o");
			break;
		case 8:
			if(d<=22) {
				System.out.println("Seu signo � le�o.");
			}else 
			System.out.println("Seu signo � virgem");
			break;
		case 9:
			if(d<=22) {
				System.out.println("Seu signo � virgem.");
			}else 
			System.out.println("Seu signo � libra");
			break;
		case 10:
			if(d<=22) {
				System.out.println("Seu signo � libra.");
			}else 
			System.out.println("Seu signo � escorpi�o");
			break;
		case 11:
			if(d<=21) {
				System.out.println("Seu signo � escorpi�o.");
			}else 
			System.out.println("Seu signo � sagit�rio");
			break;
		case 12:
			if(d<=21) {
				System.out.println("Seu signo � sagit�rio.");
			}else 
			System.out.println("Seu signo � capric�rnio");
			break;
		default:
			System.out.println("M�s invalido.");
		}
		ler.close();
	}
}
