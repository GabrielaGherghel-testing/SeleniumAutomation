package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeFormTest {

    public WebDriver driver;

  @Test
  public void automationMethod() {
    // deschidem un browser de Chrome
    driver = new ChromeDriver();
    // accesam o pagina web
    driver.get("https://demoqa.com/");
    // facem browserul in modul maximize
    driver.manage().window().maximize();
    // facem un scroll
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 1000)");

      WebElement Formsfield=driver.findElement(By.xpath("//h5[text()='Forms']"));
      Formsfield.click();

      WebElement PracticeFormfield =driver.findElement(By.xpath("//span[text()='Practice Form']"));
      PracticeFormfield.click();

      WebElement firstNamefield=driver.findElement(By.id("firstName"));
      String firstNameValue="Gabriela";
      firstNamefield.sendKeys(firstNameValue);

      WebElement lastNamefield=driver.findElement(By.id("lastName"));
      String lastNameValue="Gherghel";
      lastNamefield.sendKeys(lastNameValue);

      WebElement userEmailfield=driver.findElement(By.id("userEmail"));
      String userEmailValue="test@test.com";
      userEmailfield.sendKeys(userEmailValue);


      WebElement malefield=driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
      WebElement femalefield=driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
      WebElement otherfield=driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

      String genderValue="Female";

      if (malefield.getText().equals(genderValue))
      {
          malefield.click();
      }
      else if(femalefield.getText().equals(genderValue)){
          femalefield.click();
      }
      else if(otherfield.getText().equals(genderValue)){
          otherfield.click();
      }


      WebElement mobileNumberfield=driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
      String mobileNumberValue="076543276";
      mobileNumberfield.sendKeys(mobileNumberValue);

      WebElement pictureElement=driver.findElement(By.id("uploadPicture"));
      File file = new File("src/test/resources/1.png");
      pictureElement.sendKeys(file.getAbsolutePath());

  }
}
