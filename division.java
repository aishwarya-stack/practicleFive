import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter the number");
     Scanner number=new Scanner(System.in);
     int no=number.nextInt();
     
     System.out.println("enter the divisor");
     int divisor=number.nextInt();
     
     int remainder=no % divisor;
     int quotient=no/divisor;
     
     System.out.println("remainder"+remainder);
     System.out.print("quotient"+quotient);
     
	}

}
