package com.atmecs.assessment.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.assessment.constant.log.FilePath;
import com.atmecs.assessment.util.ProvideData;

public class TestDataInputOne {
	@DataProvider(name = "")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE, 2);
		Object[][] getData = provideData.provideData();
		return getData;
	}


}
