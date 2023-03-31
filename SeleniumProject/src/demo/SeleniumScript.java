package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String dpath = "D:\\Prasanna\\selenium\\selenium_java\\ChromeDriver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", dpath);
//		WebDriverManager.chromedriver().setup();
		String url = "https://www.lambdatest.com/";
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.addArguments("--remote-allow-origins=*");
		DesiredCapabilities dcaps = new DesiredCapabilities();
		dcaps.setCapability("os", "windows");
		dcaps.setCapability(ChromeOptions.CAPABILITY, cOptions);
		WebDriver driver = new ChromeDriver(cOptions);

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement login = driver.findElement(By.linkText("Login"));
		System.out.println("Clicking on the login element in the main page");
		login.click();
		WebElement google = driver.findElement(By.xpath("//a[contains(@href,'google')]"));
		google.click();
		WebElement mailid = driver.findElement(By.id("identifierId"));
		mailid.sendKeys("sujathalmprasanna@gmail.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
		email.click(); 
		
		
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("login-button"));
//		driver.findElement(By.xpath("//a[contains(@href,'login')]"));
//
//		email.clear();
//		System.out.println("Entering the email");
//		email.sendKeys("your_email");
//
//		password.clear();
//		System.out.println("entering the password");
//		password.sendKeys("your_password");
//
//		System.out.println("Clicking login button");
//		loginButton.click();

		String title = "Welcome - LambdaTest";

		String actualTitle = driver.getTitle();

		System.out.println("Verifying the page title has started");
		Assert.assertEquals(actualTitle, title, "Page title doesnt match");

		System.out.println("The page title has been successfully verified");

		System.out.println("User logged in successfully");

		driver.quit();

	}

}
