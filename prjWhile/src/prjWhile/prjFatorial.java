package prjWhile;
import java.util.Scanner;

public class prjFatorial {
	 public static void main(String[] args) {
		 Scanner ler = new Scanner (System.in);
		 int fato, i;
		 
		 System.out.println("Escreva o número que você deseja o fatorial: ");
		 fato= ler.nextInt();
		 i=fato-1;
		 
		 while (i>0) {
			 fato=fato*i;
			 i--;
		 }
		 System.out.println("O fatorial do número escolhido é: "+fato);
		 ler.close();
	 }
}
