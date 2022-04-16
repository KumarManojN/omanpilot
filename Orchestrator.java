import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orchestrator 

{
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException
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
	public void tank1Orchestrator()
	{
		WebElement leg1=driver.findElement(By.xpath("(//a[text()='Sea Water '])"));
		leg1.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	WebElement orchestrator =driver.findElement(By.xpath("(//label[@for='t3_orchestrator_switch'])[2]"));
	orchestrator.click();
	
}
}