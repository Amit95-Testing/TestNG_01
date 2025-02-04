package Exercises;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Demo4 {
	@Test(enabled=false)
	public void Apple() {
		System.out.println("Save the apple");
	}
	@Parameters({"url"})
	@Test
	public void Peas(String urlname) {
		System.out.println("Save the peas");
		System.out.println(urlname);
	}
	@Test
	public void banana() {
		System.out.println("Save the banana");
	}
	@Test(timeOut=4000)
	public void Mango() {
		System.out.println("Save the mango");
	}
}

