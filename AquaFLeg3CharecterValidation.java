import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AquaFLeg3CharecterValidation 
{
	WebDriver driver;
	String ExpectedMsg="Saved Data Successfully..";
	
	@BeforeMethod
	public void Setup() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");
 	 driver=new ChromeDriver();
 	driver.get("http://aquaf.cultyvate.com/aquaf/login");
// 	Alert alt=driver.switchTo().alert();
 	Thread.sleep(3000);
	//alt.accept();
 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 	driver.manage().window().maximize();
}
@Test(priority=1)
public void loginToApp() throws InterruptedException
{
  WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
  userName.click(); userName.sendKeys("test"); 
  WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
  password.click(); password.sendKeys("test@123"); 
  Thread.sleep(2000); 
  WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
  submit.click();
  Thread.sleep(3000);
 WebElement leg2click=driver.findElement(By.xpath("//a[text()='Desalinated + Sea Water ']"));
 leg2click.click();
 Thread.sleep(2000);
 Alert alt=driver.switchTo().alert();
 Thread.sleep(2000);
 alt.accept();
}
@Test(priority=2)
public void refill_TANK1_Test() throws InterruptedException
{
loginToApp();
SoftAssert assertion=new SoftAssert();

WebElement  refillwater=driver.findElement(By.xpath("//input[@id='t1_refill']"));
refillwater.click();
refillwater.clear();
System.out.println("refilling water values are cleared");
Thread.sleep(2000);
refillwater.sendKeys("30e");
Actions act=new Actions(driver);
act.sendKeys(Keys.ENTER).perform();
WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
	savechanges.click();
	Thread.sleep(3000);

	Alert alt=driver.switchTo().alert();
	alt.accept();
	Thread.sleep(3000);
	String value=alt.getText();
	System.out.println("the name" +value);
 Thread.sleep(3000);
assertion.assertEquals(value, ExpectedMsg);
assertion.assertAll();

}
    @Test(priority=3)
public void Water_flow_to_T2_Test() throws InterruptedException 
{
    	loginToApp();
    	 SoftAssert assertion=new SoftAssert();
			WebElement watertoflow=driver.findElement(By.xpath("//input[@id='t1_t2_wflow']"));
			watertoflow.click();
			watertoflow.clear();
			Thread.sleep(2000);
			System.out.println("water flow  value are cleared");
			watertoflow.sendKeys("20e");
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);

	  	  WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
	  		savechanges.click();
	  		Thread.sleep(2000);

	  		//CLICK ON ALERT POP UP
	  		Alert alt=driver.switchTo().alert();
	  	 
	  	    Thread.sleep(2000);
	  		alt.accept();
	  		Thread.sleep(3000); 
	  	    String value=alt.getText();
	  	    alt.accept();
			assertion.assertEquals(value, ExpectedMsg);
		    assertion.assertAll();

}
@Test(priority=4)
public void Delay_Between_Pumping_Minute_Test() throws InterruptedException
{
   loginToApp();
	  SoftAssert assertion=new SoftAssert();
  		WebElement delaybetweenpumpingvalue=driver.findElement(By.xpath("//input[@id='t1_delay_min']"));
  		delaybetweenpumpingvalue.click();
  		delaybetweenpumpingvalue.clear();
  		System.out.println("delay between pumping value  value are cleared");
  		Thread.sleep(3000);
  		delaybetweenpumpingvalue.sendKeys("2e");
  		Thread.sleep(2000);
  		Actions act=new Actions(driver);
  		act.sendKeys(Keys.ENTER).perform();
  		WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
  	  		savechanges.click();
  	  		Thread.sleep(2000);

  	  		//CLICK ON ALERT POP UP
  	  		Alert alt=driver.switchTo().alert();
  	  	  
  	  	    Thread.sleep(3000);
  	  		alt.accept();
  	  		Thread.sleep(3000);
  	  		String value=alt.getText();
  	  		alt.accept();
  			assertion.assertEquals(value, ExpectedMsg);
  		    assertion.assertAll();
}



