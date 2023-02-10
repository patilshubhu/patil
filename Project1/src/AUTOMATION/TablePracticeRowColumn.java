package AUTOMATION;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TablePracticeRowColumn {


	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 int rows=
	 driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr")).size();
	 System.out.println(rows);
	 
	 int cols=
	driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td")).size();
	 System.out.println(cols);	
	 
	 for(int r=1;r<=rows;r++) {
		 for(int c=1;c<=cols;c++) {
			 String value=
  driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr"
  		+ "["+r+"]/td["+c+"]")).getText();
		 
		System.out.print("===>"+value); 
		 }
		 System.out.println();
	 }
	 
	}
}	
	
	

	
	
	
	
	
	

