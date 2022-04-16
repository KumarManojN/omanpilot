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

public class AquaF_Tank3_Number_Validation 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://aquaf.cultyvate.com/aquaf/login");
		 //	Alert alt=driver.switchTo().alert();
		 //	Thread.sleep(3000);
		 //	alt.accept();
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
	    public void lower_Soil_Moisture_Test() throws InterruptedException
	    {
	  
	    	 WebElement lowerSoilMoisture=driver.findElement(By.id("moisture_lower"));
	   	  lowerSoilMoisture.click();
	   	  lowerSoilMoisture.clear();
	   	  System.out.println("LOWER SOIL MOISTURE are cleared");
	   	  Thread.sleep(2000);
	   	  lowerSoilMoisture.sendKeys("123456");
	   	  Thread.sleep(3000);;
	   	  String num=lowerSoilMoisture.getAttribute("value");
	   	 Assert.assertEquals(num,123456);
	   	  System.out.println("soil moisture lower threshold is allowing more than 5 digits ");
	   	
	    }
	    @Test(priority=2)
	    public void upper_Moisture_Test() throws InterruptedException
	    {
	    	
	    	 WebElement upperMoisture=driver.findElement(By.id("moisture_upper"));
	   	  upperMoisture.click();
	   	  upperMoisture.clear();
	   	  System.out.println("UPPER MOISTURE values are cleared successfully :");
	   	  Thread.sleep(2000);
	   	  upperMoisture.sendKeys("622123");
	   	  String num1=upperMoisture.getAttribute("value");
	   	 Assert.assertEquals(num1, 622123);
	   	  System.out.println("soil moisture upper threshold is allowing more than 5 digits ");
	   	
	    }
	    @Test(priority=3)
	    public void pump_Water_To_Drain_When_Water_In_T3_is_More_Than_minimum_150ltrs() throws InterruptedException
	    {
	    	
	    	 WebElement pumpwaterToDRain=driver.findElement(By.id("t3_level_drain"));
	   	  pumpwaterToDRain.click();
	   	  pumpwaterToDRain.clear();
	   	  System.out.println("PUMP WATER TO DRAIN values are cleared successfully :");
	   	  Thread.sleep(2000);
	   	  pumpwaterToDRain.sendKeys("676232");
	   	  String num2=pumpwaterToDRain.getAttribute("value");
	   	Assert.assertEquals(num2, 676232);
	   	  System.out.println("pump Water To Drain When Water In T3 is More Than minimum 150ltrs is allowing more than 5 digits ");
	   	 
	    }
	    @Test(priority=4)
	    public void water_To_Drain_Test() throws InterruptedException
	    {
	    	
	    	  WebElement watertoDrain=driver.findElement(By.id("t3_wflow_drain"));
	    	  watertoDrain.click();
	    	  watertoDrain.clear();
	    	  System.out.println(" WATER FLOW TO DRAIN values are cleared successfully ");
	    	  Thread.sleep(2000);
	    	  watertoDrain.sendKeys("453234");
	    	  String num3=watertoDrain.getAttribute("value");
	    	 Assert.assertEquals(num3, 453234);
	    	  System.out.println("water to drain is allowing more than 5 digits ");
	    	  
	    }
	    @Test(priority=5)
	    public void click_On_Save_T3() throws InterruptedException
	    
	    {
	    	  WebElement clickOnSave=driver.findElement(By.xpath("//button[text()='Save Changes']"));
	    	  clickOnSave.click();
	    	  Thread.sleep(3000);
	    	 Alert alt1=driver.switchTo().alert();
	    	 Thread.sleep(2000);
	    	 alt1.accept();
	    }
	        @AfterMethod
	        public void quitAquaF()
	        {
	        	driver.quit();
	        }
}
