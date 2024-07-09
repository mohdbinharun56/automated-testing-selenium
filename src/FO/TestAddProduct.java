package FO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestAddProduct {
//	WebDriver driver;
	
	public void getProductAdd(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/header/section/nav/a[2]")).click();
	}
	
	public void setValues(WebDriver driver) {
		driver.findElement((By.name("name"))).sendKeys("naga-pizza");
		driver.findElement((By.name("price"))).sendKeys("300");
		WebElement dropdownElement = driver.findElement(By.name("category"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("fast food");
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		System.out.println("Selected option: " + selectedOption.getText());
		
		
		WebElement fileInput = driver.findElement(By.name("image"));
		String filePath = "C:\\\\Users\\\\Mohammad\\\\Downloads\\\\pizza.jpeg";
		 fileInput.sendKeys(filePath);
		 
	}
	
	public void getUpdateProduct(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[3]/a[1]")).click();
		driver.findElement(By.name("price")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("price")).sendKeys("100");
		driver.findElement(By.name("update")).click();
		
	}
	
	public void click(WebDriver driver) {
		driver.findElement(By.name("add_product")).click();
	}
}
