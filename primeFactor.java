import java.util.*;
public class primeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numPowersOf2;        
		int nextPowerOf2 = 1;    
		//Current power of  2
		int exponent = 0;            
        numPowersOf2 = 30;
System.out.println("Here are the number are " + numPowersOf2 + " power of 2");
while (exponent<numPowersOf2)
		{
		     nextPowerOf2=nextPowerOf2*2;
		     exponent++;
		     System.out.println(nextPowerOf2);
		            
		 }
		 
	}

}
