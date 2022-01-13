package com.company;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnkitaKausha_jy2pd0o\\Downloads\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.close();

    }
}
