package Testng.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
  @Test
  public void f() {
	  System.out.println("in test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in test before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("in test after");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("in test before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("in test after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("in test in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("in test in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("in test before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("in test after suite");
  }

}