@Test(priority=5)
public void Delay_Between_Pumping_Second_Test() throws InterruptedException
{
   loginToApp();
   SoftAssert assertion=new SoftAssert();
		WebElement delaybetweenpumpingvalueseconds=driver.findElement(By.xpath("//input[@id='t1_delay_sec']"));
		delaybetweenpumpingvalueseconds.click();
		delaybetweenpumpingvalueseconds.clear();
		Thread.sleep(2000);
		System.out.println("delay between pumping value  value are cleared");
		Thread.sleep(3000);
		delaybetweenpumpingvalueseconds.sendKeys("4e");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
	  		savechanges.click();
	  		Thread.sleep(2000);

	  		//CLICK ON ALERT POP UP
	  		Alert alt=driver.switchTo().alert();
	  	    Thread.sleep(3000);
	  		alt.accept();
	  		Thread.sleep(3000);
	  	    String value=alt.getText();
	  	    alt.accept();
			assertion.assertEquals(value, ExpectedMsg);	   
		    assertion.assertAll();
}



@Test(priority=6)
public void click_On_Save_Tank1_Test() throws InterruptedException
{
  loginToApp();
  WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
	savechanges.click();
	Thread.sleep(4000);

	//CLICK ON ALERT POP UP
	Alert alt=driver.switchTo().alert();
    Thread.sleep(3000);
	alt.accept();
	Thread.sleep(3000); 
	
	alt.accept();
}



  @Test(priority=7)
  public void click_On_Tank2_Test() throws InterruptedException
  {
	  loginToApp();
	  
		WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
		Actions act=new Actions(driver);
		act.moveToElement(tank2).perform();
		tank2.click();
		Thread.sleep(3000);
  }
  
  
  
 @Test(priority=8)
 public void T2_to_T3_pH_value_Minimum_Test() throws InterruptedException
 {
	 loginToApp();
	Thread.sleep(2000);
	 click_On_Tank2_Test();
	 Thread.sleep(2000);
	 SoftAssert assertion=new SoftAssert();
		WebElement phvaluemin=driver.findElement(By.xpath("//input[@id='ph_min']"));
	     phvaluemin.click();
		phvaluemin.clear();
		System.out.println("ph value minimum  values are cleared");
		phvaluemin.sendKeys("1e");
		Thread.sleep(3000);
		 WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
	     Actions act1=new Actions(driver);
	     act1.moveToElement(savet2).perform();
	     savet2.click();
		
	     Thread.sleep(3000);
	     Alert alt1=driver.switchTo().alert();
			alt1.accept();
			Thread.sleep(3000);
			String msg=alt1.getText();
			alt1.accept();
			assertion.assertEquals(msg, ExpectedMsg);
			assertion.assertAll();
	    
 }
	 @Test(priority=9)
	 public void ph_Value_Maximum_Test() throws InterruptedException
	 {
		 loginToApp();
		 Thread.sleep(2000);
		  WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
  		Actions act=new Actions(driver);
  		act.moveToElement(tank2).perform();
  		tank2.click();
  		Thread.sleep(3000);
			 SoftAssert assertion=new SoftAssert();
   		WebElement phvaluemax=driver.findElement(By.xpath("//input[@id='ph_max']"));
   	     phvaluemax.click();
   		phvaluemax.clear();
   		System.out.println("ph value minimum  values are cleared");
   		phvaluemax.sendKeys("4e");
   		Thread.sleep(3000);
   		
   		 WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
   	     Actions act1=new Actions(driver);
   	     act1.moveToElement(savet2).perform();
   	     savet2.click();
   		
   	     Thread.sleep(3000);
   	     Alert alt1=driver.switchTo().alert();
   			alt1.accept();
   			Thread.sleep(3000);
   			String msg=alt1.getText();
   			alt1.accept();
   			assertion.assertEquals(msg, ExpectedMsg);
   			assertion.assertAll();
		
 }
 
 
 
 
