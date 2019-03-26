package testbaidu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class testbaidu {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.baidu.com");
	      Thread.sleep(5000);
	      driver.findElement(By.id("kw")).sendKeys("selenium");
	      driver.findElement(By.id("su")).click();
	      driver.close();
	}

}
