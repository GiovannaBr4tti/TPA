package listaTeamsIfElse;

 import java.util.Scanner;
 
public class ImparPar {
   public static void main(String Args[]) {
	   Scanner ler = new Scanner(System.in);
	   int num, r;
	   
	   System.out.println("Escreva um n�mero: ");
	   num= ler.nextInt();
	   
	   r=num%2;
	   
	   if(r==0) {
		   System.out.println("� um n�mero par.");
	   }
	   else {
		   System.out.println("� um n�mero �mpar.");
	   }
	   ler.close();
   }
}
