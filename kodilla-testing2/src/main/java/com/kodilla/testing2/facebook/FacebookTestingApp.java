package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//div[contains(@class,\"9xo5\")]/button[contains(@class,\"9xo6\")]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class,\"6ltg\")]/a[contains(@class,\"6lti\")]";
    public static final String XPATH_DAY = "//span[contains(@class,\"5k_4\")]/span/select[1]";
    public static final String XPATH_MONTH = "//span[contains(@class,\"5k_4\")]/span/select[2]";
    public static final String XPATH_YEAR = "//span[contains(@class,\"5k_4\")]/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement cookiesBtn = driver.findElement(By.xpath(XPATH_COOKIES));
        cookiesBtn.click();

        WebElement accountBtn = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        accountBtn.click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_DAY)));

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(1);

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(9);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1982");
    }
}
