package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By clickButtonStart = By.xpath("//button[contains(text(),'Start')]");
    private By loadingPointer = By.id("loading");
    private By getHelloWorld = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(clickButtonStart).click();

//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(loadingPointer)));
        FluentWait wait = new FluentWait(driver)
        .withTimeout(Duration.ofSeconds(5))
        .pollingEvery(Duration.ofSeconds(1))
        .ignoring(NoSuchElementException.class);

     wait.until(ExpectedConditions.invisibilityOf(
         driver.findElement(loadingPointer)));

    }

    public String getTwoWords() {
        return driver.findElement(getHelloWorld).getText();
    }

}
