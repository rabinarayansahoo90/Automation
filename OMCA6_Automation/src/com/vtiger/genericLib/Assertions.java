package com.vtiger.genericLib;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
		//// HARD ASSERT
		@Test
		public void checkStrictHardAssertion() {
			 String actual = "Hello";
			 String expected = "Hello";
			
			 Assert.assertEquals(actual, expected);
			System.out.println("Strict Hard");				
		}
		@Test
		public void checkContainsHardAssertion() {
			String actual = "Hello";
			String expected = "llo";
			
			Assert.assertTrue(actual.contains(expected));
			System.out.println("Contains Hard");
		}
		
		//// SOFT ASSERT
		@Test
		public void checkStrictSoftAssertion() {
			 String actual = "Showing";
			 String expected = "Showing";
			
			 SoftAssert sf = new SoftAssert();
			 sf.assertEquals(actual,expected);
			 
			 System.out.println("Strict Soft");
			 sf.assertAll();
		}
		
//		@Test
//		public void checkPartialSoftAssertion() {
//			 String actual = "Showing";
//			 String expected = "wing";
//			
//			 SoftAssert sf = new SoftAssert();
//			 sf.assertTrue(actual.);
//			 
//			 System.out.println("Partial Soft");
//			 sf.assertAll();
//		}
		
	}


