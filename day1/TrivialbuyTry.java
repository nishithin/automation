package day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

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
			driver.findElement(By.xpath("//*[@id='normal_login_username']")).sendKeys("apple@inscriptio.in");
			driver.findElement(By.xpath("//*[@id=\'normal_login_password\']")).sendKeys("helloworld");
			driver.findElement(By.xpath("//*[@id=\'normal_login\']/button/a")).click();
			//driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.MINUTES);
			Thread.sleep(8000);
			driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/div[1]/a")).click();
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//*[@id=\"client-profile_tax_reg_number\"]")).sendKeys("TAX NUMBER");
			driver.findElement(By.xpath("//*[@id=\"client-profile_company_reg_number\"]")).sendKeys("COMPANY REG NUMBER");
			driver.findElement(By.xpath("//*//*[@id=\"client-profile_credit_agency_number\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"AGENCY NUM");
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div[1]/form/div[2]/div[3]/div/div/div/div/div/div[1]/span[2]")).click();
			
			//Select dropdown = new Select(driver.findElement(By.id("Construction")));
			//dropdown.selectByIndex(3);
			
			driver.findElement(By.xpath("//*[@id=\"client-profile_license_number\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"license number");
			driver.findElement(By.xpath("//*[@id=\"client-profile_authorised_manager\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"manager");
			driver.findElement(By.xpath("//*[@id=\"client-profile_authorised_manager_email\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"abc@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"client-profile_authorised_manager_phone\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"9898989898");
			
			//Editing address
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div[1]/form/div[6]/div[2]/div/div")).click();
			
			//driver.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				}
				
}
