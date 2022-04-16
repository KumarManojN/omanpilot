import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add_User_Validation {
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
				WebElement login =driver.findElement(By.xpath("//input[@value='Login']"));
				login.click();
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
	  }
		  @Test(priority=2)
		  public void addUserTest() throws InterruptedException
		  {
			  menuOption();
		  WebElement firstName=driver.findElement(By.xpath("//input[@formcontrolname='FirstName']"));
		  Actions act=new Actions(driver);
		  act.moveToElement(firstName);
		  firstName.click();
		  firstName.sendKeys("@@@#$%$");
		  WebElement lastName=driver.findElement(By.xpath("//input[@formcontrolname='LastName']"));
		  lastName.click();
		  act.sendKeys(Keys.ENTER).perform();
		  act.sendKeys(Keys.SPACE).perform();
		  act.sendKeys(Keys.SPACE).perform();
		  act.sendKeys(Keys.SPACE).perform();
		  act.sendKeys(Keys.SPACE).perform();
		  Thread.sleep(2000);
		
		  WebElement mailId=driver.findElement(By.xpath("//input[@formcontrolname='EmailId']"));
		  mailId.click();
		  mailId.sendKeys("kunalceg@gmail.com");
		  WebElement phoneNumber=driver.findElement(By.xpath("//input[@formcontrolname='PhoneNumber']"));
		  phoneNumber.click();
		  phoneNumber.sendKeys("9876543e1");
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
		  username.sendKeys("1234!@#$#@");
		  WebElement changePassword=driver.findElement(By.xpath("//input[@formcontrolname='Password']"));
		  changePassword.click();
		  changePassword.sendKeys("manu!@#2");
		  WebElement clickOnAdd=driver.findElement(By.xpath("//button[@class='save-form mat-raised-button mat-button-base']"));
		  clickOnAdd.click();
		  Thread.sleep(2000);
		  WebElement clickOnReset=driver.findElement(By.xpath("(//button[@class='reset-form mat-raised-button mat-button-base'])[2]"));
		  clickOnReset.click();
		  Thread.sleep(2000);
		  WebElement clickOnCancel=driver.findElement(By.xpath("(//button[@class='reset-form mat-raised-button mat-button-base'])[1]"));
		  clickOnCancel.click();
}
		  @AfterMethod
		  public void quit()
		  {
			  driver.quit();
		  }
}
