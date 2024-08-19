package switchCase;

import java.util.Scanner;

public class PrjMencao {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int mb , b, r, i, totAl;
		double porMb, porB, porR, porI;
		String mencao;
		
		System.out.println("Digite o n�mero de Alunos: ");
		totAl= ler.nextInt();
		
		System.out.println("Digite o n�mero de men��es MB: ");
		mb= ler.nextInt();
		
		System.out.println("Digite o n�mero de men��es B: ");
		b= ler.nextInt();
		
		System.out.println("Digite o n�mero de men��es R: ");
		r= ler.nextInt();
		
		System.out.println("Digite o n�mero de men��es I: ");
		i= ler.nextInt();
		
		if((mb+b+r+i) != totAl)
			System.out.println("N�mero invalido de men��es.");
		
		System.out.println("Digite a Men��o que voc� queira ver a porcentagem.");
		mencao= ler.next();
		
		switch(mencao) {
			case "MB":
			case "mb":
			case "Mb":
				porMb=(mb*100)/totAl;
				System.out.println("A porcentagem de men��es MB s�o: "+porMb+"%");
				break;
			case "B":
			case "b":
				porB=(b*100)/totAl;
				System.out.println("A porcentagem de men��es B s�o: "+porB+"%");
				break;
			case "R":
			case "r":
				porR=(r*100)/totAl;
				System.out.println("A porcentagem de men��es R s�o: "+porR+"%");
				break;
			case "I":
			case "i":
				porI=(i*100)/totAl;
				System.out.println("A porcentagem de men��es I s�o: "+porI+"%");
				break;
			default:
				System.out.println("Men��o invalida.");			
		}
		ler.close();
	}
}
