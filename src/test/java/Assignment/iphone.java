package Assignment;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphone {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> mobilePrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<WebElement> mobileName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        int count=0;
		for (WebElement webElement : mobilePrice) {
			String iphonePrice = webElement.getText();		
			System.out.println(mobileName.get(count).getText()+"----"+iphonePrice);
			
			FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\iphone.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet1");
			sh.createRow(count).createCell(0).setCellValue(iphonePrice);
			FileOutputStream fout = new FileOutputStream(".\\src\\main\\resources\\iphone.xlsx");
			wb.write(fout);
			wb.close();
		}
		
		
	}
}
