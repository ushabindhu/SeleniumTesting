package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_003MainHMR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		if(bo.getTitle().equals("AplHmr"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		bo.close();

	}

}
