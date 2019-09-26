package com.atmecs.assessment.testscripts;

import org.testng.annotations.Test;

import com.atmecs.assessment.pages.InsigtsBlog;
import com.atmecs.assessment.validations.BreadCumValidation;
import com.atmecs.assessment.validations.FootersValidation;

public class InsightBlog {
	InsigtsBlog ib = new InsigtsBlog();
	BreadCumValidation bcv = new BreadCumValidation();
	FootersValidation fv =new FootersValidation();
	@Test(priority=2)
	public void insightBlogTest() throws InterruptedException {
		InsigtsBlog ib = new InsigtsBlog();
		ib.selectBlog();
		bcv.breadcumvalid();
		
		
	}

}
