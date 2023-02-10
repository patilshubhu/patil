package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsGmail {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		
		//1 ID
		 driver.findElement(By.id("identifierId"));
		 
		//2 name
		 driver.findElement(By.name("identifier"));
		 
		 //3 classname
		 driver.findElement(By.className("eC9N2e"));
		 
		 //4tagname
		 driver.findElement(By.tagName("hasAttribute"));
		 
		 //5 linktext
		 driver.findElement(By.linkText("google saftey centre"));
		 
		 //6 partial linktext
		 driver.findElement(By.partialLinkText("password"));
		 
		//7  absolute path
		 driver.findElement(By.xpath("//html/body/c-wiz/div[2]/div[2]/div[3]/div/div/a"));
		 
		 //8 relative xpath
		 driver.findElement(By.xpath("//*[@id=/yDmHod/c-wiz/html/body/div[2]/div[2]/div[3]/a"));
}		 
} 
		 
		
		
		
		
		
	
	
	
	
	
	
	
	
	

