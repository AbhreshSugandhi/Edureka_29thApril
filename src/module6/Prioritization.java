package module6;

import org.testng.annotations.Test;

public class Prioritization {

	@Test(priority = 10)
	public void Vishali() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 10)
	public void Naga() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 255)
	public void Virendra() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 200)
	public void Sudip() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 1004)
	public void Sachin() {
		System.out.println("This is the Test Case 5");
	}
}
