package week4day1homeassignment.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Attributed based xpath
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("bags",Keys.ENTER);
		//partial Text based xpath
		//To the left of the screen under "Gender" click on "Men"
	        Thread.sleep(3000); 
	        driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
	        //Under "Category" click "Laptop bags"
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//label[contains(text(),'Laptop Bag')]")).click();
	        
		//Print the count of the items found.
	        Thread.sleep(3000);
	        String itemCount = driver.findElement(By.className("title-count")).getText();
	        System.out.println("Total items found: " + itemCount);
	        
	        List<String> list=new ArrayList<String>();//Empty List
	        // Get the list of brands
	        List<WebElement> brands = driver.findElements(By.className("product-brand"));
	        System.out.println("\nList of Brands:");
	        for (WebElement brand : brands) 
	        {
	        	String text2 = brand.getText();
				list.add(text2);
				}
	        System.out.println(list);
	        
	        List<String> test=new ArrayList<String>();//Empty List
	        //  Get the list of bag names
	        List<WebElement> bagNames = driver.findElements(By.className("product-product"));
	        System.out.println("\nList of Bag Names:");
	        for (WebElement bag : bagNames)
	        {
	        	String text3 = bag.getText();
				test.add(text3);
	        }
	        System.out.println(test);
	        
	        

	

	}
}

