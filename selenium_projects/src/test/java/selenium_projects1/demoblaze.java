package selenium_projects1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoblaze {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://demoblaze.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		System.out.println("Completed");
		
		driver.close();

	}

}
