package seleniumWebComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
		// source element -drag
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		// target element -drop
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		// Action class
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(source, target).perform();

		// Verify the TEXT of the target element after drop

		driver.findElement(By.tagName("p"));
		System.out.println(target.getText());

	}
}
