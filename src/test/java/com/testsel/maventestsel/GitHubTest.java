package com.testsel.maventestsel;


import com.testsel.maventestsel.pages.HomePage;
import com.testsel.maventestsel.pages.LoginPage;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
//@Test
public class GitHubTest extends TestCase
  {
   //@TestSuite
    public static void testLogin()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://github.com/login");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage pageTest = new LoginPage(webDriver);
     // User user = new User("OlgaVM", "123");
     
        User user = new User("OlgaVM", "OL2979489Ja");
        pageTest.loginUser(user);
        
       HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.CheckHomePage(user.login.toString()));
        
        webDriver.quit();
    }

  
}
