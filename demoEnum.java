enum Signal
{
	RED,YELLOW,GREEN
}
class CheckSignal
{
	Signal currentSignal;
	public CheckSignal(Signal cs)
	{
		this.currentSignal=cs;
	}
	public void makeRide()
	{
		switch(currentSignal)
		{
		case RED:
			System.out.println("the signal is RED.\n kindly wait until it turn to GREEN");
			break;
		case YELLOW:
			System.out.println("the signal is YELLOW.\n kindly wait look around and make safe move");
			break;
		case GREEN:
			System.out.println("the signal is GREEN.\n have safe ride");
			break;
		}
	}
}
public class DemoEnum 
{
	public static void main(String[]args)
	{
		CheckSignal myDrive =new CheckSignal(Signal.GREEN);
		myDrive.makeRide();
	}
}
