package selenium_projects1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class blazedemo {
	public static void main(String[] args) throws InterruptedException {
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
				driver.get("https://blazedemo.com/");

				driver.manage().window().maximize();

				Thread.sleep(5000);

				WebElement ele = driver.findElement(By.name("fromPort"));

				Select drp = new Select(ele);

//				drp.selectByValue("Portland");
		//
//				Thread.sleep(2000);

				drp.selectByValue("Boston");

				Thread.sleep(2000);

				WebElement ele1 = driver.findElement(By.name("toPort"));

				Select drp1 = new Select(ele1);

				drp1.selectByValue("New York");

				Thread.sleep(2000);

				driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();

				// Write your code from here...
				
				Thread.sleep(1000);
				driver.findElement(By.name("inputName")).sendKeys("Shivam");
				
				Thread.sleep(1000);
				driver.findElement(By.id("address")).sendKeys("India");
				
				Thread.sleep(1000);
				driver.findElement(By.id("city")).sendKeys("Noida");
				
				Thread.sleep(1000);
				driver.findElement(By.id("state")).sendKeys("Uttar Pradesh");
				
				Thread.sleep(1000);
				driver.findElement(By.id("zipCode")).sendKeys("201301");
				
				Thread.sleep(1000);
				WebElement card = driver.findElement(By.name("cardType"));
				Select drpdwn = new Select(card);
				drpdwn.selectByValue("amex");
				
				Thread.sleep(1000);
				driver.findElement(By.id("creditCardNumber")).sendKeys("2525363614147987");
				
				Thread.sleep(1000);
				driver.findElement(By.id("creditCardMonth")).clear();
				driver.findElement(By.id("creditCardMonth")).sendKeys("01");
				
				Thread.sleep(1000);
				driver.findElement(By.id("creditCardYear")).clear();
				driver.findElement(By.id("creditCardYear")).sendKeys("2027");
				
				Thread.sleep(1000);
				driver.findElement(By.id("nameOnCard")).sendKeys("Shivam");
				
				Thread.sleep(1000);
				driver.findElement(By.id("rememberMe")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
				
				Thread.sleep(3000);
				driver.close();

			}

		}
		
	
