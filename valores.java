import java.util.Scanner;
public class valores {
			public class tresValores {
				public static void main(String[] args) {
					Scanner ler= new Scanner(System.in);
					int a,b,c;
					System.out.println("Digite o primeiro valor");
			     a=ler.nextInt();
			     System.out.println("Digite o segundo valor");
			     b=ler.nextInt();
			     System.out.println("Digite o terceiro valor");
			     c=ler.nextInt();
			     if (a<b && b<c){
			     System.out.println(" a ordem � "+c+" ,"+b+" ,"+a);
			     }else if(b<a && a<c) {
			    	 System.out.println("a ordem � :"+c+","+a+" ,"+b);
			     }else if(c<a && a<b) {
			    	 System.out.println( "a ordem �:"+b+" ,"+a+" , "+c);
			     }else if (a<c && c<b) {
			    	 System.out.println("a ordem �: "+b+" ,"+c+" ,"+a);
			     }else if (c<b && b<a) {
			    	 System.out.println("a ordem �: "+a+" ,"+b+" ,"+c);
			     }else if (b<c && c<a) {
			    	 System.out.println("a ordem �: "+a+" ,"+c+" ,"+b );
			     }
				}

			}
		}

