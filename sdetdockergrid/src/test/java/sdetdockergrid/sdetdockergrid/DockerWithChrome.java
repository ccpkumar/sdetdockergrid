package sdetdockergrid.sdetdockergrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setBrowserName("chrome");
		URL url = new URL("http://192.168.99.100:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("The tile is "+driver.getTitle());
		driver.quit();
	}

}
