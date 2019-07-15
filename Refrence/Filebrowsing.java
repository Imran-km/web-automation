import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filebrowsing {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C://Users//38223//Downloads//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://dev1-kamino.wdtest1.com";
		driver.get(url);
		Actions a=new Actions(driver);
		WebElement email=driver.findElement(By.xpath("//*[@id='email-identifier']"));//email
		a.moveToElement(email).click().sendKeys("iotusbqauser+a1@gmail.com").build().perform();
		WebElement pwd=driver.findElement(By.xpath("//*[@id='password-identifier']"));//Password
		a.moveToElement(pwd).click().sendKeys("Western@123").build().perform();
		driver.findElement(By.xpath("//*[@class='Btn Btn--primary Btn--submit ']")).click();//Sign in Button
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//New Folder Creation for 10	 times in a loop
				for(int i=0;i<10;i++) {
						WebElement newfolder=driver.findElement(By.xpath("//*[@class='FolderCreateButton ']"));//New Folder Button
						a.moveToElement(newfolder).click().build().perform();
						WebElement n=driver.findElement(By.xpath("//*[@class='form-line is-invalid']//input[@name='name' and @type='text']"));
						a.moveToElement(n).sendKeys("!Rishik!"+i).build().perform();
						driver.findElement(By.xpath("//*[@class='Btn Btn--primary ']")).click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						System.out.println("New Folder "+i+" Created Successfully");
				}
				System.out.println("New Folders Creation is Completed");
				driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-list-view  ']")).click();//Click On List View.
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[contains(@data-id,'55')]")).click();//Click On First Folder or File
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-share-link  ']")).click();//Click ON GET Link
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='Btn Btn--small Btn--inline Btn--primary ']")).click();//Click on COPY button in get link window
		System.out.println("Link Copied To Clipboard");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(@data-id,'55')]")).click();//Click On First Folder or File
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-share-link  ']")).click();//Click ON GET Link
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='Btn Btn--small Btn--link ']")).click();//Click on delete share link button in get link window
		System.out.println("Share Link Deleted");
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-rename  ']")).click();
		WebElement rename=driver.findElement(By.xpath("//*[@class='form-line is-invalid']//input[@name='name' and @type='text']"));
		a.moveToElement(rename).sendKeys("!ABHI!").build().perform();;
		driver.findElement(By.xpath("//*[@class='Btn Btn--primary ']")).click();
		driver.navigate().refresh();
		System.out.println("Renamed Successfully");
		driver.findElement(By.xpath("//*[contains(@data-id,'55')]")).click();//Click On First Folder or File
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-move  ']")).click();
		driver.findElement(By.xpath("//*[@class='list-item']")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-small btn-move ']")).click();
		System.out.println("Moved Successfully");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement am=driver.findElement(By.xpath("//*[contains(@data-id,'55')]"));
		a.moveToElement(am).click().build().perform();
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-delete  ']")).click();
		driver.findElement(By.xpath("//*[@class='Btn Btn--primary']")).click();
		System.out.println("Deleted Successfully");
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-thumbnail-view  ']")).click();
		System.out.println("Performed List to Thumbnails View Operation");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-list-view  ']")).click();
		System.out.println("Performed Thumbnails View Operation");
		//Robot is used to upload file
				for(int j=0;j<=3;j++) {
						Robot robot=new Robot();
						WebElement upload=driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-upload  ']"));
						a.moveToElement(upload).click().build().perform();
						robot.setAutoDelay(1000);
						StringSelection  s=new StringSelection("C:\\AFILES\\Picture6.jpg");
						ClipboardOwner owner=null;
				 		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,owner);
						robot.setAutoDelay(3000);
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.keyRelease(KeyEvent.VK_V);
						robot.setAutoDelay(3000);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						robot.delay(60000);
				}
				System.out.println("Uploading 3 files is completed");  
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-check-all  ']")).click();
		driver.findElement(By.xpath("//*[@class='icon icon-rounded icon-delete  ']")).click();
		driver.findElement(By.xpath("//*[@class='Btn Btn--primary']")).click();
	*/
		/*//Clicking on first Folder/File
		driver.findElement(By.xpath("//html//body//div//div//div[1]//div[2]//div[2]//div[1]//div//div[1]//div//div//div[1]//div[2]//div")).click();
		Thread.sleep(15000);
		//Mouse Hovering to particular button
		Actions a=new Actions(driver);
		//Rename Operation
		WebElement rename=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/span/span"));
		a.moveToElement(rename).click().build().perform();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/form/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/form/div/input")).sendKeys("!Western!");;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/form/button")).click();
		System.out.println("Rename Operation Completed");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Share Link Operation
		WebElement share=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[2]/span/span"));
		a.moveToElement(share).click().build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='Btn Btn--small Btn--inline Btn--primary ']")).click();
		System.out.println("ShareLink Operation Completed");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Delete Share Link
		WebElement deletesharelink=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/span/span"));
		a.moveToElement(deletesharelink).click().build().perform();
		System.out.println("DeleteShareLink Operation Completed");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Move Operation 
		WebElement move=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/span/span"));
		a.moveToElement(move).click().build().perform();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[3]/ul/li[1]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[3]/div[2]/button")).click();
		System.out.println("Move Operation Completed");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//Delete Operation
		WebElement delete=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[4]/span/span"));
		a.moveToElement(delete).click().build().perform();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/button")).click();
		System.out.println("Delete Operation is Completed");
		//Thumbnails View
		WebElement thumbnailsview=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]/span"));
		a.moveToElement(thumbnailsview).click().build().perform();
		System.out.println("Thumbnails Operation Completed");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//List View
		WebElement listview=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]/span"));
		a.moveToElement(listview).click().build().perform();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//New Folder Creation for 10 times in a loop
		for(int i=0;i<3;i++){
				WebElement newfolder=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]/span"));
				a.moveToElement(newfolder).click().build().perform();
				driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/form/div/input")).clear();
				driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/form/div/input")).sendKeys("!Rishik!"+i);
				driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/form/button")).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		System.out.println("New Folders Creation is Completed");
		//Robot is used to upload file
		for(int j=0;j<3;j++) {
				Robot robot=new Robot();
				WebElement upload=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/form/label/span[1]/span"));
				a.moveToElement(upload).click().build().perform();
				robot.setAutoDelay(1000);
				StringSelection  s=new StringSelection("C:\\Users\\sandisk\\Desktop\\SeleniumScripts\\jkl.jpg");
				ClipboardOwner owner=null;
		 		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,owner);
				robot.setAutoDelay(2000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				robot.setAutoDelay(2000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
		}
		System.out.println("Uploading 3 files is completed");  
		WebElement tdot=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/span[2]/span"));
		a.moveToElement(tdot).click().build().perform();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Select All OperationIs Completed");
		*/
		
	}
}
