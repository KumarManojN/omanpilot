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

public class RoleBased_Validation 
{
	WebDriver driver;
	  @BeforeMethod
	  public void SetUp() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");

			 driver=new ChromeDriver();
			 driver.get("http://aquaf.cultyvate.com/aquaf/login");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
      	WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
			userName.click();
			userName.sendKeys("test");
			WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
			password.click();
			password.sendKeys("test@123");
			Thread.sleep(2000);
			WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
			submit.click();
			Thread.sleep(2000);
	  }

	  @Test(priority=1)
	  public void menuOption() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  WebElement menuButton=driver.findElement(By.xpath("//img[@class='user-avatar-md rounded-circle']"));
		  Actions act=new Actions(driver);
		  act.moveToElement(menuButton);
		  menuButton.click();
		  Thread.sleep(2000);
		  WebElement adminValidation=driver.findElement(By.xpath("//h5[contains(text(),' Admin')]"));
		  act.moveToElement(adminValidation);
		  String name=adminValidation.getText();
		  Assert.assertEquals(name, "Manoj - Admin");
	  System.out.println("The Account belongs to Admin");
		  

		  WebElement leg2=driver.findElement(By.xpath("//a[text()='Desalinated Water ']"));
		  act.moveToElement(leg2);
		  leg2.click();
		  Alert alt=driver.switchTo().alert();
		  Thread.sleep(2000);
		  alt.accept();

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
	  	WebElement  refillwater=   driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	  	   refillwater.click();
	  	   refillwater.clear();
	  	   System.out.println("refilling water values are cleared");
	  	   Thread.sleep(2000);
	  	   refillwater.sendKeys("123454");
	  	   System.out.println("The Values for Refill Water Has Updated Successfully ");
	  	   Thread.sleep(3000);
	 
	  	   boolean
	  	   watertoflowisDisplayed=driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).isDisplayed();
	  	   if(watertoflowisDisplayed)
	  	   {
	  		   System.out.println("Water flow to T2 is Displayed");
	  	   }
	  	   else
	  	   {
	  		   System.out.println("Water flow to T2 is not Displayed");
	  	   }
	  	   
	  		WebElement watertoflow=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
	  		watertoflow.click();
	  		watertoflow.clear();
	  		Thread.sleep(2000);
	  		System.out.println("water flow  value are cleared");
	  		watertoflow.sendKeys("123454");
	  		Thread.sleep(3000);
	  		System.out.println("The values for water flow from to t1 to  t2 has Updated successfully ");	
	  
	  	//DELAY BETWEEN PUMPING
	  		boolean delaybetweenpumpingvalueIsDisplayed=driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).isDisplayed();
	          if(delaybetweenpumpingvalueIsDisplayed)
	          {
	          	System.out.println("Delay between pumping Minutes Seconds is Displayed");
	          }
	          else
	          {
	          	System.out.println("Delay between pumping Minutes Seconds is not Displayed");
	          }
	  		WebElement delaybetweenpumpingvalue=driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
	  		delaybetweenpumpingvalue.click();
	  		delaybetweenpumpingvalue.clear();
	  		System.out.println("delay between pumping value  value are cleared");
	  		Thread.sleep(3000);
	  		delaybetweenpumpingvalue.sendKeys("123454");
	  		Thread.sleep(2000);
	  		   System.out.println("The Values for delay between pumping value Has Updated Successfully ");
	  		Thread.sleep(3000);
	  		
	  		WebElement dealaybetweenpumpingvalueseconds=driver.findElement(By.xpath("(//input[@type='number'])[4]"));
	  		dealaybetweenpumpingvalueseconds.click();
	  		dealaybetweenpumpingvalueseconds.clear();
	  		Thread.sleep(2000);
	  		System.out.println("delay between pumping value  value are cleared");
	  		Thread.sleep(3000);
	  		dealaybetweenpumpingvalueseconds.sendKeys("123454");
	  		Thread.sleep(2000);
	  		   System.out.println("The Values for delay between pumping value Has Updated Successfully ");
	  		Thread.sleep(3000);	
	  		
	  	
	  		//CLICK ON SAVE
	  		WebElement savechanges=driver.findElement(By.xpath("(//button[text()='Save Changes'])[2]"));
	  		savechanges.click();
	  		Thread.sleep(2000);
	  	 
	  		
	  		
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
	      	boolean phvalueminisDisplayed=driver.findElement(By.xpath("(//input[@class='form-control'])[9]")).isDisplayed();
	      	if(phvalueminisDisplayed)
	      	{
	      		System.out.println("pH-value is Displayed");
	      	}
	      	else
	      	{
	      		System.out.println("pH-value is not Displayed");
	      	}
	      	WebElement phvaluemin=driver.findElement(By.xpath("(//input[@class='form-control'])[9]"));
	  		 WebDriverWait wait2=new WebDriverWait(driver,30);
	  	     wait2.until(ExpectedConditions.elementToBeClickable(phvaluemin));
	  		phvaluemin.clear();
	  		System.out.println("ph value minimum  values are cleared");
	  		Thread.sleep(2000);
	  		phvaluemin.sendKeys("300000");
	  		Thread.sleep(3000);
	  	    System.out.println("The Values for ph value minimum Has Updated Successfully ");
	  		Thread.sleep(3000);
	
	  		WebElement phvaluemax=driver.findElement(By.xpath("(//input[@class='form-control'])[10]"));
	  		 phvaluemax.click();
	  	     phvaluemax.clear();
	  	 	System.out.println("ph value maximum  value are cleared");
	  	     Thread.sleep(2000);
	  	      phvaluemax.sendKeys("400000");  
	  	      Thread.sleep(3000);
	  	      System.out.println("The Values for ph value minimum Has Updated Successfully ");
	  	      Thread.sleep(3000);
	      
	  	      //WATER FLOW TO T3
	  	      boolean waterflowtot3isDisplayed=driver.findElement(By.xpath("(//input[@class='form-control'])[11]")).isDisplayed();
	  	      if(waterflowtot3isDisplayed)
	  	      {
	  	    	  System.out.println("Water flow to T3 is Displayed ");
	  	      }
	  	      else
	  	      {
	  	    	  System.out.println("Water flow to T3 is not Displayed");
	  	      }
	  	      WebElement waterflowtot3=driver.findElement(By.xpath("(//input[@class='form-control'])[11]"));
	  		     waterflowtot3.click();
	  		     waterflowtot3.clear();
	  		 	System.out.println("water flow to t3  values are cleared");
	  		     Thread.sleep(2000);
	  		     waterflowtot3.sendKeys("123454");
	  		     Thread.sleep(3000);
	  		     System.out.println("The Values for water flow to t3 Has Updated Successfully ");
	  		     Thread.sleep(3000);
	  		   
	  		   
	  	  
	  		     
	  		     //DELAY  BETWEEN PUMPING IN TANK2
	  		     boolean delaybetweenpumpingminisDisplayed=driver.findElement(By.xpath("(//input[@class='form-control'])[12]")).isDisplayed();
	  		     if(delaybetweenpumpingminisDisplayed)
	  		     {
	  		    	 System.out.println("Delay between pumping Minutes Seconds is Displayed");
	  		     }
	  		     else
	  		     {
	  		    	 System.out.println("Delay between pumping Minutes Seconds is not Displayed");
	  		     }
	  		     
	  		     WebElement delaybetweenpumpingmin=driver.findElement(By.xpath("(//input[@class='form-control'])[12]"));
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
	  			     
	  			     
	  			     
	  			     
	  			     
	  			     WebElement delaybetweenpumpingsec=driver.findElement(By.xpath("(//input[@class='form-control'])[13]"));
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
	  			     boolean tempMinisDisplayed=driver.findElement(By.xpath("(//input[@type='number'])[14]")).isDisplayed();
	                   if(tempMinisDisplayed)
	                   {
	                  	 System.out.println("T2 to T1 Temperature is Displayed");
	                   }
	                   else
	                   {
	                  	 System.out.println("T2 to T1 Temperature is not Displayed");
	                   }
	  			     WebElement tempMin=driver.findElement(By.xpath("(//input[@type='number'])[14]"));
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
	  			      
	  			      
	  			      
	  			      
	  			      WebElement tempMax=driver.findElement(By.xpath("(//input[@type='number'])[15]"));
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
	  			      boolean humminisDisplayed=driver.findElement(By.xpath("(//input[@class='form-control'])[16]")).isDisplayed();
	  			      if(humminisDisplayed)
	  			      {
	  			    	  System.out.println("Humidity is Displayed");
	  			      }
	  			      else
	  			      {
	  			    	  System.out.println("Humidity is not Displayed");
	  			      }
	  			      WebElement hummin=driver.findElement(By.xpath("(//input[@class='form-control'])[16]"));
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
	  			      
	  			      
	  			      
	  			      
	  			      WebElement hummax=driver.findElement(By.xpath("(//input[@class='form-control'])[17]"));
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
	  			      boolean minisDisplayed=driver.findElement(By.xpath("(//input[@type='number'])[18]")).isDisplayed();
	  			      if(minisDisplayed)
	  			      {
	  			    	  System.out.println("Recirculation Gap Time is Displayed");
	  			      }
	  			      else
	  			      {
	  			    	  System.out.println("Recirculation Gap Time is not Displayed");
	  			      }
	  			      WebElement min=driver.findElement(By.xpath("(//input[@type='number'])[18]"));
	  			      min.click();
	  			      min.clear();
	  			      System.out.println(" RECIRCLATION GAP value are cleared");
	  			      min.sendKeys("123454");
	  			      Thread.sleep(3000);
	  			      System.out.println("The Values  for RECIRCLATION GAP  Has Updated Successfully ");
	  			 
	  			      //WATER FLOW T2 TO T1
	  			      boolean waterflowT2toT1isDisplayed=driver.findElement(By.xpath("(//input[@type='number'])[19]")).isDisplayed();
	  			      if(waterflowT2toT1isDisplayed)
	  			      {
	  			    	  System.out.println("Water flow T2 to T1 is Displayed");
	  			      }
	  			      else
	  			      {
	  			    	  System.out.println("Water flow T2 to T1 is not Displayed");
	  			      }
	  			      WebElement waterflowT2toT1=driver.findElement(By.xpath("(//input[@type='number'])[19]"));
	  			      waterflowT2toT1.click();
	  			      waterflowT2toT1.clear();
	  			      Thread.sleep(3000);
	  			      System.out.println("WATER FLOW T2 TO T1  value are cleared");
	  			      waterflowT2toT1.sendKeys("123454");
	  			      Thread.sleep(3000);
	  			      System.out.println("The Values  for WATER FLOW T2 TO T1 Has Updated Successfully ");
	  			      Thread.sleep(3000);
	  			   
	  			      //DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2
	  			      boolean delaywaterpumpingt2minisDisplayed=driver.findElement(By.xpath("(//input[@type='number'])[20]")).isDisplayed();
	  			      if(delaywaterpumpingt2minisDisplayed)
	  			      {
	  			    	  System.out.println("Delay between pumping Minutes Seconds is Displayed");
	  			      }
	  			      else
	  			      {
	  			    	  System.out.println("Delay between pumping Minutes Seconds is not Displayed");
	  			      }
	  			      WebElement delaywaterpumpingt2min=driver.findElement(By.xpath("(//input[@type='number'])[21]"));
	  			      delaywaterpumpingt2min.click();
	  			      delaywaterpumpingt2min.clear();
	  			      Thread.sleep(3000);
	  			      System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 value are cleared");
	  			      delaywaterpumpingt2min.sendKeys("123454");
	  			      Thread.sleep(3000);
	  			      System.out.println("The Values  for DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 Has Updated Successfully ");
	  			      Thread.sleep(3000);

	  		          WebElement delaybetweenpumpingt2sec=driver.findElement( By.xpath("(//input[@type='number'])[22]"));
	  		          delaybetweenpumpingt2sec.click();
	  		          delaybetweenpumpingt2sec.clear();
	  		          Thread.sleep(3000);
	  		          System.out.println("DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 values are cleared");
	  		          delaybetweenpumpingt2sec.sendKeys("123454");
	  		          Thread.sleep(3000);
	  		          System.out.println("The Values  for DELAY BETWEEN PUMPING IN T2 FROM T1 TO T2 Has Updated Successfully ");
	  		          Thread.sleep(3000);
	  		      
	  		          //CLICK ON RESET TANK2
	  		       WebElement resetT2=driver.findElement(By.id("t2_reset"));
	  		        resetT2.click();
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
	  				    Thread.sleep(2000);
	  					alt1.accept();
	  			    	Thread.sleep(3000);
	  }
	  @Test(priority=2)
