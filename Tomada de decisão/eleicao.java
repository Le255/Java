import java.util.Scanner;
public class eleicao {
	public static void main(String[] args) {
	Scanner ler =new Scanner (System.in);
	int anoEle, anoNas, idade;
	System.out.println("digite o ano de elei��o :");
	anoEle= ler.nextInt();
	System.out.println("digite o ano de nascimento :");
	anoNas = ler.nextInt();
	idade= anoEle-anoNas;
	System.out.println("sua idade � :" + idade);
	if(idade >=16) {
		System.out.println("poder� votar");
	}
	else {
	System.out.println("n�o poder� votar");
	}
	}
}
