import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This Java class will open a page and will type in a text box using ID and Xpath locators
public class practice2 {
    public static void main(String[] args) throws InterruptedException {
        //Set the chromedriver property and specify the path of the Chromedriver file
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        //Declaring driver object
        WebDriver driver = new ChromeDriver();
        driver.get("https://oscarvalerio.github.io/seleniumExercises/practice1.html");
        //maximize browser and then wait 2 seconds
        //NOTE: Is not a good practice to use thread sleep in test automation, we´ll try sync methods later
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Enter Username field by using ID locator
        driver.findElement(By.id("userField")).sendKeys("myUsername");
        //Enter Password field by using NAME locator
        driver.findElement(By.id("passwordField")).sendKeys("myPassword");
        //Click on the Submit button field by using CLASSNAME locator
        driver.findElement(By.name("buttonToSubmit")).click();
    }
}
