package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import page.WheelOfFortunePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;



public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://demo.betgames.tv/");
        driver.manage().window().maximize();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    /*@AfterMethod
    public void afterTest(ITestResult result) throws IOException {
        if (!result.isSuccess()) {
            SimpleDateFormat time = new SimpleDateFormat("MM_dd_HH_mm_ss");
            time.setTimeZone(TimeZone.getTimeZone("Europe/Vilnius"));
            long failTime = System.currentTimeMillis();
            String testName = result.getName();
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("C:\\Users\\Ieva\\Documents\\screenshots\\" +
                    "screenshot_" + testName + "_" + time.format(failTime) + ".png"));
        }
    }*/
}
