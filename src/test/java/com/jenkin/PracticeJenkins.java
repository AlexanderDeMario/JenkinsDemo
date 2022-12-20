package com.jenkin;

import org.testng.annotations.Test;

public class PracticeJenkins {
	@Test(groups="Sanity")
	public void PracticeJenkinsTest() {
		System.out.println("hello");
	}
	
	@Test(groups = "Sanity")
	public void PracticeJenkinsTest1()
	{
		System.out.println("jenkins execution");
	}
	@Test(groups = "Regression")
	public void PracticeJenkinsTest2()
	{
		System.out.println("execution");
	}
	
}
