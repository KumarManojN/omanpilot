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

public class AquaF_Tank3_Charecter_Validation 
{
	
	WebDriver driver;
	String ExpectedMsg="Saved Data Successfully..";
	String validmsg="enter a valid value";
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://aquaf.cultyvate.com/aquaf/login");
		 Thread.sleep(3000);
		//	Alert alt1=driver.switchTo().alert();
			Thread.sleep(2000);
			
			//alt1.accept();
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
		 WebElement leg2click=driver.findElement(By.xpath("//a[text()='Tank 3 ']"));
		 leg2click.click();
		 Thread.sleep(2000);
		 Alert alt=driver.switchTo().alert();
		 Thread.sleep(2000);
		 alt.accept();
	
	}
	  @Test(priority=1)
	    public void lower_Soil_Moisture_Char_Test() throws InterruptedException
	    {
	    SoftAssert assertion=new SoftAssert();
	    	 WebElement lowerSoilMoisture=driver.findElement(By.id("moisture_lower"));
	   	  lowerSoilMoisture.click();
	   	  lowerSoilMoisture.clear();
	   	  System.out.println("LOWER SOIL MOISTURE are cleared");
	   	  Thread.sleep(2000);
	   	  lowerSoilMoisture.sendKeys("1e");
	   	  Actions act1=new Actions(driver);
	   	  act1.sendKeys(Keys.ENTER).perform();
	   	  Thread.sleep(3000);;
	   	 WebElement clickOnSave=driver.findElement(By.xpath("//button[text()='Save Changes']"));
   	  clickOnSave.click();
   	   Thread.sleep(3000);
   	  //CLICK ON ALERT POP UP
   		Alert alt=driver.switchTo().alert();
   		alt.accept();
   	 Thread.sleep(2000);
   		String msg=alt.getText();
   		alt.accept();
       	Thread.sleep(3000); 
	   	  Actions act=new Actions(driver);
	   	  act.moveToElement(clickOnSave);
	   	  assertion.assertEquals(msg, ExpectedMsg);
	   	assertion.assertAll();
	   	  System.out.println("lower Soil Moisture Test is accepting charecters ");
	   	  
	    }
	  @Test(priority=2)
	    public void upper_Moisture_Char_Test() throws InterruptedException
	    {
	    	SoftAssert assertion=new SoftAssert();
	    	 WebElement upperMoisture=driver.findElement(By.id("moisture_upper"));
	   	  upperMoisture.click();
	   	  upperMoisture.clear();
	   	  System.out.println("UPPER MOISTURE values are cleared successfully :");
	   	  Thread.sleep(2000);
	   	  upperMoisture.sendKeys("6e");
	   	  Actions act1=new Actions(driver);
	   	  act1.sendKeys(Keys.ENTER).perform();
	   	  Thread.sleep(3000);
	 	 WebElement clickOnSave=driver.findElement(By.xpath("//button[text()='Save Changes']"));
	   	  clickOnSave.click();
	   	   Thread.sleep(3000);
	   	  //CLICK ON ALERT POP UP
	   		Alert alt=driver.switchTo().alert();
	   		alt.accept();
	   		Thread.sleep(3000); 
	   		String msg=alt.getText();
		   	  
	       	Thread.sleep(3000); 
		   	  Actions act=new Actions(driver);
		   	  act.moveToElement(clickOnSave);
		   	  assertion.assertEquals(msg, ExpectedMsg);
	   	  assertion.assertAll();
	   	  System.out.println("Upper Moisture is Accepting Charecters");
	    }
	  @Test(priority=3)
	    public void Pump_water_to_Drain_when_water_in_T3_is_more_than_minimum_150ltrs() throws InterruptedException
	    {
	    	SoftAssert assertion=new SoftAssert();
	    	 WebElement pumpwaterToDRain=driver.findElement(By.id("t3_level_drain"));
	   	  pumpwaterToDRain.click();
	   	  pumpwaterToDRain.clear();
	   	  System.out.println("PUMP WATER TO DRAIN values are cleared successfully :");
	   	  Thread.sleep(2000);
	   	  pumpwaterToDRain.sendKeys("564e");
	   	  Actions act1=new Actions(driver);
	   	  act1.sendKeys(Keys.ENTER).perform();
	   	  Thread.sleep(3000);
	 	 WebElement clickOnSave=driver.findElement(By.xpath("//button[text()='Save Changes']"));
	   	  clickOnSave.click();
	   	   Thread.sleep(3000);
	   	  //CLICK ON ALERT POP UP
	   		Alert alt=driver.switchTo().alert();
	   		
	   		alt.accept();
	   	    Thread.sleep(2000);
	   		String msg=alt.getText();
	   	
	       	Thread.sleep(3000); 
		   	  Actions act=new Actions(driver);
		   	  act.moveToElement(clickOnSave);
		   	  assertion.assertEquals(msg, ExpectedMsg);
	   	 System.out.println("Pump water to Drain when water in T3 is more than minimum 150ltrs is accepting characters charecters");
	   	  assertion.assertAll();
	    }
	  @Test(priority=4)
	    public void water_To_Drain_Char_Test() throws InterruptedException
	    {
	    	SoftAssert assertion=new SoftAssert();
	    	  WebElement watertoDrain=driver.findElement(By.id("t3_wflow_drain"));
	    	  watertoDrain.click();
	    	  watertoDrain.clear();
	    	  System.out.println(" WATER FLOW TO DRAIN values are cleared successfully ");
	    	  Thread.sleep(2000);
	    	  watertoDrain.sendKeys("556e");
	    	  Actions act1=new Actions(driver);
	    	  act1.sendKeys(Keys.ENTER).perform();
	    	  Thread.sleep(3000);
	    		 WebElement clickOnSave=driver.findElement(By.xpath("//button[text()='Save Changes']"));
	    	   	  clickOnSave.click();
	    	   	   Thread.sleep(3000);
	    	   	  //CLICK ON ALERT POP UP
	    	   		Alert alt=driver.switchTo().alert();	
	    	   		alt.accept();
	    	   	 Thread.sleep(2000);
	    	   		String msg=alt.getText();
	    	       	Thread.sleep(3000); 
	    		   	  Actions act=new Actions(driver);
	    		   	  act.moveToElement(clickOnSave);
	    		   	  assertion.assertEquals(msg, ExpectedMsg);
	    	  System.out.println("water To Drain is accepting characters charecters");
	    	  assertion.assertAll();
	    }
	  @Test(priority=5)
	    public void click_On_Save_T3() throws InterruptedException
	    
	    {
	    	  WebElement clickOnSave=driver.findElement(By.xpath("//button[text()='Save Changes']"));
	    	  clickOnSave.click();
	    	   Thread.sleep(3000);
	    	  //CLICK ON ALERT POP UP
	    		Alert alt=driver.switchTo().alert();
	    		System.out.println(alt.getText());
	    	    Thread.sleep(3000);
	    		alt.accept();
	        	Thread.sleep(3000);  
	    }
	  @AfterMethod
	  public void close_AquaF_Test()
	  {
		  driver.quit();
	  }
  
}
