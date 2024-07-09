package FO;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {
	 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		TestAdminLogin tl = new TestAdminLogin();
		tl.getLogin(driver);

		
//		User
//		TestUser user = new TestUser();
//		user.getUser(driver);
//		user.deleteUser(driver);
		
		
		
//		Product
		TestAddProduct productadd = new TestAddProduct();
		productadd .getProductAdd(driver);
		
		//add product
//		productadd .setValues(driver);
//		Thread.sleep(2000);
//		productadd .click(driver);
		
		// update
		productadd.getUpdateProduct(driver);
		
		
//		Update Profile
//		TestAdminProfileUpdate updateprofile = new TestAdminProfileUpdate();
//		updateprofile.updateadmin(driver);
//		updateprofile.setValues(driver);
//		Thread.sleep(2000);
		
//		updateprofile.getSubmit(driver);
//		driver.quit();

	}

}
