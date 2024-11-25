package prjListaVetoresAvaliativa;
import java.util.Scanner;
public class prjVetorExpoente {
	    public static void main(String[] args) {
	    	Scanner ler = new Scanner (System.in);
	        final int TAM = 11; 
	        int[] a = new int[TAM];  

	        // Inicializando o vetor A 
	        
	        a[0] = 1;  // O primeiro valor é 2^0, ou seja, 1
	        for (int i = 1; i < TAM; i++) {
	            a[i] = a[i - 1] * 2;  // A cada iteração, multiplica o valor anterior por 2
	        }

	        // Imprimindo os elementos do vetor A
	        System.out.print("A = [");
	        for (int i = 0; i < TAM; i++) {
	            if (i == TAM - 1) {
	                System.out.print(a[i]);  
	            } else {
	                System.out.print(a[i] + ", "); 
	            }
	        }
	        System.out.println("]");
	    }
	}

}
