import java.io.BufferedReader;
import java.io.InputStreamReader;
class Student
{
	String name, course; int rno; float ial, ia2, ia3, avg;
	Student ()
	{
		try
      {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (isr);
			System.out.println("Enter Roll Number of Student.");
			rno=Integer.parseInt(br.readLine());
			System.out.println("Enter Name of Student.");
			name=br.readLine();
			System.out.println("Enter Course of Student.");
			course=br.readLine();
			System.out.println("Enter First CIE score of the Student.");
			ial=Float.parseFloat(br.readLine());
			System.out.println("Enter Second CIE score of the Student.");
			ia2=Float.parseFloat(br.readLine());
			System.out.println("Enter Third CIE score of the Student.");
			ia3=Float.parseFloat(br.readLine());
			avg=(ial + ia2 + ia3 ) / 3;
	    }
		catch (Exception e)
		{
			System.out.println("Run Time Error Occured while reading input..."); e.printStackTrace();
		}
		}
	void displayStudentDetails()
	{
		System.out.println(rno+"\t"+name+"\t\t"+course+"\t"+ial+"\t"+ia2+"\t"+ia3+"\t"+avg);
	}
	}
class arrayofStudent 
{
	public static void main(String a[])
  {
	Student list[]=new Student [5];
/* Initialize array of objects individually*/
	for (int i=0;i<list.length;i++)
		list[i]=new Student();
	System.out.println("\n*** **");
	System.out.println("R.No\tName\t\tCourse\tCIE-I\tCIE-II\tCIE-III\tAvg");
	System.out.println("\n****************************************************************");
	for(int i=0;i<3;i++)
		list[i].displayStudentDetails();
	System.out.println("\n****************************************************************");
	}
}
