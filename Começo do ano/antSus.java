import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;
	public class antSus{
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int  antecessor,sucessor ,numero;
		System.out.println("apresente o numero :");
		numero =ler.nextInt();
		sucessor= numero+1;
		antecessor= numero-1;
		System.out.println("O sucessor do numero é :" + sucessor);
		System.out.println(" o antecessor do numero é :" +antecessor);
		
	}
}
