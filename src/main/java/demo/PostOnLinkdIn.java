package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PostOnLinkdIn {
    
    WebDriver driver;

    public PostOnLinkdIn () {
        // print construstor
        System.out.println("Constructor: TestCases");
        
        WebDriverManager.chromedriver().timeout(30).setup();
      // object creation
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void PostOnLinkdIn() {
       // Navigate to url
        driver.get("https://in.linkedin.com/");
       
        //Enter the Email id
        driver.findElement(By.xpath("//input[@id = 'session_key']")).sendKeys("Email");

        //Enter the password
        driver.findElement(By.xpath("//input[@id = 'session_password']")).sendKeys("password");

        //Click on sign button
        driver.findElement(By.xpath("//button[@type ='submit']")).click();
    

        // click on create post
        driver.findElement(By.xpath(""));
        


        

    }
    }

