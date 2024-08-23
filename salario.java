import java.util.Scanner;
public class salario {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int sal,salLiquido,inss;
		System.out.println("digite seu salario");
		sal= ler.nextInt();
		if (sal>2500){
			inss= sal*11/100;
			salLiquido=sal-inss;
			System.out.println("o seu inss é " + inss);
		}else {
			inss= sal*9/100;
			salLiquido=sal-inss;
			System.out.println("o seu inss é " + inss);
		}
		System.out.println("o seu salario liquido é " + salLiquido);
		
	}

}
