package week2day2homeassignment.day2;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Anne123");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement source = driver.findElement(By.name("industryEnumId"));
		Select select = new Select(source);
		select.selectByIndex(3);
		WebElement source1= driver.findElement(By.name("ownershipEnumId"));
		Select select1= new Select(source1);
		select1.selectByVisibleText("S-Corporation");
		WebElement sourc= driver.findElement(By.name("dataSourceId"));
		Select seect1= new Select(sourc);
		seect1.selectByValue("LEAD_EMPLOYEE");
		WebElement source3= driver.findElement(By.name("marketingCampaignId"));
		Select select3= new Select(source3);
		select3.selectByIndex(6);
		WebElement sour1= driver.findElement(By.name("generalStateProvinceGeoId"));
		Select set1= new Select(sour1);
		set1.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String header = driver.getTitle();
		System.out.println(header);
		driver.close();
		
	
		

	}

}
