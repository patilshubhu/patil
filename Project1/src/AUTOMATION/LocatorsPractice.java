package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
 // Regular locators
 //1 facebook example.
		
		//1. :-ID
		driver.findElement(By.id("copy the unique id from the website"));
		driver.findElement(By.id("pageTitle"));
		
		//2. Name:-
		driver.findElement(By.name("copy the unique name attribute value from the website"));
		driver.findElement(By.name("referrer"));
		
		//3.content:-
		driver.findElement(By.className("copy the unique type  from the website"));
	    driver.findElement(By.className("tinyViewport tinyHeight"));
		
		//4 classname 
	    driver.findElement(By.className("copy the unique type  from the website"));
	    driver.findElement(By.className("origin-when-crossorigin"));
	    
	    //5 Tagname
	    driver.findElement(By.tagName("copy the unique tagname  from the website"));
	    driver.findElement(By.tagName("button"));
	    
	    //6 LinkText
	    driver.findElement(By.linkText("copy the unique link test from the website"));
	    driver.findElement(By.linkText("https://www.facebook.com/login/web/"));
	    
	  //7 absolute xpath:-
	    driver.findElement(By.xpath("copy of the absolute xpath  from the website"));
	    driver.findElement(By.xpath("/html/body/div[10]"));
	    
	  //8 relative xpath:-
	    driver.findElement(By.xpath("copy of the relative xpath  from the website"));
	    driver.findElement(By.xpath("button"));
	    
	    
	    
	   
	   
		
	}

}
