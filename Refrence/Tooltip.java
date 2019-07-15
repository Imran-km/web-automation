import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {
			public static void main(String[] args) throws InterruptedException, IOException{
				System.setProperty("webdriver.chrome.driver","C://Users//38223//Downloads//chromedriver//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				String url="https://dev1-kamino.wdtest1.com";
				driver.get(url);
				driver.findElement(By.xpath("//*[@id='email-identifier']")).sendKeys("wdsantest+nov22@gmail.com");//email
				driver.findElement(By.xpath("//*[@id='password-identifier']")).sendKeys("Western@123");//Password
				driver.findElement(By.xpath("//html//body//div//div//div[1]//main//div[2]//form//button")).click();//Sign in Button
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Clicking on first Folder/File
				driver.findElement(By.xpath("//html//body//div//div//div[1]//div[2]//div[2]//div[1]//div//div[1]//div//div//div[1]//div[2]//div")).click();
				Thread.sleep(15000);
				//Mouse Hovering to particular button
				Actions a=new Actions(driver);
			   //Rename Tooltip Testing
				 String exprenametooltip = "Rename";
				 System.out.println("Expected Rename Tooltip :" +exprenametooltip);
				 WebElement rename=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/span"));	
			     String actrenametooltip = rename.getAttribute("data-tooltip");		
			     System.out.println("Actual Rename Tool Tip :" +actrenametooltip);							
			        if(actrenametooltip.equals(exprenametooltip)) {							
			            System.out.println("Rename Tooltip Is Matched");					
			        }	
			        else {
			        	System.out.println("Rename Tooltip Is Not Matched");
			        }
			     System.out.println(" ");
			   //Share Link Tooltip Testing
			     String expsharetooltip = "Share Link";	
			     System.out.println("Expected Share Tooltip :" +expsharetooltip);
			     WebElement share=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[2]/span"));	
				 String actsharetooltip = share.getAttribute("data-tooltip");		
				 System.out.println("Actual Share Tool Tip :" +actsharetooltip);							
				    if(actsharetooltip.equals(expsharetooltip)) {							
				         System.out.println("Share Link Tooltip Is Matched");					
				        }	
				    else {
				         System.out.println("Share Link Tooltip Is Not Matched");
				        }
				 System.out.println(" ");
			   //Move Tooltip Testing
				 String expmovetooltip = "Move";
		         System.out.println("Expected Move Tooltip :" +expmovetooltip);
	   			 WebElement move=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/span"));	
		         String actmovetooltip = move.getAttribute("data-tooltip");		
   	 	         System.out.println("Actual Move Tool Tip :" +actmovetooltip);							
				    if(actmovetooltip.equals(expmovetooltip)) {							
					     System.out.println("Move Tooltip Is Matched");					
					        }	
				    else {
					     System.out.println("Move Tooltip Is Not Matched");
					        } 
				 System.out.println(" ");
			   //Delete Tooltip Testing
				 String expdeletetooltip = "Delete";
			     System.out.println("Expected Delete Tooltip :" +expdeletetooltip);
				 WebElement delete=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[4]/span"));	
				 String actdeletetooltip = delete.getAttribute("data-tooltip");		
				 System.out.println("Actual Delete Tool Tip :" +actdeletetooltip);							
				    if(actdeletetooltip.equals(expdeletetooltip)) {							
					     System.out.println("Delete Tooltip Is Matched");					
						    }	
					else {
					   	 System.out.println("Delete Tooltip Is Not Matched");
							        } 
				 System.out.println(" ");
			   //Thumbnails view Tooltip Testing
				 String expThumbnailsviewtooltip = "Thumbnails view";
				 System.out.println("Expected Thumbnails view Tooltip :" +expThumbnailsviewtooltip);
				 WebElement Thumbnailsview=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]"));	
				 String actThumbnailsviewtooltip = Thumbnailsview.getAttribute("data-tooltip");		
				 System.out.println("Actual Thumbnails view Tool Tip :" +actThumbnailsviewtooltip);							
					if(actThumbnailsviewtooltip.equals(expThumbnailsviewtooltip)) {							
					     System.out.println("Thumbnails view Tooltip Is Matched");					
									        }	
		            else {
						 System.out.println("Thumbnails view Tooltip Is Not Matched");
									        } 		
			     System.out.println(" ");
			   //New Folder Tooltip Testing
				 String expNewFoldertooltip = "New Folder";
				 System.out.println("Expected New Folder Tooltip :" +expNewFoldertooltip);
			     WebElement NewFolder=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]"));	
				 String actNewFoldertooltip = NewFolder.getAttribute("data-tooltip");		
				 System.out.println("Actual New Folder Tool Tip :" +actNewFoldertooltip);							
			        if(actNewFoldertooltip.equals(expNewFoldertooltip)) {							
						 System.out.println("New Folder Tooltip Is Matched");					
											        }	
					else {
					   	  System.out.println("New Folder Tooltip Is Not Matched");
											        } 
											        System.out.println(" ");
											      //Upload Tooltip Testing
												     String expUploadtooltip = "Upload file";
												     System.out.println("Expected Upload Tooltip :" +expUploadtooltip);
														WebElement Upload=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/form/label/span[1]"));	
													      String actUploadtooltip = Upload.getAttribute("data-tooltip");		
													        System.out.println("Actual Upload Tool Tip :" +actUploadtooltip);							
													        if(actUploadtooltip.equals(expUploadtooltip)) {							
													            System.out.println("Upload Tooltip Is Matched");					
													        }	
													        else {
													        	System.out.println("Upload Tooltip Is Not Matched");
													        } 
													        System.out.println(" ");
													        //feedback Tooltip Testing
														     String expfeedbacktooltip = "Feedback";
														     System.out.println("Expected feedback Tooltip :" +expfeedbacktooltip);
																WebElement feedback=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[1]/button"));	
															      String actfeedbacktooltip = feedback.getAttribute("data-tooltip");		
															        System.out.println("Actual feedback Tool Tip :" +actfeedbacktooltip);							
															        if(actfeedbacktooltip.equals(expfeedbacktooltip)) {							
															            System.out.println("feedback Tooltip Is Matched");					
															        }	
															        else {
															        	System.out.println("feedback Tooltip Is Not Matched");
															        } 
															        System.out.println(" ");
															      //Search Tooltip Testing
																     String expSearchtooltip = "Search";
																     System.out.println("Expected Search Tooltip :" +expSearchtooltip);
																		WebElement Search=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/form/div[1]/button"));	
																	      String actSearchtooltip = Search.getAttribute("data-tooltip");		
																	        System.out.println("Actual Search Tool Tip :" +actSearchtooltip);							
																	        if(actSearchtooltip.equals(expSearchtooltip)) {							
																	            System.out.println("Search Tooltip Is Matched");					
																	        }	
																	        else {
																	        	System.out.println("Search Tooltip Is Not Matched");
																	        } 
																	        System.out.println(" ");
		       
											               
									        
									        
									        
									        
	}

}
