package prjWhile;
public class altura {
	public static void main(String[] args) {
		double p, j;
		int i=0;
		
		p=145;
		j=134;
		
		while(j<p) {
			p= 145+(2*i);
			j= 134+(2.5*i);
			i++;
		}
		System.out.println("João ficará mais alto que Pedro em "+i+ " anos com "
		+j+" de altura.");
	}
}
