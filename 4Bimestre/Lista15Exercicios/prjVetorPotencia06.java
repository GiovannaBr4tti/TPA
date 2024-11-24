package prjListaVetoresAvaliativa;
public class prjVetorPotencia06 {
	public static void main (String Args[]) {
		final int TAM=11;
		int i;
		int a[] = new int[TAM];
		a[0]=1;
		
		for(i=1; i<TAM; i++) {
			a[i] = a[i -1 ]*2;
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("a[" + i + "] =" + a[i]);
		}

	}
}
