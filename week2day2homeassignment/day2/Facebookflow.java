package week2day2homeassignment.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebookflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains (text(),'Create new account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anne");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jenima");
		driver.findElement(By.xpath("//input[@aria-label= 'Mobile number or email address']")).sendKeys("annesterwin@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("preetina");
		WebElement source = driver.findElement(By.id("day"));
		Select select=new Select(source);
		select.selectByIndex(4);
		// Select class by visible text
		WebElement source1 = driver.findElement(By.id("month"));
		Select select1 = new Select(source1);
		select1.selectByValue("9");
		//Select class by value
		WebElement industryDD = driver.findElement(By.id("year"));
		Select sel=new Select(industryDD);
		sel.selectByValue("1996");
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		
	}

}
