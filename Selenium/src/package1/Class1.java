package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		
		//bo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		bo.get("https://www.hdfcbank.com/");
		Thread.sleep(3000);
		bo.navigate().to("https://www.hdfcbank.com/personal/HNW_Banking/hnw_banking");
		Thread.sleep(3000);
		System.out.println(bo.getTitle());
		bo.navigate().to("https://www.hdfcbank.com/nri_banking/home.htm");
		bo.navigate().back();
		bo.navigate().forward();
		Thread.sleep(3000);
		
	    bo.findElement(By.linkText("Personal Loan EMI Calculator")).click();
	    bo.navigate().refresh();
	    bo.close();
	    // bo.switchTo().frame("Premier");
	    //bo.findElement(By.linkText("Premier")).click();
	    //bo.navigate().forward();
		
		

	}

}
