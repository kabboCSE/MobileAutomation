package com.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

public class TestApp {


    private AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        var options = new BaseOptions()
                .amend("platformName", "android")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:deviceName", "local")
                .amend("appium:udid", "emulator-5554")
                .amend("appium:appPackage", "com.androidsample.generalstore")
                .amend("appium:appActivity", "com.androidsample.generalstore.SplashActivity");


        URL remoteUrl = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(remoteUrl, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }



@Test
public void sampleTest() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set explicit wait globally

    try {
        WebElement ClickCountry = wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/text1")));
        ClickCountry.click();
        System.out.println("ClickCountry - Passed");
    } catch (Exception e) {
        System.out.println("ClickCountry - Failed");
    }

    try {
        WebElement location = wait.until(ExpectedConditions.elementToBeClickable(
                driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                                ".scrollIntoView(new UiSelector().text(\"Bangladesh\"))"))));
        location.click();
        System.out.println("location - Passed");
    } catch (Exception e) {
        System.out.println("location - Failed: " + e.getMessage());
    }

    try {
        WebElement NameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/nameField")));
        NameField.sendKeys("This is a test");
        System.out.println("NameField - Passed");
    } catch (Exception e) {
        System.out.println("NameField - Failed");
    }

    try {
        WebElement RadioBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadioButton[@text = 'Female']")));
        RadioBtn.click();
        System.out.println("RadioBtn - Passed");
    } catch (Exception e) {
        System.out.println("RadioBtn - Failed");
    }

    try {
        WebElement Btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.androidsample.generalstore:id/btnLetsShop")));
        Btn.click();
        System.out.println("Btn - Passed");
    } catch (Exception e) {
        System.out.println("Btn - Failed");
    }

    try {
        WebElement AirJordan = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        AirJordan.click();
        System.out.println("AirJordan - Passed");
    } catch (Exception e) {
        System.out.println("AirJordan - Failed");
    }

    try {
        WebElement AirJordanMid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        AirJordanMid.click();
        System.out.println("Air Jordan 1 Mid SE - Passed");
    } catch (Exception e) {
        System.out.println("Air Jordan 1 Mid SE - Failed");
    }

    driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Nike SFB Jungle\"))"
    ));

    try {
        WebElement PG3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='PG 3']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        PG3.click();
        System.out.println("PG3 - Passed");
    } catch (Exception e) {
        System.out.println("PG3 - Failed");
    }

    try {
        WebElement SFB = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Nike SFB Jungle']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        SFB.click();
        System.out.println("Nike SFB Jungle - Passed");
    } catch (Exception e) {
        System.out.println("Nike SFB Jungle- Failed");
    }

    try {
        WebElement LeBron = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='LeBron Soldier 12 ']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        LeBron.click();
        System.out.println("LeBron Soldier 12 - Passed");
    } catch (Exception e) {
        System.out.println("LeBron Soldier 12- Failed");
    }

    driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward().scrollIntoView(new UiSelector().text(\"Air Jordan 9 Retro\"))"
    ));

    try {
        WebElement Jordan9 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Air Jordan 9 Retro']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        Jordan9.click();
        System.out.println("Air Jordan 9 Retro - Passed");
    } catch (Exception e) {
        System.out.println("Air Jordan 9 Retro- Failed");
    }

    try {
        WebElement JordanLift = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Jordan Lift Off']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        JordanLift.click();
        System.out.println("Jordan Lift Off - Passed");
    } catch (Exception e) {
        System.out.println("Jordan Lift Off- Failed");
    }

    try {
        WebElement Jordan6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Jordan 6 Rings']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        Jordan6.click();
        System.out.println("Jordan 6 Rings - Passed");
    } catch (Exception e) {
        System.out.println("Jordan 6 Rings- Failed");
    }

    driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward().scrollIntoView(new UiSelector().text(\"Nike Blazer Mid '77\"))"
    ));

    try {
        WebElement Converse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Converse All Star']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        Converse.click();
        System.out.println("Converse All Star - Passed");
    } catch (Exception e) {
        System.out.println("Converse All Star- Failed");
    }

    try {
        WebElement Nike77 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Nike Blazer Mid '77\"]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']")));
        Nike77.click();
        System.out.println("Nike Blazer Mid '77 - Passed");
    } catch (Exception e) {
        System.out.println("Nike Blazer Mid '77- Failed");
    }

    driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward().scrollIntoView(new UiSelector().text(\"Air Jordan 4 Retro\"))"
    ));


    try {
        WebElement CartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]")));
        CartBtn.click();
        System.out.println("CartBtn - Passed");
    } catch (Exception e) {
        System.out.println("CartBtn- Failed");
    }

// Scroll from Top to Bottom (Full Scroll)
    driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).flingForward()"
    ));

    Thread.sleep(4000);

// Scroll from Bottom to Top (Full Scroll)
    driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).flingBackward()"
    ));

    Thread.sleep(4000);


    try {
        WebElement SendMeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]")));
        SendMeBtn.click();
        System.out.println("SendMeBtn - Passed");
    } catch (Exception e) {
        System.out.println("SendMeBtn- Failed");
    }

    try {
        WebElement ProceedBtn = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnProceed\"]"));
        ProceedBtn.click();
        System.out.println("ProceedBtn - Passed");
        Thread.sleep(6000);
    } catch (Exception e) {
        System.out.println("ProceedBtn- Failed");
    }


    try {
        WebElement text = driver.findElement(By.xpath("//android.widget.EditText"));
        text .click();
        Thread.sleep(2000);
        text .sendKeys("TEST COMPLETE" + Keys.ENTER);
        Thread.sleep(4000);
        System.out.println("search - Passed");
    } catch (Exception e) {
        System.out.println("search - Failed");
    }
}


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}


