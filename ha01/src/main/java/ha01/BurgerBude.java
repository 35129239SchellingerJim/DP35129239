package ha01;

public class BurgerBude extends Caterer
{
	public void deliver(int foodNo,String addr)
	{
		System.out.println("Burger "+foodNo+" an "+addr+" geliefert");
	}
}
