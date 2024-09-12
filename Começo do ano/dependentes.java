import java.util.Scanner;
public class dependentes {
	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		double salario, dependentes, novoSalario;
		System.out.println("digite o salario:");
		salario= ler.nextDouble();
		System.out.println("digite o numero de dependentes");
		dependentes= ler.nextDouble();
		novoSalario= (dependentes*55.00)+salario;
		System.out.println(" o novo salario é: " +novoSalario);
		

	}

}
