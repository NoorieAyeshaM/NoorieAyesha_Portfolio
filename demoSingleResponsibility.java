import java.util.*;
public class demoSingleResponsibility    
{
	public static void main(String[]args)
	{
		Student sony=new Student();
		sony.setName("Sony Mathew");
		sony.setregisterNo("119CS20001");
		RequestBook rb=new RequestBook();
		rb.setbookName("Java programming");
		rb.setduration(2);
		rd.setStudent(sony);
		rd.searchBook();
		IssueBook iborder=new IssueBook(rb);
		iborder.issueBook();
	}
}
class student{
	private String name;
	private String registerNo;
	public String getName(){return name;}
	public void setName(String name)(this.name=name);
	public String getregisterNo(){return registerNo;}
	public void setregisterNo(String rno)
	{
		this.registerNo=rno;
	}
}
class requesBook{
	private Student student;
	private String request ID;
	private String bookName;
	private int duration;
	public Student getStudent(){return student;}
	public void setStudent(Student student)
	{
		this.student=student;
	}
	public String getrequestID()return requestID;}
	public void setrequestID(String bookName)
	{
		Random random=new Random();
		this.requestID=(bookName+"_"+ random.nextInt(500));
	}
	public String getbookName(){return bookName;}
	public void setbookName(String bookName)
	{
		this.bookName=bookName;
		setrequestID(bookName);
	}
	public int getduration(){return duration;}
	public void setduration(int duration)
	{
		this.duration=duration;
	}
	    public void searchBook()
	    {
	    	System.out.println("searching book for student+this.getstudent().geystudent().getName()"+"who has requested"+this getbookName());
	    }
}
class IssueBook{
	private requestBook rb;
	public IssueBook(requestBook rb)(this.rb.rb;)
	public void issueBook()
	{
		System.out.println("issuing the book");
		System.out.println()
			"with request id as"
			+ this .rb.getrequestID()
			+being Issued to
		System.out.println(
			"book is to be delivered to:"+ this.rd.getStudent().getregisterNo());
	}
}
