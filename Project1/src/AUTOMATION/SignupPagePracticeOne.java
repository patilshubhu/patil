package AUTOMATION;

import java.util.List;

import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPagePracticeOne {
	public static void main(String[] args) throws InterruptedException {
		//  launch browser==>hit the URL
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
	
		driver.navigate().to("https://www.facebook.com/reg/");
		Thread.sleep(4000);
		// 1 firstname
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("sanvi");
		Thread.sleep(4000);
		// 2 lastname
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("patil");
		Thread.sleep(4000);
		// 3 MobileNO
		WebElement mobileno = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		mobileno.sendKeys("9620846944");
		Thread.sleep(3000);
		// 4 NewPassword
		WebElement newpass = driver.findElement(By.xpath("//input[@type='password']"));
		newpass.sendKeys("patil@123");
		Thread.sleep(3000);
		// 5 select the option day
		WebElement selectday = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s = new Select(selectday);
		Thread.sleep(3000);
		// 6 select the option by value
		s.selectByValue("28");
		List<WebElement> day = s.getOptions();
		System.out.println("Total Day present in Listbox=>" + day.size());
		Thread.sleep(3000);
		
		// 7 select month
		WebElement selectmonth = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select m = new Select(selectmonth);
		m.selectByVisibleText("Nov");
		Thread.sleep(3000);
		
		// 8 select year
        WebElement selectyear = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select m2 = new Select(selectyear);
		m2.selectByVisibleText("1998");
		Thread.sleep(3000);
		
		// 9 Radio Button select or not
        WebElement femaleOption = driver.findElement(By.xpath("//input[@value='1']"));
		System.out.println("Femail Option is selected ="+femaleOption.isSelected());
		if (femaleOption.isEnabled() && femaleOption.isSelected()) {
			System.out.println("Female option is selected");
		}
		else
		{
			femaleOption.click();
			if(femaleOption.isSelected())
			{
				System.out.println("Female option is not selected..");
			}
		}
		Thread.sleep(3000);
		
	    // 10 sign in
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000);
		signin.click();
		
	}
}
