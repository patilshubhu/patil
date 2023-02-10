package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasecDesign {
	private static final String username = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	
	//browser lounch
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//1 sendkeys()method present in webelement interface ===>used to pass the data to the web element
	
	//username
	
	WebElement username=
	driver.findElement(By.xpath("//input[@name='email']"));
	username.sendKeys("shubhangi patil");	
	
	//password
	
	WebElement pass=
	driver.findElement(By.xpath("//input[@name='pass']"));
   ((WebElement) driver).sendKeys("sanvi@789");	
	
	//2 click():-  used to click on button/radio button
	WebElement logingbutton=
	driver.findElement(By.xpath("//button[@name='login']"));
	logingbutton.click();
	
	//3 isenabled:-will help you to understand the current state of the webelement
	
	Object logingbutten;
	System.out.println(logingbutton.isEnabled());
	if(logingbutton.isEnabled()==true) {
		logingbutton.click();
	}
	else
	{
		System.out.println("the login button is disabled");
	}
	
	driver.navigate().to("https://www.facebook.com");
	
	
	//4 isdisplayed:-will help you to check the present of webelement on the webpage
	
	WebElement fblogo =
	driver.findElement(By.xpath("//img[@alt='Facebook']"));
	if(fblogo.isDisplayed()==true) {
	System.out.println("facebook logo is displayed on registration page");
	}
	else
	{
	System.out.println("facebook logo is not displayed on registration page");	
	}
	
	//5 isselected:-will help you to check the selection state of the webelement
	
	driver.navigate().to("https://www.facebook.com/reg/");
	Thread.sleep(1500);
	
	WebElement femaleopt =
	driver.findElement(By.xpath("//input[@value='1']"));
	femaleopt.click();
	if(femaleopt.isSelected()==false) {
		femaleopt.click();
	
	}
	else
	{
	System.out.println("female option is by default selected");		
	
	}			
	
}		
}		

	

	

	


		
	
			
	
				