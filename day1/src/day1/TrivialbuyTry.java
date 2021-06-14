package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivialbuyTry {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://trivialbuy.dataphion.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='normal_login_username']")).sendKeys("applereg@inscriptio.in");
			driver.findElement(By.xpath("//*[@id=\'normal_login_password\']")).sendKeys("Apple@123");
			driver.findElement(By.xpath("//*[@id=\'normal_login\']/button/a")).click();
			driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.MINUTES);
			driver.findElement(By.linkText("Client Profile")).click();
			//driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div[2]/div[8]/div[2]/div[4]/div");
			
			//driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				}
				
}