@Test(priority=10)
public void Water_flow_to_T3_Test() throws InterruptedException
{
	loginToApp();
	  SoftAssert assertion=new SoftAssert();
		 
		WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
		Actions act=new Actions(driver);
		act.moveToElement(tank2).perform();
		tank2.click();
		Thread.sleep(3000);
WebElement waterflowtot3=driver.findElement(By.xpath("//input[@id='t2_t3_wflow']"));
   waterflowtot3.click();
   waterflowtot3.clear();
	System.out.println("water flow to t3  values are cleared");
   Thread.sleep(2000);
   waterflowtot3.sendKeys("30e");
 
   act.sendKeys(Keys.ENTER).perform();
   Thread.sleep(3000);
   WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
    Actions act1=new Actions(driver);
    act1.moveToElement(savet2).perform();
    savet2.click();
    Thread.sleep(3000);
    Alert alt1=driver.switchTo().alert();
		
	   
		alt1.accept();
		 Thread.sleep(3000);
		String msg=alt1.getText();
		alt1.accept();
		System.out.println("the Name"  +msg);
		assertion.assertEquals(msg, ExpectedMsg);
	   assertion.assertAll();
}




@Test(priority=11)
public void Delay_between_pumping_Minute_Tank2_Test() throws InterruptedException
{
   loginToApp();
   WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	Actions act=new Actions(driver);
	act.moveToElement(tank2).perform();
	tank2.click();
	Thread.sleep(3000);
   SoftAssert assertion=new SoftAssert();
	Thread.sleep(2000);
 WebElement delaybetweenpumpingmin=driver.findElement(By.xpath("//input[@id='t2_t3_delay_min']"));
   delaybetweenpumpingmin.click();
   delaybetweenpumpingmin.clear();
 	System.out.println("delay between pumping minimum  value are cleared");
   Thread.sleep(2000);
     delaybetweenpumpingmin.sendKeys("3e");
   
     act.sendKeys(Keys.ENTER).perform();
     Thread.sleep(3000);
     WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
     Actions act1=new Actions(driver);
     act1.moveToElement(savet2).perform();
     savet2.click();
     Thread.sleep(3000);
     Alert alt1=driver.switchTo().alert();
		
	    Thread.sleep(3000);
		alt1.accept();
		savet2.click();
	String msg=alt1.getText();
	alt1.accept();
		assertion.assertEquals(msg, ExpectedMsg);
	   assertion.assertAll();
}  
@Test(priority=12)
public void delay_between_pumping_Second_Tank2_Test() throws InterruptedException
{
	loginToApp();
	WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	Actions act=new Actions(driver);
	act.moveToElement(tank2).perform();
	tank2.click();
	Thread.sleep(3000);
	
	SoftAssert assertion=new SoftAssert();
	  WebElement delaybetweenpumpingsec=driver.findElement(By.xpath("//input[@id='t2_t3_delay_sec']"));
     delaybetweenpumpingsec.click();
   delaybetweenpumpingsec.clear();
   System.out.println("delay between pumping minimum  values are cleared");
     Thread.sleep(2000);
     delaybetweenpumpingsec.sendKeys("4e");
    
     act.sendKeys(Keys.ENTER).perform();
     Thread.sleep(3000);
     WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
	      Actions act1=new Actions(driver);
	      act1.moveToElement(savet2).perform();
	      savet2.click();
	      Thread.sleep(3000);
	      Alert alt1=driver.switchTo().alert();
	 		
	 	    Thread.sleep(3000);
	 		alt1.accept();
	 		savet2.click();
	 	String msg=alt1.getText();
	 	alt1.accept();
	 		assertion.assertEquals(msg, ExpectedMsg);
		   assertion.assertAll();
    
}




