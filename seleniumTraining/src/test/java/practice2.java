import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This Java class will open a page and will type in a text box using ID and Xpath locators
public class practice2 {
    public static void main(String[] args) {
        //Set the chromedriver property and specify the path of the Chromedriver file
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        //Declaring driver object
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //Enter Username field by using ID locator
        driver.findElement(By.id("inputUsername")).sendKeys("myUsername");
        //Enter Password field by using NAME locator
        driver.findElement(By.name("inputPassword")).sendKeys("myPassword");
        //Click on the Submit button field by using CLASSNAME locator
        driver.findElement(By.className("signInBtn")).click();
    }
}
