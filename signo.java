import java.util.*;
public class signo {
public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
	int mes, dia;
	System.out.println("Informe o m�s:");
	mes=ler.nextInt();
	System.out.println("Informe o dia:");
	dia=ler.nextInt();
	
	switch (mes) {
	
	case 1:
		if (dia<20) {
			System.out.println("Voc� � de Capric�rnio");
		}else {
			System.out.println("Voc� � de Aqu�rio");
		}
		break;
		
	case 2:
		if (dia<19) {
			System.out.println("Voc� � de Aqu�rio");
		}else {
			System.out.println("Voc� � de Peixes");
		}
		break;
		
	case 3:
		if (dia<20) {
			System.out.println("Voc� � de Peixes");
		}else {
			System.out.println("Voc� � de �ries");
		}
		break;
		
	case 4:
		if (dia<20) {
			System.out.println("Voc� � de �ries");
		}else {
			System.out.println("Voc� � de Touro");
		}
		break;
		
	case 5:
		if (dia<20) {
			System.out.println("Voc� � de Touro");
		}else {
			System.out.println("Voc� � de G�meos");
		}
		break;
		
	case 6:
		if (dia<20) {
			System.out.println("Voc� � de G�meos");
		}else {
			System.out.println("Voc� � de C�ncer");
		}
		break;
		
	case 7:
		if (dia<20) {
			System.out.println("Voc� � de C�ncer");
		}else {
			System.out.println("Voc� � de Le�o");
		}
		break;
		
	case 8:
		if (dia<20) {
			System.out.println("Voc� � de Le�o");
		}else {
			System.out.println("Voc� � de Virgem");
		}
		break;
		
	case 9:
		if (dia<20) {
			System.out.println("Voc� � de Virgem");
		}else {
			System.out.println("Voc� � de Libra");
		}
		break;
		
	case 10:
		if (dia<20) {
			System.out.println("Voc� � de Libra");
		}else {
			System.out.println("Voc� � de Escorpi�o");
		}
		break;
		
	case 11:
		if (dia<20) {
			System.out.println("Voc� � de Escorpi�o");
		}else {
			System.out.println("Voc� � de Sagit�rio");
		}
		break;
		
	case 12:
		if (dia<20) {
			System.out.println("Voc� � de Sargit�rio");
		}else {
			System.out.println("Voc� � de Capric�rnio");
		}
		break;
		
	default:
		System.out.println("M�s n�o encontrado");
	ler.close();
	}
}
}
