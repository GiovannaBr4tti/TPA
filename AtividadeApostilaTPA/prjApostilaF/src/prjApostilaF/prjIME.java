package prjApostilaF;

import java.util.Scanner;

public class prjIME {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double imc, p, a;
		
		System.out.println("Digite o peso do usu�rio: ");
		p= ler.nextDouble();
		
		System.out.println("Digite a altura do usu�rio: ");
		a= ler.nextDouble();
		
		imc=p/(a*a);
		System.out.printf("IMC do usu�rio: = %.2f \n",imc);
		
		if(imc<18.5) {
			System.out.println("Excesso de Magreza.");
		}else if(imc<25){
			System.out.println("Peso comum.");
		}else if(imc<30) {
			System.out.println("Excesso de peso.");
		}else if(imc<35) {
			System.out.println("Obesidade de 1� Grau.");
		}else if(imc<40) {
			System.out.println("Obesidade de 2� Grau.");
		}else {
			System.out.println("Obesidade de 3� Grau.");
		}
		ler.close();
	}
}