package FO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestAdminProfileUpdate {
	
	public void updateadmin(WebDriver driver) {
			driver.findElement(By.xpath("/html/body/section/div/div[1]/a")).click();
//				Thread.sleep(2000);
	}
	public void setValues(WebDriver driver) {
		driver.findElement(By.name("name")).sendKeys("admin");
		driver.findElement(By.name("old_pass")).sendKeys("111");
		driver.findElement(By.name("new_pass")).sendKeys("222");
		driver.findElement(By.name("confirm_pass")).sendKeys("222");
	}
	
	public void getSubmit(WebDriver driver) {
		driver.findElement(By.name("submit")).click();
	}
}
