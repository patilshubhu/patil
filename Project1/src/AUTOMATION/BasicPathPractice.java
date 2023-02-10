package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BasicPathPractice {
	



	private static final String username = null;
	private static final WebElement LoginButton = null;
	


	public static void main(String[] arg) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		//1 sendkeys()method present in webelement interface===>used to pass the data to the webelement
	
	// username
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shubhangi patil");
         
        // password
     driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sanvi@123"); 
     
     //2 click():-used to click button
    driver.findElement(By.xpath("//button[@value='1']"));
	   
	//WebElement loginbutton = null;
	//loginbutton.click();
     
//     //3 isenabled active/passive===>boolean values
     
//    System.out.println("LoginButton.isEnabled()");
//           if(LoginButton.isEnabled()==true) {
//    	   LoginButton.click();
//       }
//       else {
//    	   System.out.println("the loginbutton isdisabled");
//       }
//     
//     driver.navigate().to("https://www.facebook.com/");
//     
//     //4 isdisplayed:-it is help to check the present of webelement on the webpage
//     
//        //webelement fblogo
//     driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img' ]"));
// 
//     System.out.println("facebooklogo.isDisplayed()");
//    WebElement facebooklogo = null;
//    if(facebooklogo.isDisplayed()==true) {
//	   System.out.println("facebook logo is  displayed on registration page");
//   }
//       else {
//    	   
//     System.out.println("facebook logo is not displayed on registration page");
//       }
//	 
//		
//	//5 isselected:-check the selection state of the webelement
//      
//      driver.navigate().to("https://www.facebook.com/reg/");
//      WebElement femaleopt=
//      driver.findElement(By.xpath("//input[@value='1']"));
//       // femaleopt.click();
  
//    
	
//	}



	
		
	}
	
}	
	

	
		
	


