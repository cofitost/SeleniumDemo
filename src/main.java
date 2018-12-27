
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;;

public class main {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    WebDriver driver = null;

    System.setProperty("webdriver.chrome.driver", "YOUR_CHROME_DRIVER_PATH");
    driver = new ChromeDriver(DesiredCapabilities.chrome());

    driver.get("https://ilearn2.fcu.edu.tw/");
    driver.findElement(By.id("login_username")).sendKeys("YOUR_ACCOUNT");
    driver.findElement(By.id("login_password")).sendKeys("YOUR_PASSWORD");
    driver.findElement(By.cssSelector("input[value='µn¤J']")).click();
  }

}
