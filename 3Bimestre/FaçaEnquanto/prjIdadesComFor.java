package prjFor;
import java.util.Scanner;
public class prjIdadesComFor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int anonasci,anoatual, idade, idadevelho=0,idadenovo=0;
		
		System.out.println("Digite o ano atual: ");
		anoatual = ler.nextInt();
		
		for (int i=1; i<11; i++) {
			System.out.println("Digite o ano de nascimento do "+i+"° usuário : ");
			anonasci = ler.nextInt();
			
			idade = anoatual-anonasci;
			System.out.println("O "+i+"° usuário tem "+idade+" anos.");
			
				if (idadevelho<idade) {
					idadevelho=idade;
				}
				idadenovo=idade;
				if(idadenovo>idade) {
					idadenovo=idade;
				}
		}
		System.out.println("o usúario mais velho tem "+ idadevelho+" anos.");
		System.out.println("o usúario mais novo tem "+ idadenovo+" anos.");
		ler.close();
	}
}

