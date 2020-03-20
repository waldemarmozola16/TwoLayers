package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {

    private WebDriver driver;
    private By clickButtonStart = By.xpath("//button[contains(text(),'Start')]");
    private By getHelloWorld = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(clickButtonStart).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(getHelloWorld));
}
    public boolean isStartButtonDisplayed(){
        return driver.findElement(clickButtonStart).isDisplayed();
            }
    public String getTwoWords() {
        return driver.findElement(getHelloWorld).getText();
    }
}
