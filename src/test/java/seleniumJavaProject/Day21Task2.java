package seleniumJavaProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String	ex="STORE";
	
		//System.out.println("Title of the page is :"+ title);
		if (ex.equals(driver.getTitle())) {
			
			System.out.println("Page landed on correct website");
			
			}
		else
		{
			System.out.println("Page not landed on correct website");
		}
		
		driver.close();
	}

}
