public class Commandline
{
	publicstaticvoid main(String args[])
	{
		if(args.length>0)
		{
			System.out.println("java buzzwords...");
			for (bytei=0;i<args.length;i++)
			{
				System.out.println(i+1+"."+ args[i]);
			}
		}
		else
		{
			System.out.println("NO COMMAND LINE ARGUMENT FOUND");
		}
	}
}
