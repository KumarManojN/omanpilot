import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AquaF_Login_Validation 
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
			Thread.sleep(3000);
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
		  WebElement addUser1=driver.findElement(By.xpath("//span[text()='Add User ']"));
		  act.moveToElement(addUser1);
		  addUser1.click();
		  Thread.sleep(2000);
		  WebElement firstName=driver.findElement(By.xpath("//input[@formcontrolname='FirstName']"));
		  act.moveToElement(firstName);
		  firstName.click();
		  firstName.clear();
		  firstName.sendKeys("Manu");
		  WebElement lastName=driver.findElement(By.xpath("//input[@formcontrolname='LastName']"));
		  lastName.click();
		  lastName.clear();
		  lastName.sendKeys("Kuni");
		  Thread.sleep(2000);
		  WebElement mailId=driver.findElement(By.xpath("//input[@formcontrolname='EmailId']"));
		  mailId.click();
		  mailId.clear();
		  mailId.sendKeys("kunalceg@gmail.com");
		  WebElement phoneNumber=driver.findElement(By.xpath("//input[@formcontrolname='PhoneNumber']"));
		  phoneNumber.click();
		  phoneNumber.clear();
		  phoneNumber.sendKeys("9876543211");
		  Thread.sleep(2000);
		  WebElement roleSelect=driver.findElement(By.xpath("(//div[@class='mat-select-arrow-wrapper'])[2]"));
		  act.moveToElement(roleSelect);
		  roleSelect.click();
		  WebElement admin=driver.findElement(By.xpath("//span[text()='Operator']"));
		  admin.click();
		  Thread.sleep(2000);
		  WebElement isActive=driver.findElement(By.xpath("(//div[@class='mat-select-arrow-wrapper'])[3]"));
		  act.moveToElement(isActive);
		  isActive.click();
		  WebElement isActivesel=driver.findElement(By.xpath("//span[text()='Yes']"));
		  isActivesel.click();
		  WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		  username.click();
		  username.sendKeys("manukunni");
		  WebElement changePassword=driver.findElement(By.xpath("//input[@placeholder='Change Password']"));
		  changePassword.click();
		  changePassword.sendKeys("manukuni12");
		  WebElement clickOnAdd=driver.findElement(By.xpath("//button[@class='save-form mat-raised-button mat-button-base']"));
		  clickOnAdd.click();
		  Thread.sleep(2000);
		  WebElement clickOnReset=driver.findElement(By.xpath("(//button[@class='reset-form mat-raised-button mat-button-base'])[2]"));
		  clickOnReset.click();
		  Thread.sleep(2000);
		  WebElement clickOnCancel=driver.findElement(By.xpath("(//button[@class='reset-form mat-raised-button mat-button-base'])[1]"));
		  clickOnCancel.click();
		  Thread.sleep(2000);
		  WebElement menuButtonsec=driver.findElement(By.xpath("//img[@class='user-avatar-md rounded-circle']"));
		  act.moveToElement(menuButtonsec);
		  menuButtonsec.click();
		  Thread.sleep(2000);
  	   WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
  	   act.moveToElement(logout);
  	   Thread.sleep(2000);
  	   logout.click();
  	   Thread.sleep(2000);
	  }
	  @AfterMethod
	  public void quit()
	  {
		  driver.quit();
	  }    
}
