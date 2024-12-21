package learningselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumIntroduction {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        System.setProperty("Webdriver.Chrome.Driver", "C:\\Users\\KP15\\Documents\\chromedriver-win64");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://Salesforce.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       driver.close();
    }
}
