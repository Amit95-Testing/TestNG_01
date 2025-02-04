package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class student {

	@Test(dataProvider = "getData")
	public void Amity(String subject, String student) {
		System.out.println("Pass");
		System.out.println(subject);
		System.out.println(student);
	}
	
	@Test
	public void Siya() {
		System.out.println("Pass");
	}
	
	@Test
	public void Lala() {
		System.out.println("Pass");
	}
	
	@DataProvider
	public Object[][] getData() {
	//1st project & Student
	//2nd project & Student
	//3rd project & Student
    Object[][] data = new Object[3][2];//3 row & 2 column count
    data[0][0] = "subject1Name";
    data[0][1] = "student1Name";
    
    data[1][0] = "subject2Name";
    data[1][1] = "student2Name";
    
    data[2][0] = "subject3Name";
    data[2][1] = "student3Name";
    
    return data;
	}

}
