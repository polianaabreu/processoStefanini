package com.cadastro.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver = getDriver();

    private static WebDriver getDriver(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
        return webDriver;
    }
}
