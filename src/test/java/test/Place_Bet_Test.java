package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.WheelOfFortunePage;


public class Place_Bet_Test extends BaseTest {


    @Test (priority = 1)
    public void placeBetUsingAddRandomFunctionWithTwoDigits() {

        WheelOfFortunePage wheelOfFortunePage = new WheelOfFortunePage(driver);
        wheelOfFortunePage.waitForTheGameToBeLoaded();
        wheelOfFortunePage.writeInAmountFieldTwoNumbers("3", "5");
        wheelOfFortunePage.clickAddRandomButton();
        wheelOfFortunePage.getTextFromBetType();
       // System.out.println(wheelOfFortunePage.getTextFromBetType());
        wheelOfFortunePage.clickPlaceBetButton();
        //System.out.println(wheelOfFortunePage.getTextFromRecentBet());

        Assert.assertEquals(wheelOfFortunePage.getTextFromBetType(), wheelOfFortunePage.getTextFromRecentBet(), "No bet in Recent bets, no placed bet");

    }

    @Test (priority = 2)
    public void placeBetByColourWithOneNumber() {
        WheelOfFortunePage wheelOfFortunePage = new WheelOfFortunePage(driver);
        wheelOfFortunePage.waitForTheGameToBeLoaded();
        wheelOfFortunePage.writeInAmountFieldOneNumber("6");
        wheelOfFortunePage.chooseGreyColourBet("grey");
        wheelOfFortunePage.getTextFromBetType();
        wheelOfFortunePage.clickPlaceBetButton();
        //System.out.println(wheelOfFortunePage.getTextFromBetType());
        Assert.assertEquals(wheelOfFortunePage.getTextFromBetType(), wheelOfFortunePage.getTextFromRecentBet(), "No bet in Recent bets");
    }

}
