package com.atmecs.assessment.logreport;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.atmecs.assessment.constant.log.FilePath;
import com.atmecs.assessment.constant.testbase.TestBase;

public class LogReport extends TestBase {
	Logger logger = null;

	public LogReport() {
		getlogger();
		logger = Logger.getLogger(LogReport.class.getName());
	}

	public void getlogger() {
		PropertyConfigurator.configure(FilePath.LOG4J_FILE);
	}

	
	public void info(String message) {
		logger.info(message);
	}

}
