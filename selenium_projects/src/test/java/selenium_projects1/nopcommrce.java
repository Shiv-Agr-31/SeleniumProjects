package selenium_projects1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nopcommrce {
	public static void main(String[] args) throws Exception {
//		ScreenRecorderUtil.startRecord("main");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		ScreenRecorderUtil.startRecord("main");
				driver.get("https://demo.nopcommerce.com/");

				driver.manage().window().maximize();

				Thread.sleep(5000);
				
				WebElement register = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
				register.click();
				
				WebElement gender = driver.findElement(By.id("gender-male"));
				gender.click();
				
				WebElement firstName = driver.findElement(By.id("FirstName"));
				firstName.sendKeys("Shivam");
				
				WebElement lastName = driver.findElement(By.id("LastName"));
				lastName.sendKeys("Agrawal");
				
				WebElement date = driver.findElement(By.name("DateOfBirthDay"));
				Select date1 = new Select(date);
				date1.selectByValue("31");
				
				WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
				Select month1 = new Select(month);
				month1.selectByValue("1");
				
				WebElement year = driver.findElement(By.name("DateOfBirthYear"));
				Select year1 = new Select(year);
				year1.selectByValue("1998");
				
				WebElement email = driver.findElement(By.id("Email"));
				email.sendKeys("shivam@email.com");
				
				WebElement company = driver.findElement(By.id("Company"));
				company.sendKeys("shivam");
				
				WebElement pass = driver.findElement(By.id("Password"));
				pass.sendKeys("shivam");
				
				WebElement cnfPass = driver.findElement(By.id("ConfirmPassword"));
				cnfPass.sendKeys("shivam");
				
				WebElement submit = driver.findElement(By.id("register-button"));
				submit.click();
				
				TakesScreenshot sc = ((TakesScreenshot) driver);
				File src = sc.getScreenshotAs(OutputType.FILE);
				File f2 = new File("C:\\Users\\shiva\\Documents\\screenshot\\login.png");
				FileUtils.copyFile(src, f2);
				
				Thread.sleep(3000);
				driver.close();

				ScreenRecorderUtil.stopRecord();



				
				

	}

}
