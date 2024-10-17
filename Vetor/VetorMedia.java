import java.util.Scanner;
public class VetorMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i;
		double soma=0, m=0;
		int a[] = new int [10];
		
		//Lendo o vetor A
		for (i=0; i<10; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de a:");
			a [i] = ler.nextInt();
			soma=a[i] + soma;
		}
		
		//Apresentando A
		System.out.print("A = [");
		for (i=0; i<10; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
		
		//Apresentando a média
		m=soma/10;
		System.out.println("a media é "+m);
		
	}
	
}
