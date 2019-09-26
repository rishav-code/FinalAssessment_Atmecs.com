package com.atmecs.assessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.validations.FootersValidation;
import com.atmecs.assessment.validations.ServiceAvailableValidation;

public class HomePage extends TestBase {
	ServiceAvailableValidation sav = new ServiceAvailableValidation();
	FootersValidation fvs = new FootersValidation();
	@Test
	public void selectServices() {
		
		Findloc loc = new Findloc();
		Actions action = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath(loc.getlocator("loc.services.dpdn")));
		Action mouseover = action.moveToElement(wb).build();
		mouseover.perform();
		sav.validateServiceDpdn();
		fvs.servicesValidation();
		fvs.siteMapValidation();
		
		CommonUtlity.isElementVisible(loc.getlocator("loc.digitallife.dpdn"));
		CommonUtlity.clickOnElement(loc.getlocator("loc.digitallife.dpdn"));
		
	}
}

