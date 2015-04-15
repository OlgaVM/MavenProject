/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testsel.maventestsel.pages;



import com.testsel.maventestsel.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author OlgaVM
 */
public class LoginPage {
   
    private WebDriver webDriver;
 
    /**
     * Логин
     */
    @FindBy(id = "login_field")
    private WebElement login;
 
    /**
     * Пароль
     */
    @FindBy(id = "password")
    private WebElement password;

    
    
    //@FindBy( id = "submit")
    private WebElement submitLogin;
 
    /**
     * Сообщение об ошибке
     */
//   
      public LoginPage(WebDriver webDriver) {
        // проверить, что вы находитесь на верной странице
        
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
 
    /**
     * Залогиниться
     * @param user - {@link User}
     */
    public void loginUser(User user) {
     System.out.println(webDriver.getTitle());
     login.sendKeys(user.login);
     password.sendKeys(user.password);
     submitLogin = webDriver.findElement(By.name("commit"));
     submitLogin.click();
    }
 
   //создать новый pageObject, в котором описать успешную регистрацию, найти элемент
    //<span class="js-select-button">OlgaVM</span>
    // в тестах в ассерте прописать вызов метода из этого pageObjecta
}
   
