package com.atmecs.assessment.validations;

import org.testng.Assert;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.logreport.LogReport;

public class FootersValidation extends TestBase {
	Findloc loc = new Findloc();
	ValidateData validdata = new ValidateData();
	LogReport log = new LogReport();
	public void siteMapValidation() {
		boolean selection = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemap.footer.click"));
		Assert.assertEquals(selection, true, "sitemap dosent exist");
		log.info("Site map is there");
		boolean selection2 = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemep.home.click"));
		Assert.assertEquals(selection2, true, "home in sitemap option dosent exist");
		log.info("home in sitemap option  exist");
		boolean selection3 = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemap.aboutus.click"));
		Assert.assertEquals(selection3, true, "aboutus in sitemap option dosent exist");
		log.info("aboutus in sitemap option  exist");
		boolean selection4 = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemap.service.click"));
		Assert.assertEquals(selection4, true, "service in sitemap option dosent exist");
		log.info("service in sitemap option  exist");
		boolean selection5 = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemap.partners.click"));
		Assert.assertEquals(selection5, true, "partners in sitemap option dosent exist");
		log.info("partners in sitemap option  exist");
		boolean selection6 = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemap.casestudio.click"));
		Assert.assertEquals(selection6, true, "casestudio in sitemap option dosent exist");
		log.info("casestudio in sitemap option  exist");
		boolean selection7 = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemap.news.click"));
		Assert.assertEquals(selection7, true, "news in sitemap option dosent exist");
		log.info("news in sitemap option  exist");
		boolean selection8 = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemap.carrer.click"));
		Assert.assertEquals(selection8, true, "career in sitemap option dosent exist");
		log.info("carrer in sitemap option  exist");
		boolean selection9 = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemap.news.click"));
		Assert.assertEquals(selection9, true, "contactus in sitemap option dosent exist");
		log.info("contactus in sitemap option  exist");
		
		
		
	}
	public void servicesValidation() {
		boolean selection111 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.ai.click"));
		Assert.assertEquals(selection111, true, "ai in services option dosent exist");
		log.info("ai in services option  exist");
		boolean selection10 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.arvr.click"));
		Assert.assertEquals(selection10, true, "arvr in services option dosent exist");
		log.info("arvr in services option  exist");
		boolean selection11 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.qe.click"));
		Assert.assertEquals(selection11, true, "qe in services option dosent exist");
		log.info("qe in services option  exist");
		boolean selection12 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.blockchain.click"));
		Assert.assertEquals(selection12, true, "blockchain in services option dosent exist");
		log.info("blockchain in services option  exist");
		boolean selection13 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.robotic.click"));
		Assert.assertEquals(selection13, true, "robotic in services option dosent exist");
		log.info("robotic in services option  exist");
		boolean selection14 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.cloud.click"));
		Assert.assertEquals(selection14, true, "cloud in services option dosent exist");
		log.info("cloud in services option  exist");
		boolean selection15 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.ea.click"));
		Assert.assertEquals(selection15, true, "ea in services option dosent exist");
		log.info("ea in sitemap option  exist");
		boolean selection16 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.Ito.click"));
		Assert.assertEquals(selection16, true, "iot in services option dosent exist");
		log.info("iot in services option  exist");
		boolean selection17 = CommonUtlity.isDisplayed(loc.getlocator("loc.sitemap.news.click"));
		Assert.assertEquals(selection17, true, "news in services option dosent exist");
		log.info("news in services option  exist");
		boolean selection18 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.MC.click"));
		Assert.assertEquals(selection18, true, "mc in services option dosent exist");
		log.info("mc in services option  exist");
		boolean selection19 = CommonUtlity.isDisplayed(loc.getlocator("loc.services.pe.click"));
		Assert.assertEquals(selection19, true, "ai in services option dosent exist");
		log.info("ai in services option  exist");
		
	}

}
