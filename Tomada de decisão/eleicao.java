import java.util.Scanner;
public class eleicao {
	public static void main(String[] args) {
	Scanner ler =new Scanner (System.in);
	int anoEle, anoNas, idade;
	System.out.println("digite o ano de eleição :");
	anoEle= ler.nextInt();
	System.out.println("digite o ano de nascimento :");
	anoNas = ler.nextInt();
	idade= anoEle-anoNas;
	System.out.println("sua idade é :" + idade);
	if(idade >=16) {
		System.out.println("poderá votar");
	}
	else {
	System.out.println("não poderá votar");
	}
	}
}
