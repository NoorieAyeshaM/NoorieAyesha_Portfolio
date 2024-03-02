package week5;
import java.util.Scanner;
public class VowelorNot 
{
	 public static void main(String[] args) 
   {
		 boolean isVowel=false;
	     System.out.println("Enter a character/ alphabet:");
	     Scanner cs=new Scanner(System.in);
		 char ch=cs.next().charAt(0);
		 switch(ch)
		 {
		 case'A':
		 case'E':
		 case'I':
		 case'O':
		 case'U':
		 case'a':
		 case'e':
		 case'i':
		 case'o':
		 case'u':isVowel=true;
		 }
         if(isVowel=true)
         System.out.println(ch+"is an vowel");
         else
         System.out.println(ch+"is a consonant");
	 }
}
