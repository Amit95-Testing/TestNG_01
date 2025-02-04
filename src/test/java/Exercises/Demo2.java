package Exercises;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void bank() {
		System.out.println("bank");

	}
	
	@Test(groups= {"Smoke"})
	public void Lastline() {
		System.out.println("i am 1st from last.");
	}
    @Parameters({"ABC"})
	@Test
	public void saving(String test) {
		System.out.println("Save the money");
		System.out.println(test);
	}

	@Test
	public void current() {
		System.out.println("run the money");
	}
	@BeforeTest
	public void first() {
		System.out.println("First Test case");
	}
}
