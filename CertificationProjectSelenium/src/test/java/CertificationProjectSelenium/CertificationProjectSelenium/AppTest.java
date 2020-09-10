package CertificationProjectSelenium.CertificationProjectSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Unit test for simple App.
 */
public class AppTest {



    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
        System.setProperty("webdriver.chrome.driver", "/opt/google/chromedriver/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
        WebDriver webDriver = new ChromeDriver(options);
        String ipAddress = "http://35.225.163.128:32000/website/";
        webDriver.get(ipAddress);
        
        webDriver.findElement(By.id("About Us")).click();
        webDriver.close();
    }
}
