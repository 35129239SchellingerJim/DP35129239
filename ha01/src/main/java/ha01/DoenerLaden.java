package ha01;

public class DoenerLaden extends Caterer
{
	public void deliver(int foodNo,String addr)
	{
		System.out.println("Doener "+foodNo+" an "+addr+" geliefert");
	}
}

