package com.atmecs.assessment.validations;

import org.testng.Assert;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.logreport.LogReport;

public class BreadCumValidation extends TestBase {
	public void breadcumvalid() {
		Findloc loc = new Findloc();
		LogReport log = new LogReport();
		boolean content = CommonUtlity.isDisplayed(loc.getlocator("loc.blog.content.text"));
		Assert.assertEquals(content, true, "content dosent exist");
		log.info("content is there");
		boolean ai = CommonUtlity.isDisplayed(loc.getlocator("loc.blog.ai.link"));
		Assert.assertEquals(ai, true, "ai dosent exist");
		log.info("ai is there");
		boolean home = CommonUtlity.isDisplayed(loc.getlocator("loc.blog.home.link"));
		Assert.assertEquals(home, true, "homedosent exist");
		log.info("home is there");
		String actual = CommonUtlity.getElement(loc.getlocator("loc.1sblog.name.bfreadcum.txt")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, ValidateData.getData("blog1breadcumText"), "wrong text");
	    log.info("sucessfully validated");
		
	}


}
