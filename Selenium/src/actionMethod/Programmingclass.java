package actionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Programmingclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		
		bo.get("https://www.hdfcbank.com");
		System.out.println(bo.getTitle());
		
		Actions MR = new Actions(bo);
		MR.moveToElement(bo.findElement(By.xpath("//a[@class='mainlink'][contains(text(),'Products')]"))).perform();
		Thread.sleep(3000);
		MR.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/div[2]/div[2]/div[1]/ul[1]/li[3]/a[1]"))).perform();
	    Thread.sleep(3000);
	    MR.moveToElement(bo.findElement(By.xpath("//a[contains(text(),'Debit Cards')]"))).perform();
	    Thread.sleep(3000);
	    bo.findElement(By.xpath("//div[@class='innerNavContainer']//a[contains(text(),'Debit Cards')]")).click();
	
	}
}
