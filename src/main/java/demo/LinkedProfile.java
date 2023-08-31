package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedProfile {

    WebDriver driver;

    public LinkedProfile() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void linked() throws InterruptedException {

        // driver.get("https://www.linkedin.com/");

        // driver.get("https://in.linkedin.com/");

        driver.get("https://www.linkedin.com/login");

        // driver.findElement(By.id("session_key")).sendKeys("artisharma89223@gmail.com");
        driver.findElement(By.id("username")).sendKeys("artisharma89223@gmail.com");
        // driver.findElement(By.linkText("Email or
        // phone")).sendKeys("artisharma89223@gmail.com");
        driver.findElement(By.id("password")).sendKeys("EN_xp,HU#a92wKw");

        driver.findElement(By.xpath("//*[@id=\'organic-div\']/form/div[3]/button")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='global-nav']/div/nav/ul/li[1]/a/span")).click();

        // driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]"))
        // .click();
        try {
            Thread.sleep(3000);
            // driver.findElement(
            // By.xpath("//*[@id=\'ember1543\']/div[3]/ul/li/div/div[2]/div/a"))
            // .click();
            driver.get("https://www.linkedin.com/analytics/profile-views/");

            System.out.println("checking who vied your profile:::");
            List<WebElement> views = driver.findElements(By.xpath("//div[@class='member-analytics-addon-loader']"));
            String viewed = "Profile viewers in the past 90 days";

            for (WebElement webElement : views) {

                if (viewed.equals("Profile viewers in the past 90 days")) {

                    System.out.println(webElement.getText());
                    break;

                }

            }
            // driver.findElement(By.id("ember2350"));

            // Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println(e);
        }

        driver.get("https://www.linkedin.com/analytics/post-summary/urn:li:activity:7101483658649182208/");

        // List<WebElement> imp =
        // driver.findElements(By.xpath("//div[@class='display-flex align-items-center
        // t-black--light']"));
        // System.out.println(imp.size());

        // String s = "impressions";

        // for (WebElement impr : imp) {
        // if (s.equalsIgnoreCase("impressions")) {

        // System.out.println(impr.getText());
        // break;

        // }

        WebElement impr = driver.findElement(By.xpath("//div[@class = 'display-flex align-items-center']/p"));
        // impr.getText();
        System.out.println("impressions ----" + impr.getText());
        // navigate to home url
        driver.get("https://www.linkedin.com/feed/");

        driver.findElement(By.xpath("//div[@class='share-box-feed-entry__top-bar']/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class = 'text-body-large-bold truncate']")).click();
        Thread.sleep(2000);
        // driver.findElement(By.linkText("Connections only")).click();
        driver.findElement(By.id("CONNECTIONS_ONLY")).click();
        driver.findElement(By.xpath("//span[text() = 'Done']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[1]")).sendKeys("please join us");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Post']")).click();

        WebElement verify = driver.findElement(By.xpath("//span[text()='Post successful.']"));
        System.out.println(verify.isDisplayed());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='View post']")).click();
        Thread.sleep(3000);

        WebElement afterpost = driver.findElement(By.xpath("//section[@class='fixed-full']"));
        try {
            if (afterpost.isDisplayed())
                System.out.println("The post is posted and visible");
        } catch (Exception ex) {
            System.out.println("FileformatException => " + ex.getMessage());
        }

        // try {
        // WebElement verify = driver.findElement(By.xpath("//span[text()='Post
        // successful.']"));
        // String che = verify.getText();
        // if (che.equals("Post successfu")) {

        // System.out.println("its is successfully Posted");
        // }

        // } catch (Exception e) {
        // // TODO: handle exception

        // System.out.println(e + " its is not posted please do once again");
        // }

    }
    //
    // WebElement impressions =
    // driver.findElement(By.xpath("//span[@class='ca-entry-point__num-views
    // t-14']"));
    // System.out.println(impressions.getText());

    // driver.findElements(By.tagName("st"));

}