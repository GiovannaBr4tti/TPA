package listaTeamsIfElse;

 import java.util.Scanner;
 
public class DataAno {
  public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int anoElec, anoNac, idade;
	
	System.out.println("Escreva o ano da pr�xima elei��o: ");
	anoElec=ler.nextInt();
	
	System.out.println("Escreva o ano do nascimento do Usu�rio: ");
	anoNac = ler.nextInt();
	
	idade= anoElec-anoNac;
	
	System.out.println("Idade do Usu�rio: "+idade);
	
	if (idade<16) {
		System.out.println("N�o poder� votar.");
		}
	else{
		System.out.println("Poder� votar.");
		}
	  ler.close();
     }
 }
