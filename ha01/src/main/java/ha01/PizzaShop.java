package ha01;

public class PizzaShop extends Caterer
{
	public void deliver(int foodNo,String addr)
	{
		System.out.println("Pizza "+foodNo+" an "+addr+" geliefert");
	}
}
