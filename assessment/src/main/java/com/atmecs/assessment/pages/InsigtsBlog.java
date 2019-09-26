package com.atmecs.assessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.logreport.LogReport;
import com.atmecs.assessment.validations.BreadCumValidation;

public class InsigtsBlog extends TestBase{
	@Test
	public void selectBlog() throws InterruptedException {
		
		LogReport log = new LogReport();
		BreadCumValidation bcv = new BreadCumValidation ();
		
	
		Findloc loc = new Findloc();
		Actions action = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath(loc.getlocator("loc.insigts.footer.click")));
		Action mouseover = action.moveToElement(wb).build();
		mouseover.perform();
		
		CommonUtlity.isElementVisible(loc.getlocator("loc.blog.click"));
		CommonUtlity.clickOnElement(loc.getlocator("loc.blog.click"));
		
		CommonUtlity.clickOnElement(loc.getlocator("loc.1stblog.click"));
		Thread.sleep(3000);
		bcv.breadcumvalid();
		CommonUtlity.scrollDownPage(300);
		CommonUtlity.clickOnElement(loc.getlocator("loc.blog.submit.btn"));
		String popup= driver.switchTo().alert().getText();
		System.out.println(popup);
		
}
}