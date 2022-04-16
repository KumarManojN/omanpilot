import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.Sleep;
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

public class Leg1EditAndDelete 
{
	WebDriver driver;
	
  @BeforeMethod
  public void setUp() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://aquaf.cultyvate.com/aquaf/login");
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
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
public void page_Title_Test() throws InterruptedException 
{

	String title=driver.getTitle();
	System.out.println("the page title is : " +title);
	Assert.assertEquals(title, "Aqua-F Pilot");
}

@Test(priority=2)
public void aquaF_Leg2_Edit_And_Delete_Test() throws InterruptedException

{
	//REFILLING WATER
	boolean  refillwaterisDisplayed= driver.findElement(By.xpath("//input[@id='t1_refill']")).isDisplayed();
	if(refillwaterisDisplayed)
	{
		System.out.println("Refill TANK1 when water is less than is displayed");
	}
	else
	{
		System.out.println("Refill TANK1 when water is less than is not Displayed");
	}
	WebElement  refillwater=   driver.findElement(By.xpath("//input[@id='t1_refill']"));
	   refillwater.click();
	   refillwater.clear();
	   System.out.println("refilling water values are cleared");
	   Thread.sleep(2000);
	   refillwater.sendKeys("123454");
	   
	   String num=refillwater.getAttribute("value");
	   System.out.println("The Values for Refill Water Has Updated Successfully ");
	   Thread.sleep(3000);
	int size=num.length();
	if(size<=5)
	{
		System.out.println(" ");
	}
	else
	{
		System.out.println("You have Entered More Than five Digits");
	}
	
	
	
	
	
	
	//WATER FLOW
	   boolean
	   watertoflowisDisplayed=driver.findElement(By.xpath("//input[@id='t1_t2_wflow']")).isDisplayed();
	   if(watertoflowisDisplayed)
	   {
		   System.out.println("Water flow to T2 is Displayed");
	   }
	   else
	   {
		   System.out.println("Water flow to T2 is not Displayed");
	   }
	   
		WebElement watertoflow=driver.findElement(By.xpath("//input[@id='t1_t2_wflow']"));
		watertoflow.click();
		watertoflow.clear();
		Thread.sleep(2000);
		System.out.println("water flow  value are cleared");
		watertoflow.sendKeys("123454");
		Thread.sleep(3000);
		String num1=watertoflow.getAttribute("value");
		System.out.println("The values for water flow from to t1 to  t2 has Updated successfully ");	
		int size1=num1.length();
		if(size1<=5)
		{
			System.out.println(" ");
		}
		else
		{
			System.out.println(" you have enetered more than five digits");
		}
		
		
		
		
		
			
	//DELAY BETWEEN PUMPING
		boolean delaybetweenpumpingvalueIsDisplayed=driver.findElement(By.xpath("//input[@id='t1_delay_min']")).isDisplayed();
     if(delaybetweenpumpingvalueIsDisplayed)
     {
     	System.out.println("Delay between pumping Minutes Seconds is Displayed");
     }
     else
     {
     	System.out.println("Delay between pumping Minutes Seconds is not Displayed");
     }
		WebElement delaybetweenpumpingvalue=driver.findElement(By.xpath("//input[@id='t1_delay_min']"));
		delaybetweenpumpingvalue.click();
		delaybetweenpumpingvalue.clear();
		System.out.println("delay between pumping value  value are cleared");
		Thread.sleep(3000);
		delaybetweenpumpingvalue.sendKeys("123454");
		Thread.sleep(2000);
		String num3=delaybetweenpumpingvalue.getAttribute("value");
		   System.out.println("The Values for delay between pumping value Has Updated Successfully ");
		Thread.sleep(3000);
		int size3=num3.length();
		if(size3<=5)
		{
			System.out.println(" ");
		}
		else
		{
			System.out.println("You Have Entered More Than Five Digits");
		}
		WebElement dealaybetweenpumpingvalueseconds=driver.findElement(By.xpath("//input[@id='t1_delay_sec']"));
		dealaybetweenpumpingvalueseconds.click();
		dealaybetweenpumpingvalueseconds.clear();
		Thread.sleep(2000);
		System.out.println("delay between pumping value  value are cleared");
		Thread.sleep(3000);
		dealaybetweenpumpingvalueseconds.sendKeys("123454");
		Thread.sleep(2000);
		String num4=delaybetweenpumpingvalue.getAttribute("value");
		   System.out.println("The Values for delay between pumping value Has Updated Successfully ");
		Thread.sleep(3000);	
		int size4=num4.length();
		if(size4<=5)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("You Have Entered Mor Than Five Digits");
			Thread.sleep(3000);
		}
		
	    
	    

