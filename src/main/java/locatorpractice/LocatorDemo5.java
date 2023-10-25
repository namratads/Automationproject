package locatorpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5 {

	public static <WebElement> void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\AutomationProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse.daily/groupa");
		driver.manage().window().maximize();
		
		//self
		String text = driver.findElement(By.xpath("//a[contains(text(),'NBCC (India)')]")).getText();
		System.out.println(text);
		
		//parent
		String text1 = driver.findElement(By.xpath("//a[contains(text(),'NBCC (India)')]/parent::td")).getText();
		System.out.println(text1);
		
		//child
		WebElement text2 = (WebElement) driver.findElement(By.xpath("//a[contains(text(),'NBCC (India)')]/ancestor::tr/child::td")).getSize();
		System.out.println("Number of child elements"+text2);
		
		//ancestor
		String text3= driver.findElement(By.xpath("//a[contains(text(),'NBCC (India)')]/ancestor::tr")).getText();
		System.out.println(text3);
		
		//descendant
		int text4 = driver.findElements(By.xpath("//a[contains(text(),'NBCC (India)')]/ancestor::tr/descendant::*")).size();
		System.out.println("The number of Descendant nodes is "+text4);
		
		//following node code
		int test5 = driver.findElements(By.xpath("//a[contains(text(),'NBCC (India)')]/ancestor::tr/following::tr")).size();
		System.out.println("The number of Following nodes is "+ test5);
		
		//sibling code
		int test6 = (int) driver.findElements(By.xpath("//a[contains(text(),'NBCC (India)')]/ancestor::tr/following-sibling::tr")).size();
		System.out.println("The number of Following sibling is "+ test6);
		
		//preceeding code
		int test7 = driver.findElements(By.xpath("//a[contains(text(),'NBCC (India)')]/ancestor::tr/preceding::tr")).size();
		System.out.println("The number of preceding node is "+ test7);
		
		//preceeding-sibling code
		int test8 = driver.findElements(By.xpath("//a[contains(text(),'NBCC (India)')]/ancestor::tr/preceding-sibling::tr")).size();
		System.out.println("The number of preceding-sibling node is "+ test8);
		
		
	}

}
