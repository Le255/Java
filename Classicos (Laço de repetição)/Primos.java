import java.util.Scanner;
public class Primos {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n,i=1, numD=0;
		System.out.println("digite um numero inteiro");
		n=ler.nextInt();
		
		while (i<=n) {
			if (n%i==0) {
				numD=numD+1;
		
			}
			i=i+1;
		}
		if(numD==2) {
			System.out.println("Número primo");
		}else {
			System.out.println("número composto");
		}
	}
 
}

