import java.util.Scanner;
public class salario {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		double salario, dividas, total;
		System.out.println("digite o salario :");
		salario= ler.nextDouble();
		System.out.println("digite o total de suas dividas :");
		dividas =ler.nextDouble();
		total=salario-dividas;
		System.out.println("total :" +total);
		if(total>=0) {
			System.out.println("sobrou dinheiro");
		
		}else {
			System.out.println("não sobrou");
		}
			
		
	}
}
