package seleniumWebComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task3 {

	public static void main(String[] args) {

		// Handling browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("logu");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("logu@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Logu@123");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		driver.findElement(By.id("laterBtn")).click();

		driver.navigate().back();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("loganayaki1997@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("God5n2me!!!");
		driver.findElement(By.linkText("Login")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
