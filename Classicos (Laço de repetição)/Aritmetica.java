import java.util.*;
public class Aritmetica {
public static void main(String[] args) {
		
		Scanner ler= new Scanner (System.in);
		double itInicial, itFinal, soma=0, m=0;
		int i=0;
		
		
		System.out.println("Digite o intervalo inicial");
		itInicial=ler.nextDouble();
		
		System.out.println("Digite o intervalo final");
		itFinal=ler.nextDouble();
		
		while (itInicial<=itFinal) {
		i++;
		soma= soma + itInicial;
		itInicial++;
		}
		m= soma/i;
		System.out.println("sua media �:" +m);
		soma=ler.nextInt();
	}
 
	
}
