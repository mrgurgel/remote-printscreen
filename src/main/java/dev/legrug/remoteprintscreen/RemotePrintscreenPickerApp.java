package dev.legrug.remoteprintscreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Inital example taken from: https://dzone.com/articles/using-selenium-webdriver-for-full-page-screenshots
 */
public class RemotePrintscreenPickerApp {


    public static void main(String[] args) {

        String siteURL = args[0];
        String fileDestination = args[1];
        WebDriver driver = null;
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(siteURL);

            Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

            ImageIO.write(screenshot.getImage(), "PNG", new File(fileDestination));
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(driver != null)
            {
                driver.quit();
            }
        }
    }
}

