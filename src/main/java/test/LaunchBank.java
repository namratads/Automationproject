package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\AutomationProject\\src\\main\\java\\test\\LaunchBank.java");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");

	}

}
