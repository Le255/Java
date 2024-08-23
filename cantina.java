import java.util.*;
public class cantina {
public static void main(String[] args) {
	Scanner ler=new Scanner (System.in);
	int codigo;
	System.out.println("Informe o código do produto escolhido");
	codigo=ler.nextInt();
	
	switch (codigo) {
	
	case 1:
		System.out.println("Descrição: Cachorro Quente");
		System.out.println("Preço: R$ 8,00");
		break;
		
	case 2:
		System.out.println("Descrição: Cheseeburger");
		System.out.println("Preço: R$ 12,00");
		break;
		
	case 3:
		System.out.println("Descrição: X-Salada");
		System.out.println("Preço: R$ 15,00");
		break;
			
	case 4:
		System.out.println("Descrição: Misto Quente");
		System.out.println("Preço: R$ 11,00");
		break;
			
	case 5:
		System.out.println("Descrição: Pão na chapa");
		System.out.println("Preço: R$ 6,00");
		break;
		
	default:
		System.out.println("Lanche não encontrado");
	ler.close();
	}
}
}
