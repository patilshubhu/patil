package AUTOMATION;

import java.util.List;

import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPagePractice {
	public static void main(String[] args) { 
		
		// 1. launch browser==>hit the URL
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		// driver.manage().window().maximize();

////		WebElement loginlink = driver.findElement(By.xpath("//button[@value='1']"));
////		loginlink.click();
////			
////		//2 username
////		WebElement username=
////		driver.findElement(By.xpath("//input[@name='email']"));
////		username.sendKeys("shubhangi patil");
////	
////		//3 password
////		WebElement password=
////		driver.findElement(By.xpath("//input[@name='pass']"));
////		password.sendKeys("sanvi@789");
////		
//		// 4 sign in page
//		driver.navigate().to("https://www.facebook.com/reg/");
//		// WebElement signuppage =
//		// driver.findElement(By.xpath("https://en-gb.facebook.com/reg/"));
//		// signuppage.click();
//
//		// 5 firstname
//		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
//		firstname.sendKeys("sanvi");
//
//		// 6 lastname
//		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
//		firstname.sendKeys("patil");
//
//		// 7 MobileNO
//		WebElement mobileno = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
//		mobileno.sendKeys("9880252560");
//
//		// 8 NewPassword
//		WebElement newpass = driver.findElement(By.xpath("//input[@type='password']"));
//		newpass.sendKeys("patil@123");
//
//		// 9 select the option day
//		WebElement selectday = driver.findElement(By.xpath("//select[@title='Day']"));
//		Select s = new Select(selectday);
//
//		// 10 select the option by value
//		s.selectByValue("28");
//		List<WebElement> day = s.getOptions();
//		System.out.println("total day present in listbox" + day.size());
//
//		// 11 select month
//
//		WebElement selectmonth = driver.findElement(By.xpath("//select[@arie-label='Month']"));
//		Select m = new Select(selectmonth);
//		m.selectByVisibleText("Nov");
//
//		// 12 select year
//
//		WebElement selectyear = driver.findElement(By.xpath("//select[@arie-label='Year']"));
//		Select y = new Select(selectyear);
//		m.selectByVisibleText("1998");
//
//		// 13 Radio Button select or not
//
//		Object femaleoptbtn;
//		WebElement femaleoptbtn1 = driver.findElement(By.xpath("//input[@value='1']"));
//		System.out.println(femaleoptbtn1.isEnabled());
//		if (femaleoptbtn1.isEnabled() == true) {
//			femaleoptbtn1.click();
//		} else {
//			System.out.println("female option butten is disabled");
//
//			// 14 sign in
//			WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
//			System.out.println(signin.isEnabled());
//			if (signin.isEnabled() == true) {
//				signin.click();
//			} else {
//				System.out.println("sign in button is disabled");
//			}

	//15 multiple
		
	List<WebElement>footerlinks=
	driver.findElements(By.xpath("//div[@id='pagefooterChildren']/ul/li/a"));
	System.out.println(footerlinks.size());
	
	 for(int i=0;i<footerlinks.size();i++) {
		 WebElement indiviualfooterlink = footerlinks.get(i);
		 
		 String linkname=indiviualfooterlink.getText();
		System.out.println(i+"==>"+linkname);
	//	String link =indiviulfooterlink.getAttribute("href");
	//	System.out.println(i+"==>"+linkname+"==>"+link);
		 
	 }	 
		}

	
	}
	

