package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {

    public WebDriver driver;

    @Test
    public void automationMethod(){
   //deschidem un browser de Chrome
   driver=new ChromeDriver();
   //accesam o pagina web
    driver.get("https://demoqa.com/");
    //facem browserul in modul maximize
        driver.manage().window().maximize();
        //facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");

        //declaram un element

        WebElement Elementsfield=driver.findElement(By.xpath("//h5[text()='Elements']"));
        Elementsfield.click();

        WebElement WebTablefield =driver.findElement(By.xpath("//span[text()='Web Tables']"));
        WebTablefield.click();

        WebElement Addfield=driver.findElement(By.id("addNewRecordButton"));
        Addfield.click();

        WebElement firstNamefield=driver.findElement(By.id("firstName"));
        String firstNameValue="Gabriela";
        firstNamefield.sendKeys(firstNameValue);

        WebElement lastNamefield=driver.findElement(By.id("lastName"));
        String lastNameValue="Gherghel";
        lastNamefield.sendKeys(lastNameValue);

        WebElement userEmailfield=driver.findElement(By.id("userEmail"));
        String userEmailValue="test@test.com";
        userEmailfield.sendKeys(userEmailValue);

        WebElement agefield=driver.findElement(By.id("age"));
        String ageValue="40";
        agefield.sendKeys(ageValue);

        WebElement salaryfield=driver.findElement(By.id("salary"));
        String salaryValue="4000";
        salaryfield.sendKeys(salaryValue);

        WebElement departmentfield=driver.findElement(By.id("department"));
        String departmentValue="Testing";
        departmentfield.sendKeys(departmentValue);

        WebElement submitfield=driver.findElement(By.id("submit"));
        submitfield.click();


    }
}
