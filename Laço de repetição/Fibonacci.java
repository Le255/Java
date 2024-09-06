import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int n, a=0, b=1, i=0, c;
		
		System.out.println("Digite um número para obter a sequência");
		n=ler.nextInt();
		
		while(i<=n) {
			System.out.println(+a+ "");
			
			c=a+b;
			a=b;
			b=c;
			i++;
		}
	}
}

