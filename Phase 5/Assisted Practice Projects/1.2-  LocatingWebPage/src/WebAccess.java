import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAccess {
	public static void main(String[] args) {
	//load the driver
		System.setProperty("webdriver.chrome.driver","P:\\MPHASIS\\Selenium\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
	//maximise the web browser screen
		wd.manage().window().maximize();
	//load the webpage
		wd.get("https://www.google.in/");
//title of webpage what loaded
		System.out.println(wd.getTitle());
//load the url
		System.out.println(wd.getCurrentUrl());
		//close the browser

//		wd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
//		wd.findElement(By.id("nav-search-submit-button")).click();
		
		wd.findElement(By.linkText("Start here.")).click();
		wd.findElement(By.id("ap_customer_name")).sendKeys("karthik");
		wd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
		wd.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
		wd.findElement(By.id("ap_password")).sendKeys("1234567");
		wd.findElement(By.id("continue")).click();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		wd.close();
		
		
	}
}


