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

public class AquaF_Tank3_Space_Validation 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://aquaf.cultyvate.com/aquaf/login");
			//Alert alt1=driver.switchTo().alert();
		//	Thread.sleep(2000);
		//	alt1.accept();
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
  @Test
  public void tank3_Space_Validation_Test() throws InterruptedException {
	  
	  WebElement lowerSoilMoisture=driver.findElement(By.id("moisture_lower"));
   	  lowerSoilMoisture.click();
   	  lowerSoilMoisture.clear();
   	  System.out.println("LOWER SOIL MOISTURE are cleared");
   	  Thread.sleep(2000);
   	  Actions act=new Actions(driver);
   	 lowerSoilMoisture.click();
   	 act.sendKeys(Keys.ENTER).perform();
   	lowerSoilMoisture.sendKeys("1");
   	  act.sendKeys(Keys.SPACE).perform();
   	 act.sendKeys(Keys.SPACE).perform();
   	 act.sendKeys(Keys.SPACE).perform();
   	 String name=lowerSoilMoisture.getAttribute("value");
   	 Assert.assertEquals(name,"1");
   	  System.out.println("It will not accept space in lowerSoilMoistureTest ");
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
  @Test
  
  public void upper_Moisture_Space_Validation_Test() throws InterruptedException
  {
  	
  	 WebElement upperMoisture=driver.findElement(By.xpath("//input[@id='moisture_upper']"));
 	  upperMoisture.click();
 	  upperMoisture.clear();
 	  System.out.println("UPPER MOISTURE values are cleared successfully :");
 	  Thread.sleep(2000);
 	 Actions act=new Actions(driver);
 	 upperMoisture.click();
 	 act.sendKeys(Keys.ENTER).perform();
 	upperMoisture.sendKeys("6");
  	  act.sendKeys(Keys.SPACE).perform();
  	  act.sendKeys(Keys.SPACE).perform();
  	  act.sendKeys(Keys.SPACE).perform();
  	  act.sendKeys(Keys.SPACE).perform();
  	  String name=upperMoisture.getAttribute("value");
  	  Assert.assertEquals(name,"6");
  	  System.out.println("It will not accept space in upperMoistureTest ");
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
  @Test(priority=3)
  public void Pump_water_to_Drain_when_waterinT3is_more_than_minimum_150ltrs() throws InterruptedException
  {
  
  	 WebElement pumpwaterToDRain=driver.findElement(By.xpath("//input[@id='t3_level_drain']"));
 	  pumpwaterToDRain.click();
 	  pumpwaterToDRain.clear();
 	  System.out.println("PUMP WATER TO DRAIN values are cleared successfully :");
 	  Thread.sleep(2000);
   	  Actions act=new Actions(driver);
  	 pumpwaterToDRain.click();
  	 act.sendKeys(Keys.ENTER).perform();
  	pumpwaterToDRain.sendKeys("234");
   	  act.sendKeys(Keys.SPACE).perform();
   	 act.sendKeys(Keys.SPACE).perform();
   	 act.sendKeys(Keys.SPACE).perform();
   	 act.sendKeys(Keys.SPACE).perform();
   	 String name=pumpwaterToDRain.getAttribute("value");
   	 Assert.assertEquals(name,"234");
   	  System.out.println("It will not accept space in Pump water to Drain when water in T3 is more than minimum 150ltrs ");
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
  @Test(priority=4)
  public void water_To_Drain_space_validation_Test() throws InterruptedException
  {
  	
  	  WebElement watertoDrain=driver.findElement(By.id("t3_wflow_drain"));
  	  watertoDrain.click();
  	  watertoDrain.clear();
  	  System.out.println(" WATER FLOW TO DRAIN values are cleared successfully ");
  	  Thread.sleep(2000);
  	  Actions act=new Actions(driver);
  	 watertoDrain.click();
  	 act.sendKeys(Keys.ENTER).perform();
  	watertoDrain.sendKeys("123");
  	  act.sendKeys(Keys.SPACE).perform();
  	 act.sendKeys(Keys.SPACE).perform();
  	 act.sendKeys(Keys.SPACE).perform();
  	 act.sendKeys(Keys.SPACE).perform();
  	 String name=watertoDrain.getAttribute("value");
  	 Assert.assertEquals(name, "123");
   	  System.out.println("It will not accept space in waterToDrain ");
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
public void closeAquaFTest()
{
	  driver.quit();
} 
}
