public class vowelCount
{
/* This function to count number of vowels,consonants,digits and special character in a string.*/
   static void countCharacterType(String str)
   {
	   //Declare the variables for number of counts vowels,consonants,digit and special characters
	   byte vowelsCount=0,consonantCount=0,digitCount=0,splChars=0;
	   for (short i=0; i<str.length(); i++)
	   {
		   char ch=str.charAt(i);
		   if ((ch>='a'&& ch<='z') || (ch >='A'&& ch<='Z'))
		   {
			   ch=Character.toLowerCase(ch);
			   if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				   vowelsCount++;
			   else
				   consonantCount++;
		   }
		   else if (ch >= '0'&& ch <='9')
			   digitCount++;
		   else
			   splChars++ /* This counts including white spaces */;
	   }
	   System.out.println("The total number of Vowels in the given string:"+vowelsCount);
	   System.out.println("The total number of Consonant in the given string:"+consonantCount);
	   System.out.println("The total number of Digits in the given string:"+digitCount);
	   System.out.println("The total number of Special Character in the given string:"+splChars);
   }
   static public void main (String[]args)
   {
	   String str=("Habiit-2:Begin with an end in your mind.\n Stephen R. Covey author of 7 habits of Effective People, suggests that effcetive individuals have a clear vision of their desired destination before embarking on any endeavor.");
	   countCharacterType(str);
   }
}