		//CLICK ON SAVE
		WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
		savechanges.click();
		Thread.sleep(4000);
	 
		
		
		//CLICK ON ALERT POP UP
		Alert alt2=driver.switchTo().alert();
		System.out.println(alt2.getText());
	    Thread.sleep(3000);
		alt2.accept();
 	Thread.sleep(3000);
		
 	
 	
	    //CLICK ON TANK2
 	
 	
 	
 	WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
 	Actions act1=new Actions(driver);
 	act1.moveToElement(tank2).perform();
 	tank2.click();
 	Thread.sleep(3000);
 	
 	
 	
 	//ENTER PH VALUES
 	boolean phvalueminisDisplayed=driver.findElement(By.xpath("//input[@id='ph_min']")).isDisplayed();
 	if(phvalueminisDisplayed)
 	{
 		System.out.println("pH-value is Displayed");
 	}
 	else
 	{
 		System.out.println("pH-value is not Displayed");
 	}
 	WebElement phvaluemin=driver.findElement(By.xpath("//input[@id='ph_min']"));
		 WebDriverWait wait2=new WebDriverWait(driver,30);
	     wait2.until(ExpectedConditions.elementToBeClickable(phvaluemin));
		phvaluemin.clear();
		System.out.println("ph value minimum  values are cleared");
		Thread.sleep(2000);
		phvaluemin.sendKeys("300000");
		Thread.sleep(3000);
		String num5=phvaluemin.getAttribute("value");
	    System.out.println("The Values for ph value minimum Has Updated Successfully ");
		Thread.sleep(3000);
		int size5=num5.length();
		if(size5<=5)
		{
			System.out.println("  ");
		}
		else
		{
			System.out.println("You Have Entered More Than Five Digits");
		}
		
		
		
		
		
		WebElement phvaluemax=driver.findElement(By.xpath("//input[@id='ph_max']"));
		 phvaluemax.click();
	     phvaluemax.clear();
	 	System.out.println("ph value maximum  value are cleared");
	     Thread.sleep(2000);
	      phvaluemax.sendKeys("400000");  
	      String num6=phvaluemax.getAttribute("value");
	      Thread.sleep(3000);
	      System.out.println("The Values for ph value minimum Has Updated Successfully ");
	      Thread.sleep(3000);
	      int size6=num6.length();
	      if(size6<=5)
	      {
	    	  System.out.println(" ");
	      }
	      else
	      {
	    	  System.out.println("You Have Entered More Than Five Digits");
	      }
	     
	      
	      
	      
	      //WATER FLOW TO T3
	      boolean waterflowtot3isDisplayed=driver.findElement(By.xpath("//input[@id='t2_t3_wflow']")).isDisplayed();
	      if(waterflowtot3isDisplayed)
	      {
	    	  System.out.println("Water flow to T3 is Displayed ");
	      }
	      else
	      {
	    	  System.out.println("Water flow to T3 is not Displayed");
	      }
	      WebElement waterflowtot3=driver.findElement(By.xpath("//input[@id='t2_t3_wflow']"));
		     waterflowtot3.click();
		     waterflowtot3.clear();
		 	System.out.println("water flow to t3  values are cleared");
		     Thread.sleep(2000);
		     waterflowtot3.sendKeys("123454");
		     Thread.sleep(3000);
		     String num7=waterflowtot3.getAttribute("value");
		     System.out.println("The Values for water flow to t3 Has Updated Successfully ");
		     Thread.sleep(3000);
		     int size7=num7.length();
		    
