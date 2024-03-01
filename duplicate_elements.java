import java.util.Scanner;
public class duplicate_elements 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) 
        {
            array[i] = scanner.nextInt();
        }
        System.out.println("Does the array contain any duplicate elements? " + hasDuplicates(array));
    }

    public static boolean hasDuplicates(int[] array) 
  {
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = i + 1; j < array.length; j++) 
            {
                if (array[i] == array[j]) 
                {
                    return true;
                }
            }
        }
        return false;
    }
}
