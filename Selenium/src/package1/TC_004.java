package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_004 {

	public static void main(String[] args) {
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
		
		if(bo.switchTo().alert().getText().equals("Invalid UserID"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//Popup ok
		bo.switchTo().alert().accept();
		bo.close();

	}

}
