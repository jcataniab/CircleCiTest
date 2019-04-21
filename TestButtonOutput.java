import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestButtonOutput {
    public static void main(String[] args) {

        // Setup selenium driver
	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

        // open html file
        driver.get("file:" + System.getProperty("user.dir") + "/index.html");

        // simulate click and grab output
        driver.findElement(By.id("pushmebutton")).click();
        String outputText = driver.findElement(By.id("output")).getText();
        driver.close();

        // test
        boolean passed = outputText.contentEquals("Congratulations the button works :)");

        // log results
        if (passed){
            System.out.println("Test Success: Found ");
            System.exit(0);
        } else {
            System.out.println("Test Fail: Unable to find correct text.");
            System.exit(1);
        }
    }
}
