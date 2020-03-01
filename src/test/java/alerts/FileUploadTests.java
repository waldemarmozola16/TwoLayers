package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
    var uploadPage = homePage.clickFileUpload();
    uploadPage.uploadFile("/home/kali/workspace/testautomatiomationu/webdriver_java/resources/chromedriver");
    assertEquals(uploadPage.getUploadFiles(), "chromedriver", "Upload is incorrect") ;
    }
}
