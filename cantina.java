import java.util.*;
public class cantina {
public static void main(String[] args) {
	Scanner ler=new Scanner (System.in);
	int codigo;
	System.out.println("Informe o c�digo do produto escolhido");
	codigo=ler.nextInt();
	
	switch (codigo) {
	
	case 1:
		System.out.println("Descri��o: Cachorro Quente");
		System.out.println("Pre�o: R$ 8,00");
		break;
		
	case 2:
		System.out.println("Descri��o: Cheseeburger");
		System.out.println("Pre�o: R$ 12,00");
		break;
		
	case 3:
		System.out.println("Descri��o: X-Salada");
		System.out.println("Pre�o: R$ 15,00");
		break;
			
	case 4:
		System.out.println("Descri��o: Misto Quente");
		System.out.println("Pre�o: R$ 11,00");
		break;
			
	case 5:
		System.out.println("Descri��o: P�o na chapa");
		System.out.println("Pre�o: R$ 6,00");
		break;
		
	default:
		System.out.println("Lanche n�o encontrado");
	ler.close();
	}
}
}
