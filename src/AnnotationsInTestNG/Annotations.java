package AnnotationsInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	
		@BeforeSuite//The annotated method will be run only once before all tests in this suite have run.
		public void beforesuite(){
			System.out.println("BEFORE-SUITE");
		}
		@BeforeTest//The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
		public void beforetest(){
			System.out.println("BEFORE-TEST");
		}
		@BeforeClass//	The annotated method will be run only once before the first test method in the current class is invoked.
		public void beforeclass(){
			System.out.println("BEFORE-CLASS");
		}
		@BeforeMethod//The annotated method will be run before each test method.
		public void beforemethode(){
			System.out.println("BEFORE-METHOD");
		}
		@BeforeGroups//The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
		public void beforegroup(){
			System.out.println("BEFORE-GROUP");
		}
		@Test//Marks a class or a method as a part of the test.
		public void test(){
			System.out.println("TEST");
		}
		@AfterMethod//The annotated method will be run after each test method
		public void aftermethod(){
			System.out.println("AFTER-METHOD");
		}
		@AfterClass//The annotated method will be run only once after all the test methods in the current class have run
		public void afterclass(){
			System.out.println("AFTER-CLASS");
		}
		@AfterTest    //The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
		public void aftertest(){
			System.out.println("AFTER-TEST");
		}
		@AfterSuite//The annotated method will be run only once after all tests in this suite have run.
		public void aftersuite(){
			System.out.println("AFTER-SUITE");
		}
		@AfterGroups //The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
		public void aftergroup(){
			System.out.println("AFTER-GROUP");
		}
		

	}


