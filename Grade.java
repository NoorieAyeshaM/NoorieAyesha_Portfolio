import java.util.Scanner;
public class Grade 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks:");
        int result=sc.nextInt();
        char grade;
        if(result>=80)
        {
    	    grade='A';
        }
        else if(result>=70)
        {
    	    grade='B';
        }
        else if(result>=60)
        {
    	    grade='C';
        }
        else if(result>=50)
        {
    	    grade='D';
        }
        else {
    	    grade='F';
            System.out.println("Failed");
            //break;
        }
        System.out.println("grade of the student is"+grade);
	}

}
