import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LogIn extends SetUp {
    @Test(priority = 0 )
    public void signUp()
    {
        driver.get("https://www.rokomari.com/login/?");
//        driver.findElement(By.xpath("//p[contains(text(),'Sign up')]")).click();
        List<WebElement> signUpBtn = driver.findElements(By.className("js--login-form-btn"));
        signUpBtn.get(0).click();
    }
@Test (priority = 1)

    public void LogIn()
{
      List<WebElement> email = driver.findElements(By.className("form-control"));
      email.get(1).sendKeys("etum@gmail.com");
      List<WebElement> pass = driver.findElements(By.className("form-control"));
      pass.get(2).sendKeys("12345qwe");
      WebElement loginBtn =  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
      loginBtn.sendKeys(Keys.ENTER);

}

     @Test(priority = 2)
      public  void selectMenu()
      {
         List<WebElement> list = driver.findElements(By.id("js--authors")) ;
         list.get(0).click();
         driver.get("https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0");

      }

      @Test(priority = 3)
      public void addToCart()
      {
         driver.get("https://www.rokomari.com/book/1346/porir-meye-megoboti");
         driver.findElement(By.xpath("//body/div[6]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[2]")).click();

      }
//    public void fillUp()
//    {
//        List<WebElement> fullName = driver.findElements(By.className("form-control"));
//        fullName.get(3).sendKeys("Etu Mahmuda Era");
//        List<WebElement> email = driver.findElements(By.className("form-control"));
//        email.get(4).sendKeys("etum@gmail.com");
//        List<WebElement> mobile = driver.findElements(By.className("form-control"));
//        mobile.get(5).sendKeys("01315655618");
//        List<WebElement> pass = driver.findElements(By.className("form-control"));
//        fullName.get(6).sendKeys("12345qwe");
//        List<WebElement> clickOnCheckBox = driver.findElements(By.className("recaptcha-checkbox-border"));
//        clickOnCheckBox.get(0).click();
//        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
//
//    }


}
