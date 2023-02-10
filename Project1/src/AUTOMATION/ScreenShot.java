package AUTOMATION;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static WebDriver driver;

	public static void staticm1(String filenameParam) throws IOException {

		// method for screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// to get date and time
		Date d = new Date();
		System.out.println(d);

		// remove space and symbol from date
		String filename = filenameParam+ "_" + d.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		System.out.println(filename);

		// destination to file
		File dest = new File("C:\\Users\\patil\\OneDrive\\Desktop\\ScreenShot\\" + filename);
		FileUtils.copyFile(src, dest);

	}

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// hit the url
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		staticm1("FbloginPage");

		// find signup element
		driver.navigate().to("https://www.facebook.com/reg");
		staticm1("SignupPage");
		driver.quit();
	}

}
