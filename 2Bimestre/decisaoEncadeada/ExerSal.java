package prjEncadeada;

import java.util.Scanner;

public class ExerSal {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double sal;
		
		sal= ler.nextDouble();
		System.out.println("Sal�rio do usu�rio: R$"+sal);
		
		if(sal<1302) {
			System.out.println("Abaixo do sal�rio m�nimo.");
		}
		else if(sal==1302) {
			System.out.println("Igual ao sal�rio m�nimo.");
		}
		else {
			System.out.println("Acima do sal�rio m�nimo.");
		}
		ler.close();
	}
}

