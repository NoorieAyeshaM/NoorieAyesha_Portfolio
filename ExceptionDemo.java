import java.lang.*;
class NumberRangeException extends Exception{
	String message;
	NumberRangeException(String msg){
		this.message=msg;
	}
	public String getMessage(){
		return message;
	}
}
public class ExceptionDemo{
	public static void main(String args[]) {
		int number=20;
		try{
			if(number<10||number>20)
					{
				throw new NumberRangeException("number not within specified range");
					}
			System.out.println("the number in range is:"+number);
		}
		catch(NumberRangeException nre){
			System.out.println(nre.getMessage());
		}
	}
}
