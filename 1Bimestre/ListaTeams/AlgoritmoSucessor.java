package listaTeams;

import java.util.Scanner;

public class AlgoritmoSucessor {
     public static void main(String args[]) {
    	 Scanner ler = new Scanner(System.in);
    	 int num, ant, suc;
    	 
    	 System.out.println("Insira um n�mero");
    	 num = ler.nextInt();
    	 
    	 suc= num+1;
    	 ant= num-1;
    	 
    	 System.out.println("Antecessor do n�mero inserido: "+ant);
    	 System.out.println("Sucessor do n�mero inserido: "+suc);
    	 
    	 ler.close();
     }
}
