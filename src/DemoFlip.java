import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFlip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\this pc\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.getTitle();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		WebElement move=driver.findElement(By.xpath("//div[@class='exehdJ']"));
		a.moveToElement(move).build().perform();
		Thread.sleep(3000);
		driver.close();
	}
}
