package listaTeamsIfElse;

  import java.util.Scanner;

public class Sal�rio {
   public static void main(String Args[]) {
	   Scanner ler = new Scanner(System.in);
	   double s, d, v;
	   
	   System.out.println("Escreva o sal�rio: ");
	   s= ler.nextDouble();
	   
	   System.out.println("Escreva o total de d�vidas: ");
	   d= ler.nextDouble();
	   
	   v= s-d;
	   
	   if(v<0) {
		   System.out.println("Faltar�: ");
	   }
	   else {
		   System.out.println("Sobrar�: ");
	   }
	   System.out.println(v);
	   ler.close();
   }
}
