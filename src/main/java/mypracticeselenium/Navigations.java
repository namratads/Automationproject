package mypracticeselenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//driver.get("https://www.amazon.in/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		

	}

}
