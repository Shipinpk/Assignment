package sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\workspace\\Assignment\\lib\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		WebDriver driver = new ChromeDriver(options);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		/*
		 * navigate to url
		 */

		driver.navigate().to("https://testpavithram.rapidor.co/users/login/");

		/*
		 * add wait element to wait for an element
		 */

		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.findElement(By.xpath("//div[@class='form-group']//input[@class='form-control input-lg ' and @type='text']")).sendKeys("superadmin");
		
		driver.findElement(By.xpath("//div[@class='form-group']//input[@class='form-control input-lg ' and @type='password']")).sendKeys("testpavithram_0.151401636507_!piLS72(mp,'*");
		
		driver.findElement(By.xpath("//form[@id='user_form']//button[@class='btn login_signin']")).click();
		
		driver.findElement(By.xpath("//div[@class='collapsible-body']//a[contains(text(),'Create Order')]")).click();
		
		driver.findElement(By.xpath("//input[@id='x_order_no']")).sendKeys("testorder");
		
		driver.findElement(By.xpath(" //input[@id='x_username']")).sendKeys("test username");
		
		driver.findElement(By.xpath("//input[@id='x_datetime']")).sendKeys("08/07/2019");
		
		driver.findElement(By.xpath("//input[@id='x_latitude']")).sendKeys("");
		
		driver.findElement(By.xpath("//input[@id='x_longitude']")).sendKeys("");
		
		driver.findElement(By.xpath("//input[@id='p_search']")).sendKeys("017");
		
		driver.findElement(By.xpath("//li[@id='ui-id-3']")).click();
		
		
		//driver.findElement(By.xpath("//input[@id='p_phone']")).sendKeys("");
		
		//driver.findElement(By.xpath("//input[@id='p_email']")).sendKeys("");
		
		driver.findElement(By.xpath("//textarea[@id='shippingAddress']")).sendKeys("calicut");
		
		driver.findElement(By.xpath("//textarea[@id='billingAddress']")).sendKeys("calicut");
		
		/*
		 * adding product
		 */
		driver.findElement(By.xpath("//a[@class='pos_add_product pull-right addProduct margin1P nonpos'] ")).click();
		
		driver.findElement(By.xpath("//a[@id='353189_anchor']")).click();
		
		driver.findElement(By.xpath("//input[@class='chkbox']")).click();
		
		driver.findElement(By.xpath("//button[@id='create_order_items_add2']")).click();
		
		driver.findElement(By.xpath("//tr[2]//td[6]//div[1]//input[1]")).sendKeys("1");
		
		/*
		 * click next button
		 */
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary margin1P purchase-placeorder'] ")).click();
		
		/*
		 * submit button to place the order
		 */
		driver.findElement(By.xpath("//button[@id='purchase-placeorder']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='action_icon_354191']")));
		driver.findElement(By.xpath("//img[@id='action_icon_354191']")).click();
		
		driver.findElement(By.xpath("//li[@class='readonlySelector']//label[@name='e_354191'][contains(text(),'Payment')]")).click();
		
		
		
		
		


		

	}

}
