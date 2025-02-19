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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
//    public void sampleTest() {
//
//        var el1 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry"));
//        el1.click();
//
//        WebElement location = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Bangladesh\"))"));
//        location.click();
////        var el2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Argentina\")"));
////        el2.click();
//
//        var el3 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
//
//        el3.sendKeys("Test Data");
//
//        var el4 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale"));
//        el4.click();
//        var el5 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));
//        el5.click();
//        var el6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(0)"));
//        el6.click();
//
//        var el7 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(0)"));
//        el7.click();
//
//        var newv = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(1)"));
//        newv.click();
//
//        var newv2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(1)"));
//        newv2.click();
//
//        WebElement shoe = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Air Jordan 9 Retro\"))"));
//        var newv3 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(2)"));
//        newv3.click();
//
//        var newv4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(2)"));
//        newv4.click();
//
//        var newv5 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(3)"));
//        newv5.click();
//
//        var newv6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(3)"));
//        newv6.click();
//
//        var newv7 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(4)"));
//        newv7.click();
//
//        var newv8 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(4)"));
//        newv8.click();
//        var el8 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart"));
//        el8.click();
//        var el9 = driver.findElement(AppiumBy.className("android.widget.CheckBox"));
//        el9.click();
//
//        var el20 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed"));
//        el20.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//
//    }

    public void sampleTest() throws InterruptedException {


        try {
           WebElement ClickCountry;
            ClickCountry = driver.findElement(By.id("android:id/text1"));
            ClickCountry.click();
            Thread.sleep(1000);
            System.out.println("ClickCountry - Passed");

        } catch (Exception e) {
            System.out.println("ClickCountry - Failed");
        }

        try {

                    WebElement location = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Bangladesh\"))"));
        location.click();
            WebElement SelectCountry = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Bangladesh]"));
            SelectCountry.click();
            System.out.println("SelectCountry - Passed");
            Thread.sleep(4000);

        } catch (Exception e) {
            System.out.println("SelectCountry - Failed");
        }

        try {
            WebElement NameField = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
            NameField.sendKeys("This is a test");
            System.out.println("NameField - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("NameField - Failed");
        }


        //android.widget.RadioButton[@text = 'Female']
        try {
            WebElement RadioBtn = driver.findElement(By.xpath(" //android.widget.RadioButton[@text = 'Female']"));
            RadioBtn.click();
            System.out.println("RadioBtn - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("RadioBtn - Failed");
        }

        try {
            WebElement Btn = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
            Btn.click();
            System.out.println("Btn - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Btn - Failed");
        }
//                                StartProducts
        try {
            WebElement AirJordan = driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']\n"));
            AirJordan.click();
            System.out.println("AirJordan - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("AirJordan - Failed");
        }

        try {
            WebElement AirJordanMid = driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']\n"));
            AirJordanMid.click();
            System.out.println("Air Jordan 1 Mid SE - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Air Jordan 1 Mid SE - Failed");
        }

//        Scroll

        var n =  driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Nike SFB Jungle\"))"
        ));

        Thread.sleep(1000);
//       PG3
        try {
            WebElement PG3 = driver.findElement(By.xpath("//android.widget.TextView[@text='PG 3']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']\n"));
            PG3.click();
            System.out.println("PG3 - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("PG3 - Failed");
        }
        //Nike SFB Jungle
        try {
            WebElement SFB = driver.findElement(By.xpath("//android.widget.TextView[@text='Nike SFB Jungle']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']\n"));
            SFB.click();
            System.out.println("Nike SFB Jungle - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Nike SFB Jungle- Failed");
        }
        //LeBron Soldier 12
        try {
            WebElement LeBron = driver.findElement(By.xpath("//android.widget.TextView[@text='LeBron Soldier 12 ']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']\n"));
            LeBron.click();
            System.out.println("LeBron Soldier 12 - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("LeBron Soldier 12- Failed");
        }


        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward().scrollIntoView(new UiSelector().text(\"Air Jordan 9 Retro\"))"
        ));
        Thread.sleep(5000);

        //Air Jordan 9 Retro
        try {
            WebElement Jordan9 = driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 9 Retro']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']\n"));
            Jordan9.click();
            System.out.println("Air Jordan 9 Retro - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Air Jordan 9 Retro- Failed");
        }

        //Jordan Lift Off
        try {
            WebElement Jordan9 = driver.findElement(By.xpath("//android.widget.TextView[@text='Jordan Lift Off']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']\n"));
            Jordan9.click();
            System.out.println("Jordan Lift Off - Passed");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Jordan Lift Off- Failed");
        }

        //Jordan Lift Off
        try {
            WebElement Jordan6 = driver.findElement(By.xpath("//android.widget.TextView[@text='Jordan 6 Rings']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADD TO CART']\n"));
            Jordan6.click();
            System.out.println("Jordan 6 Rings - Passed");
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println("Jordan 6 Rings- Failed");
        }

// Scroll backward from "Air Jordan 9 Retro" to "Air Jordan 1 Mid SE"
//        driver.findElement(AppiumBy.androidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward().scrollIntoView(new UiSelector().text(\"Nike Blazer Mid '77\"))"
//        ));
//        Thread.sleep(3000);

//        driver.findElement(AppiumBy.androidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
//                        ".setAsVerticalList()" +
//                        ".scrollBackward().scrollIntoView(new UiSelector().text(\"Air Jordan 9 Retro\"))"
//        ));








//        try {
//            WebElement location = driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Bangladesh\"))"));
//            location.click();
//            System.out.println("location - Passed");
//        } catch (Exception e) {
//            System.out.println("location - Failed");
//        }
//
//        try {
//            var el3 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
//            el3.sendKeys("Test Data");
//            System.out.println("el3 - Passed");
//        } catch (Exception e) {
//            System.out.println("el3 - Failed");
//        }
//
//        try {
//            var el4 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale"));
//            el4.click();
//            System.out.println("el4 - Passed");
//        } catch (Exception e) {
//            System.out.println("el4 - Failed");
//        }
//
//        try {
//            var el5 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));
//            el5.click();
//            System.out.println("el5 - Passed");
//        } catch (Exception e) {
//            System.out.println("el5 - Failed");
//        }
//
////        try {
//////            var el6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(0)"));
////            var el6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(0)"));
////            el6.click();
////            System.out.println("el6 - Passed");
////        } catch (Exception e) {
////            System.out.println("el6 - Failed");
////        }
//
//        try {
//            // Click on "Air Jordan 4 Retro"
//            product_element = driver.find_element(AppiumBy.XPATH, "//android.widget.TextView[@text='Air Jordan 4 Retro']")
//            product_element.click()
//            sleep(2)
//
//# Click on 'ADD TO CART' button
//                    add_to_cart_button = driver.find_element(AppiumBy.XPATH, "//android.widget.Button[@text='ADD TO CART']")
//            add_to_cart_button.click()
//            sleep(2)
//            System.out.println("Test Passed: Product added to cart successfully!");
//        } catch (Exception e) {
//            System.out.println("Test Failed: " + e.getMessage());
//        }
//
//
//        try {
//            var el7 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(0)"));
//            el7.click();
//            System.out.println("el7 - Passed");
//        } catch (Exception e) {
//            System.out.println("el7 - Failed");
//        }
//
//        try {
//            var newv = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(1)"));
//            newv.click();
//            System.out.println("newv - Passed");
//        } catch (Exception e) {
//            System.out.println("newv - Failed");
//        }
//
//        try {
//            var newv2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(1)"));
//            newv2.click();
//            System.out.println("newv2 - Passed");
//        } catch (Exception e) {
//            System.out.println("newv2 - Failed");
//        }
//
//        try {
//            WebElement shoe = driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Nike Blazer Mid '77\"))"));
//            System.out.println("shoe - Passed");
//        } catch (Exception e) {
//            System.out.println("shoe - Failed");
//        }
//
//        try {
//            var newv3 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(2)"));
//            newv3.click();
//            System.out.println("newv3 - Passed");
//        } catch (Exception e) {
//            System.out.println("newv3 - Failed");
//        }
//
//        try {
//            var newv4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(2)"));
//            newv4.click();
//            System.out.println("newv4 - Passed");
//        } catch (Exception e) {
//            System.out.println("newv4 - Failed");
//        }
//
//        try {
//            var newv5 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(3)"));
//            newv5.click();
//            System.out.println("newv5 - Passed");
//        } catch (Exception e) {
//            System.out.println("newv5 - Failed");
//        }
//
//        try {
//            var newv6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(3)"));
//            newv6.click();
//            System.out.println("newv6 - Passed");
//        } catch (Exception e) {
//            System.out.println("newv6 - Failed");
//        }
//
//        try {
//            var newv7 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productImage\").instance(4)"));
//            newv7.click();
//            System.out.println("newv7 - Passed");
//        } catch (Exception e) {
//            System.out.println("newv7 - Failed");
//        }
//
//        try {
//            var newv8 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(4)"));
//            newv8.click();
//            System.out.println("newv8 - Passed");
//        } catch (Exception e) {
//            System.out.println("newv8 - Failed");
//        }
//
//        try {
//            var el8 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart"));
//            el8.click();
//            System.out.println("el8 - Passed");
//        } catch (Exception e) {
//            System.out.println("el8 - Failed");
//        }
//
//        try {
//            var el9 = driver.findElement(AppiumBy.className("android.widget.CheckBox"));
//            el9.click();
//            System.out.println("el9 - Passed");
//        } catch (Exception e) {
//            System.out.println("el9 - Failed");
//        }
//
//        try {
//            var el20 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed"));
//            el20.click();
//            System.out.println("el20 - Passed");
//        } catch (Exception e) {
//            System.out.println("el20 - Failed");
//        }


    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}


