package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBookMyShow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bookmyshow.com/");
		
		//1 ID
		 driver.findElement(By.id("super-container"));
		 
		//2 name
		 driver.findElement(By.name("description"));
		 
		 //3 classname
		 driver.findElement(By.className("super-container"));
		 
		 //4tagname
		 driver.findElement(By.tagName("div"));
		 
		 //5 linktext
		 driver.findElement(By.linkText("play credit card"));
		 
		 //6 partial linktext
		 driver.findElement(By.partialLinkText("play"));
		 
		//7  absolute path
		 driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[2]/div/div[3]/section[1]/div/img"));
		 
		 //8 relative xpath
		 driver.findElement(By.xpath("//*[@id=/suprt-container/html/body/div[1]/div[1]/div[2]/div/div[3]/section[1]/div/img"));
		 
		 
		 
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
