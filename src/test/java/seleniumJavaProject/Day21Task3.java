package seleniumJavaProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21Task3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence",Keys.ENTER);
		driver.findElement(By.linkText("History")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
