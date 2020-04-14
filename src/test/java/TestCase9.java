import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class TestCase9 {

	public WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Executables\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void openMyBlog() {
		driver.get("http://gmail.com");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
