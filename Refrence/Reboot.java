import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reboot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//sandisk//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://dev1-kamino.wdtest1.com";
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='email-identifier']")).sendKeys("testuseriotusb+dmonarch@gmail.com");//email
		driver.findElement(By.xpath("//*[@id='password-identifier']")).sendKeys("Sandisk@123");//Password
		driver.findElement(By.xpath("//html//body//div//div//div[1]//main//div[2]//form//button")).click();//Sign in Button
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for(int i=1;i<16;i++) {
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/nav/button")).click();//Settings
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div/div[2]/div/div[1]/div[2]/ul/li[1]/span")).click();//User Details
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div/div/div[2]/div/div[2]/div/ul/li[5]/span")).click();//Reboot button in account details
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div/div/div[2]/div/div[2]/div[2]/p/button")).click();//reboot confirm button
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div/div/div[1]/span")).click();//Reboot dialogue Close button
		Thread.sleep(100000);
		System.out.println(i+""+"Cycle Reboot is completed Successfuly");
		Thread.sleep(10000);
		}
		
	}

}
