package prjDecisaoEncadeada;

import java.util.Scanner;

public class ExerSalario {
     public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double sal, salMin;
		
		System.out.println("Escreva o sal�rio do usu�rio: R$");
		sal= ler.nextDouble();
		
		System.out.println("Escreva o valor atual do sal�rio min�mo: R$");
		salMin= ler.nextDouble();
		
		System.out.println("Sal�rio do usu�rio: R$"+sal);
		
		if(sal<salMin) {
			System.out.println("Sal�rio Insuficiente.");
		}
		else {
			System.out.println("Sal�rio Suficiente.");
		}
		ler.close();
	}
}
