package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlerts(){
        var alertsPage = homePage.clickJavaScritsAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Result text is incorrect");
    }
    @Test
    public void testGetTextFromAlerts(){
        var alertsPage = homePage.clickJavaScritsAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Result text is incorrect");
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Result text is incorrect");
    }

}
