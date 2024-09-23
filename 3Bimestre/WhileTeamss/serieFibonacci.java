package prjWhile;
	import java.util.Scanner;
public class serieFibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int seq1 = 1, seq2 = 1, i = 1, n, proximon;
        
        System.out.print("escolha o termo para a série de Fibonacci: ");
        n = ler.nextInt();
        
        while (i <= n) {
        	System.out.print(seq1 + " ");

            proximon = seq1 + seq2;
            seq1 = seq2;
            seq2 = proximon;
            i++;
        }
       ler.close();
    }
}
