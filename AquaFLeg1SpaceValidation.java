import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AquaFLeg1SpaceValidation 
{
	WebDriver driver;
	
	  @BeforeMethod
	  public void setUp() throws InterruptedException
	  {
	 	 System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");
	 	 driver=new ChromeDriver();
	 	 driver.get("http://aquaf.cultyvate.com/aquaf/login");
	 //	Alert alt=driver.switchTo().alert();
	 	Thread.sleep(3000);
	 	//alt.accept();
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		  userName.click(); userName.sendKeys("test"); 
		  WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		  password.click(); password.sendKeys("test@123"); 
		  Thread.sleep(2000); 
		  WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		  submit.click();
		  Thread.sleep(3000);
		 WebElement leg2click=driver.findElement(By.xpath("//a[text()='Sea Water ']"));
		 leg2click.click();
		 Thread.sleep(2000);
		Alert alt4=driver.switchTo().alert();
			alt4.accept();
	  }
@Test(priority=1)
public void refill_Water_Number_Validation_Test() throws InterruptedException 
{
	 
	  WebElement  refillwater=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	   refillwater.click();
	   refillwater.clear();
	   System.out.println("refilling water values are cleared");
	   Thread.sleep(2000);
	   Actions act =new Actions(driver);
	   refillwater.click();
	   act.sendKeys(Keys.ENTER).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   String num=refillwater.getAttribute("value");
	   Assert.assertEquals(num, "");
	   System.out.println("It will not allow space in RefillTANK1WhenWaterIsLessThan ");  
	   Thread.sleep(3000);
	   WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
	 		savechanges.click();
	 		Thread.sleep(2000);

	 		//CLICK ON ALERT POP UP
	 		Alert alt=driver.switchTo().alert();
	 		System.out.println(alt.getText());	
	 	    Thread.sleep(3000);
	 		alt.accept();
	 		Thread.sleep(3000); 
	  
}
@Test(priority=2)
public void Water_flow_to_T2_Test() throws InterruptedException 
{
	 
		WebElement watertoflow=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		watertoflow.click();
		watertoflow.clear();
		System.out.println("water flow  value are cleared");
	  Actions act =new Actions(driver);
	  watertoflow.click();
	  act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   String num=watertoflow.getAttribute("value");
	   Assert.assertEquals(num, "");
	   Thread.sleep(2000);
	   System.out.println("It will not allow space in WaterflowtoT2Test ");
	   WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
	 		savechanges.click();
	 		Thread.sleep(2000);

	 		//CLICK ON ALERT POP UP
	 		Alert alt=driver.switchTo().alert();
	 		System.out.println(alt.getText());	
	 	    Thread.sleep(3000);
	 		alt.accept();
	 		Thread.sleep(3000); 
}
@Test(priority=3)
public void delay_Between_Pumping_Test() throws InterruptedException
{
		WebElement delaybetweenpumpingvalue=driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
		delaybetweenpumpingvalue.click();
		delaybetweenpumpingvalue.clear();
		System.out.println("delay between pumping value  value are cleared");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		delaybetweenpumpingvalue.click();
		  act.sendKeys(Keys.SPACE).perform();
		   act.sendKeys(Keys.SPACE).perform();
		   act.sendKeys(Keys.SPACE).perform();
		act.sendKeys(Keys.SPACE).perform();
		String num=delaybetweenpumpingvalue.getAttribute("value");
		Assert.assertEquals(num, "");
		Thread.sleep(3000);
		  WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
			savechanges.click();
			Thread.sleep(2000);

			//CLICK ON ALERT POP UP
			Alert alt=driver.switchTo().alert();
			System.out.println(alt.getText());	
		    Thread.sleep(3000);
			alt.accept();
			Thread.sleep(3000); 
}
		  @Test(priority=4)
		  public void delay_Between_PumpingSec_Test() throws InterruptedException
		  {	
			  WebElement delaybetweenpumpingvalueseconds=driver.findElement(By.xpath("(//input[@type='number'])[4]"));
	    		delaybetweenpumpingvalueseconds.click();
	    		delaybetweenpumpingvalueseconds.clear();
	    		Thread.sleep(2000);
	    		System.out.println("delay between pumping value  value are cleared");
	    		Thread.sleep(3000);
		Actions act=new Actions(driver);
		delaybetweenpumpingvalueseconds.click();
		  act.sendKeys(Keys.SPACE).perform();
		   act.sendKeys(Keys.SPACE).perform();
		   act.sendKeys(Keys.SPACE).perform();
		act.sendKeys(Keys.SPACE).perform();
		String num=delaybetweenpumpingvalueseconds.getAttribute("value");
		Assert.assertEquals(num, "");
		Thread.sleep(3000);
		  WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
			savechanges.click();
			Thread.sleep(2000);

			//CLICK ON ALERT POP UP
			Alert alt=driver.switchTo().alert();
			System.out.println(alt.getText());	
		    Thread.sleep(3000);
			alt.accept();
			Thread.sleep(3000); 
}
@Test(priority=5)
public void click_On_Save_Tank1_Test() throws InterruptedException
{
	  WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
		savechanges.click();
		Thread.sleep(4000);

		//CLICK ON ALERT POP UP
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());	
	    Thread.sleep(3000);
		alt.accept();
		Thread.sleep(3000); 
}
@Test(priority=6)
public void click_On_Tank2_Test() throws InterruptedException
{
		WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
		Actions act=new Actions(driver);
		act.moveToElement(tank2).perform();
		tank2.click();
		Thread.sleep(3000);
}
@Test(priority=7)
public void T2_to_T3_pH_value_Test() throws InterruptedException
{
	  click_On_Tank2_Test();
	 
	  Thread.sleep(3000);
		WebElement phvaluemin=driver.findElement(By.xpath("(//input[@class='form-control'])[9]"));
	Actions act2=new Actions(driver);
	act2.moveToElement(phvaluemin).perform();
	phvaluemin.click();
		phvaluemin.clear();
		System.out.println("ph value minimum  values are cleared");
		Thread.sleep(2000);
		 Actions act =new Actions(driver);
		 phvaluemin.click();
		  act.sendKeys(Keys.SPACE).perform();
		   act.sendKeys(Keys.SPACE).perform();
		   act.sendKeys(Keys.SPACE).perform();
		   act.sendKeys(Keys.SPACE).perform();
		   String num=phvaluemin.getAttribute("value");
		   Assert.assertEquals(num, "");
		   System.out.println("It will not allow space in T2toT3pHvalue ");  
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
@Test(priority=8)
public void T2_to_T3_Ph_Min_value_Test() throws InterruptedException
{
	  click_On_Tank2_Test();
	  Thread.sleep(3000);
		   WebElement phvaluemax=driver.findElement(By.xpath("(//input[@class='form-control'])[10]"));
		   Actions act3=new Actions(driver);
		   act3.moveToElement(phvaluemax);
		 phvaluemax.click();
	     phvaluemax.clear();
	 	System.out.println("ph value maximum  value are cleared");
	     Thread.sleep(2000);
	     
	   Actions act =new Actions(driver);
	   phvaluemax.click();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   String num=phvaluemax.getAttribute("value");
	   Assert.assertEquals(num, "");
	   System.out.println("It will not allow space in T2toT3pHvalue");
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
@Test(priority=9)
public void Water_flow_to_T3_Test() throws InterruptedException
{
	
	  click_On_Tank2_Test();
	  WebElement waterflowtot3=driver.findElement(By.xpath("(//input[@class='form-control'])[11]"));
	     waterflowtot3.click();
	     waterflowtot3.clear();
	 	System.out.println("water flow to t3  values are cleared");
	     Thread.sleep(2000);
Actions act =new Actions(driver);
waterflowtot3.click();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
String num=waterflowtot3.getAttribute("value");
Assert.assertEquals(num,"");
System.out.println("It will not allow space in WaterflowtoT3 ");
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
@Test(priority=10)
public void delay_between_pumping_Tank2_Test() throws InterruptedException
{
	  
	  click_On_Tank2_Test();
	Thread.sleep(2000);
WebElement delaybetweenpumpingmin=driver.findElement(By.xpath("(//input[@class='form-control'])[12]"));
 Actions act1=new Actions(driver);
 act1.moveToElement(delaybetweenpumpingmin).perform();
	   delaybetweenpumpingmin.click();
	   delaybetweenpumpingmin.clear();
	 	System.out.println("delay between pumping minimum  value are cleared");
	   Thread.sleep(2000);
	   Actions act =new Actions(driver);
	   delaybetweenpumpingmin.click();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   act.sendKeys(Keys.SPACE).perform();
	   String num=delaybetweenpumpingmin.getAttribute("value");
	   Assert.assertEquals(num,"");
	  System.out.println("It will not allow space in DelaybetweenpumpingTank2");
	  Thread.sleep(3000);
	  WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
	  
	  act1.moveToElement(savet2).perform();
	  savet2.click();
	  	
	  Thread.sleep(3000);
	  Alert alt1=driver.switchTo().alert();
	  		System.out.println(alt1.getText());
	  	    Thread.sleep(3000);
	  		alt1.accept();
	  	Thread.sleep(3000);
}
@Test(priority=11)
public void delay_between_pumping_sec_Test() throws InterruptedException
{
	  click_On_Tank2_Test();
	  Thread.sleep(3000);
	  WebElement delaybetweenpumpingsec=driver.findElement(By.xpath("(//input[@class='form-control'])[13]"));
	  Actions act2=new Actions(driver);
	  act2.moveToElement(delaybetweenpumpingsec);
	     delaybetweenpumpingsec.click();
	   delaybetweenpumpingsec.clear();
	   System.out.println("delay between pumping minimum  values are cleared");
	     Thread.sleep(2000);
	     Actions act =new Actions(driver);
	     delaybetweenpumpingsec.click();
	     act.sendKeys(Keys.SPACE).perform();
		   act.sendKeys(Keys.SPACE).perform();
		   act.sendKeys(Keys.SPACE).perform();
	  	   act.sendKeys(Keys.SPACE).perform();
	  	   String num=delaybetweenpumpingsec.getAttribute("value");
	  	 Assert.assertEquals(num,"");
	  	  System.out.println("It will not allow space in DelaybetweenpumpingTank2");
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
@Test(priority=12)
public void T2_to_T1_Temperature_Test() throws InterruptedException
{

	  click_On_Tank2_Test();
	Thread.sleep(2000);
	 WebElement tempMin=driver.findElement(By.xpath("(//input[@type='number'])[14]"));
 tempMin.click();
 tempMin.clear();
 System.out.println("Temperature Minimum  values are cleared");
		     Actions act =new Actions(driver);
		     tempMin.click();
		     act.sendKeys(Keys.SPACE).perform();
			   act.sendKeys(Keys.SPACE).perform();
			   act.sendKeys(Keys.SPACE).perform();
			   act.sendKeys(Keys.SPACE).perform();
			   String num=tempMin.getAttribute("value");
			   Assert.assertEquals(num,"");
			   System.out.println("It will not allow space in T2toT1Temperature");
			   Thread.sleep(2000);
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
@Test(priority=13)
public void temp_Max_Test() throws InterruptedException
{
	  click_On_Tank2_Test();
	  Thread.sleep(3000);
			   WebElement tempMax=driver.findElement(By.xpath("(//input[@type='number'])[15]"));
			   Actions act3=new Actions(driver);
			   act3.moveToElement(tempMax);
			      tempMax.click();
			      tempMax.clear();
			      Thread.sleep(2000);
			      System.out.println("Temperature Maximum  values are cleared");
			      Actions act =new Actions(driver);
			      tempMax.click();
			      act.sendKeys(Keys.SPACE).perform();
				   act.sendKeys(Keys.SPACE).perform();
				   act.sendKeys(Keys.SPACE).perform();
				   act.sendKeys(Keys.SPACE).perform();
				   String num=tempMax.getAttribute("value");
				   Assert.assertEquals(num,"");
				   System.out.println("It will not allow space in T2toT1Temperature");
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
@Test(priority=14)
public void Humidity_Test() throws InterruptedException
{

	  click_On_Tank2_Test();
	Thread.sleep(3000);
WebElement hummin=driver.findElement(By.xpath("(//input[@class='form-control'])[16]"));
hummin.click();
hummin.clear();
System.out.println("humidity minimum  value are cleared");
Thread.sleep(3000);
Actions act =new Actions(driver);
hummin.click();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
String num=hummin.getAttribute("value");
Assert.assertEquals(num,"");
System.out.println("It will not allow space in Humidity");    
Thread.sleep(2000);
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
@Test(priority=15)
public void humidity_max_Test() throws InterruptedException
{
	  click_On_Tank2_Test();
	  Thread.sleep(3000);
WebElement hummax=driver.findElement(By.xpath("(//input[@class='form-control'])[17]"));
Actions act=new Actions(driver);
act.moveToElement(hummax);
hummax.click();
hummax.clear();
System.out.println("humidity maximum  values are cleared");
hummax.click();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
String num=hummax.getAttribute("value");
Assert.assertEquals(num,"");
Thread.sleep(3000);
System.out.println("It will not allow space in Humidity");
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
@Test(priority=16)
public void RecirculationGap_Time_Test() throws InterruptedException
{
	
	  click_On_Tank2_Test();
	Thread.sleep(3000);
	 WebElement min=driver.findElement(By.xpath("(//input[@type='number'])[18]"));
 min.click();
 min.clear();
 System.out.println(" RECIRCLATION GAP value are cleared");
Actions act =new Actions(driver);
min.click();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
String num=min.getAttribute("value");
Assert.assertEquals(num,"");
System.out.println("It will not allow space in Recirculation Gap Time");
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
@Test(priority=17)
public void Water_flow_T2_to_T1_Test() throws InterruptedException
{
	
	  click_On_Tank2_Test();
	Thread.sleep(2000);
WebElement waterflowreverse=driver.findElement(By.xpath("(//input[@type='number'])[19]"));
waterflowreverse.click();
waterflowreverse.clear();
Thread.sleep(3000);
System.out.println("WATER FLOW T2 TO T1  value are cleared");
Actions act =new Actions(driver);
waterflowreverse.click();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
String num=waterflowreverse.getAttribute("value");
Assert.assertEquals(num,"");
System.out.println("It will not allow space in Water flow T2 to T1"); 
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
@Test(priority=18)
public void delay_between_pumping__T2_to_T1_Test() throws InterruptedException
{
	
	  click_On_Tank2_Test();
	Thread.sleep(2000);
	 WebElement delaywaterpumpingt2min=driver.findElement(By.xpath("(//input[@type='number'])[21]"));
 delaywaterpumpingt2min.click();
 delaywaterpumpingt2min.clear();
 Thread.sleep(3000);
 System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 value are cleared");
Actions act =new Actions(driver);
delaywaterpumpingt2min.click();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
String num=delaywaterpumpingt2min.getAttribute("value");
Assert.assertEquals(num,"");
System.out.println("It will not allow space in Delaybetweenpumping T2 to T1");
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
@Test(priority=19)
public void delay_between_pumping_T2_sec_Test() throws InterruptedException
{
	  click_On_Tank2_Test();
	  Thread.sleep(3000);
WebElement delaybetweenpumpingt2sec=driver.findElement( By.xpath("(//input[@type='number'])[22]"));
Actions act3=new Actions(driver);
act3.moveToElement(delaybetweenpumpingt2sec);
delaybetweenpumpingt2sec.click();
delaybetweenpumpingt2sec.clear();
Thread.sleep(3000);
System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 values are cleared");
Actions act =new Actions(driver);
delaybetweenpumpingt2sec.click();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
act.sendKeys(Keys.SPACE).perform();
String num=delaybetweenpumpingt2sec.getAttribute("value");
Assert.assertEquals(num,"");
System.out.println("It will not allow space in delaybetweenpumpingt2sec");
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
@Test(priority=20)
public void click_On_Save_Tank2() throws InterruptedException
{
	  click_On_Tank2_Test();
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
