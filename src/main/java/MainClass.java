import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\DRIVERS\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().setSize(new Dimension(900, 500));

        String link = "https://github.com/mozilla/geckodriver/releases/tag/v0.26.0";
        driver.get(link);
        driver.navigate().to("http://google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.cssSelector("")).sendKeys("Test");
        driver.findElement(By.cssSelector("")).click();

        assert driver.findElements(By.cssSelector("")).size() == 0;
        File screanshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String filename = format.format(dateNow) + ".png";

//        try {
//            FileUtils.copyFile(screanshot, new File("C://Download/" + filename));
//        }
//            catch (IOException e) {
//            e.printStackTrace();
//            }
        driver.quit();
    }
}
