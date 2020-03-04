package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests1 extends BaseTests {

    @Test
    public void testFrameText() {
        var nestedFramesPage = homePage.clickFramesPage().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");

    }
}
