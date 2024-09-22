package prjWhile;

public class prjTabuada {
	 public static void main(String[] args) {
	int num=1, i=1, r=0;

		 System.out.print("Tabuada de 1 a 10:  ");
		 
		 while(num<11) {
			 while(i<11) {
				 r=num*i;
				 System.out.println(num+"x"+i+"="+r);
				 i++;
			 }
			 System.out.println("\n");
			 i=1;
			 num++;
		 }
	}
}
