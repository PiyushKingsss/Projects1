import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAccess {
	public static void main(String[] args) {
	//load the driver
		System.setProperty("webdriver.chrome.driver","P:\\MPHASIS\\Selenium\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
	//maximise the web browser screen
		wd.manage().window().maximize();
		//webpage level time bound
				wd.manage().timeouts().pageLoadTimeout(200,TimeUnit.MILLISECONDS);
			//load the webpage
				wd.get("P:\\MPHASIS\\HTML\\bootstrap\\hello.html");
				
				//webelements 1.implicit 2.explicit
				//wd.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
				
				WebElement we1=wd.findElement(By.name("user"));
				WebElement we2=wd.findElement(By.name("email"));
				//userdefined method(wd,we,timebound,value)
				explicit(wd,we1,2000,"karthik");
				explicit(wd,we2,3000,"k@c.c");
				
			}

			public static void explicit(WebDriver wd, WebElement we, int timebound, String sendkeys) {
				// TODO Auto-generated method stub
				new WebDriverWait(wd, timebound).until(ExpectedConditions.visibilityOf(we));
				we.sendKeys(sendkeys);
				
			}
		}


		
	/*	//load the webpage
				wd.get("P:\\MPHASIS\\HTML\\bootstrap\\hi.html");
				Select sc=new Select(wd.findElement(By.name("subjects")));
				//sc.selectByIndex(2);
				sc.selectByValue("java");
			
				
				
			}
		}






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
}*/


