package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class waitTests extends BaseTests {

    @Test
    public void setUpWaitTests() {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getTwoWords(), "Hello World!", "Message is incorrect");

    }

}