		     if(size7<=5)
		     {
		    	 System.out.println(" ");
		     }
		     else
		     {
		    	 System.out.println("You Have Entered More Than Five Digits");
		     }
		   
		     
		     
		     
		     
		     //DELAY  BETWEEN PUMPING IN TANK2
		     boolean delaybetweenpumpingminisDisplayed=driver.findElement(By.xpath("//input[@id='t2_t3_delay_min']")).isDisplayed();
		     if(delaybetweenpumpingminisDisplayed)
		     {
		    	 System.out.println("Delay between pumping Minutes Seconds is Displayed");
		     }
		     else
		     {
		    	 System.out.println("Delay between pumping Minutes Seconds is not Displayed");
		     }
		     
		     WebElement delaybetweenpumpingmin=driver.findElement(By.xpath("//input[@id='t2_t3_delay_min']"));
		     Actions act3=new Actions(driver);
		     act3.moveToElement(delaybetweenpumpingmin);
			   delaybetweenpumpingmin.click();
			   delaybetweenpumpingmin.clear();
			 	System.out.println("delay between pumping minimum  value are cleared");
			   Thread.sleep(2000);
			     delaybetweenpumpingmin.sendKeys("123454");
			     Thread.sleep(3000);
			     String num8=delaybetweenpumpingmin.getAttribute("value");
			     System.out.println("The Values delay between pumping minimum for  Has Updated Successfully ");
			     Thread.sleep(3000);
			     int size8=num8.length();
			     if(size8<=5)
			     {
			    	 System.out.println("");
			     }
			     else
			     {
			    	 System.out.println("You Have Entered More Than five Digits");
			     }
			     
			     
			     
			     
			     
			     WebElement delaybetweenpumpingsec=driver.findElement(By.xpath("//input[@id='t2_t3_delay_sec']"));
			     delaybetweenpumpingsec.click();
			   delaybetweenpumpingsec.clear();
			   System.out.println("delay between pumping minimum  values are cleared");
			     Thread.sleep(2000);
			     delaybetweenpumpingsec.sendKeys("123454");
			     Thread.sleep(3000);
			     String num9=delaybetweenpumpingsec.getAttribute("value");
			     System.out.println("The Values for delay between pumping minimum Has Updated Successfully ");
			     Thread.sleep(3000);
			     int size9=num9.length();
			     if(size9<=5)
			     {
			    	 System.out.println(" ");
			     }
			     else
			     {
			    	 System.out.println("You Hav Entered More Than Two Digits");
			     }
			     
			     
			     
			     
			     
			     //TEMPERATURE IN TANK2
			     boolean tempMinisDisplayed=driver.findElement(By.xpath("//input[@id='tem_min']")).isDisplayed();
              if(tempMinisDisplayed)
              {
             	 System.out.println("T2 to T1 Temperature is Displayed");
              }
              else
              {
             	 System.out.println("T2 to T1 Temperature is not Displayed");
              }
			     WebElement tempMin=driver.findElement(By.xpath("//input[@id='tem_min']"));
			     tempMin.click();
			     tempMin.clear();
			     System.out.println("Temperature Minimum  values are cleared");
			     tempMin.sendKeys("300000");
			     System.out.println("The Values for temperature Minimum Has Updated Successfully ");
			     String num10=tempMin.getAttribute("value");
			     Thread.sleep(3000);
			     int size10=num10.length();
			     if(size10<=5)
			     {
			    	 System.out.println("");
			     }
			     else
			     {
			    	 System.out.println("You Have Entered More Than Five Digits");
			     }
			      Thread.sleep(3000);
			      
			      
			      
			      
			      WebElement tempMax=driver.findElement(By.xpath("//input[@id='tem_max']"));
			      tempMax.click();
			      tempMax.clear();
			      Thread.sleep(3000);
			      System.out.println("Temperature Maximum  values are cleared");
			      tempMax.sendKeys("600000");
			      Thread.sleep(3000);
			      String num11=tempMax.getAttribute("value");
			      System.out.println("The Values for Temperature Maximum Has Updated Successfully ");
			      Thread.sleep(3000);
			      int size11=num11.length();
			      if(size11<=5)
			      {
			    	  System.out.println("");
			      }
			      else
			      {
			    	  System.out.println("You Have Entered More Than Two Digits");
			      }
			     
			      
			      
			      
			      
