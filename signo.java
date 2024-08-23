import java.util.*;
public class signo {
public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
	int mes, dia;
	System.out.println("Informe o mês:");
	mes=ler.nextInt();
	System.out.println("Informe o dia:");
	dia=ler.nextInt();
	
	switch (mes) {
	
	case 1:
		if (dia<20) {
			System.out.println("Você é de Capricórnio");
		}else {
			System.out.println("Você é de Aquário");
		}
		break;
		
	case 2:
		if (dia<19) {
			System.out.println("Você é de Aquário");
		}else {
			System.out.println("Você é de Peixes");
		}
		break;
		
	case 3:
		if (dia<20) {
			System.out.println("Você é de Peixes");
		}else {
			System.out.println("Você é de Áries");
		}
		break;
		
	case 4:
		if (dia<20) {
			System.out.println("Você é de Áries");
		}else {
			System.out.println("Você é de Touro");
		}
		break;
		
	case 5:
		if (dia<20) {
			System.out.println("Você é de Touro");
		}else {
			System.out.println("Você é de Gêmeos");
		}
		break;
		
	case 6:
		if (dia<20) {
			System.out.println("Você é de Gêmeos");
		}else {
			System.out.println("Você é de Câncer");
		}
		break;
		
	case 7:
		if (dia<20) {
			System.out.println("Você é de Câncer");
		}else {
			System.out.println("Você é de Leão");
		}
		break;
		
	case 8:
		if (dia<20) {
			System.out.println("Você é de Leão");
		}else {
			System.out.println("Você é de Virgem");
		}
		break;
		
	case 9:
		if (dia<20) {
			System.out.println("Você é de Virgem");
		}else {
			System.out.println("Você é de Libra");
		}
		break;
		
	case 10:
		if (dia<20) {
			System.out.println("Você é de Libra");
		}else {
			System.out.println("Você é de Escorpião");
		}
		break;
		
	case 11:
		if (dia<20) {
			System.out.println("Você é de Escorpião");
		}else {
			System.out.println("Você é de Sagitário");
		}
		break;
		
	case 12:
		if (dia<20) {
			System.out.println("Você é de Sargitário");
		}else {
			System.out.println("Você é de Capricórnio");
		}
		break;
		
	default:
		System.out.println("Mês não encontrado");
	ler.close();
	}
}
}
