package Controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pilote {
    public WebDriver driveGui(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:/Stage/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver= new org.openqa.selenium.chrome.ChromeDriver();
        return driver;
    }
    public WebDriver driverNoGui(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:/Stage/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--window-size=1920x1080");
        driver= new ChromeDriver(options);
        return driver;
    }
}
