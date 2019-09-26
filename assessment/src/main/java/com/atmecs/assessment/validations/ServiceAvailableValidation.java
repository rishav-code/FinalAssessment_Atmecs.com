package com.atmecs.assessment.validations;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.logreport.LogReport;

public class ServiceAvailableValidation extends TestBase {
	public void validateServiceDpdn() {
		Findloc loc = new Findloc();
		ValidateData validdata = new ValidateData();
		
		LogReport log = new LogReport();

		WebElement key = CommonUtlity.getElement( loc.getlocator("loc.services.dpdn"));
		String element = key.getText();
		
		log.info("Redirection validation");
		System.out.println(element);
		Assert.assertEquals(element, ValidateData.getData("ServiceTitle"),
				"Homepage redirection is not successfull");
		log.info("Successfully redirected to Homepage");
	}

}
