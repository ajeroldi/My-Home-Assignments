package week2day2homeassignment.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Anne1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Jeroldin1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Orcle1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Tech Hub");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Tech1");
		driver.findElement(By.name("description")).sendKeys("Hubtest the value");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("annerose.jeroldin@gmail.com");
		WebElement source1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select1 = new Select(source1);
		select1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("description")).sendKeys("Hubtest the value");
		driver.findElement(By.name("importantNote")).sendKeys("Hubtest value");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String header = driver.getTitle();
		System.out.println(header);
		driver.close();
		
		
		
	}

}
