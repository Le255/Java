import java.util.*;
public class Rodizio {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int n;
	System.out.println("Entre com o �ltimo digito da placa:");
	n=ler.nextInt();
	
	//Come�ando o c�digo
	
	switch (n) {
	//Utilizando o switch
	case 1:
	case 2:
		System.out.println("Voc� n�o pode rodar de Segunda-feira");
		//Break serve para fechar o bloco
		break;
		
	case 3:
	case 4:
		System.out.println("Voc� n�o pode rodar de Ter�a-feira");
		break;
		
	case 5:
	case 6:
		System.out.println("Voc� n�o pode rodar de Quarta-feira");
		break;
		
	case 7:
	case 8:
		System.out.println("Voc� n�o pode rodar de Quinta-feira");
		break;
		
	case 9:
	case 0:
		System.out.println("Voc� n�o pode rodar de Sexta-feira");
		break;
		
	default:
		System.out.println("N�mero inv�lido");
	}
}
}
