package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCases Details = new TestCases();
		Details.TC_003();
		Details.TC_004();
		Details.TC_002MainHMR();
		Details.TC_003MainHMR();
		Details.TC_002MainHMR();

	}
	

}

class TestCases {
	String BuildPath = "http://dmlogics.in/build4/Loging.html";
	WebDriver bo;
	
	void TC_003() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		
		//bo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		bo.get(BuildPath);
		//Login
		bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//input[@name='pass']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		//To print page title
		System.out.println(bo.getTitle());
		
		//String s = bo.getCurrentUrl();
		
		if(bo.getTitle().equals("MainHMR"))
		System.out.println("Pass");
		else
			System.out.println("Fail");
		bo.close();
	}
	
	void TC_004() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		//Login
		bo.get(BuildPath);
		bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kavya");
		bo.findElement(By.xpath("//input[@name='pass']")).sendKeys("kishore");
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		
        //Popup message
		bo.switchTo().alert().getText();	
		
		if(bo.switchTo().alert().getText().equals("Invalid UserID"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//popup
		bo.switchTo().alert().accept();
		bo.close();
	}
	
	void TC_002MainHMR() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		
		//bo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		bo.get(BuildPath);
		//Login
		bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//input[@name='pass']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		
		//MainHmr Page title
		System.out.println(bo.getTitle());
		
		bo.findElement(By.linkText("Station Halts to monitor")).click();
		//Stations page title
		System.out.println(bo.getTitle());
		
		if(bo.getTitle().equals("stations"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		bo.close();
	}
	
	void TC_003MainHMR() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		
		//bo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		bo.get(BuildPath);
		
		String s = bo.getTitle();
		//Login
		bo.findElement(By.xpath("//input[@name='id']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//input[@name='pass']")).sendKeys("kishore");;
		bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
		
		//MainHmr Page title
		System.out.println(bo.getTitle());
		
		bo.findElement(By.linkText("Update Profile&Skills")).click();
		System.out.println(bo.getTitle());
		
		if(bo.getTitle().equals("AplHmr"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		bo.close();
	}
	
	
}