@Test(priority=13)
public void T2_to_T1_Temperature_Minute_Test() throws InterruptedException
{
 loginToApp();
 WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	Actions act=new Actions(driver);
	act.moveToElement(tank2).perform();
	tank2.click();
	Thread.sleep(3000);
 SoftAssert assertion=new SoftAssert();
	Thread.sleep(2000);
     WebElement tempMin=driver.findElement(By.xpath("//input[@id='tem_min']"));
     tempMin.click();
     tempMin.clear();
     System.out.println("Temperature Minimum  values are cleared");
     tempMin.sendKeys("3e");
 
     act.sendKeys(Keys.ENTER).perform();
     Thread.sleep(3000);
     WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
	      Actions act1=new Actions(driver);
	      act1.moveToElement(savet2).perform();
	      savet2.click();
	      Thread.sleep(3000);
	      Alert alt1=driver.switchTo().alert();
	 		
	 	    Thread.sleep(3000);
	 		alt1.accept();
	 		savet2.click();
	 	String msg=alt1.getText();
	 	alt1.accept();
	 		assertion.assertEquals(msg, ExpectedMsg);
		   assertion.assertAll();
}
@Test(priority=14)
public void T2_to_T1_Temperature_Seconds_Test() throws InterruptedException
{
 loginToApp();
 WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	Actions act=new Actions(driver);
	act.moveToElement(tank2).perform();
	tank2.click();
	Thread.sleep(3000);
 
 SoftAssert assertion=new SoftAssert();
	   WebElement tempMax=driver.findElement(By.xpath("//input[@id='tem_max']"));
      tempMax.click();
      tempMax.clear();
      Thread.sleep(3000);
      System.out.println("Temperature Maximum  values are cleared");
      tempMax.sendKeys("4e");
 
      act.sendKeys(Keys.ENTER).perform();
      Thread.sleep(3000);
      WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
	      Actions act1=new Actions(driver);
	      act1.moveToElement(savet2).perform();
	      savet2.click();
	      Thread.sleep(3000);
	      Alert alt1=driver.switchTo().alert();
	 		
	 	    Thread.sleep(3000);
	 		alt1.accept();
	 		savet2.click();
	 	String msg=alt1.getText();
	 	alt1.accept();
	 		assertion.assertEquals(msg, ExpectedMsg);
		   assertion.assertAll();
}





@Test(priority=15)
public void Humidity_Minimum_Test() throws InterruptedException
{
loginToApp();
WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
Actions act=new Actions(driver);
act.moveToElement(tank2).perform();
tank2.click();
Thread.sleep(3000);

 SoftAssert assertion=new SoftAssert();
	Thread.sleep(2000);
WebElement hummin=driver.findElement(By.xpath("//input[@id='hum_min']"));
hummin.click();
hummin.clear();
System.out.println("humidity minimum  value are cleared");
hummin.sendKeys("1e");

act.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);
WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
  Actions act1=new Actions(driver);
  act1.moveToElement(savet2).perform();
  savet2.click();
  Thread.sleep(3000);
  Alert alt1=driver.switchTo().alert();
		
	    Thread.sleep(3000);
		alt1.accept();
		savet2.click();
		String msg=alt1.getText();
		alt1.accept();
		assertion.assertEquals(msg, ExpectedMsg);
   assertion.assertAll();
}
@Test(priority=16)
public void humidity_Maximum_Test() throws InterruptedException
{
loginToApp();
WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
Actions act=new Actions(driver);
act.moveToElement(tank2).perform();
tank2.click();
Thread.sleep(3000);

SoftAssert assertion=new SoftAssert();
WebElement hummax=driver.findElement(By.xpath("//input[@id='hum_max']"));
hummax.click();
hummax.clear();
System.out.println("humidity maximum  values are cleared");
hummax.sendKeys("8e");

act.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);
WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
  Actions act1=new Actions(driver);
  act1.moveToElement(savet2).perform();
  savet2.click();
  Thread.sleep(3000);
  Alert alt1=driver.switchTo().alert();
		
	    Thread.sleep(3000);
		alt1.accept();
		savet2.click();
		String msg=alt1.getText();
		alt1.accept();
		assertion.assertEquals(msg, ExpectedMsg);
   assertion.assertAll();

}




@Test(priority=17)
public void Recirculation_Gap_Time_Test() throws InterruptedException
{
 loginToApp();
 WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	Actions act=new Actions(driver);
	act.moveToElement(tank2).perform();
	tank2.click();
	Thread.sleep(3000);
 SoftAssert assertion=new SoftAssert();
	Thread.sleep(2000);
WebElement min=driver.findElement(By.xpath("//input[@id='rec_gap_min']"));
min.click();
min.clear();
System.out.println(" RECIRCLATION GAP value are cleared");
min.sendKeys("4e");

act.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);
WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
  Actions act1=new Actions(driver);
  act1.moveToElement(savet2).perform();
  savet2.click();
  Thread.sleep(3000);
  Alert alt1=driver.switchTo().alert();
		
	    Thread.sleep(3000);
		alt1.accept();
		savet2.click();
		String msg=alt1.getText();
		alt1.accept();
		assertion.assertEquals(msg, ExpectedMsg);
   assertion.assertAll();
}


