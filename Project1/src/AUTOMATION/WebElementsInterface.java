package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsInterface {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		//Expected url is hit or not:-
		String AUrl=driver.getCurrentUrl();
		System.out.println(AUrl);
		
		String EUrl= "https://rahulshettyacademy.com/loginpagePractise/";
		System.out.println(EUrl);
		
	if(AUrl.equalsIgnoreCase(EUrl)) {
			System.out.println("Link validation successful");
		}else {
			System.out.println("Link validation failed");
		}
		
		//Username:-
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("rahulshettyacademy");
		
		//Password:-
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("learning");
		
		//Click on checkbox terms and condition:-
		WebElement terms= driver.findElement(By.xpath("//input[@name='terms']"));
		//terms.click();		
	if(terms.isSelected()==true) {
			System.out.println("Manually selected");
	}else {
			terms.isSelected();
			System.out.println("Selected by default");
		}
		
		//Click on signin button:-
		WebElement signin= driver.findElement(By.xpath("//input[@name='signin']"));
		signin.click();
		
		if(signin.isEnabled()==true) {
			System.out.println("signin button enabled");
		}else {
	System.out.println("signin is disabled");
	}
	}
}

		
		
	


