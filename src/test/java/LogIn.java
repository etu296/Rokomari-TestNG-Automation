import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LogIn extends SetUp {
    @Test(priority = 0 )
    public void signIn()
    {
        driver.get("https://www.rokomari.com/login/?");
//        driver.findElement(By.xpath("//p[contains(text(),'Sign up')]")).click();

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
         WebElement goToCart = driver.findElement(By.cssSelector("div.container:nth-child(16) section.details-book-section:nth-child(2) div.row div.col-9 div.details-book-main-info-wrapper div.row.no-gutters div.col.details-book-main-info.align-self-center div.details-btn div.row.no-gutters div.col > a.btn.details-cart-btn.small-cart-button.js--goto-cart-btn:nth-child(2)"));
         goToCart.sendKeys(Keys.ENTER);
      }

      @Test(priority = 4)
      public void viewCart()
      {
          List<WebElement> clickOnCart = driver.findElements(By.className("cart-menu"));
          clickOnCart.get(0).sendKeys(Keys.ENTER);
      }

    @Test(priority = 5)
    public void placeOrder()
    {
        WebElement placeOrder = driver.findElement(By.cssSelector("#js-continue-to-shipping"));
        placeOrder.sendKeys(Keys.ENTER);
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
