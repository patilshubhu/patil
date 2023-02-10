package AUTOMATION;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopifyExample {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\patil\\OneDrive\\Desktop\\crome driver\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();
		   driver.get("https://www.shopify.com/");
		   driver.get("https://www.bookmyshow.com/");
		   driver.get("https://www.facebook.com/");
		 // 1 to close browser current tab
		    
		 //     driver.close();
		       
		 //2 to close browser all tabs    
		       
		 //      driver.quit();
		 
		 //3 to get url
		  //     String url  = driver.getCurrentUrl();
		  //   System.out.println(url);
		     
		  //5 get current url
	     
		    System.out.println(driver.getCurrentUrl());
		   
		     String Actualurl = driver.getCurrentUrl();
		     String Expectedurl = "https://www.shopify.com/";
		     
		     if(Actualurl.equalsIgnoreCase(Expectedurl)) {
	    	 System.out.println("Link validation is ok");
		     }
		     else
		     {
		    	 System.out.println("Link validation is not ok");
			}
//		            
//		   //6 get title used to capture the title of the current webpage
//		     
//		       String Actualttitle = driver.getTitle();
//		         System.out.println(Actualttitle);
//		          String Expectedtitle = "Facebook - log in or sign up";
//		         
//		           if( Actualttitle.equalsIgnoreCase(Expectedtitle)) {
//		         	 System.out.println("Title validation is ok");
//		          }
//	          else
//		          {
//		         	 System.out.println("Title validation is not ok");
//		         	 
//		          }  
//		           
		    //7 maximize:- open browser with full window
		     
//		    driver.manage().window().maximize();     
		 
//		    //8 navigate to hit url + additional operation
//		    
//		    driver.navigate().to("https://www.google.com/");
//		   driver.navigate().back();  //amazon
//		     driver.navigate().forward();//google
//		     driver.navigate().refresh();
//		         
		    //9 setsize():-allow you to set the size of your browser 
		    
//		   org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(100,200);
		  
//		    driver.manage().window().setSize(d);
		    
		    //10 setposition :- you can set the position of your browswe on your screen
		    
		    Point p = new Point(200,400);
		    driver.manage().window().setPosition(p);
		  
}
}
	
	
	
	
	
	
	
	
	
	
	

