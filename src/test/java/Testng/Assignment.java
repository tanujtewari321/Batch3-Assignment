package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment {
    @Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanuj.tewari\\Documents\\JAVA and SELENIUM Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		
		// verifying the title
		String actual_title = driver.getTitle();
		String expected_title = "ToolsQA";
		System.out.println("actual_title = "+actual_title);
		System.out.println("expected_title = "+expected_title);
		if(actual_title.equals(expected_title)) {
			System.out.println("The title is verified!");
		}
		else {
			System.out.println("The title is not verified!");
		}
		
		
		// Getting current URL
		String current_url = driver.getCurrentUrl();
		System.out.println("Current URL -> "+current_url);
		
		
		// To scroll down by 450 pixels vertical
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");
		
		
		// Clicking on Elements card using indexing XPath
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();
		
		// Clicking on Text Box using indexing XPath
		driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click();
		
		// To scroll down by 100 pixels vertical
		js.executeScript("window.scrollBy(0,100)");
		
		// Entering full name
		driver.findElement(By.xpath("(//input[@id='userName'])[1]")).sendKeys("Tanuj Tewari");		
		
		// Entering email
		driver.findElement(By.xpath("(//input[@id='userEmail'])[1]")).sendKeys("tanuj.tewari@sourcefuse.com");	
		
		// Entering Current Address
		driver.findElement(By.xpath("(//textarea[@id='currentAddress'])[1]")).sendKeys("Nainital");
		
		// Entering Permanent Address
		driver.findElement(By.xpath("(//textarea[@id='permanentAddress'])[1]")).sendKeys("Uttarakhand");
		
		// To scroll down by 400 pixels vertical
        js.executeScript("window.scrollBy(0,400)");
		
		// Hitting Submit
		driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
		
		// Sleep for 3000 milliseconds
        Thread.sleep(3000);
		
		
		
		// Clicking on Text Box using indexing XPath
		driver.findElement(By.xpath("(//li[@id='item-1'])[1]")).click();
		
		// Clicking on radio button
		driver.findElement(By.xpath("(//label[@for='tree-node-home'])[1]")).click();
		
		// Clicking on the '+' icon
		driver.findElement(By.xpath("//button[@title='Expand all']//*[name()='svg']")).click();
		
		
		// To scroll up by 300 pixels vertical
        js.executeScript("window.scrollBy(0,-300)");
        
        // Sleep for 3000 milliseconds
        Thread.sleep(3000);
		
        
       // Going back to home page
        driver.get("https://demoqa.com");
       
       // To scroll down by 450 pixels vertical
        js.executeScript("window.scrollBy(0,450)");
        
       // Selecting Alerts, Frame & Windows via indexing XPath
        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();
        
       // To scroll down by 400 pixels vertical
        js.executeScript("window.scrollBy(0,400)");
        
        
       // Selecting Alerts, Frame & Windows via indexing XPath
        driver.findElement(By.xpath("(//li[@id='item-1'])[2]")).click();
        
       // To scroll down by 400 pixels vertical
        js.executeScript("window.scrollBy(0,200)");
        
       // Clicking on the 'click here' button
        driver.findElement(By.xpath("(//button[@id='timerAlertButton'])[1]")).click();
        
       // Sleep for 5000 milliseconds
        Thread.sleep(5000);
        
       // Clicking 'Ok' in the alert box
        driver.switchTo().alert().accept();
        
       // Closing the driver
        driver.close();
    }
}
