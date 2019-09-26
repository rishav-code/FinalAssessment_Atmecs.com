package com.atmecs.assessment.testscripts;

import org.testng.annotations.Test;

import com.atmecs.assessment.pages.HomePage;
import com.atmecs.assessment.validations.ServiceAvailableValidation;
@Test(priority=1)
public class HomepageScript {
	public void homepagescripttest() {
		HomePage hp =new HomePage();
		ServiceAvailableValidation sav = new ServiceAvailableValidation();
		hp.selectServices();
		sav.validateServiceDpdn();
	}

}
