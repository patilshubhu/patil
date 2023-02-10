package AUTOMATION;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeTestCases {
	public static void main(String[] args) {
		
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			 WebDriver driv=new ChromeDriver();
			   driv.get("https://www.facebook.com/");
			   
			   driv.manage().window().maximize();
			   
			   //sendkey- method present in webelement interface ==> used to pass the data to the webelement
			   
			  WebElement username=driv.findElement(By.xpath("//input[@name='email']"));
			  
			  username.sendKeys("sanvi@gmail.com");
			  
			  // password
		 WebElement password=driv.findElement(By.xpath("//input[@name='pass']"));
			  
			  password.sendKeys("@@@@@@");
			  
			  // click-use to click on button/radio button
			  
			  WebElement loginbtn=driv.findElement(By.xpath("//button[@name='login']"));
			  
			  loginbtn.click();
			  
			 String Acceptedurl=driv.getCurrentUrl();
			 String Exceptedurl="https://www.facebook.com/";
			 
			 if(Acceptedurl.equalsIgnoreCase(Exceptedurl)) {
				 System.out.println("test case is pass");
			 }else {
				 System.out.println("test case is fail");
			 }
			 
			 
			 }
			 }