package com.realdolmen.helloworld;

import org.slf4j.*;

public class LoggerClass {
	
	final Logger logger = LoggerFactory.getLogger(LoggerClass.class);
	
	public boolean execute()
	{
		logger.info("Logging execution");
		return true;
	}
}
