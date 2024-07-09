package FO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestUser {
	public void getUser(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/header/section/nav/a[5]")).click();
	}
	
	public void deleteUser(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/section/div/div[3]/a")).click();
	}
}
