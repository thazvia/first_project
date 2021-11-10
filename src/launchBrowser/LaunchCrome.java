package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCrome {

	public static void main(String[] args) throws InterruptedException {
		
		//Scanner scn=new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thazv\\july2021_selenium\\1st_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximzize
		driver.manage().window().maximize();
		
		//get the web site
		driver.get("https://www.google.com/");
		
		//identify web element and perform action
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//driver.findElement(By.name("btnK")).click();
		
		//wait the execution for 3 seconds
		Thread.sleep(3000);
		//to close the browser
		driver.close();
	}

}
