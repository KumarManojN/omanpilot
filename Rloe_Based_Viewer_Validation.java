import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rloe_Based_Viewer_Validation 
{
	WebDriver driver;
	  @BeforeMethod
	  public void SetUp() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");

			 driver=new ChromeDriver();
			 driver.get("http://aquaf.cultyvate.com/aquaf/login");
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
		 // WebElement adminValidation=driver.findElement(By.xpath("//h5[contains(text(),' Admin')]"));
		  //act.moveToElement(adminValidation);
		 // String name=adminValidation.getText();
		 // Assert.assertEquals(name, "admintest1 - Admin");
	 // System.out.println("The Account belongs to Admin");
		  

		  WebElement leg2=driver.findElement(By.xpath("//a[text()='Desalinated Water ']"));
		  act.moveToElement(leg2);
		  leg2.click();
		  Alert alt=driver.switchTo().alert();
		  Thread.sleep(2000);
		  alt.accept();

	  		Thread.sleep(4000);
	  	 
	  		
	  		
	  		
	  	    
	      	
	  	    //CLICK ON TANK2
	      	
	      	
	      
	      	WebElement tank2=driver.findElement(By.xpath("//a[text()='Tank2 (Capacity: 2271ltrs)']"));
	      	Actions act1=new Actions(driver);
	      	act1.moveToElement(tank2).perform();
	      	tank2.click();
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
	  	
	  			 
	  			    	Thread.sleep(3000);  
	  			  }	  
	  				  
	  				  @AfterMethod
	  				  public void quitAquaF()
	  				  {
	  					  driver.quit();
	  				  }
}
