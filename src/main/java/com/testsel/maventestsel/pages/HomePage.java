/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testsel.maventestsel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author OlgaVM
 */
public class HomePage {
    
    private WebDriver webDriver;
    private String _login;
    private WebElement _span;
      public HomePage(WebDriver webDriver) {
       
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
    public  boolean CheckHomePage(String login)
    {
       return webDriver.findElements(By.xpath("//span[text()='OlgaVM']")).size() > 0;
    }
    
}
