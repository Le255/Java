import java.util.*;
public class Rodizio {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int n;
	System.out.println("Entre com o último digito da placa:");
	n=ler.nextInt();
	
	//Começando o código
	
	switch (n) {
	//Utilizando o switch
	case 1:
	case 2:
		System.out.println("Você não pode rodar de Segunda-feira");
		//Break serve para fechar o bloco
		break;
		
	case 3:
	case 4:
		System.out.println("Você não pode rodar de Terça-feira");
		break;
		
	case 5:
	case 6:
		System.out.println("Você não pode rodar de Quarta-feira");
		break;
		
	case 7:
	case 8:
		System.out.println("Você não pode rodar de Quinta-feira");
		break;
		
	case 9:
	case 0:
		System.out.println("Você não pode rodar de Sexta-feira");
		break;
		
	default:
		System.out.println("Número inválido");
	}
}
}
