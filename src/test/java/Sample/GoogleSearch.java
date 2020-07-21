package Sample;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class GoogleSearch {

		@Test
		public void Magentoreg() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys("selenium");
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div")).click();
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[5]/div/div[1]/a/h3")).click();
			String title = driver.getTitle();
			System.out.println("The Title is = "+ title);
			if (title.equals("SeleniumHQ Browser Automation"))
			{
				System.out.println("Got the Expected Result");
				System.out.println("Result");
			}
			
			driver.quit();
		}
	}


