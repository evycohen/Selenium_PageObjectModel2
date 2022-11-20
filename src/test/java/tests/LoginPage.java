package tests;

import helper.driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends TestBase{

    @Test
    public void adminLoginTest(){
        DriverManager.getDriver().findElement(By.name("login[email]")).sendKeys("administrator@localhost.com");
        DriverManager.getDriver().findElement(By.name("login[password]")).sendKeys("administrator");
        DriverManager.getDriver().findElement(By.cssSelector("button[type='submit']")).click();
    }
}
