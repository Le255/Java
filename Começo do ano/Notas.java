package comecodoano;
import java.util.Scanner;
public class Notas {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n1 ,n2 ,n3 ,media;
		System.out.println("digite a primeira nota");
		n1= ler.nextInt();
		System.out.println("digite a segunda nota");
		n2= ler.nextInt();
		System.out.println("digite a terceira nota");
		n3= ler.nextInt();
		media =n1+n2+n3/3;
		System.out.println("sua media é" +media);
	}

}

