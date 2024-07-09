package FO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestAdminLogin extends TestAdminProfileUpdate{
//	WebDriver driver;
	public void getLogin(WebDriver driver) {
		try {
			driver.get("http://localhost/food_website_backend/food%20website%20backend/admin/admin_login.php");
			Thread.sleep(2000);
			driver.findElement(By.name("name")).sendKeys("admin");
			driver.findElement(By.name("pass")).sendKeys("222");
			Thread.sleep(2000);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
//			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
