package lacoderepeticao;

public class Tabuada2 {
	public static void main(String[] args) {
		int tab=1, i, res=0;
		
		i=1;
		while (tab<10) {
			
			while(i<11) {
				res=i*tab;
				System.out.println(tab+"x"+i+"="+ res);
				i=i+1;
			}
			i=2;
			
			tab=tab+1;
				while(i<11) {
				res=i*tab;
				System.out.println(tab+"x"+i+"="+ res);
				i=i+1;
			}
		}
			
			
	}
	}

