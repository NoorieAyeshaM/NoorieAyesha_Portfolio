package week6;
import java.util.Random;
public class Demosingleresponsibility 
{
	publicstaticvoid main(String args[])
	{
		Student sony =newStudent();
		sony.setName("sonymathew");
		sony.setregisterno("119CS2001");
		requestbookrb=newrequestbook();
		rb.setbookName("java progrmming");
		rb.setduration(2);
		rb.setStudent(sony);
		rb.searchbook();
		Issuebookiborder=newIssuebook(rb);
		iborder.issuebook();
	}
}
class Student
{
	private String name;
	private String registerno;
	public String getName() { returnname;}
	publicvoidsetName(String name) {this.name=name;}
	public String getregisterno() {returnregisterno;}
	publicvoidsetregisterno(String rno)
	{
		this.registerno=rno;
	}
}
classrequestbook
{
	private Student student;
	private String requestID;
	private String bookName;
	privateintduration;
	public Student getStudent() {returnstudent;}
	
	publicvoidsetStudent(Student student)
	{
		this.student=student;
	}
	public String getrequestID() {returnrequestID;}
	publicvoidsetrequestID(String bookName)
	{
		Random random=newRandom();
		this.requestID=(bookName +"-"+ random.nextInt(500));
	}
	public String getbookName() {returnbookName;}
	publicvoidsetbookName(String bookName)
	{
		this.bookName=bookName;
		setrequestID(bookName);
	}
	publicintgetduration() {returnduration;}
	publicvoidsetduration(intduration)
	{
		this.duration=duration;
	}
	publicvoidsearchbook()
	{
		System.out.println("searching book for student-"+this.getStudent().getName()+"who has requested "+this.getbookName());
	}
}
classIssuebook
{
	privaterequestbookrb;
	publicIssuebook(requestbookrb) {this.rb=rb;}
	publicvoidissuebook()
	{
		System.out.println("issuing the book");
		System.out.println("with the request id as"+this.rb.getrequestID()+"bieng issued to"+this.rb.getStudent().getName());
		System.out.println("book is to be delivered to:"+this.rb.getStudent().getregisterno());
	}
}
