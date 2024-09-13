import java.util.Scanner;
public class Peso {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		String sexo, resposta;
		double al;
		
		do {
			System.out.println("Digite o seu sexo: M para masculino e F para feminino");
			sexo=ler.next();
			
			System.out.println("Digite sua altura");
			al=ler.nextDouble();
			
			if (sexo.equalsIgnoreCase("M")) {
				al=52+(0.75* (al-152.4));
				System.out.printf("Seu peso ideal é %.2f:" ,al);
			}else {
				al= 52+(0.67* (al-152.4));
				System.out.printf("Seu peso ideal é %.2f:" ,al);
			}
			System.out.println();
			
			System.out.println("Deseja continuar? S para sim ou N para não");
			resposta=ler.next();
			
		}while (resposta.equalsIgnoreCase("S"));
		
	}
}
