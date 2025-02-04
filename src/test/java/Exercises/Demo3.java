package Exercises;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	
	@AfterTest
	public void last() {
		System.out.println("Last test case");
	}
  @Test(groups= {"Smoke"})
  public void loan() {
	  System.out.println("Loan types given below");
  }
  @Parameters({"XYZ"})
  @Test
  public void Home(String Name) {
	  System.out.println("Home Loan");
	  System.out.println(Name);
  }
  
  @Test(dependsOnMethods="Home")
  public void vehical() {
	  System.out.println("Vehical Loan");
  }
  @BeforeSuite
  public void firstline() {
	  System.out.println("I am first from first test case");
  }
}
