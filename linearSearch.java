import java.util.Scanner;
public class linearSearch 
{
	public static void main(String args[])
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n= sc.nextInt();
		int[] array= new int[n];
		System.out.println("Enter the array elements");
		for (int i=0; i<n; i++)
    {
			array[i]= sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int searchElement= sc.nextInt();
		boolean found= false;
		for (int i=0; i<n; i++)
{
			if (array[i]== searchElement) 
      {
				System.out.println("Element found at index :" +i);
				found= true;
				break;
			}
}
		if (!found){
			System.out.println("Element not found in the array");
		}
	}
}
