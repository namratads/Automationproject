package mypracticeselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.icicibank.com/");
	    
	    WebDriverManager.firefoxdriver().setup();
	    WebDriver driver1 = new FirefoxDriver();
	    driver1.get("https://www.icicibank.com/");
	    
	    WebDriverManager.edgedriver().setup();
	    WebDriver driver2 = new EdgeDriver();
	    driver2.get("https://www.icicibank.com/");

	}

}
