import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int n,f, i=0;
		System.out.println("Digite um numero para obter o fatorial");
		n=ler.nextInt();
		f=1;
		
		while (i<=n) {
			i++;
			System.out.println(" o fatorial de "+n+" é: "+f);
			f*=i;
		}
	 
	}
	}