public void tank3() throws InterruptedException
{
	  		      WebElement tank3=driver.findElement(By.xpath("//a[text()='Tank 3 ']"));
	  		      Actions act=new Actions(driver);
	  		      act.moveToElement(tank3);
	  		      tank3.click();
	  		      Thread.sleep(2000);
	  		      Alert alt=driver.switchTo().alert();
	  		      alt.accept();
	  	
	  			     //LOWER SOIL MOISTURE
	  				  boolean lowerSoilMoistureIsDisplayed=driver.findElement(By.id("moisture_lower")).isDisplayed();
	  				  if(lowerSoilMoistureIsDisplayed)
	  					  {
	  					  System.out.println("LOWER SOIL MOISTURE is Displayed");
	  				  }
	  				  else
	  				  {
	  					  System.out.println("LOWER SOIL MOISTURE is not Displayed");
	  				  }
	  				  WebElement lowerSoilMoisture=driver.findElement(By.id("moisture_lower"));
	  				  lowerSoilMoisture.click();
	  				  lowerSoilMoisture.clear();
	  				  System.out.println("LOWER SOIL MOISTURE are cleared");
	  				  Thread.sleep(2000);
	  				  lowerSoilMoisture.sendKeys("3");
	  				  Thread.sleep(3000);;
	  				  System.out.println("The Values for LOWER SOIL MOISTURE has updated successfully ");
	  			  	
	  				  
	  			
	  				  //UPPER MOISTURE
	  				  boolean upperMoistureisDisplayed=driver.findElement(By.id("moisture_upper")).isDisplayed();
	  				  if(upperMoistureisDisplayed)
	  				  {
	  					  System.out.println("UPPER MOISTURE is Displayed");
	  				  }
	  				  WebElement upperMoisture=driver.findElement(By.id("moisture_upper"));
	  				  upperMoisture.click();
	  				  upperMoisture.clear();
	  				  System.out.println("UPPER MOISTURE values are cleared successfully ");
	  				  Thread.sleep(2000);
	  				  upperMoisture.sendKeys("6");
	  				  System.out.println("The values for UPPER MOISTURE are updated successfully ");
	  				  
	  				
	  				  //PUMP WATER TO DRAIN
	  				  boolean pumpwaterToDRainisDisplayed=driver.findElement(By.id("t3_level_drain")).isDisplayed();
	  				  if(pumpwaterToDRainisDisplayed)
	  				  {
	  					  System.out.println("PUMP WATER TO DRAIN is Displayed");
	  				  }
	  				  else
	  				  {
	  					  System.out.println("PUMP WATER TO DRAIN is not Displayed");
	  				  }

	  				  WebElement pumpwaterToDRain=driver.findElement(By.id("t3_level_drain"));
	  				  pumpwaterToDRain.click();
	  				  pumpwaterToDRain.clear();
	  				  System.out.println("PUMP WATER TO DRAIN values are cleared successfully");
	  				  Thread.sleep(2000);
	  				  pumpwaterToDRain.sendKeys("100");
	  				  System.out.println("Thhe values for PUMP WATER TO DRAIN has Updated successfully ");
	  				  Thread.sleep(3000);
	  				
	  				  //WATER FLOW TO DRAIN
	  				  boolean watertoDrainIsDisplayed=driver.findElement(By.id("t3_wflow_drain")).isDisplayed();
	  				  if(watertoDrainIsDisplayed)
	  				  {
	  					  System.out.println("WATER FLOW TO DRAIN is Displayed");
	  				  }
	  				  else
	  				  {
	  					  System.out.println("WATER FLOW TO DRAIN is not Displayed");
	  				  }
	  				  WebElement watertoDrain=driver.findElement(By.id("t3_wflow_drain"));
	  				  watertoDrain.click();
	  				  watertoDrain.clear();
	  				  System.out.println(" WATER FLOW TO DRAIN values are cleared successfully ");
	  				  Thread.sleep(2000);
	  				  watertoDrain.sendKeys("45");
	  				  System.out.println("The values WATER FLOW TO DRAIN has updated successfully ");
	  				
	  				  //CLICK ON SAVE
	  				  WebElement clickOnSave=driver.findElement(By.xpath("//button[text()='Save Changes']"));
	  				  clickOnSave.click();
	  				   Thread.sleep(3000);
	  				  
	  				  
	  				  
	  				  //CLICK ON ALERT POP UP
	  					
	  					System.out.println(alt.getText());
	  				    Thread.sleep(3000);
	  					alt.accept();
	  			    	Thread.sleep(3000);  
	  			  }	  
	  				  
	  				  @AfterMethod
	  				  public void quitAquaF()
	  				  {
	  					  driver.quit();
	  				  }
	  				  }
	  

