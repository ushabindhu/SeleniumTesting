package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
  @Test(enabled = true,priority=1,groups="login")
  
  public void testcase1() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		
		//bo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		bo.get("http://dmlogics.in/build4/Loging.html");
		//Login
		bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//input[@name='pass']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		
		//MainHmr Page title
		System.out.println(bo.getTitle());
		
		bo.findElement(By.linkText("Station Halts to monitor")).click();
		//Stations page title
		System.out.println(bo.getTitle());
		
		Assert.assertEquals(bo.getTitle(), "stations");
		
		/*if(bo.getTitle().equals("stations"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
			*/
		
		bo.close();
  }
  
  @Test(enabled = true,priority=2,groups="admin")
  public void testcase2() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		
		//bo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		bo.get("http://dmlogics.in/build4/Loging.html");
		//Login
		bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//input[@name='pass']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		
		//MainHmr Page title
		System.out.println(bo.getTitle());
		
		//To click on update profile link and see that page
		bo.findElement(By.linkText("Update Profile&Skills")).click();
		System.out.println(bo.getTitle());
		
		Assert.assertEquals(bo.getTitle(), "AplHmr");
		/*
		if(bo.getTitle().equals("AplHmr"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
			
		
		bo.findElement(By.xpath("//input[@id='EID']")).sendKeys("12345");
		bo.findElement(By.xpath("//input[@id='fname']")).sendKeys("Usha");
		bo.findElement(By.xpath("//input[@id='lname']")).sendKeys("Bindhu");
		
		WebElement radio1 = bo.findElement(By.id("//input[@id='sex-0']"));							
      WebElement radio2 = bo.findElement(By.id("//input[@id='sex-1']"));
      
    //Radio Button1 is selected		
      radio1.click();			
      System.out.println("Radio Button Option 1 Selected");					
      		
      //Radio Button1 is de-selected and Radio Button2 is selected		
      radio2.click();			
      System.out.println("Radio Button Option 2 Selected");
      */
		bo.close();
		
  }
  
 public void TC_004() {
	  
	// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver bo = new FirefoxDriver();
			//Login
			bo.get("http://dmlogics.in/build4/Loging.html");
			bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kavya");
			bo.findElement(By.xpath("//input[@name='pass']")).sendKeys("kishore");
			bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
			
	        //Popup message
			bo.switchTo().alert().getText();	
			Assert.assertEquals(bo.switchTo().alert().getText(), "Invalid UserID");
			
			/*
			 if(bo.switchTo().alert().getText().equals("Invalid UserID"))
				System.out.println("Pass");
			else
				System.out.println("Fail");
			
			//Popup ok
			bo.switchTo().alert().accept();
			*/
			bo.close();
  }
  
}
