import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Delete {
			public static void main(String[] args) throws InterruptedException{
				System.setProperty("webdriver.chrome.driver", "C://Users//sandisk//Downloads//chromedriver_win32//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				String url="https://dev1-wdcloud.wdtest1.com";
				driver.get(url);
				driver.findElement(By.xpath("//*[@id='email-identifier']")).sendKeys("wdsantest+nov22@gmail.com");//email
				driver.findElement(By.xpath("//*[@id='password-identifier']")).sendKeys("Western@123");//Password
				driver.findElement(By.xpath("//html//body//div//div//div[1]//main//div[2]//form//button")).click();//Sign in Button
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				//Clicking on first Folder/File
				driver.findElement(By.xpath("//html//body//div//div//div[1]//div[2]//div[2]//div[1]//div//div[1]//div//div//div[1]//div[2]//div")).click();
				Actions a=new Actions(driver);
				//Move Operation 
				WebElement move=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/span/span"));
				a.moveToElement(move).click().build().perform();
				driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[3]/ul/li[1]/span[2]")).click();
				driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[3]/div[2]/button")).click();
				System.out.println("Move Operation Completed");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//Delete Operation
				WebElement delete=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[4]/span/span"));
				a.moveToElement(delete).click().build().perform();
				driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/button")).click();
				System.out.println("Delete Operation is Completed");
	}

}
