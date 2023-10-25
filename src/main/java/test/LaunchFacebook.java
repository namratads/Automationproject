package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String s = "tommy";
       // driver.close();---it just after open webpage close it again immediately
        driver.get("https://www.facebook.com/");
//        driver.findElement(By.partialLinkText("r")).click();
        By s1 = By.className("_55r1");
        WebElement s3 = driver.findElement(s1);
        s3.sendKeys(s);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("namo123");
        driver.findElement(By.tagName("button")).click();
//        By by = By.id("Namrata Shinde");
//        By by1 = By.id("namo123");
//		WebElement loginButton = driver.findElement(by);
//		WebElement loginButton1 = driver.findElement(by1);
//		loginButton.click();
//		loginButton1.click();
	}

}
