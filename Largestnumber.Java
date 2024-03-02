import java.util.Scanner;
public class Largestnumber 
{
    public static void main(String[] args) 
{
	Scanner cs=new Scanner(System.in);
	int num1=cs.nextInt();
	System.out.println("enter the first number");
	int num2=cs.nextInt();
	System.out.println("enter the first number");
	int num3=cs.nextInt();
	System.out.println("enter the first number");
	int largest;
	if(num1>num2)
	{
		if(num1>num3)
	        largest=num1;
		else
			largest=num3;
	}
	else 
 {
		if(num2>num3)
			largest=num2;
		else
			largest=num3;
	}
	System.out.println("the largest number is"+largest);
	}
}
