package Testng.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


//sel->drivers ->generalized->maven->pom.xml
public class NewTest {
	 WebDriver wd;
	 @BeforeTest
	 public void inti() {
		 WebDriverManager.chromedriver().setup();
		 wd=new ChromeDriver();
		 wd.manage().window().maximize();
	 }

	
	
  @Test
  public void test1() {
	  
		wd.get("https://www.google.co.in/");
		String title=wd.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("Google",title,"title not matched");
		System.out.println("done");
		sa.assertEquals("https://www.google.co.in/",wd.getCurrentUrl(),"url not found");
		sa.assertAll();
		
	  
  }
  
  @Test
  public void test2() {
		wd.get("https://www.amazon.in/");
		
	  
  }
  
  @AfterTest
  public void closing() {
	  wd.close();
  }
  
  
}




