package algoritmos;
import java.util.Scanner;
public class notas2 {
public static void main(String[] args) {
	Scanner scanner= new Scanner (System.in);
	int n1, n2, n3, m;
	System.out.println("digite a primeira nota");
	n1= scanner.nextInt();
	
	System.out.println("digite a segunda nota");
	n2= scanner.nextInt();
	
	System.out.println("digite a terceira nota");
	n3= scanner.nextInt();
	
	m= (n1 + n2 + n3)/3;
	System.out.println("sua media é:" + m);
	
	}
}
