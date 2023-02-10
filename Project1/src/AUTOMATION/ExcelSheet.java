package AUTOMATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\patil\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();	
		
		//FIRST NAME 
		FileInputStream file1=new FileInputStream("C:\\Users\\patil\\Downloads\\sanvi.xlsx");
		String value1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys(value1);
		
		//LAST NAME 
		FileInputStream file2=new FileInputStream("C:\\Users\\patil\\Downloads\\Untitled spreadsheet.xlsx");
		String value2 = WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value2);
	
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys(value2);
		
		//moblie number
		
		FileInputStream file3=new FileInputStream("C:\\Users\\patil\\Downloads\\Untitled spreadsheet.xlsx");
		String value3 = WorkbookFactory.create(file3).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(value3);
		
		WebElement mno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mno.sendKeys(value3);
		
		//password
		FileInputStream file4=new FileInputStream("C:\\Users\\patil\\Downloads\\Untitled spreadsheet.xlsx");
		String value4 = WorkbookFactory.create(file4).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(value4);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		pass.sendKeys(value4);

		
	}

}




