
import java.util.Scanner;
public class multiplo {
public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
	int n,resto;
	System.out.println("digite o numero inteiro");
	n= ler.nextInt();
	resto= n %10;
	if(resto==0){
		System.out.println("é multiplo de 10");
	}else {
		System.out.println("nao e´multiplo de 10");
	}
	
}
}
