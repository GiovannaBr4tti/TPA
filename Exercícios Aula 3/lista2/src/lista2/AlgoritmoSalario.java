package lista2;

import java.util.Scanner;

public class AlgoritmoSalario {
     public static void main(String args[]) {
    	 Scanner ler= new Scanner(System.in);
    	 double s, d, sf;
    	 
    	 System.out.println("Insira o Sal�rio do funcion�rio: ");
    	 s= ler.nextDouble();
    	 
    	 System.out.println("Insira a quantia de dependentes do funcion�rio: ");
    	 d= ler.nextDouble();
    	 
    	 sf= s+(d*55);
    	 
    	 System.out.println("Sal�rio final do funcion�rio: R$"+sf);
    	 ler.close();
     }
}
