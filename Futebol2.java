import java.util.*;
public class Futebol2 {
public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	int id;
	System.out.println("Digite sua idade");
	id=ler.nextInt();
	
	//Switch case
	
	switch (id) {
	case 6:
		System.out.println("Voc� � Dente de leite");
		break;
		
	case 7: 
		System.out.println("Voc� � j�nior");
		break;
		
	case 8:
		System.out.println("Voc� � j�nior max");
		break;
		
	case 9:
		System.out.println("Voc� � j�nior master");
		break;
		
	case 10:
		System.out.println("Voc� � master");
		break;
		
	default:
		System.out.println("N�o aceitamos maiores de 10 anos");
	ler.close();
	}
}
}
