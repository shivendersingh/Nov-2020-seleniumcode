package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {

	// pre-condition annotation
	@BeforeSuite // 1
	public void setup() {
		System.out.println("Setup system property for chrome");
	}

	@BeforeTest // 2
	public void login() {
		System.out.println("login method");
	}

	@BeforeClass // 3
	public void launchbrowser() {
		System.out.println("launch chrome browser");
	}

	@BeforeMethod // 4
	public void enterurl() {
		System.out.println("enter url");
	}

	// starting the test
	/*
	 * @beforemethod
	 * @test-1
	 * @aftermethod
	 
	 * @beforemethod
	 * @test-2
	 * @aftermethod

	 */
	@Test // 5
	public void googleTitleTest() {
		System.out.println("Google title test");
	}

	@Test 
	public void searchtest() {
		System.out.println("search test");
	}

	// post- condtion annotation
	@AfterMethod // 6
	public void logout() {
		System.out.println("login from app");
	}

	@AfterClass // 7
	public void closeBrowser() {
		System.out.println("close browser");
	}

	@AfterTest // 8
	public void deleteallcookies() {
		System.out.println("deleteallcookies");
	}

	@AfterSuite // 9
	public void genetratetestreport() {
		System.out.println("genetratetestreport");
	}

}
