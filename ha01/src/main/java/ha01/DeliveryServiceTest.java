package ha01;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeliveryServiceTest {

	 @Test public void test() 
	{
		DeliveryService FastFoodService=new DeliveryService();
		
		PizzaShop PizzaShop=new PizzaShop();
		FastFoodService.setSubcontractor(PizzaShop);
		FastFoodService.deliver(42,"WilliAlle73");
		
		BurgerBude BurgerBude=new BurgerBude();
		FastFoodService.setSubcontractor(BurgerBude);
		FastFoodService.deliver(42,"WilliAlle73");
		
		DoenerLaden DoenerLaden=new DoenerLaden();
		FastFoodService.setSubcontractor(DoenerLaden);
		FastFoodService.deliver(42,"WilliAlle73");
		
		// drei neue Lines + Klasse Steak House 
		SteakHouse SteakHouse=new SteakHouse();
		FastFoodService.setSubcontractor(SteakHouse);
		FastFoodService.deliver(42,"WilliAlle73");
	}

}

