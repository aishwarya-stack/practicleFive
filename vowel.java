import java.util.*;
public class vowel {
public static void main(String[] arg)
{
	 System.out.println("Enter a character :");
     Scanner sc = new Scanner(System.in);
     char ch = sc.next().charAt(0);
     if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
        System.out.println("Given character is an vowel");
     }else{
        System.out.println("Given character is a consonant");
     }
	
    }
}


