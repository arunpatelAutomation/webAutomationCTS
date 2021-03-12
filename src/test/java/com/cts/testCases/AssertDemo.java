package com.cts.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	//soft assert
	
	@Test(priority=1)
	void demoTest() {
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(true); //pass
		sa.assertEquals("Welcome", "welocme"); //fail
		sa.assertEquals(10, 10); //pass
		System.out.println("Successfully passed !");
		sa.assertAll();
	}
		//hard assert
		@Test(priority=2)
		
		void demoTest2() {
			
			Assert.assertTrue(true); //pass
			Assert.assertEquals('a', 'a');
			Assert.assertEquals(10, 20);
			Assert.assertEquals("Arun", "Arun");
			System.out.println("Test passed !");
		}
		
	}
	
	
