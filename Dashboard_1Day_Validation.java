import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dashboard_1Day_Validation 
{
	WebDriver driver;
	  @BeforeMethod
	  public void SetUp() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://aquaf.cultyvate.com/aquaf/login");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			  WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
			  userName.click(); userName.sendKeys("Manoj"); 
			  WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
			  password.click(); password.sendKeys("1234"); 
			  Thread.sleep(2000); 
			  WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
			  submit.click();
			  Thread.sleep(3000);
	  }
	  @Test(priority=1)
	  public void tank1_Chart_Test() throws InterruptedException
	  {
		 
	      WebElement tank1Chart=driver.findElement(By.xpath("//div[@id='leg1_tank1_card']"));
	      Actions act1=new Actions(driver);
	      act1.moveToElement(tank1Chart);
	      tank1Chart.click();
	     Thread.sleep(3000);
	      WebElement select_date_1Day_TDS=driver.findElement(By.xpath("//button[text()='1 Day']"));
		  Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day_TDS);
          select_date_1Day_TDS.click();
          Thread.sleep(15000);
	      boolean tank1Chart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
	      if(tank1Chart1)
	      {
	      	System.out.println("chart for Tank1 is displayed");
	      }
	      else
	      {
	      	System.out.println("chart is not displayed for Tank1 in Leg1");
	      }
		  
	  }
	  @Test(priority=2)
	  public void tank1_ph_Test() throws InterruptedException
	  {
		  
	        WebElement seawaterTank1Ph=driver.findElement(By.xpath("//div[@id='leg1_t1_pH_card']"));
	        Actions act1=new Actions(driver);
	        act1.moveToElement(seawaterTank1Ph);
	        seawaterTank1Ph.click();
	        Thread.sleep(3000);
	        WebElement select_date_1Day_PH=driver.findElement(By.xpath("//button[text()='1 Day']"));
		      Actions act=new Actions(driver);
		      act.moveToElement(select_date_1Day_PH);
		      select_date_1Day_PH.click();
		      Thread.sleep(15000);		      
	      boolean phChartTank1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
	      
	    	  if(phChartTank1)
	    	  {
	    		  System.out.println("chart is displayed for ph in tank1 for leg1");
	           }
	    	  else
	    	  {
	    		  System.out.println("chart is not displayed for ph in tank1 for leg1");
	    	  }
	       
	  }
	  @Test(priority=3)
  public void tank1_tds_Test() throws InterruptedException
  {
		
  
  WebElement seawater_Tank1_Tds=driver.findElement(By.xpath("//div[@id='leg1_t1_tds_card']"));

  seawater_Tank1_Tds.click();
  Thread.sleep(3000);
  WebElement select_date_1Day_EC=driver.findElement(By.xpath("//button[text()='1 Day']"));
  Actions act2=new Actions(driver);
  act2.moveToElement(select_date_1Day_EC);
  select_date_1Day_EC.click();
  Thread.sleep(15000);
  boolean tdsChart=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
  if(tdsChart)
  {
  	System.out.println("chart for Tds Is Displayed");
  }
  else
  {
  	System.out.println("chart is not displayed for Tds");
  }
  }
	  @Test(priority=4)
  public void tank1_Ec_Test() throws InterruptedException
  {
		
       WebElement seawaterTank1Ec=driver.findElement(By.xpath("//div[@id='leg1_t1_ec_card']"));
       Actions act=new Actions(driver);
       act.moveToElement(seawaterTank1Ec);
       seawaterTank1Ec.click();
       Thread.sleep(3000);
       WebElement select_date_1Day_EC=driver.findElement(By.xpath("//button[text()='1 Day']"));
       Actions act2=new Actions(driver);
       act2.moveToElement(select_date_1Day_EC);
       select_date_1Day_EC.click();
       Thread.sleep(15000);

  	
       boolean ecChart=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
       if(ecChart)
       {
      	 System.out.println("chart is displayed for Ec");
       }}
	   @Test(priority=5)
     public void tank2_Chart_Test() throws InterruptedException
     {
		
          WebElement tank2Chart=driver.findElement(By.xpath("//div[@id='leg1_t2_card']"));
          Actions act1=new Actions(driver);
          act1.moveToElement(tank2Chart);
          tank2Chart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day_Ph=driver.findElement(By.xpath("//button[text()='1 Day']"));
	         Actions act2=new Actions(driver);
	         act2.moveToElement(select_date_1Day_Ph);
	         select_date_1Day_Ph.click();
       Thread.sleep(15000);
          boolean tank2Chart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(tank2Chart1) 
          {
            System.out.println("Chart is displayed for Tank2 in leg1");	 
          }
          else
          {
         	 System.out.println("chart is not displayed for Tank2 in leg1");
          }
     }
	  @Test(priority=6)
	public void seaWater_Tank2_ph_Test() throws InterruptedException
	{
		
       WebElement phTank2=driver.findElement(By.xpath("//div[@id='leg1_t2_pH_card']"));
       Actions act=new Actions(driver);
       act.moveToElement(phTank2);
       phTank2.click();
       Thread.sleep(3000);
       WebElement select_date_1Day_Ph=driver.findElement(By.xpath("//button[text()='1 Day']"));
       Actions act2=new Actions(driver);
       act2.moveToElement(select_date_1Day_Ph);
       select_date_1Day_Ph.click();
       Thread.sleep(15000);

       boolean phChart=driver.findElement(By.xpath("//div[@id='leg1_t2_pH_card']")).isDisplayed();
      if(phChart)
      {
      	System.out.println("Chart is displayed for the Ph tank2");
      }
      else
      {
      	System.out.println("chart is not displayed for the Ph tank2");
      }}
		@Test(priority=7)
		public void  seaWater_Tank2_Ec_Test() throws InterruptedException
		{
			
			 
         WebElement ecTank2=driver.findElement(By.xpath("//div[@id='leg1_t2_ec_card']"));
         Actions act=new Actions(driver);
         act.moveToElement(ecTank2);
         ecTank2.click();
         Thread.sleep(3000);
         WebElement select_date_1Day_Ec=driver.findElement(By.xpath("//button[text()='1 Day']"));
         Actions act2=new Actions(driver);
         act2.moveToElement(select_date_1Day_Ec);
         select_date_1Day_Ec.click();
         Thread.sleep(15000);

			boolean ecTank2Chart=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
			if(ecTank2Chart)
			{
				System.out.println("chart is displayed for the Ec In Tank2 For leg1");
			}
			else
			{
				System.out.println("chart is not displayed for the Ec In Tank2 For leg1");
			}
		}
		@Test(priority=8)
		public void seaWater_tds_Tank2_Test() throws InterruptedException
		{
			
         WebElement tdsTank2=driver.findElement(By.xpath("//div[@id='leg1_t2_tds_card']"));
         Actions act=new Actions(driver);
         act.moveToElement(tdsTank2);
         tdsTank2.click();
         Thread.sleep(3000);
         WebElement select_date_1Day_TDS=driver.findElement(By.xpath("//button[text()='1 Day']"));
         Actions act2=new Actions(driver);
         act2.moveToElement(select_date_1Day_TDS);
         select_date_1Day_TDS.click();
         Thread.sleep(15000);

         boolean tdsTank2Chart=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
			if(tdsTank2Chart)
			{
				System.out.println("chart is displayed for the TDS In Tank2 For leg1");
			}
			else
			{
				System.out.println("chart is not displayed for the TDS In Tank2 For leg1");
			} 
		}
		
		@Test(priority=9)
		public void tank1_Ph_Leg2_Test() throws InterruptedException
		{
			
         WebElement phTank2=driver.findElement(By.xpath("//div[@id='leg2_t1_pH_card']"));
         Actions act=new Actions(driver);
         act.moveToElement(phTank2);
         phTank2.click();
         Thread.sleep(3000);
         WebElement select_date_1Day_Ph=driver.findElement(By.xpath("//button[text()='1 Day']"));
         Actions act2=new Actions(driver);
         act2.moveToElement(select_date_1Day_Ph);
         select_date_1Day_Ph.click();
         Thread.sleep(15000);
         boolean phTank1Chart=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
         if(phTank1Chart)
         {
        	 System.out.println("chart is displayed for Tank1 Ph in Leg2");
         }
         else
         {
        	 System.out.println("chart is not displayed for the ph in Tank1 ");
         }}
		@Test(priority=10)
		public void tank2_TDS_Leg2_Test() throws InterruptedException
		{
			
        WebElement tdsTank1=driver.findElement(By.xpath("//div[@id='leg2_t1_tds_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(tdsTank1);
        tdsTank1.click();
        Thread.sleep(3000);
        WebElement select_date_1Day_TDS=driver.findElement(By.xpath("//button[text()='1 Day']"));
        Actions act2=new Actions(driver);
        act2.moveToElement(select_date_1Day_TDS);
        select_date_1Day_TDS.click();
        Thread.sleep(15000);
       boolean ecCharTank1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
       if(ecCharTank1)
       {
    	   System.out.println("chart is displayed for Ec In Tank1 In Leg2");
       }
       else
       {
    	   System.out.println("chart is not displayed for the Ec In Tank2 For Leg2");
       }
		}
		@Test(priority=11)
		public void ec_Tank1_Leg2_Test() throws InterruptedException
		{
			 
        WebElement ecTank1=driver.findElement(By.xpath("//div[@id='leg2_t1_ec_card']"));
       Actions act=new Actions(driver);
       act.moveToElement(ecTank1);
       ecTank1.click();
       Thread.sleep(3000);
       WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
       Actions act2=new Actions(driver);
       act2.moveToElement(select_date_1Day);
       select_date_1Day.click();
       Thread.sleep(15000);	
       boolean ecChartTank1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
       if(ecChartTank1)
       {
    	   System.out.println("chart is displayed for the Ec in Tank1 for Leg2");
       }
       else
       {
    	   System.out.println("chart is not diplayed for the EC in Tank2 for Leg2");
       }
		}
		@Test(priority=12)
		public void ph_Tank2_Leg2_Test() throws InterruptedException
		{
		
        WebElement phTank2=driver.findElement(By.xpath("//div[@id='leg2_t2_pH_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(phTank2);
        phTank2.click();
        Thread.sleep(3000);
  	  WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
      Actions act2=new Actions(driver);
      act2.moveToElement(select_date_1Day);
      select_date_1Day.click();
      Thread.sleep(15000);	
        boolean phChartTank2=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
        if(phChartTank2)
        {
        	System.out.println("chart is displayed for the Ph in Tank2 For Leg2");
        }
        else
        {
        	System.out.println("chart is not displayed for the ph In tnka2 for leg2");
        }
		}
		@Test(priority=13)
		public void ec_Tank2_Leg2_Test() throws InterruptedException
		{
			
		WebElement ecTank2=driver.findElement(By.xpath("//div[@id='leg2_t2_ec_card']"));
		Actions act=new Actions(driver);
		act.moveToElement(ecTank2);
		ecTank2.click();
      Thread.sleep(3000);
      WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
      Actions act2=new Actions(driver);
      act2.moveToElement(select_date_1Day);
      select_date_1Day.click();
      Thread.sleep(15000);	
		boolean ecChartTank2=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(ecChartTank2)
		{
			System.out.println("chart is displatyed fopr the EC In Tank2 For Leg2");
		}
		else
		{
			System.out.println("chart is not displayed for the Ec in Tank2 for Leg2");
		}
		}
		@Test(priority=14)
		public void tds_Tank2_Leg2_Test() throws InterruptedException
		{
			
        WebElement tdsTank2=driver.findElement(By.xpath("//div[@id='leg2_t2_tds_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(tdsTank2);
        tdsTank2.click();
        Thread.sleep(3000);
        WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
        Actions act2=new Actions(driver);
        act2.moveToElement(select_date_1Day);
        select_date_1Day.click();
        Thread.sleep(15000);	
        boolean tdsChartTank2=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
        if(tdsChartTank2)
        {
        	System.out.println("chart is displayed for the tds in Tank2 for leg2");
        }
        else
        {
        	System.out.println("chart is bot displayed for the tds in tank2 for leg2");
        }
		}
		@Test(priority=15)
		public void tank2_Humidity_Test() throws InterruptedException
		{
			
          WebElement humidityChart=driver.findElement(By.xpath("//div[@id='leg2_t2_hum_card']"));
          Actions act1=new Actions(driver);
          act1.moveToElement(humidityChart);
          humidityChart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);
          boolean humidityChart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(humidityChart1)
          {
          	System.out.println("chart is displayed for Humidity"); 
          }
          else
          {
          	System.out.println("chart is not displayed for Humidity");
          }
		}
		@Test(priority=16)
		public void tank2_Temperature_Test() throws InterruptedException
		{  
			
          WebElement tempChart=driver.findElement(By.xpath("//div[@id='leg2_t2_tem_card']"));
          Actions act1=new Actions(driver);
          act1.moveToElement(tempChart);
          tempChart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);
          boolean tempChart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(tempChart1)
          {
          	System.out.println("Chart is displayed for Temperature");
          }                 
          else
          {
          	System.out.println("Chart is not displayed for the Temperature");
          }
		}
		@Test(priority=17)
		public void leg3_Tank1_Chart_Test() throws InterruptedException
		{
			
          WebElement tank1Chart=driver.findElement(By.xpath("//div[@id='leg3_t1_card']"));
          Actions act1=new Actions(driver);
          act1.moveToElement(tank1Chart);
          tank1Chart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);	
          boolean tank1Chart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(tank1Chart1)
          {
          	System.out.println("Chart is displayed for tank1");
          }
          else
          {
          	System.out.println("chart is not displayed for tank1");
          }
		}
		@Test(priority=18)
		public void ph_Tank1_Leg3_Test() throws InterruptedException
		{
		
		WebElement phTank1=driver.findElement(By.xpath("//div[@id='leg3_t1_pH_card']"));
		Actions act=new Actions(driver);
		act.moveToElement(phTank1);
		phTank1.click();
      Thread.sleep(3000);
	  WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
      Actions act2=new Actions(driver);
      act2.moveToElement(select_date_1Day);
      select_date_1Day.click();
      Thread.sleep(15000);	
		boolean phChartTank1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(phChartTank1)
		{
			System.out.println("chart is displayed for the ph in tank1 for leg3");
		}
		else
		{
			System.out.println("chart is not is displayed for the ph in tank1 for leg3");
		}
		}
		@Test(priority=19)
		public void ec_Tank1_Leg3_Test() throws InterruptedException
		{
			
		WebElement ecTank1=driver.findElement(By.xpath("//div[@id='leg3_t1_ec_card']"));
		Actions act=new Actions(driver);
		act.moveToElement(ecTank1);
		ecTank1.click();
      Thread.sleep(3000);
      WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
      Actions act2=new Actions(driver);
      act2.moveToElement(select_date_1Day);
      select_date_1Day.click();
      Thread.sleep(15000);	
		boolean ecChartTank1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(ecChartTank1)
		{
			System.out.println("chart is displayed for the Ec in Tank1 for leg3");
		}
		else
		{
			System.out.println("chart is not displayed for the Ec In tank1 for leg3");
		}
		}
		@Test(priority=20)
		public void tds_Tank1_Leg3_Test() throws InterruptedException
		{
			
        WebElement tdsTank1=driver.findElement(By.xpath("//div[@id='leg3_t1_tds_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(tdsTank1);
        tdsTank1.click();
        Thread.sleep(3000);
        WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
        Actions act2=new Actions(driver);
        act2.moveToElement(select_date_1Day);
        select_date_1Day.click();
        Thread.sleep(15000);	
      boolean tdsChartTank1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(tdsChartTank1)
		{
			System.out.println("chart is displayed for the TDS in Tank1 for leg3");
		}
		else
		{
			System.out.println("chart is not displayed for the TDS In tank1 for leg3");
		}
		}
		@Test(priority=21)
		public void tank2_Chart_Leg3_Test() throws InterruptedException
		{ 
			
          WebElement tank2Chart=driver.findElement(By.xpath("//div[@data-label='Desalinated Water - Tank 2']"));
          Actions act1=new Actions(driver);
          act1.moveToElement(tank2Chart);
          tank2Chart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);	
          boolean tank2Chart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(tank2Chart1)
          {
          	System.out.println("chart is displayed for Tank2");
          }
          else
          {
          	System.out.println("chart is not displayed for Tank");
          }
		}
		@Test(priority=22)
		public void ph_Tank2_Leg3_Test() throws InterruptedException
		{
			 
        WebElement phTank2=driver.findElement(By.xpath("//div[@id='leg3_t2_pH_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(phTank2);
        phTank2.click();
        Thread.sleep(3000);
        WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
        Actions act2=new Actions(driver);
        act2.moveToElement(select_date_1Day);
        select_date_1Day.click();
        Thread.sleep(15000);	
      boolean phChartTank2=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(phChartTank2)
		{
			System.out.println("chart is displayed for the Ph in Tank2 for leg3");
		}
		else
		{
			System.out.println("chart is not displayed for the Ph In tank2 for leg3");
		}
		}
		@Test(priority=23)
		public void ec_Tank2_Leg3_Test() throws InterruptedException
		{

        WebElement ecTank2=driver.findElement(By.xpath("//div[@id='leg3_t2_ec_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(ecTank2);
        ecTank2.click();
        Thread.sleep(3000);

		  WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
  Actions act2=new Actions(driver);
  act2.moveToElement(select_date_1Day);
  select_date_1Day.click();
  Thread.sleep(15000);
      boolean ecChartTank2=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(ecChartTank2)
		{
			System.out.println("chart is displayed for the EC in Tank2 for leg3");
		}
		else
		{
			System.out.println("chart is not displayed for the EC In tank2 for leg3");
		}
		}
		@Test(priority=24)
		public void tds_Tank2_Leg3_Test() throws InterruptedException
		{

			 
        WebElement tdsTank2=driver.findElement(By.xpath("//div[@id='leg3_t2_tds_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(tdsTank2);
        tdsTank2.click();
        Thread.sleep(3000);
        WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
        Actions act2=new Actions(driver);
        act2.moveToElement(select_date_1Day);
        select_date_1Day.click();
        Thread.sleep(15000);
      boolean tdsChartTank2=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(tdsChartTank2)
		{
			System.out.println("chart is displayed for the Tds in Tank2 for leg3");
		}
		else
		{
			System.out.println("chart is not displayed for the Tds In tank2 for leg3");
		}
		}
		@Test(priority=25)
		public void humidity_Tank2_Leg3_Test() throws InterruptedException
		{

			
          WebElement humidityChart=driver.findElement(By.xpath("//div[@id='leg3_t2_hum_card']"));
          Actions act=new Actions(driver);
          act.moveToElement(humidityChart);
          humidityChart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);
          boolean humidityChart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
    		if(humidityChart1)
    		{
    			System.out.println("chart is displayed for the Humidity in Tank2 for leg3");
    		}
    		else
    		{
    			System.out.println("chart is not displayed for the Humidity In tank2 for leg3");
    		}
		}
		@Test(priority=26)
		public void temperature_Tank2_Test() throws InterruptedException
		{
			
          WebElement tempChart=driver.findElement(By.xpath("//div[@id='leg3_t2_temp_card']"));
          Actions act=new Actions(driver);
          act.moveToElement(tempChart);
          tempChart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);
          boolean tempChart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(tempChart1)
          {
          	System.out.println("Chart is displayed for the Temperature");
          }
          else
          {
          	System.out.println("Chart is not displayed for the temprature");
          }
		}
		@Test(priority=27)
		public void ph_Tank3_Test() throws InterruptedException
		{
			
        WebElement phTank3=driver.findElement(By.xpath("//div[@id='t3_ph_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(phTank3);
        phTank3.click();
      Thread.sleep(3000);
      WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
      Actions act2=new Actions(driver);
      act2.moveToElement(select_date_1Day);
      select_date_1Day.click();
      Thread.sleep(15000);	
      boolean phChartTank3=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(phChartTank3)
		{
			System.out.println("chart is displayed for the ph in Tank3 ");
		}
		else
		{
			System.out.println("chart is not displayed for the ph In tank3");
		}
		}@Test(priority=28)
		public void ec_Tank3_Test() throws InterruptedException
		{
			
        WebElement ecTank3=driver.findElement(By.xpath("//div[@id='t3_ec_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(ecTank3);
        ecTank3.click();
      Thread.sleep(3000);
      WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
      Actions act2=new Actions(driver);
      act2.moveToElement(select_date_1Day);
      select_date_1Day.click();
      Thread.sleep(15000);
      boolean phChartTank3=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(phChartTank3)
		{
			System.out.println("chart is displayed for the Ec in Tank3 ");
		}
		else
		{
			System.out.println("chart is not displayed for the Ec In tank3");
		}
		}
		@Test(priority=29)
		public void tds_Tank3_Test() throws InterruptedException
		{
			
        WebElement tdsTank3=driver.findElement(By.xpath("//div[@id='t3_tds_card']"));
        Actions act=new Actions(driver);
        act.moveToElement(tdsTank3);
        tdsTank3.click();
      Thread.sleep(3000);
      WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
      Actions act2=new Actions(driver);
      act2.moveToElement(select_date_1Day);
      select_date_1Day.click();
      Thread.sleep(15000);
      boolean phChartTank3=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
		if(phChartTank3)
		{
			System.out.println("chart is displayed for the TDS in Tank3 ");
		}
		else
		{
			System.out.println("chart is not displayed for the TDS In tank3");
		}	
		}
		@Test(priority=30)
		public void t3_Tank3_Test() throws InterruptedException
		{
			
			WebElement t3Chart=driver.findElement(By.xpath("//div[@id='tank3_card']"));
			Actions act=new Actions(driver);
			act.moveToElement(t3Chart);
			t3Chart.click();
			Thread.sleep(3000);
			  WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
	          Actions act2=new Actions(driver);
	          act2.moveToElement(select_date_1Day);
	          select_date_1Day.click();
	          Thread.sleep(15000);
			boolean t3Chart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
			if(t3Chart1)
			{
				System.out.println("chart is displayed for tank3");
			}
			else
			{
				System.out.println("chart is not displayed for tank3");
			}
		}
		@Test(priority=31)
		public void t3_Leg1_Test() throws InterruptedException
		{

			
          WebElement leg1Chart=driver.findElement(By.xpath("//div[@id='leg1_water_card']"));
          Actions act=new Actions(driver);
          act.moveToElement(leg1Chart);
          leg1Chart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);
          boolean leg1chart=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(leg1chart)
          {
          	System.out.println("chart is displayed for leg1");
          }
          else
          {
          	System.out.println("chart is not displayed for leg1");
          }
		}
		@Test(priority=32)
		public void leg2_Chart_Test() throws InterruptedException
		{
			
          WebElement leg2Chart=driver.findElement(By.xpath("//div[@id='leg2_water_card']"));
          Actions act=new Actions(driver);
          act.moveToElement(leg2Chart);
          leg2Chart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);
          boolean leg2chart=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(leg2chart)
          {
          	System.out.println("chart is displayed for the leg2");
          }
          else
          {
          	System.out.println("chart is mot displayed for the leg2");
          }
		}
		@Test(priority=33)
		public void leg3_Chart_Test() throws InterruptedException
		{
			 
          WebElement leg3chart=driver.findElement(By.xpath("//div[@id='leg3_water_card']"));
          Actions act=new Actions(driver);
          act.moveToElement(leg3chart);
          leg3chart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);
          boolean leg3Chart=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(leg3Chart)
          {
          	System.out.println("chart is not displayed for the leg3");
          }
          else
          {
          	System.out.println("chart is not displayed for the leg3");
          }
		}
		@Test(priority=34)
		public void water_to_Drain_Chart_Test() throws InterruptedException
		{
			 
          WebElement waterflowtodrainChart=driver.findElement(By.xpath("//div[@id='tank3_drain_card']"));
          Actions act=new Actions(driver);
          act.moveToElement(waterflowtodrainChart);
          waterflowtodrainChart.click();
          Thread.sleep(3000);
          WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
          Actions act2=new Actions(driver);
          act2.moveToElement(select_date_1Day);
          select_date_1Day.click();
          Thread.sleep(15000);
          boolean waterflowtodrainchart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
         if(waterflowtodrainchart1)
         {
      	   System.out.println("chart is displayed for the water flow to drain");
         }
         else
         {
      	   System.out.println("chart is not displayed for the water flow to drain");
         }}
          
         @Test(priority=35)
         
         public void water_To_Farm_Test() throws InterruptedException
         {
      	  
             WebElement watertofarmChart=driver.findElement(By.xpath("//div[@id='tank3_farm_card']"));
             Actions act=new Actions(driver);
             act.moveToElement(watertofarmChart);
             watertofarmChart.click();
         Thread.sleep(3000);
         WebElement select_date_1Day=driver.findElement(By.xpath("//button[text()='1 Day']"));
         Actions act2=new Actions(driver);
         act2.moveToElement(select_date_1Day);
         select_date_1Day.click();
         Thread.sleep(15000);
         boolean watertofarmChart1=driver.findElement(By.xpath("//canvas[@id='chart']")).isDisplayed();
          if(watertofarmChart1)
          {
          	System.out.println("chart is displayed for water flow to farm");
          }
          else
          {
          	System.out.println("chart is not displayed for the water flow to farm");
          }
		}
		
@AfterMethod
public void quitAquaF()
{
driver.quit();	
}
}
