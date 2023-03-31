package sdetdockergrid.sdetdockergrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithFirefox {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setBrowserName("firefox");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("The tile is "+driver.getTitle());
		driver.quit();
	}

}
