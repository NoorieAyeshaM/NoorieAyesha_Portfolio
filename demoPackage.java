package emp;
import java.util.Scanner;
public class Employee 
{
	Short empId;
	public int expYears;
	String empName;
	public float salary;
	public Employee() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter employee number...");
		empId=Short.parseShort(sc.next());
		System.out.println("enter employee name");
		empName=sc.next();
		System.out.println("enter employee gross salary");
		salary=Float.parseFloat(sc.next());
		System.out.println("enter employee years of 
           experience");   
		expYears=Integer.parseInt(sc.next());
	}
	public void getEmployee() 
	{
	  System.out.println("empId+"\t"+empName+"\t"+expYears+"\t"+
       salary");
  }
}
*****************************************************************
package bonus;
import emp.Employee;
public class issuebonus 
{
	public static void issueEmployeeBonus(Employee emp) 
	{
		if(emp.expYears>10)
			emp.salary=emp.salary+(emp.salary* 0.15f);
		else
			emp.salary=emp.salary+(emp.salary* 0.05f);	
	}
}
*****************************************************************
package Week6;
import emp.Employee;
import bonus.issuebonus;
public class demoPackage 
{
	public static void main(String[] args) 
	{
		System.out.println("this program illustrates use of 
           packages");
		Employee list[]= new Employee[3];
		/* initialize array of objects individually*/
		for(byte i=0; i<list.length; i++)
			list[i]=new Employee();
		System.out.println("\n*****************************
           **********"); 		
		System.out.println("empId empName expYear salary");
		System.out.println("\n*****************************
           ***********");
		for (byte i=0; i<list.length; i++) 
		{
			issuebonus.issueEmployeeBonus(list[i]);
			list[i].getEmployee();
	  }                                		
      System.out.println("\n*****************************
      ************");
	}
}
