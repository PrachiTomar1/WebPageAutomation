package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class WebTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        
        WebElement resultStats = driver.findElement(By.id("result-stats"));
        Assert.assertTrue(resultStats.isDisplayed(), "Search results not displayed");
        
        // Click on the first result
        WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]"));
        firstResult.click();
        
        // Verify page title contains Selenium
        Assert.assertTrue(driver.getTitle().contains("Selenium"), "Title does not contain expected text");
        
        // Navigate back to Google
        driver.navigate().back();
        
        // Perform another search
        searchBox = driver.findElement(By.name("q"));
        searchBox.clear();
        searchBox.sendKeys("Test Automation");
        searchBox.submit();
        
        // Verify new search results
        WebElement newResultStats = driver.findElement(By.id("result-stats"));
        Assert.assertTrue(newResultStats.isDisplayed(), "New search results not displayed");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