			      //HUMIDITY IN TANK2
			      boolean humminisDisplayed=driver.findElement(By.xpath("//input[@id='hum_min']")).isDisplayed();
			      if(humminisDisplayed)
			      {
			    	  System.out.println("Humidity is Displayed");
			      }
			      else
			      {
			    	  System.out.println("Humidity is not Displayed");
			      }
			      WebElement hummin=driver.findElement(By.xpath("//input[@id='hum_min']"));
			      hummin.click();
			      hummin.clear();
			      System.out.println("humidity minimum  value are cleared");
			      hummin.sendKeys("300001");
			      Thread.sleep(3000);
			      String num12=hummin.getAttribute("value");
			      System.out.println("The Values humidity minimum Has Updated Successfully ");
			      Thread.sleep(3000);
			      int size12=num12.length();
			      if(size12 <=5)
			      {
			    	  System.out.println("");
			      }
			      else
			      {
			    	  System.out.println("You Have Entered More Than Two digits");
			      }
			      
			      
			      
			      
			      WebElement hummax=driver.findElement(By.xpath("//input[@id='hum_max']"));
			      hummax.click();
			      hummax.clear();
			      System.out.println("humidity maximum  values are cleared");
			      hummax.sendKeys("500000");
			      Thread.sleep(3000);
			      String num13=hummax.getAttribute("value");
			      System.out.println("The Values for humidity maximum Has Updated Successfully ");
			      Thread.sleep(3000);
			      int size13=num13.length();
			      if(size13<=5)
			      {
			    	  System.out.println("");
			      }
			      else
			      {
			    	  System.out.println("You Have Entered More Than Five Digits");
			      }
			      
			      
			      
			      
			      
			      //RECIRCLATION GAP
			      boolean minisDisplayed=driver.findElement(By.xpath("//input[@id='rec_gap_min']")).isDisplayed();
			      if(minisDisplayed)
			      {
			    	  System.out.println("Recirculation Gap Time is Displayed");
			      }
			      else
			      {
			    	  System.out.println("Recirculation Gap Time is not Displayed");
			      }
			      WebElement min=driver.findElement(By.xpath("//input[@id='rec_gap_min']"));
			      min.click();
			      min.clear();
			      System.out.println(" RECIRCLATION GAP value are cleared");
			      min.sendKeys("123454");
			      Thread.sleep(3000);
			      String num14=min.getAttribute("value");
			      System.out.println("The Values  for RECIRCLATION GAP  Has Updated Successfully ");
			      int size14=num14.length();
			      if(size14<=5)   
			      {
			    	  System.out.println(" ");
			      }
			      else
			      {
			    	  System.out.println("You Have Entered ore Than Five Digits");
			      }
			      
			      
			      
			      
			      //WATER FLOW T2 TO T1
			      boolean waterflowT2toT1isDisplayed=driver.findElement(By.xpath("//input[@id='t2_t1_wflow']")).isDisplayed();
			      if(waterflowT2toT1isDisplayed)
			      {
			    	  System.out.println("Water flow T2 to T1 is Displayed");
			      }
			      else
			      {
			    	  System.out.println("Water flow T2 to T1 is not Displayed");
			      }
			      WebElement waterflowT2toT1=driver.findElement(By.xpath("//input[@id='t2_t1_wflow']"));
			      waterflowT2toT1.click();
			      waterflowT2toT1.clear();
			      Thread.sleep(3000);
			      System.out.println("WATER FLOW T2 TO T1  value are cleared");
			      waterflowT2toT1.sendKeys("123454");
			      Thread.sleep(3000);
			      String num15=waterflowT2toT1.getAttribute("value");
			      System.out.println("The Values  for WATER FLOW T2 TO T1 Has Updated Successfully ");
			      Thread.sleep(3000);
			      int size15=num15.length();
			      if(size15<=5)
			      {
			    	  System.out.println(" ");
			      }
			      else
			      {
			    	  System.out.println("You Have Entered More Than Five digits");
			      }
			      
			      
			      
			      
			      
