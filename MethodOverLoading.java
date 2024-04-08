package Week_9;
class Student {
	String Name;
	float[] CIE={0,0,0};
	float avg;
	byte rollNo;
	void setStudent (String n, float ia[], byte rno) {
			float sum=0.0f;
			Name=n;
			avg=0.0f;
			rollNo=rno;
			for (byte i=0;i<3;i++) {
				CIE[i]=ia[i];
				sum=sum+CIE[i];
			}
			avg=sum/3.0f;
	}
	void setStudent (String n, float ial, float ia2, byte rno) {
		Name=n;
		rollNo=rno;
		CIE [0]=ial;
		CIE[1]=ia2;
		avg=(CIE [0]+CIE[1])/3.0f;
	}
	void setStudent (String n, float ia, byte rno) {
		Name=n;
		rollNo=rno;
		CIE[0]=ia;
		avg=(CIE [0]+CIE[1])/3.0f;
	}
	void showStudent () {
		System.out.println(rollNo+".\t\t"+Name+"\t\t"+avg+"\t\t");
	}
}
public class MethodOverLoading {
	public static void main(String[] args) {
		Student deeps=new Student();
		System.out.println("the internal details of a Student"); System.out.println("Roll no.\tName\t\tAverage");
		deeps.setStudent("Deepika", 198.4f, (byte) 12);
		deeps.showStudent(); deeps.setStudent("jaya", 198.4f, (byte)2);
		deeps.showStudent ();
		float[] CIE= {12.0f, 14.0f, 19,3f};
		deeps.setStudent("rekha", CIE, (byte) 13);
		deeps.showStudent ();
	}
}
