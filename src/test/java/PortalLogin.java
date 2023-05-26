import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PortalLogin {
    @Test
    public void browserSetup(){

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();

        driver.get("https://www.aiub.edu/");

        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.id("username")).sendKeys("17-3");
        driver.findElement(By.id("password")).sendKeys("H*");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).click();
    }
}

