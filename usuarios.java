import java.util.*;
public class usuarios {
	public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
	     int id1,id2,id3,id4,id5;
	   String user1,user2,user3,user4,user5;
	     System.out.println("digite o nome da primeira pessoa");
	     user1=ler.next();
	     System.out.println("digite a idade da primeira pessoa");
	     id1=ler.nextInt();
	     System.out.println("digite o nome da segunda pessoa");
	     user2=ler.next();
	     System.out.println("digite a idade da segunda pessoa");
	     id2=ler.nextInt();
	     System.out.println("digite o nome da terceita pessoa");
	     user3=ler.next();
	     System.out.println("digite a idade da terceira pessoa");
	     id3=ler.nextInt();
	     System.out.println("digite o nome da quarta pessoa");
	     user4=ler.next();
	     System.out.println("digite a idade da quarta pessoa");
	     id4=ler.nextInt();
	     System.out.println("digite o nome da quinta pessoa");
	     user5=ler.next();
	     System.out.println("digite a idade da quinta pessoa");
	     id5=ler.nextInt();
	     
	     if (id1<id2 && id2<id3 && id3<id4 && id4<id5 ) {
	     System.out.println(" a ordem do mais novo ate o mais velho é : "+id1+" ,"+user1+" ,"+id5+" ,"+user5);
	 }else if (id2<id1 && id1<id3 && id3<id4 && id4<id5 ) {
	     System.out.println(" a ordem do mais novo ate o mais velho é : "+id2+" ,"+user2+ " ,"+id5+" ,"+user5);
	 }else if(id3<id2 && id2<id1 && id1<id4 && id4<id5 ) {
	      System.out.println(" a ordem do mais novo ate o mais velho é : "+id3+" ,"+user3+","+id5+" , "+user5);
	 }else if (id4<id3 && id3<id2 && id2<id1&& id1<id5 ) {
	      System.out.println(" a ordem do mais novo ate o mais velho é : "+id4+" , "+user4+","+id5+"  ,"+user5);
	 }else if(id5<id3 && id3<id2 && id2<id1 && id1<id4 ) {
	     System.out.println(" a ordem do mais novo ate o mais velho é : "+id5+", "+user5+" ,"+id4+","+user4);
	 }else if (id1<id5 && id5<id3 && id3<id2&& id2<id4 ) {
	     System.out.println(" a ordem do mais novo ate o mais velho é : "+id1+" ,"+user5+" ,"+id4+","+user4);
	 }else if (id2<id1 &&id1<id5 && id5<id3 && id3<id4) {
	      System.out.println(" a ordem do mais novo ate o mais velho é : "+id2+" , "+user2+","+id4+","+user4);
	 }else if(id3<id2 && id2<id1 && id1<id5 && id5<id4) {
	      System.out.println(" a ordem do mais novo ate o mais velho é : "+id3+" ,"+user3+","+id4+","+user4);
	 }else if (id4<id5 && id5<id2 && id2<id1 && id1<id3) {
	       System.out.println(" a ordem do mais novo ate o mais velho é : "+id4+","+user4+" ,"+id3+","+user3);
	 }else if (id1<id4 && id4<id5 && id5<id2 && id2<id3) {
	       System.out.println(" a ordem do mais novo ate o mais velho é : "+id1+" ,"+user1+","+id3+","+user3);
	 }else if (id2<id1&&id1<id4 && id4<id5 && id5<id3) {
	       System.out.println(" a ordem do mais novo ate o mais velho é : "+id2+" ,"+user2+","+id3+","+user3);
	 }else if (id5<id2 && id2<id1 && id1<id4 && id4<id3) {
	       System.out.println(" a ordem do mais novo ate o mais velho é : "+id5+" ,"+user5+","+id3+","+user3);
	 }else if (id5<id4 && id4<id3 && id3<id1 && id1<id2) {
	       System.out.println(" a ordem do mais novo ate o mais velho é : "+id5+" ,"+user5+" ,"+id2+","+user2);
	 }else if (id1<id5 && id5<id4 && id4<id3 && id3<id2) {
	        System.out.println(" a ordem do mais novo ate o mais velho é : "+id1+" ,"+user1+","+user2+","+user2);
	 }else if (id3<id1&& id1<id5 && id5<id4 && id4<id2) {
            System.out.println(" a ordem do mais novo ate o mais velho é : "+user3+" ,"+user3+","+id2+","+user2);
     }else if (id4<id3 && id3<id1 && id1<id5 && id5<id2) {
	       System.out.println(" a ordem do mais novo ate o mais velho é : "+id4+" ,"+user4+","+id2+","+user2);
	 }else if (id5<id4 && id4<id3 && id3<id2 && id2<id1) {
	       System.out.println(" a ordem do mais novo ate o mais velho é : "+id5+" , "+user5+" ,"+id1+","+user1);
	 }else if (id2<id5 && id5<id4 && id4<id3 && id3<id1) {
	       System.out.println(" a ordem do mais novo ate o mais velho é : "+id2+","+user2+" ,"+id1+","+user1);
	 }else if (id3<id2 && id2<id5 && id5<id4 && id4<id1) {
	       System.out.println(" a ordem do mais novo ate o mais velho é : "+id3+" ,"+user3+","+id1+","+user1);
     }else  if(id4<id3 && id3<id2 && id2<id5 && id5<id1) {
	        System.out.println(" a ordem do mais novo ate o mais velho é : "+id4+" ,"+user4+","+id1+","+user1);
		  
	  }
	 }
}

