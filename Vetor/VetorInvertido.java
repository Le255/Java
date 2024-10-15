import java.util.Scanner;
public class VetorInvertido {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i,ib=9;
		int a[] = new int [10];
		int b[] = new int [10];
		
		//Lendo o vetor a
		for (i=0; i<10; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de a:");
			a[i] = ler.nextInt();
			b[ib]=a[i];
			ib--;
		}
		//Apresentendo o vetor a e b
		System.out.print("A = [");
		for (i=0; i<10; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
		
		//Apresentendo o vetor B 
		System.out.print("B=[");
		for(i=0; i<10; i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.println("]\n");
	}
	}



