import java.util.*;
public class exerPeso {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double h, p;
		String s, i;
		
		do {
			System.out.println("Digite o Sexo do usu�rio: ");
			s= ler.next();
			
			System.out.println("Digite a altura do usu�rio: ");
			h= ler.nextDouble();
			
			if(s.equalsIgnoreCase("M") || s.equalsIgnoreCase("Masculino")) {
				p=57+(0.75*(h-152.4));
				System.out.printf("O peso ideal para o Usu�rio �:\n%.2f",p);
			}else{
				p=57+(0.67*(h-152.4));
				System.out.printf("O peso ideal para a Usu�ria �:\n%.2f",p);
			}
			System.out.println("\n");
			System.out.println("Deseja continuar? Digite S para Sim e N para N�o.");
			
			i= ler.next();
		}while(i.equalsIgnoreCase("S"));
		ler.close();
	}
}
