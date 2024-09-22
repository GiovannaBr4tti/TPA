package prjWhileCaderno;
import java.util.Scanner;
public class prjIdade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1,anonasci,anoatual, idade;
		
		while (i<11) {
			System.out.println("Digite o ano de nascimento do "+i+"° usuário : ");
			anonasci = ler.nextInt();
			
			System.out.println("Digite o ano atual: ");
			anoatual = ler.nextInt();
			idade = anoatual-anonasci;
			
				if (idade>=18) {
					System.out.println("O "+i+"° usuário tem "+idade+"anos. maior de idade");
				}else {
					System.out.println("O "+i+"° usuário tem"+idade+"anos. menor de idade");
				}
			i++;
		}
	}
	
}

