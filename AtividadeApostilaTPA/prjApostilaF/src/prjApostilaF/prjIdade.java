package prjApostilaF;

import java.util.Scanner;

public class prjIdade {
    public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int aAtual, aNasc, i;
		
		System.out.println("Digite o seu ano de nascimento: ");
		aNasc= ler.nextInt();
		
        System.out.println("Digite o ano atual: ");
        aAtual= ler.nextInt();
        
        i= aAtual-aNasc;
        System.out.println("Voc� tem: "+i+" Anos.");
        
        if(i<10) {
        	System.out.println("E � uma crian�a.");
        }else if(i<18) {
        	System.out.println("E � um adolescente.");
        }else if(i<60) {
        	System.out.println("E � um adulto.");
        }else {
        	System.out.println("E � um idoso.");
        }
        ler.close();
	}
}
