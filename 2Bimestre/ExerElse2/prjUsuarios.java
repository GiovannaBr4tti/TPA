package prjApostilaF;

import java.util.Scanner;

public class prjUsuarios {
    public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		String nome, nomeV, nomeN;
		int id, idV, idN;
		
		System.out.println("Digite o nome do primeiro usu�rio: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do primeiro usu�rio: ");
		id= ler.nextInt();
		
		nomeV= nome;
		idV= id;
		
		nomeN= nome;
		idN= id;
		
		System.out.println("Digite o nome do segundo usu�rio: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do segundo usu�rio: ");
		id= ler.nextInt();
		
		if(id>idV) {
			nomeV= nome;
			idV= id;
		}else {
			nomeN= nome;
			idN= id;
		}
		System.out.println("Digite o nome do terceiro usu�rio: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do terceiro usu�rio: ");
		id= ler.nextInt();
		
		if(id>idV) {
			nomeV= nome;
			idV= id;
		}else if(id<idN) {
			nomeN= nome;
			idN= id;
		}
		System.out.println("Digite o nome do quarto usu�rio: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do quarto usu�rio: ");
		id= ler.nextInt();
		
		if(id>idV) {
			nomeV= nome;
			idV= id;
		}else if(id<idN) {
			nomeN= nome;
			idN= id;
		}
		System.out.println("Digite o nome do quinto usu�rio: ");
		nome= ler.next();
		
		System.out.println("Digite a idade do quinto usu�rio: ");
		id= ler.nextInt();
		
		if(id>idV) {
			nomeV= nome;
			idV= id;
		}else if(id<idN) {
			nomeN= nome;
			idN= id;
		}
		System.out.println("O usu�rio mais velho �: "+nomeV+".");
		System.out.println("Sua idade � de: "+idV+" Anos.");
		
		System.out.println("O usu�rio mais novo �: "+nomeN+".");
		System.out.println("Sua idade � de: "+idN+" Anos.");
		
		ler.close();
	}
}
