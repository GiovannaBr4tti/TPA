package prjListaVetoresAvaliativa;
import java.util.Scanner;
public class prjVetorPares04 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		final int TAM=2;
		int i,j;
		int a[] = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" posição do vetor a: ");
			a[i]= ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Elemento a[" + i + "] = " + a[i]);
			System.out.println("Pares de 0 até " + a[i] + ": ");
			
			for(j=0; j<=a[i]; j+=2) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	   ler.close();
	}
}

