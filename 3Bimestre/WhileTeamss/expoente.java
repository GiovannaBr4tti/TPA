package prjWhile;
import java.util.Scanner;
public class expoente {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			int i=0, r=1, base, expoente;
			
			System.out.println("Digite a base: ");
			base = ler.nextInt();
			
			System.out.println("Digite o expoente: ");
			expoente = ler.nextInt();
			
			while (i < expoente) {
				r = base*r;
				i++;			
			}
			System.out.println(r);
			ler.close();
		}
	}