@Test(priority=18)
public void Water_flow_T2_to_T1() throws InterruptedException
{
 loginToApp();
 
 WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	Actions act=new Actions(driver);
	act.moveToElement(tank2).perform();
	tank2.click();
	Thread.sleep(3000);
 SoftAssert assertion =new SoftAssert();
 
	
WebElement waterflowreverse=driver.findElement(By.xpath("//input[@id='t2_t1_wflow']"));
waterflowreverse.click();
waterflowreverse.clear();
Thread.sleep(3000);
System.out.println("WATER FLOW T2 TO T1  value are cleared");
waterflowreverse.sendKeys("45e");

act.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);

WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
  Actions act1=new Actions(driver);
  act1.moveToElement(savet2).perform();
  savet2.click();
  Thread.sleep(3000);
  Alert alt1=driver.switchTo().alert();
	
	    Thread.sleep(3000);
		alt1.accept();
		savet2.click();
		String msg=alt1.getText();
		alt1.accept();
		assertion.assertEquals(msg, ExpectedMsg);
   assertion.assertAll();
}




@Test(priority=19)
public void delay_between_pumping_T2_to_T1_Minute_Test() throws InterruptedException
{
 loginToApp();
 WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	Actions act=new Actions(driver);
	act.moveToElement(tank2).perform();
	tank2.click();
	Thread.sleep(3000);
 
 SoftAssert assertion=new SoftAssert();
	Thread.sleep(2000);
WebElement delaywaterpumpingt2min=driver.findElement(By.xpath("//input[@id='t2_t1_min']"));
delaywaterpumpingt2min.click();
delaywaterpumpingt2min.clear();
Thread.sleep(3000);
System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 value are cleared");
delaywaterpumpingt2min.sendKeys("2e");

act.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);
WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
  Actions act1=new Actions(driver);
  act1.moveToElement(savet2).perform();
  savet2.click();
  Thread.sleep(3000);
  Alert alt1=driver.switchTo().alert();
	
	    Thread.sleep(3000);
	   
		alt1.accept();
		 savet2.click();
		String msg=alt1.getText();
		alt1.accept();
		assertion.assertEquals(msg, ExpectedMsg);
   assertion.assertAll();
}
@Test(priority=20)
public void delay_between_pumping_T2_to_T1_Second_Test() throws InterruptedException
{
loginToApp();
WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
Actions act=new Actions(driver);
act.moveToElement(tank2).perform();
tank2.click();
Thread.sleep(3000);


SoftAssert assertion=new SoftAssert();
WebElement delaybetweenpumpingt2sec=driver.findElement( By.xpath("//input[@id='t2_t1_sec']"));
delaybetweenpumpingt2sec.click();
delaybetweenpumpingt2sec.clear();
Thread.sleep(3000);
System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 values are cleared");
delaybetweenpumpingt2sec.sendKeys("10e");

act.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);
WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
savet2.click();
Thread.sleep(3000);
Alert alt1=driver.switchTo().alert();

Thread.sleep(3000);
alt1.accept();
savet2.click();
String msg=alt1.getText();
alt1.accept();
assertion.assertEquals(msg,ExpectedMsg);
assertion.assertAll();

}
@Test(priority=21)
public void pagination_Test() throws InterruptedException
{
 loginToApp();
 WebElement pagination=driver.findElement(By.xpath("//span[text()='1']"));
 pagination.click();
 Thread.sleep(2000);
 WebElement previousPage=driver.findElement(By.xpath("//span[text()=' Previous ']"));
 previousPage.click();
 Thread.sleep(2000);
 WebElement nextPage=driver.findElement(By.xpath("//a[@aria-label='Next page']"));
 nextPage.click();
 Thread.sleep(3000);
}


@Test(priority=22)
public void click_On_Save_Tank2_Test() throws InterruptedException
{
 loginToApp();
 WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	Actions act=new Actions(driver);
	act.moveToElement(tank2).perform();
	tank2.click();
	Thread.sleep(3000);
WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
Actions act1=new Actions(driver);
act1.moveToElement(savet2).perform();
savet2.click();

Thread.sleep(3000);
Alert alt1=driver.switchTo().alert();
System.out.println(alt1.getText());
Thread.sleep(3000);
alt1.accept();
Thread.sleep(3000);
}
@AfterMethod

public void quitTest() {
	driver.quit();
}	
 
  
}
