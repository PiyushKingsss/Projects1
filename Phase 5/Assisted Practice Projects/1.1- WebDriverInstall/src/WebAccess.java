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


		wd.close();
		
		
	}
}


