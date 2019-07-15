import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//38223//Downloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.google.co.in";
		driver.get(url);
		System.out.println("URL OPENED");
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		
		
		
	}

}
