package seleniumJavaProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String currenturl=driver.getCurrentUrl();
		System.out.println("Current url:"    +currenturl);
		driver.navigate().refresh();
		driver.close();
	}

}
