import java.util.*;
public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //System.out.println("enter the number")
	int no1,no2,no3;
     Scanner number=new Scanner(System.in);
     System.out.println("enter the first no");
     no1=number.nextInt();
     System.out.println("enter the second number");
     no2=number.nextInt();
     System.out.println("enter the third number");
     no3=number.nextInt();
     if(no1>no2 && no1>no3)
     {
    	 System.out.println("no1 is greatest");
     }
     else if(no2>no3 && no2>no1) 
     {
    	 System.out.println("no2 is greatest");
     }
     else 
     {
    	 System.out.println("no3 is greatest");
     }
     

     
	}

	

}
