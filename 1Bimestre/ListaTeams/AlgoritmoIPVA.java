package listaTeams;

import java.util.Scanner;

public class AlgoritmoIPVA {
     public static void main(String args[]) {
    	 Scanner ler= new Scanner(System.in);
    	 double pv, ipva;
    	 int d;
    	 
    	 System.out.println("Insira o pre�o do ve�culo: ");
    	 pv = ler.nextDouble();
    	 
    	 d = 4;
    	 
    	 ipva=(d*pv/100);
    	 
    	 System.out.println("Valor do ipva do ve�culo: R$"+ipva);
    	 ler.close();
    	 }
}
