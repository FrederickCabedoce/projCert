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
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver webDriver = new ChromeDriver(options);
        String ipAddress = "http://35.225.163.128:32000/website/";
        //String ipAddress = "http://www.facebook.com";
        webDriver.get(ipAddress);
        
        webDriver.findElement(By.id("About Us")).click();
        webDriver.close();
    }
}
