package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrlCheck {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String expectedText = "facebook";
        String actualText = driver.getCurrentUrl();

        if (actualText.contains(expectedText)) {
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        driver.close();
    }
}
