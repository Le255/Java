import java.util.Scanner;
public class VetorSoma {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i;
		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [10];
		
		//Lendo o vetor a
		for (i=0; i<10; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de a:");
			a[i] = ler.nextInt();
		}
		
		//Lendo o vetor b e calculando c
		for (i=0; i<10; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de b:");
			b[i] = ler.nextInt();
			c[i] = a[i] + b[i];
		}
		
		//Apresentando a, b, e c
		System.out.print("A = [");
		for (i=0; i<10; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
		
		System.out.print("B = [");
		for (i=0; i<10; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]\n");
		
		System.out.print("C = [");
		for (i=0; i<10; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]\n");
		
		}
	

}


