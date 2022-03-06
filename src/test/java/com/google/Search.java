package com.google;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Search {

    @Test
    public void searchTest() {
        System.setProperty("webdriver.opera.driver", "/WebDrivers/operadriver_win64/operadriver.exe");
        OperaDriver driver = new OperaDriver();
        driver.get("https://www.google.com/");
        WebElement input = driver.findElement(By.xpath("//input[@aria-label=\"Найти\"]"));
        input.sendKeys("Курсы по автотестированию");
        WebElement button = driver.findElement(By.xpath("//input[@name=\"btnK\"]"));
        button.submit();

    }
}
