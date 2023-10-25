package mypracticeselenium;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String browser = "chrome";
//		if(browser=="chrome") {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\AutomationProject\\drivers\\chromedriver.exe");
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://www.icicibank.com/");
//		}
//		else if(browser=="firefox") {
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\AutomationProject\\drivers\\geckodriver.exe");
//	        WebDriver driver1 = new FirefoxDriver();
//	        driver1.get("https://www.icicibank.com/");
//		}
//		else if(browser=="internet") {    
//			 System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\AutomationProject\\drivers\\msedgedriver.exe");
//			    WebDriver driver2 = new EdgeDriver(); 
//		        driver2.get("https://www.icicibank.com/");
//		}	
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    System.out.println("Title of the WebPage is "+ driver.getTitle());
	    
	    System.out.println("Current URL of the Webpage is "+ driver.getCurrentUrl());
	    
	    System.out.println(driver.getPageSource());
	    
	    
	}

}
