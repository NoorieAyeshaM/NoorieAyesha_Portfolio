import java.util.Scanner;
public class Finalize 
{
	public static void main(String[] args) 
  {
		studentl abhinav = new studentl();
		abhinav.display();
		System.out.println("Object reference is..abhinav.finalise();"+ abhinav);
		abhinav.finalise();
		System.gc();
		System.out.println("Object garbage collected")
   }
}
class studentl
{
		String name;
		int rno;
		float res;
		Scanner sc = new Scanner (System.in);
	    studentl()
 {
	System. out. println ( "Enter Rol1 Number Of Student ");
	rno = Integer.parseInt (sc.next ());
	System.out.println("Enter Name Of Student");
	name = sc.next ();
	System.out.println("Enter Result of the Student");
	res = Float.parseFloat(sc.next());
 }
	void display() 
  {
	System.out.println(rno + "It\t" + name + "It\t" + res);
  }
	protected void finalise() 
  {
	sc.close();
	System.out.println("Object Cleaned Up By Finalize Method");
  }
}
