package postObject;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import anotherjson.items;
import anotherjson.pojo;
import anotherjson.popup;

public class postAnotherJsonAsObj {

	@Test
public void postJsonObj() 
{
		
	//setup Menu
	pojo POJO = new pojo();
	POJO.setId("ID");
	POJO.setValue("VALUE");
	
	//SETUP MENUITEMS	
	
	items Item = new items();
	
	Item.setOnclick("onclick");
	Item.setValue("value");
	
	
items Item2 = new items();
	
	Item2.setOnclick("onclick2");
	Item2.setValue("value2");
	
	
	//setup popup items
	List <items> item = new ArrayList();
	
	item.add(Item2);
	item.add(Item);
	
	popup pops = new popup();
	pops.setMemuitem(item);
	
	
	
	
	
	
	
	
	
	
}
	

}
