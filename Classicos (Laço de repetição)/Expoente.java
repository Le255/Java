import java.util.Scanner;
public class Expoente {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int b, ex, p=1, i=0;
		
		System.out.println("Digite a base");
		b=ler.nextInt();
		
		System.out.println("Digite o expoente");
		ex=ler.nextInt();
		
		while (i<ex) {
			p=p*b;
			i++;
			
			ler.close();
		}
		System.out.println("O resultado da potência é:" +p);
	}
}

