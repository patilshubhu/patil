package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsicicibank {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.icicibank.com/");
	
		//1. :-Data-xpath
		driver.findElement(By.xpath("copy the unique xpath from the website"));
		driver.findElement(By.xpath("data-exppath=\"/content/experience-fragments/icicibank/language-masters/en/find_right_product"));
				
	    //2. Name:-
		driver.findElement(By.name ("copy the unique name  from the website"));
		driver.findElement(By.name("keywords"));
		
		//3classname
		driver.findElement(By.className("simpletext23"));
		
		//4 tag name
		driver.findElement(By.tagName("login"));
		
		//5 link text
		driver.findElement(By.linkText("Create UserId"));
		
		//6 Partial link 
		driver.findElement(By.partialLinkText("UserId"));
		
		//7 relative path
		driver.findElement(By.xpath("//html//section[1]//img"));
		
		
	

	
	
	
	
	
}	
}
