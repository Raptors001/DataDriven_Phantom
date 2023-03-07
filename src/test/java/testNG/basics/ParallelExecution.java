package testNG.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {

	@Test
	public void testOne() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		System.out.println(driver.getTitle() + " This is from ChromeTest");
		driver.close();
	}
	@Test
	public void testTwo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		System.out.println(driver.getTitle() + " This is from ChromeTest");
		driver.close();
	}
	@Test
	public void testThree() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		System.out.println(driver.getTitle() + " This is from ChromeTest");
		driver.close();
	}

}
