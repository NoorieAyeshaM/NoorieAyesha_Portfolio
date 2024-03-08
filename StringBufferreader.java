import java.lang.String;
import java.lang.StringBuffer;
public class StringBufferreader 
{
	public static void main(String args[]) 
 {
		System.out.println("This code illustrates use of string class and its methods");
		System.out.println("*************************");
		String str=new String("Train your mind to see good in everything");
		System.out.println("The initial Strings is:\t"+str);
		System.out.println("After replacing 'o'with'O'"+ str.replace('o', 'O'));
	    System.out.println("The length of given String is:\t"+str.length());
	    System.out.println("The Occurrence of the charcter G is at position:\t"+str.indexOf('G'));
	    System.out.println("The lowercase of the string is:\t"+str.toLowerCase());
	    System.out.println("The Uppercase of the string is:\t"+str.toUpperCase());
	    System.out.println("The extracted sub string is:\t"+str.substring(27));
        String s="		Hello World		";
        System.out.println("The string with space :"+s);
        System.out.println("The string with Leading and Trailing spaces:\t"+s);
        System.out.println("the string without space:\t"+s.trim());
        if(s.isEmpty())
        	System.out.println("The string is empty");
        else
        	System.out.println("The strinf is not empty"+s);
        s=null;
        System.out.println("The string is after modfying...\t"+s);
        System.out.println("*************************\n");
        System.out.println("This code illustrates use of string");
        System.out.println("*************************\n");
        StringBuffer strbuf=new StringBuffer();
        System.out.println("The initial capacity of the buffer is"+strbuf.capacity());
        strbuf.append("Hello");
        System.out.println("the string Buffer:\t"+strbuf);
        strbuf.setLength(20);
        strbuf.insert(5,"welcome to the world of java");
        System.out.println("the capacity of string buffer after appending"+strbuf.capacity());
        System.out.println("the reverse of given string buffer is:"+strbuf.reverse());
        System.out.println("The buffer after deleting\t"+strbuf.delete(5,43));
        System.out.println("***************************");
	}
}
