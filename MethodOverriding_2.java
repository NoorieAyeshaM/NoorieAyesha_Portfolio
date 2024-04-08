package Week_9;
import java.util.Scanner;
class stdn{
	String name;
	float[] CIE= {0,0,0};
	float avg;
	byte rollNo;
	void setstdn (String n, float ia[], byte rno) {
		name=n;
		avg=0.0f;
		rollNo=rno;
		for (byte i=0;i<3;i++) {
			CIE [i]=ia[i];
			this.calculateAverage();
		}
	}
	void calculateAverage () {
		float sum=0.0f;
		for (byte i=0;i<3;i++) {
			sum=sum+CIE [i];
			avg=sum/3.0f;
		}
	}
	void showstdn() {
		System.out.println(rollNo+"\t"+name+"\t"+avg);
	}
}
	class Grade extends stdn {
		final byte grace=10;
		float attendence;
		Scanner sc=new Scanner(System.in);
		void setstdn (String n, float ia[], byte rno) {
			System.out.println("enter the attendence of student....");
			attendence=sc.nextFloat();
			if (attendence>=75.0f) {
				ia [2]=grace;
				super.setstdn(n,ia,rno);
			}
			else {
				super.setstdn (n,ia,rno);
			}
		}
	}

public class MethodOverriding {
	public static void main(String[] args) {
		Grade deeps=new Grade(); float[] CIE= {18.4f,23.7f,0};
		deeps.setstdn("Deepika", CIE, (byte) 15);
		System.out.println("Rollno\tname\tAverage");
		System.out.println("the internal details of a student");
		deeps.showstdn();
	}
}
