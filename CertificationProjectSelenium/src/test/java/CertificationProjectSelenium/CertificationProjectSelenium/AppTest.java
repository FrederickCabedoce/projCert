package CertificationProjectSelenium.CertificationProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestNG
{



    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String ipAddress = "http://35.225.163.128:32775/website/";
        //String ipAddress = "http://www.facebook.com";
        webDriver.get(ipAddress);
        
        webDriver.findElement(By.id("About Us")).click();
    }
}
