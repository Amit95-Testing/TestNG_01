package Exercises;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test(groups= {"Smoke"})
	public void demo1(){
		System.out.println("Hello");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After the methods");
		System.out.println("After the methods one");	
		System.out.println("After the methods one");
	}
	
	@Test
	
	public void Demo2() {
		System.out.println("Bye");
	}
    @BeforeMethod
    public void beforeMethod() {
    	System.out.println("1st methods");
   
    }
}
