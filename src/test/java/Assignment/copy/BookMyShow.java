package Assignment.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//img[@alt='BANG']")).click();
		Thread.sleep(4000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[text()='Dune: Part Two']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='sc-qswwm9-5 ghYvew']/descendant::span[.='Book tickets']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='English']/ancestor::li[@class='sc-vhz3gb-0 eKTeRz']/descendant::span[text()='2D']")).click();
//		
	}

}