			      //DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2
			      boolean delaywaterpumpingt2minisDisplayed=driver.findElement(By.xpath("//input[@id='t2_t1_min']")).isDisplayed();
			      if(delaywaterpumpingt2minisDisplayed)
			      {
			    	  System.out.println("Delay between pumping Minutes Seconds is Displayed");
			      }
			      else
			      {
			    	  System.out.println("Delay between pumping Minutes Seconds is not Displayed");
			      }
			      WebElement delaywaterpumpingt2min=driver.findElement(By.xpath("//input[@id='t2_t1_min']"));
			      delaywaterpumpingt2min.click();
			      delaywaterpumpingt2min.clear();
			      Thread.sleep(3000);
			      System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 value are cleared");
			      delaywaterpumpingt2min.sendKeys("123454");
			      Thread.sleep(3000);
			      String num16=delaywaterpumpingt2min.getAttribute("value");
			      System.out.println("The Values  for DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 Has Updated Successfully ");
			      Thread.sleep(3000);
			      int size16=num16.length();
			      if(size16<=5)
			      {
			    	  System.out.println("");
			      }
			      else
			      {
			    	  System.out.println("You Have Entered More Than Five digits");
			      }
		          WebElement delaybetweenpumpingt2sec=driver.findElement( By.xpath("//input[@id='t2_t1_sec']"));
		          delaybetweenpumpingt2sec.click();
		          delaybetweenpumpingt2sec.clear();
		          Thread.sleep(3000);
		          System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 values are cleared");
		          delaybetweenpumpingt2sec.sendKeys("123454");
		          Thread.sleep(3000);
		          String num17=delaybetweenpumpingt2sec.getAttribute("value");
		          System.out.println("The Values  for DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 Has Updated Successfully ");
		          Thread.sleep(3000);
		          int size17=num17.length();
		          if(size17<=5)
		          {
		        	  System.out.println("");
		          }
		          else
		          {
		        	  System.out.println("You Have Entered More Than Two digits");
		          }
		          
		          
		          
		          
		          
		          
		          //CLICK ON RESET TANK2
		       WebElement resetT2=driver.findElement(By.id("t2_reset"));
		      //  resetT2.click();
		        WebElement waterlevelTank2=driver.findElement(By.xpath("(//h4[@class='card-text'])[6]"));
		        Actions act4=new Actions(driver);
		        act4.moveToElement(waterlevelTank2);
		        String waterLevelCheckingTank2=waterlevelTank2.getText();
		        System.out.println("water level in tank2 is :" +waterLevelCheckingTank2);
		          
		          
		          
		          //CLICK ON SAVE TANK 2
		          boolean savet2isDisplayed=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]")).isDisplayed();
		          if(savet2isDisplayed)
		          {
		        	  System.out.println("Save button is displayed");
		          }
		          else
		          {
		        	  System.out.println("Save button is not displayed");
		          }
		         WebElement savet2=driver.findElement(By.xpath("(//button[text()='Save Changes'])[3]"));
		         Actions act2=new Actions(driver);
		         act2.moveToElement(savet2).perform();
		         savet2.click();
		         Thread.sleep(3000);
		         Alert alt1=driver.switchTo().alert();
					System.out.println(alt1.getText());
				    Thread.sleep(3000);
					alt1.accept();
			    	Thread.sleep(3000);
			      
					
}
@AfterMethod
public void closeAquaFTest()
{
driver.quit();
}

  }
	
  

