package demo;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {
	public static void main(String[] args) {
		new WebDriverManagerTest().testDriverManagerChrome();
		new WebDriverManagerTest().testDriverManagerFirefox();
	}

	public void testDriverManagerChrome() {
		WebDriver driver = WebDriverManager.chromedriver().create();
//  WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	public void testDriverManagerFirefox() {
		WebDriver driver = WebDriverManager.firefoxdriver().create();
//  WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}