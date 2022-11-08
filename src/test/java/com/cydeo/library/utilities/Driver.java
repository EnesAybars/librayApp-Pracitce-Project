package com.cydeo.library.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){


    }
    private static WebDriver driver;


    /* To change the language of the webDriver

    // Could not find the Chromedriver.exe path. Check this out!

        System.setProperty("webdriver.chrome.driver","<PATH>/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", "C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");

    //ChromeOptions object
    ChromeOptions opt = new ChromeOptions();

    //set language to Spanish
        opt.addArguments("−−lang=es");

    // configure options parameter to Chrome driver
    WebDriver driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://www.google.com/ ");

         */


    public static WebDriver getDriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABRA\\.cache\\selenium\\chromedriver\\win32\\107.0.5304.62\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");

        if(driver == null){

            String browserType = ConfigurationReader.getProperty("browser");

            switch(browserType){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }

        return driver;
    }



    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }


}
