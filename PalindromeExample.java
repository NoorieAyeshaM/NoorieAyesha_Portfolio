package week5;
import java.util.Scanner;
public class PalindromExample 
{
    public static void main(String[] args) 
  {
        int num,rev=0,rem;
        Scanner inScanner=new Scanner(System.in);
        System.out.println("enter the number");
        num=inScanner.nextInt();
        int temp=num;
        while(num!=0)
        {
        	rem=num%10;
        	rev=(rev*10)+rem;
        	num=num/10;
        }
        if(temp==rev)
        	System.out.println(temp+"is a palindrome number");
        else
        	System.out.println(temp+"is not a palindrome number");
	}
}
