package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import static Utils.ActionUtils.*;
import static Utils.WaitUtils.*;

public class WheelOfFortunePage {

    public WebDriver driver;

    public WheelOfFortunePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public static By iframe = By.id("betgames_iframe");
    public By betSlipSection = By.className("bet-slip");
    public By amountField = By.id("amount-input");
    public By addRandomButton = By.className("xPP8KvDwWxMvWNYUs5r6");
    public By textOfBetType = By.xpath("//div[@class='DGEtXKpN3PJWJA_TP1WO']//..//span");
    public By placeBetButton = By.className("place-bet-button");
    public By recentBet = By.className("iUXS2mv2HWp7YTmSK2QT");
    public By buttonsExceptSector = By.className("iRGX2h7OO48Hztwp3xPI");


    /**
     * Load the page and betslip section
     */
    public void waitForTheGameToBeLoaded() {
        waitUntilFrameToBeAvailableAndSwitchToIt(driver, iframe, 20);
    }

    /**
     * Write in amount field two digits number
     *
     * @param number1 String
     * @param number2 String
     */
    public void writeInAmountFieldTwoNumbers(String number1, String number2) {
        waitUntilElementToBeVisible(driver, betSlipSection, 10);
        scrollPage(driver, betSlip());
        waitUntilElementToBeVisible(driver, amountField, 5);
        clearField(amountField);
        enterTwoNumbers(amountField, number1, number2);
    }

    /**
     * WebElement of betSlip section
     *
     * @return WebElement
     */
    public WebElement betSlip() {
        return driver.findElement(betSlipSection);
    }

    /**
     * Click on +Add random button
     */
    public void clickAddRandomButton() {
        waitUntilElementToBeVisible(driver, addRandomButton, 60);
        clickOn(addRandomButton);
    }

    /**
     * Text of bet type from betslip
     *
     * @return String
     */
    public String getTextFromBetType() {
        waitUntilElementToBeVisible(driver, textOfBetType, 20);
        return driver.findElement(textOfBetType).getText();
    }

    /**
     * Click Place bet button
     */
    public void clickPlaceBetButton() {
        waitUntilElementToBeClickable(driver, placeBetButton, 5);
        clickOn(placeBetButton);
    }

    /**
     * Text from Recent Bet section
     *
     * @return String
     */
    public String getTextFromRecentBet() {
        waitUntilElementToBePresented(driver, recentBet, 20);
        return driver.findElement(recentBet).getText();
    }

    /**
     * Enter one number to Amount field
     * @param number String
     */
    public void writeInAmountFieldOneNumber(String number) {
        waitUntilElementToBeVisible(driver, betSlipSection, 20);
        scrollPage(driver, betSlip());
        waitUntilElementToBeVisible(driver, amountField, 5);
        clearField(amountField);
        enterOneNumber(amountField, number);
    }

    /**
     * Click button by writing it's colour
     * @param colour String
     */
    public void chooseGreyColourBet(String colour) {
        waitUntilElementToBeClickable(driver, buttonsExceptSector, 60);
        List<WebElement> allButtonsExceptSectorButtons = driver.findElements(buttonsExceptSector);
        for (WebElement allButtonsExceptSectorButton : allButtonsExceptSectorButtons) {
            if (allButtonsExceptSectorButton.getText().toLowerCase().contains(colour)) {
                allButtonsExceptSectorButton.click();
                break;
            }
        }
    }

}
