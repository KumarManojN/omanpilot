import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AquaF_Tank3_Edit_And_Delete_Validation 
{
	WebDriver driver;
	@BeforeMethod
public void setUp() throws InterruptedException
{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://aquaf.cultyvate.com/aquaf/login");
		Thread.sleep(3000);
		//Alert alt4=driver.switchTo().alert();
	//	System.out.println(alt4.getText());
		//alt4.accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
	 public void page_Title_Test()
	 {
		
			String title=driver.getTitle();
			System.out.println("the page title is : " +title);
			Assert.assertEquals(title, "Aqua-F Pilot");
	
	 }
	
	
	
  @Test(priority=2)
  public void edit_And_Delete_Test() throws InterruptedException
  {
	  
	  
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
	  String num=lowerSoilMoisture.getAttribute("value");
	  System.out.println("The Values for LOWER SOIL MOISTURE has updated successfully :" +num );
  	
	  
	  
	  
	  
	  //UPPER MOISTURE
	  boolean upperMoistureisDisplayed=driver.findElement(By.id("moisture_upper")).isDisplayed();
	  if(upperMoistureisDisplayed)
	  {
		  System.out.println("UPPER MOISTURE is Displayed");
	  }
	  WebElement upperMoisture=driver.findElement(By.id("moisture_upper"));
	  upperMoisture.click();
	  upperMoisture.clear();
	  System.out.println("UPPER MOISTURE values are cleared successfully :");
	  Thread.sleep(2000);
	  upperMoisture.sendKeys("6");
	  String num1=upperMoisture.getAttribute("value");
	  System.out.println("The values for UPPER MOISTURE are updated successfully :" +num1);
	  
	  
	  
	  
	  
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
	  System.out.println("PUMP WATER TO DRAIN values are cleared successfully :");
	  Thread.sleep(2000);
	  pumpwaterToDRain.sendKeys("100");
	  String num2=pumpwaterToDRain.getAttribute("value");
	  System.out.println("Thhe values for PUMP WATER TO DRAIN has Updated successfully :" +num2);
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
	  String num3=watertoDrain.getAttribute("value");
	  System.out.println("The values WATER FLOW TO DRAIN has updated successfully :" +num3);
	  
	  //CLICK ON SAVE
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
    	public void quit_AquaF_Test()
    	{
    		driver.quit();
    	}

}
