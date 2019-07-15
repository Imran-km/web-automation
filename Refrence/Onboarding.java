import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Onboarding {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//38223//Downloads//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://dev1-kamino.wdtest1.com";
		driver.get(url);
		driver.findElement(By.xpath("//*[@class='text-center subheading SignIn__subheading']//*[text()='Create Account']")).click();
		WebElement fn=driver.findElement(By.xpath("//*[@id='firstName-identifier']"));//First Name
		Actions act=new Actions(driver);
		act.moveToElement(fn).click().sendKeys("ABHI").build().perform();
		WebElement ln=driver.findElement(By.xpath("//*[@id='lastName-identifier']"));//LAst Name
		act.moveToElement(ln).click().sendKeys("THARUN").build().perform();
		WebElement email=driver.findElement(By.xpath("//*[@id='email-identifier']"));//Email
		act.moveToElement(email).click().sendKeys("iotusbqauser+au@gmail.com").build().perform();
		WebElement cemail=driver.findElement(By.xpath("//*[@id='confirmEmail-identifier']"));//Confirm Email
		act.moveToElement(cemail).click().sendKeys("iotusbqauser+au@gmail.com").build().perform();
		WebElement pwd=driver.findElement(By.xpath("//*[@id='password-identifier']"));//Password
		act.moveToElement(pwd).click().sendKeys("Western@123").build().perform();
		WebElement cab=driver.findElement(By.xpath("//*[@class='Btn Btn--primary Btn--submit ']"));//Create Button
		act.moveToElement(cab).click().build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement cc=driver.findElement(By.xpath("//*[@class='device-name']//*[@class='Btn Btn--primary DevicesItem__connect-button']"));//Connect Button
		act.moveToElement(cc).click().build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='Btn Btn--primary Btn--block']")).click();//Share Button in PIP Window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(@href,'/cloud/file')]")).click();//My CLoud.com href 
		
	}

}
