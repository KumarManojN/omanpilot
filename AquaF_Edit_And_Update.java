import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AquaF_Edit_And_Update 
{

	WebDriver driver;
	  @BeforeMethod
	  public void SetUp() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\This PC\\OneDrive\\Desktop\\chrome driver\\chromedriver_w\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("http://localhost:4200/login");
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
		  WebElement addUser=driver.findElement(By.xpath("//a[text()='Add User']"));
		  addUser.click();
	//	WebElement updateUser=driver.findElement(By.xpath("//td[text()=' trdxser5t67yu ']"));
	//	updateUser.click();
		WebElement userUpdate=driver.findElement(By.xpath("(//span[text()='Update '])[4]"));
		act.moveToElement(userUpdate);
		userUpdate.click();
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		act.moveToElement(firstName);
		firstName.click();
		firstName.clear();
		firstName.sendKeys("aravindh    !@#$");
		WebElement lastName=driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
		lastName.click();
		lastName.clear();
		lastName.sendKeys("anupama     *^%$");
		WebElement emailId=driver.findElement(By.xpath("//input[@formcontrolname='emailId']"));
		emailId.click();
		emailId.clear();
		emailId.sendKeys("anuaravi@gmail.com");
		WebElement phoneNumber=driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']"));
		phoneNumber.click();
		phoneNumber.clear();
		phoneNumber.sendKeys("1234565434");
		 WebElement roleSelect=driver.findElement(By.xpath("//mat-select[@formcontrolname='role']"));
		 act.moveToElement(roleSelect);
		 roleSelect.click();
		 WebElement admin=driver.findElement(By.xpath("//span[text()='Operator']"));
		 act.moveToElement(admin);
		 admin.click();
		  Thread.sleep(2000);
		 WebElement isActive=driver.findElement(By.xpath("//mat-select[@formcontrolname='isactive']"));
		 act.moveToElement(isActive);
		 isActive.click();
		 WebElement isActivesel=driver.findElement(By.xpath("//span[text()='No']"));
		 isActivesel.click();
		 Thread.sleep(2000);
		 WebElement username=driver.findElement(By.xpath("//input[@formcontrolname='username']"));
		 username.click();
		 username.clear();
		 username.sendKeys("anupama123");
		  WebElement changePassword=driver.findElement(By.xpath("//input[@placeholder='Change Password']"));
		  changePassword.click();
		  changePassword.clear();
		  changePassword.sendKeys("aravind123");
		  WebElement update=driver.findElement(By.xpath("(//span[text()='Update'])"));
		  update.click();
		  Thread.sleep(3000);
		//  WebElement cancel=driver.findElement(By.xpath("(//span[text()='Cancel'])"));
		 // cancel.click();
	  }
	@AfterMethod
	public void closeAquaF()
	{
		driver.quit();
	}
}
