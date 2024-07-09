package FO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAdminLogin {
	WebDriver driver;
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
//			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			getLogin();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getLogin() {
		try {
			driver.get("http://localhost/food_website_backend/food%20website%20backend/admin/admin_login.php");
			Thread.sleep(2000);
			driver.findElement(By.name("name")).sendKeys("admin");
			driver.findElement(By.name("pass")).sendKeys("111");
			Thread.sleep(2000);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
			driver.quit();

//			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
