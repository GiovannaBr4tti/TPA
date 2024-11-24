package prjListaVetoresAvaliativa;
import java.util.Scanner;
public class MediaVetor1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int a[], b[],c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Digite a "+(i+1)+"° nota:");
			a[i]= ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite a "+(i+1)+"° nota:");
			b[i]= ler.nextInt();
		}
		
		//media
		for(i=0; i<TAM; i++) {
			c[i]= (a[i]+b[i])/2;
		}
		
		//Apresenta��o
		System.out.print("Média = [");
		for(i=0; i<TAM; i++) {
			if (i==9) {
				System.out.print(c[i]);
			}else {
				System.out.print(c[i]+" ");
			}
		}
		System.out.print("]\n");
		
		//apresentando o maior
		int maior = c[0];  // Inicia com o primeiro valor do vetor c
        int posicaoMaior = 0;  // A posição inicial é 0
        
        for (i = 1; i < TAM; i++) {
            if (c[i] > maior) {
                maior = c[i];  // Atualiza o maior valor
                posicaoMaior = i;  // Atualiza a posição do maior valor
            }
        }
        
        // Exibindo o maior valor e sua posição
        System.out.println("O maior média é " + maior + " na posição " + (posicaoMaior + 1));
		
  }
}
