//#######################################################################
// questions about the code? email to oscarvalerio@gmail.com
//#######################################################################

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
    public static void main(String[] args) {
        //Set the chromedriver property and specify the path of the Chromedriver file
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        //Create a new Chromedriver object
        WebDriver driver = new ChromeDriver();
        //Using driver object and GET method, open the browser and a specific page
        driver.get("https://oscarvalerio.github.io/");
        //Get the title and URL of the page
        String pageTitle = driver.getTitle();
        String pageURL = driver.getCurrentUrl();
        //Print out the URL and Title of the page
        System.out.println("The Title of the page is: "+pageTitle);
        System.out.println("The URL of the page is: "+pageURL);
    }
}
