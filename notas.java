import java.util.*;
public class notas {
public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
	int mb, b, r, i, nota, porc, alunos;
	System.out.println("Digite a quantidade de alunos");
	alunos=ler.nextInt();
	System.out.println("Digite a quantidade de alunos com MB");
	mb=ler.nextInt();
	System.out.println("Digite a quantidade de alunos com B");
	b=ler.nextInt();
	System.out.println("Digite a quantidade de alunos com R");
	r=ler.nextInt();
	System.out.println("Digite a quantidade de alunos com I");
	i=ler.nextInt();
	System.out.println("Digite a nota que você deseja verificar (MB=1 B=2 R=3 I=4) ");
	nota=ler.nextInt();
	
	switch (nota) {
	
	case 1:
		porc=100*mb/alunos;
		System.out.println("Há " +(porc)+ "% de alunos com MB");
		break;
		
	case 2:
		porc=100*b/alunos;
		System.out.println("Há " +(porc)+ "% de alunos com B");
		break;
		
	case 3:
		porc=100*r/alunos;
		System.out.println("Há " +(porc)+ "% de alunos com R");
		break;
		
	case 4:
		porc=100*i/alunos;
		System.out.println("Há " +(porc)+ "% de alunos com I");
		break;
		
		default:
			System.out.println("Nota não encontrada");
		ler.close();
	}
	
}
}
