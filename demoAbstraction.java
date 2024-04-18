package week10;
abstract class myCalculator
{
	abstract void performArithmetic (int operand1 ,int operand2);
}
class performAddition extends myCalculator
{
	void performArithmetic(int num1,int num2)
	{
		System.out.println("the addition of two number is..."+(num1+num2));
	}
}
class performSubstraction extends myCalculator
{
	void performArithmetic(int num1,int num2)
	{
		System.out.println("the difference of two number is..."+(num1-num2));
	}
}
class performMultipliction extends myCalculator
{
	void performArithmetic(int num1,int num2)
	{
		System.out.println("the product of two number is..."+(num1*num2));
	}
}
class performDivision extends myCalculator
{
	void performArithmetic(int num1,int num2)
	{
		System.out.println("the remainder after division of two number is..."+(num1%num2));
	}
}
public class demoAbstraction
{
	public static void  main(String[] args)
	{
		performAddition sum = new performAddition();
		sum.performArithmetic(20,30);
		performSubstraction diff = new performSubstraction();
		diff.performArithmetic(120,30);
		performMultipliction product=new performMultipliction();
		product.performArithmetic(12,33);
		performDivision rem=new performDivision();
		rem.performArithmetic(12,33);
	}

}
