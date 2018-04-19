package ha01;

public class DeliveryService 
{
	private Caterer Sub; 
	public void setSubcontractor(Caterer einSub) 
	{
		this.Sub=einSub;
	}
	
	public void deliver(int foodNo,String address)
	{
		this.Sub.deliver(foodNo, address);
	}
}
