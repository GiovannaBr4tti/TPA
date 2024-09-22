package prjWhileCaderno;
import java.util.Scanner;

public class prjsomatoria {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0, r=0;
			while (i<=100) {
				r +=i;
				i++;
				System.out.println(r);
			
				
			}
			ler.close();
	}
}


