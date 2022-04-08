package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitUtils {

    /** Wait for frame to be available and switch to it
     * @param driver  WebDriver
     * @param locator By
     * @param timeout int
     */
    public static void waitUntilFrameToBeAvailableAndSwitchToIt(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    /** Wait for element to be visible
     * @param driver  WebDriver
     * @param locator By
     * @param timeout int
     */
    public static void waitUntilElementToBeVisible(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /** Wait for element to be presented
     * @param driver  WebDriver
     * @param locator By
     * @param timeout int
     */
    public static void waitUntilElementToBePresented(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /** Wait for element to be clickable
     * @param driver  WebDriver
     * @param locator By
     * @param timeout int
     */
    public static void waitUntilElementToBeClickable(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
