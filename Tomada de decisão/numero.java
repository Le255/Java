import java.util.Scanner;
public class numero {
public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	int n1;
	System.out.println("digite um numero inteiro");
	n1= ler.nextInt();

	if(n1%2==0) {
		System.out.println("par");
	}else {
		System.out.println("Impar");
	}
	ler.close();
}
}
