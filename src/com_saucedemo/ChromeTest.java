package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 * Created by Sandip Patel
 */

public class ChromeTest {
    public static void main(String[] args) {
        // 1 Setup Chrome browser
        String baseUrl = "https://www.saucedemo.com/";
        WebDriver driver = new ChromeDriver();
        // 2 Open Url
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 3 Print the title if the page
        System.out.println("The title of the page : " + driver.getTitle());
        // 4 Print the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        // 5 Print the page source
        System.out.println("The page source : " + driver.getPageSource());
        // 6 Enter the email to email field
        driver.findElement(By.id("user-name")).sendKeys("prime123@gmail.com");
        // 7 Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("prime123");
        // 8 Click on Login Button
        driver.findElement(By.id("login-button")).click();
        // 9 Print the current url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        // 10 Navigate to baseUrl
        driver.navigate().to(baseUrl);
        // 11 Refresh the page
        driver.navigate().refresh();
        // 12 Close the browser
        driver.quit();
    }
}