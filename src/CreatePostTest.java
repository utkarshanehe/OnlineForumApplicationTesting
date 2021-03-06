// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CreatePostTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void createPost() throws InterruptedException {
    driver.get("http://127.0.0.1:8000/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.linkText("Signin")).click();
    driver.findElement(By.id("id_username")).sendKeys("riyashah");
    driver.findElement(By.id("id_password")).click();
    driver.findElement(By.id("id_password")).sendKeys("riya1234");
    driver.findElement(By.id("login_button")).click();
    driver.findElement(By.linkText("Create Post")).click();
    driver.findElement(By.id("id_title")).click();
    driver.findElement(By.id("id_title")).sendKeys("Cultural Event");
    driver.findElement(By.id("id_content")).click();
    driver.findElement(By.id("id_content")).sendKeys("Cultural Event");
    {
      WebElement dropdown = driver.findElement(By.id("id_categories"));
      dropdown.findElement(By.xpath("//option[. = 'PICT IEEE Club']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("id_categories"));
      dropdown.findElement(By.xpath("//option[. = 'PICT IEEE Club']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("id_categories"));
      dropdown.findElement(By.xpath("//option[. = 'PICT Art Circle']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("id_categories"));
      dropdown.findElement(By.xpath("//option[. = 'PICT Art Circle']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("id_categories"));
      dropdown.findElement(By.xpath("//option[. = 'MS Preparation']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("id_categories"));
      dropdown.findElement(By.xpath("//option[. = 'PICT Art Circle']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("id_categories"));
      dropdown.findElement(By.xpath("//option[. = 'MS Preparation']")).click();
    }
    driver.findElement(By.id("id_tags")).click();
    driver.findElement(By.id("id_tags")).sendKeys("art-c");
    driver.findElement(By.id("id_tags")).click();
    driver.findElement(By.id("id_tags")).sendKeys("art-circle");
    driver.findElement(By.cssSelector("option:nth-child(5)")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(6)")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Logout")).click();
  }
}
