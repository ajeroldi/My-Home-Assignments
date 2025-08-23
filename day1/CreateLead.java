package week2homeassignment.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.name("firstName")).sendKeys("Anne");
		driver.findElement(By.name("lastName")).sendKeys("Jeroldin");
		driver.findElement(By.name("companyName")).sendKeys("Oracle");
		driver.findElement(By.name("generalProfTitle")).sendKeys("QA");
		driver.findElement(By.className("smallSubmit")).click();
		String header = driver.getTitle();
		System.out.println(header);
		driver.close();
		

	}

}
