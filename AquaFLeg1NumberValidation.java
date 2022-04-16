import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AquaFLeg1NumberValidation 


{
	WebDriver driver;
	@BeforeMethod
	  public void setUp() throws InterruptedException
	  {
	 	 System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
	 	 driver=new ChromeDriver();
		 driver.get("http://localhost:4200/login");
			/*
			 * Alert alt=driver.switchTo().alert(); Thread.sleep(3000); alt.accept();
			 */
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	driver.manage().window().maximize();
	 	Thread.sleep(2000);
	 	WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		  userName.click(); userName.sendKeys("Manoj"); 
		  WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		  password.click(); password.sendKeys("1234"); 
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
	  public void refill_Water_Number_Test() throws InterruptedException 
	  {
		 
		  WebElement  refillwater=   driver.findElement(By.xpath("//input[@id='t1_refill']"));
		   refillwater.click();
		   refillwater.clear();
		   System.out.println("refilling water values are cleared");
		   Thread.sleep(2000);
		   refillwater.sendKeys("500022");
		   System.out.println("The Values for Refill Water Has Updated Successfully ");
		   String num=refillwater.getAttribute("value");
		 Assert.assertNotEquals(num, 500022);
		   System.out.println("You have Entered more than 5 digits");
		   Thread.sleep(3000);
		
	  }
//WATER FLOW
 @Test(priority=2)
 public void Water_flow_to_T2_Validation_Test() throws InterruptedException
 {
	
	WebElement watertoflow=driver.findElement(By.xpath("//input[@id='t1_t2_wflow']"));
	watertoflow.click();
	watertoflow.clear();
	Thread.sleep(2000);
	System.out.println("water flow  value are cleared");
	watertoflow.sendKeys("400011");
	Thread.sleep(3000);
	String num1=watertoflow.getAttribute("value");
	System.out.println("The values for water flow from to t1 to  t2 has Updated successfully ");
 Assert.assertNotEquals(num1, 400011);
  System.out.println(" you have Entered more than 5 digits");

	}
	//DELAY BETWEEN PUMPING
 @Test(priority=3)
 public void delay_between_Pumping_Minute_Test() throws InterruptedException 
 {
	  
	WebElement delaybetweenpumpingvalue=driver.findElement(By.xpath("//input[@id='t1_delay_min']"));
	delaybetweenpumpingvalue.click();
	Thread.sleep(3000);
	delaybetweenpumpingvalue.clear();
	System.out.println("delay between pumping value  value are cleared");
	Thread.sleep(3000);
	delaybetweenpumpingvalue.sendKeys("500002");
	Thread.sleep(2000);
	String num3=delaybetweenpumpingvalue.getAttribute("value");
	   System.out.println("The Values for delay between pumping value Has Updated Successfully ");
	   Assert.assertNotEquals(num3, 500002);
	   System.out.println(" you have Entered more than 5 digits");
	Thread.sleep(3000);
	
 }
 @Test(priority=4)
 public void dealay_between_pumping_value_seconds_Test() throws InterruptedException
 {
	  
	WebElement dealaybetweenpumpingvalueseconds=driver.findElement(By.xpath("(//input[@type='number'])[4]"));
	dealaybetweenpumpingvalueseconds.click();
	Thread.sleep(3000);
	dealaybetweenpumpingvalueseconds.clear();
	Thread.sleep(2000);
	System.out.println("delay between pumping value  value are cleared");
	Thread.sleep(3000);
	dealaybetweenpumpingvalueseconds.sendKeys("534121");
	Thread.sleep(2000);
	String num4=dealaybetweenpumpingvalueseconds.getAttribute("value");
	   System.out.println("The Values for delay between pumping value Has Updated Successfully ");
	Thread.sleep(3000);	
	System.out.println(" value is "+num4);
	Assert.assertNotEquals(num4, 534121);
	System.out.println(" you have Entered more than 5 digits");

}
 //RESET VALUES@
 @Test(priority=5)
 public void click_On_Reset_Test() throws InterruptedException
 {
	 WebElement resetT1=driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-lg'])[4]"));
    resetT1.click();
    Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
alt.accept();
SoftAssert assertion=new SoftAssert();
Thread.sleep(3000);
Actions act =  new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//div[@class='card-body']"))).click().perform();
WebElement waterLevelChecking=driver.findElement(By.xpath("//h4[@id='t1_water']"));
String wlc=waterLevelChecking.getText();
System.out.println("value is :" +wlc);
assertion.assertEquals(wlc, 800);
 }
	//CLICK ON SAVE
 
 @Test(priority=6)
 public void click_On_Save_T1_Test() throws InterruptedException 
 {
	
	WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
	savechanges.click();
	Thread.sleep(4000);

	//CLICK ON ALERT POP UP
	Alert alt1=driver.switchTo().alert();
	System.out.println(alt1.getText());
  Thread.sleep(3000);
	alt1.accept();
	Thread.sleep(3000); 
 }
 
 @Test(priority=7)
 public void click_On_Tank2_Test() throws InterruptedException 
 {
	WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	Actions act=new Actions(driver);
	act.moveToElement(tank2).perform();
	tank2.click();
	Thread.sleep(3000);
 }
	@Test(priority=8)
	public void phVlaue_Test() throws InterruptedException
	{
	
		
		click_On_Tank2_Test();
	WebElement phvaluemin=driver.findElement(By.xpath("(//input[@class='form-control'])[9]"));
	 WebDriverWait wait2=new WebDriverWait(driver,30);
   wait2.until(ExpectedConditions.elementToBeClickable(phvaluemin));
	phvaluemin.clear();
	System.out.println("ph value minimum  values are cleared");
	Thread.sleep(2000);
	phvaluemin.sendKeys("234561");
	Thread.sleep(3000);
	String num5=phvaluemin.getAttribute("value");
	System.out.println("value is " +num5);
  System.out.println("The Values for ph value minimum Has Updated Successfully ");
 Assert.assertNotEquals(num5, 234561);
	Thread.sleep(3000);
		System.out.println("You Have Entered More Than 5 Digits");
		
	}
	@Test(priority=9)
	public void phvaluemaxTest() throws InterruptedException
	{
		
		click_On_Tank2_Test();
				
	WebElement phvaluemax=driver.findElement(By.xpath("(//input[@class='form-control'])[10]"));
	 phvaluemax.click();
   phvaluemax.clear();
	System.out.println("ph value maximum  value are cleared");
   Thread.sleep(2000);
    phvaluemax.sendKeys("433123");  
    String num6=phvaluemax.getAttribute("value");
    Thread.sleep(3000);
    System.out.println("The Values for ph value minimum Has Updated Successfully ");
    Thread.sleep(3000);
   Assert.assertNotEquals(num6, 433123);
  	  System.out.println("You Have Entered More Than 5 Digits");
  	  
 }
      @Test(priority=10)
      public void waterFlowTest() throws InterruptedException 
      {
      
      	click_On_Tank2_Test();

      	Thread.sleep(2000);
    WebElement waterflowtot3=driver.findElement(By.xpath("(//input[@class='form-control'])[11]"));
	     waterflowtot3.click();
	     waterflowtot3.clear();
	 	System.out.println("water flow to t3  values are cleared");
	     Thread.sleep(2000);
	     waterflowtot3.sendKeys("500012");
	     Thread.sleep(3000);
	     String num7=waterflowtot3.getAttribute("value");
	     System.out.println("The Values for water flow to t3 Has Updated Successfully ");
	     Thread.sleep(3000);
	    Assert.assertNotEquals(num7, 500012);
	    	 System.out.println("You Have Entered More Than 5 Digits");
	    	
	     }
      @Test(priority=11)
      public void delaybetweenpumpingmint2Test() throws InterruptedException 
      {

     
      	click_On_Tank2_Test();

      	Thread.sleep(2000);
	     WebElement delaybetweenpumpingmin=driver.findElement(By.xpath("(//input[@class='form-control'])[12]"));
		   delaybetweenpumpingmin.click();
		   delaybetweenpumpingmin.clear();
		 	System.out.println("delay between pumping minimum  value are cleared");
		   Thread.sleep(2000);
		     delaybetweenpumpingmin.sendKeys("354231");
		     Thread.sleep(3000);
		     String num8=delaybetweenpumpingmin.getAttribute("value");
		     System.out.println("the value is " +num8);
		     System.out.println("The Values delay between pumping minimum for  Has Updated Successfully ");
		     Thread.sleep(3000);
          Assert.assertNotEquals(num8, 354231);
           System.out.println("You Have Entered more Than 5 digits");
        
      }
      @Test(priority=12)
      public void delaybetweenpumpingsecTest() throws InterruptedException
      {
      
      	click_On_Tank2_Test();

		     WebElement delaybetweenpumpingsec=driver.findElement(By.xpath("(//input[@class='form-control'])[13]"));
		     delaybetweenpumpingsec.click();
		   delaybetweenpumpingsec.clear();
		   System.out.println("delay between pumping minimum  values are cleared");
		     Thread.sleep(2000);
		     delaybetweenpumpingsec.sendKeys("304231");
		     Thread.sleep(3000);
		     String num9=delaybetweenpumpingsec.getAttribute("value");
		     System.out.println("The Values for delay between pumping minimum Has Updated Successfully ");
		     Thread.sleep(3000);
	        Assert.assertNotEquals(num9, 304231);	 
		    	 System.out.println("You Hav Entered More Than 5 Digits");
		    	
		     }
      @Test(priority=13)
      public void temperatureTest() throws InterruptedException 
      {
      	
      	
      	click_On_Tank2_Test();

      	Thread.sleep(2000);
		     WebElement tempMin=driver.findElement(By.xpath("(//input[@class='form-control'])[14]"));
		     tempMin.click();
		     tempMin.clear();
		     System.out.println("Temperature Minimum  values are cleared");
		     tempMin.sendKeys("434122");
		     String num10=tempMin.getAttribute("value");
		     System.out.println("the value is " +num10);
		     Thread.sleep(3000);
		     System.out.println("The Values for temperature Minimum Has Updated Successfully ");
		      Thread.sleep(3000);
		     Assert.assertNotEquals(num10, 434122);		    
		    	 System.out.println("You Have Entered More Than 5 Digits");
		    	
      }
      @Test(priority=14)
      public void tempMaxTest() throws InterruptedException
      {
      
      	
      	click_On_Tank2_Test();

		      WebElement tempMax=driver.findElement(By.xpath("(//input[@class='form-control'])[15]"));
		      tempMax.click();
		      tempMax.clear();
		      Thread.sleep(3000);
		      System.out.println("Temperature Maximum  values are cleared");
		      tempMax.sendKeys("878783");
		      Thread.sleep(3000);
		      String num11=tempMax.getAttribute("value");
		      System.out.println("The Values for Temperature Maximum Has Updated Successfully ");
		      Thread.sleep(3000);
		      Assert.assertNotEquals(num11, 878783);
		    	  System.out.println("You Have Entered More Than 5 Digits");
		    	
		      }
             @Test(priority=15)
             public void humidityTest() throws InterruptedException 
             {
          	  
          	  
          	   click_On_Tank2_Test();

             	Thread.sleep(2000);
		      WebElement hummin=driver.findElement(By.xpath("(//input[@class='form-control'])[16]"));
		      hummin.click();
		      hummin.clear();
		      System.out.println("humidity minimum  value are cleared");
		      hummin.sendKeys("445645");
		      Thread.sleep(3000);
		      String num12=hummin.getAttribute("value");
		      System.out.println("the value is " +num12);
		      System.out.println("The Values humidity minimum Has Updated Successfully ");
		      Thread.sleep(3000);
		     Assert.assertNotEquals(num12, 445645);
		    	  System.out.println("You Have Entered More Than 5 digits");
		    	 
             }
             @Test(priority=16)
             public void hummaxTest() throws InterruptedException
             {
          	   
          	 
          	   click_On_Tank2_Test();

		      WebElement hummax=driver.findElement(By.xpath("(//input[@class='form-control'])[17]"));
		      hummax.click();
		      hummax.clear();
		      System.out.println("humidity maximum  values are cleared");
		      hummax.sendKeys("888888");
		      Thread.sleep(3000);
		      String num13=hummax.getAttribute("value");
		      System.out.println("The Values for humidity maximum Has Updated Successfully ");
		      Thread.sleep(3000);
		     Assert.assertNotEquals(num13, 888888);
		    	  System.out.println("You Have Entered More Than 5 Digits");
		    	 
		     }
             @Test(priority=17)
             public void recirculationGaptest() throws InterruptedException 
             {
          	 
          	 
          	   click_On_Tank2_Test();

             	Thread.sleep(2000);
		      WebElement min=driver.findElement(By.xpath("(//input[@class='form-control'])[18]"));
		      min.click();
		      min.clear();
		      System.out.println(" RECIRCLATION GAP value are cleared");
		      min.sendKeys("555555");
		      Thread.sleep(3000);
		      String num14=min.getAttribute("value");
		      System.out.println("The Values  for RECIRCLATION GAP  Has Updated Successfully ");
		     Assert.assertNotEquals(num14, 555555);
		    	  System.out.println("You Have Entered ore Than 5 Digits");
		    	 
		      }
             @Test(priority=18)
             public void watrFlowToT2Test() throws InterruptedException 
             {
          	 
          	   
          	   click_On_Tank2_Test();

             	Thread.sleep(2000);
		      WebElement waterflowreverse=driver.findElement(By.xpath("(//input[@class='form-control'])[19]"));
		      waterflowreverse.click();
		      waterflowreverse.clear();
		      Thread.sleep(3000);
		      System.out.println("WATER FLOW T2 TO T1  value are cleared");
		      waterflowreverse.sendKeys("303434");
		      Thread.sleep(3000);
		      String num15=waterflowreverse.getAttribute("value");
		      System.out.println("The Values  for WATER FLOW T2 TO T1 Has Updated Successfully ");
		      Thread.sleep(3000);
		     Assert.assertNotEquals(num15, 303434);
		    	  System.out.println("You Have Entered More Than 5 digits");
		    	
		      }
             @Test(priority=19)
             public void delaywaterpumpingT2toT1minTest() throws InterruptedException 
             {
          	 
          	  
          	   click_On_Tank2_Test();

             	Thread.sleep(2000);
		      WebElement delaywaterpumpingt2min=driver.findElement(By.xpath("(//input[@class='form-control'])[21]"));
		      delaywaterpumpingt2min.click();
		      delaywaterpumpingt2min.clear();
		      Thread.sleep(3000);
		      System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 value are cleared");
		      delaywaterpumpingt2min.sendKeys("108909");
		      Thread.sleep(3000);
		      String num16=delaywaterpumpingt2min.getAttribute("value");
		      System.out.println("The Values  for DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 Has Updated Successfully ");
		      Thread.sleep(3000);
		    Assert.assertNotEquals(num16, 108909);
		    	  System.out.println("You Have Entered More Than 5 digits");
		    	  
             }
             @Test(priority=20)
             public void delaybetweenpumpingt2secTest() throws InterruptedException
             {
          	 
          	 
          	   click_On_Tank2_Test();

	          WebElement delaybetweenpumpingt2sec=driver.findElement( By.xpath("(//input[@class='form-control'])[22]"));
	          delaybetweenpumpingt2sec.click();
	          delaybetweenpumpingt2sec.clear();
	          Thread.sleep(3000);
	          System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 values are cleared");
	          delaybetweenpumpingt2sec.sendKeys("252325");
	          Thread.sleep(3000);
	          String num17=delaybetweenpumpingt2sec.getAttribute("value");
	          System.out.println("The Values  for DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 Has Updated Successfully ");
	          Thread.sleep(3000);
	         Assert.assertNotEquals(num17, 252325);
	        	  System.out.println("You Have Entered More Than 5 digits");
	            
	          Thread.sleep(3000);
             }
             @Test(priority=21)
             public void saveT2() throws InterruptedException
             {
          	  
	          WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
	          click_On_Tank2_Test();

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
