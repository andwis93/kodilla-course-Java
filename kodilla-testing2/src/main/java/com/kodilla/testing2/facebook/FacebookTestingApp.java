package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//div[contains(@class,\"9xo5\")]/button[contains(@class,\"9xo6\")]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class,\"6ltg\")]/a[contains(@class,\"6lti\")]";
    public static final String XPATH_WAIT_FOR = "//button";
    public static final String XPATH_DAY = "//span[contains(@class,\"5k_4\")]/span/select[1]";
    public static final String XPATH_MONTH = "//span[contains(@class,\"5k_4\")]/span/select[2]";
    public static final String XPATH_YEAR = "//span[contains(@class,\"5k_4\")]/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement element = driver.findElement(By.xpath(XPATH_COOKIES));
        element.click();

        element = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        element.click();

      //  while(!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());
        TimeUnit.SECONDS.sleep(1);

        element = driver.findElement(By.xpath(XPATH_DAY));
        Select select = new Select(element);
        select.selectByIndex(1);
        element = driver.findElement(By.xpath(XPATH_MONTH));
        select = new Select(element);
        select.selectByIndex(9);
        element = driver.findElement(By.xpath(XPATH_YEAR));
        select = new Select(element);
        select.selectByValue("1982");
    }
}
