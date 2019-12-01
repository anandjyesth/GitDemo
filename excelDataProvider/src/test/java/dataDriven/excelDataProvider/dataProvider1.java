package dataDriven.excelDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider1 {
	
	@Test (dataProvider = "testdata")
	
	public void getData(String ip1, String ip2, String ip3) {
		
		System.out.println(ip1 + ip2 + ip3);
		
	}
	
	
	@DataProvider(name = "testdata")
	
	public Object[][] sendData()
	{
		Object [][] data = {{"hello1", "hello2", "text1"},{"hello1", "hello2", "text2"},{"hello1", "hello2","text3"}};
		
		return data;

}
}
