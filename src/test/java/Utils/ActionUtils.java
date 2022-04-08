package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static test.BaseTest.driver;

public class ActionUtils {

    /**
     * Scroll page
     * @param driver WebDriver
     * @param element WebElement
     */
    public static void scrollPage(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Enter one number in field
     * @param locator By
     * @param number String
     */
    public static void enterOneNumber(By locator, String number) {
        driver.findElement(locator).sendKeys(number);
    }

    /**
     * Enter two numbers in field
     * @param locator By
     * @param number1 String
     * @param number2 String
     */
    public static void enterTwoNumbers(By locator, String number1, String number2) {
        driver.findElement(locator).sendKeys(number1);
        driver.findElement(locator).sendKeys(number2);
    }

    /**
     * Clear the field
     * @param locator By
     */
    public static void clearField(By locator) {
        driver.findElement(locator).clear();
    }

    /**
     * Click clickable element
     * @param locator By
     */
    public static void clickOn(By locator) {
        driver.findElement(locator).click();
    }


}
