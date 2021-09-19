import java.util.*;
public class coin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int head_tail=(int) (Math.floor(Math.random()*10 ) % 2);
 	 int count;
	 if(head_tail==1)
	 {
		 System.out.println("Head");
		  count=1;
		 int percentage=count/2;
		
	 }
	 else
	 {
		 System.out.println("Tail");
		  count=1;
	 }
		 //int count;
		int percentage=(count * 100) / 2;
		System.out.println("percentage of tail"+percentage);
			
	 }
	 
	  //int count;
	 
	
	  

}
