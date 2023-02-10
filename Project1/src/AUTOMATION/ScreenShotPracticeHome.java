package AUTOMATION;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotPracticeHome {
	

	public static WebDriver driver;
	
	public static void takes1()throws IOException {
		
  //method to take screenshot
		
		File src=
		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   // to get date and time
		Date d = new Date();
	
		System.out.println(d);	
	
	//remove space and symbol from date 
	String filename="fbloginpage_"+d.toString().replace(" ", "_").replace(":","_")+".jpg";
	System.out.println(filename);
	
  //file destination
	File dest=new File("C:\\Users\\patil\\OneDrive\\Desktop\\ScreenShot\\"+filename);
	FileUtils.copyFile(src,dest);	
	}
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
	//take a screenshot of login page
			
			takes1();
			
	//		take a scrrenshot of signup page
			driver.navigate().to("https://www.facebook.com/reg");
			takes1();
			
			
		
	}
	

}
