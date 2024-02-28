public class Employee 
{
	String empName;
	int empNo;
	byte expYrs;
	double basicSalary;
	double bonus;
	double netSalary;
	void setEmployee(String Name,int no,String gender,String sex,byte ex,double basicsalary)
	{
		empName=Name;
	    empNo=no;
	    gender=sex;
	    expYrs=ex;
	    basicSalary=basicsalary;
	}
	void getEmployeeDetails()
	{
	String gender = null;
	if(gender=="female")
	{
		bonus=basicSalary*10/108;
		netSalary=basicSalary+bonus;
	}
	else
		netSalary=basicSalary;
	    System.out.println(empName+"It"+empNo+"\t"+gender+"\t"+expYrs+"It"+basicSalary+"\t"+bonus+"\t"+netSalary+"\n");
	}
	public void setEmployee(String string, int i, String string2, byte b, double d) {
		// TODO Auto-generated method stub
		
	}
}
class EmployeeDetails
{
	public static void main(String args[])
	{
	Employee Rahul=new Employee();
	Rahul.setEmployee( "Rashmi",128966,"female",null, (byte)20,100000.0d);
	System.out.println("empNane\tempNo\tgender\texpYrs\tbasicSalary\tbonus\tnetSalary\n");
	Rahul.getEmployeeDetails();
	Employee Rakesh=new Employee();
	Rakesh.getEmployeeDetails();
	Employee madhu=new Employee();
	madhu.setEmployee("Madhu",7851161,"female", (byte)25,150800.0d);
  }
}
