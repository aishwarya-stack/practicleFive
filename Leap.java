import java.util.*;

public class Leap {
	static int value = (int)(Math.random()*9000)+1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Year"+value);
		
		if ((value % 4 == 0) && value % 100 != 0)
        {
            System.out.println(value + " is a leap year.");
        }
        else if ((value % 4 == 0) && (value % 100 == 0) && (value % 400 == 0))
        {
        	System.out.println(value + " is a leap year.");
        }
        else
        {
        	System.out.println(value + " noleap year.");
        }
	}

}
