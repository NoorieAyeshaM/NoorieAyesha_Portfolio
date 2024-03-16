package week6;
import student.Student;
import requestbook.RequestBook;
import issuebook.IssueBook;

public  class demoSRp {
    public static void main(String[] args) {
        Student sony = new Student();
        sony.setname("Sony Mathew");
        sony.setregisterNO("119cs22048");
        RequestBook rb = new RequestBook();
        rb.setbookName("java programming");
        rb.setduration(2);
        rb.setStudent(sony);
        rb.searchBook();
        IssueBook ibOrder = new IssueBook(rb);
        ibOrder.issubook();
    }
}
package student;

public class Student {
    private String name;
    private String registerNO;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getregisterNo() {
        return registerNO;
    }

    public void setregisterNO(String rno) {
        this.registerNO = rno;
    }
}
package requestbook;
	
import student.Student;

import java.util.Random;

public class RequestBook {
    private Student student;
    private String requestID;
    private String bookName;
    private int duration;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getrequestID() {
        return requestID;
    }

    public void setrequestId(String bookName) {
        Random random = new Random();
        this.requestID = (bookName + "_" + random.nextInt(500));
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
        setrequestId(bookName);
    }

    public int getduration() {
        return duration;
    }

    public void setduration(int duration) {
        this.duration = duration;
    }

    public void searchBook() {
        System.out.println("searching book for student - " + this.getStudent().getname() + " who has requested " + this.getbookName());
    }
}
package issuebook;
import student.Student;
import requestbook.RequestBook;

public class IssueBook {
    private RequestBook rb;

    public IssueBook(RequestBook rb) {
        this.rb = rb;
    }

    public void issubook() {
        System.out.println("issuing the book");
        System.out.println("with request id as " + this.rb.getrequestID() + " being issued to " + this.rb.getStudent().getname());
        System.out.println("book is to be delivered to: " + this.rb.getStudent().getregisterNo());
    }
}
