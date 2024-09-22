package prjWhileCaderno;
import java.util.Scanner;
public class prjtabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1, num, r;
		
		System.out.println("Digite um número : ");
		num = ler.nextInt();
		
		while (i<11) {
			r = i*num;
			System.out.println(r);
			i++;
		}
		ler.close();
		
	}
}
