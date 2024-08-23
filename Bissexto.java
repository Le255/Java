import java.util.Scanner;
public class Bissexto {
public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
	int an, resto;
	System.out.println("digite o ano de nascimento");
	an =ler.nextInt();
	resto= an%4;
	if (resto==0){
		System.out.println("nasceu em ano bissexto");
	}else {
		System.out.println("não nasceu em ano bissesto");
		
	}
	
}
}
