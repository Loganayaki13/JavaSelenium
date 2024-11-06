package seleniumWebComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		for (int i = 0; i < 1; i++) {
			driver.findElement(By.xpath("(//a[@data-event='click'])[2]")).click();
		}

		driver.findElement(By.xpath("//a[contains(text(),'22')]")).click();

		WebElement selected_date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		String s = selected_date.getAttribute("value");
		System.out.println(s);
		driver.close();
	}

}
