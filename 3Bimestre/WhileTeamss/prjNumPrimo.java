package prjWhile;
import java.util.Scanner;

public class prjNumPrimo {
	 public static void main(String[] args) {
		 Scanner ler = new Scanner (System.in);
		 int np, r, divC=0, div=1;
		 
		 System.out.println("Didite o número que você deseja saber se é primo: ");
		 np = ler.nextInt();
		 
		 while (divC<=np) {
			 r=np%div;
			 if(r==0) {
				 divC++;
			 }
			 div++;
		 }
		 if(np<=1) {
			 System.out.println("Esse número não é primo.");
		 }else if (divC==2) {
			 System.out.println("Esse número é primo.");
		 }else {
			 System.out.println("Esse número não é primo.");
		 }
		 ler.close();
	 }
}
