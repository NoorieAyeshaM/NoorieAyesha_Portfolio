import java.util.Scanner;
public class ArmStrong 
{
    public static void main(String[] args) 
  {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the value of n:");
    	int n=sc.nextInt();	
    	int sum=0;
    	int num=n;
    	int rem=0;
    	do 
      {
    		rem=num%10;
    		sum=sum+(rem*rem*rem);
    		num=num/10;
    	}
    	while(num>0);
    	{
    	if(sum==n)
    	{
    		System.out.println("num is armStrong number");
      }
    	else 
      {
    		System.out.println("number is not armStrong number");
    	}
    	}
	}
}
