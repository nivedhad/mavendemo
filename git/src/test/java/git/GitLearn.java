package git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitLearn {

@Test
public void testprint()
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	String baseUrl = "http://newtours.demoaut.com/mercurywelcome.php";
	driver.get(baseUrl);
	driver.getTitle().contains("ercury");
	driver.close();
	System.out.println("Test Passed");
}
	

}
