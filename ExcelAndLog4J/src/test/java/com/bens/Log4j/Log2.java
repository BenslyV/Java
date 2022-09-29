package com.bens.Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log2 {

	// private static Logger log = LogManager.getLogger(Log2.class.getName());

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		// Logger log = LogManager.getLogger(Log2.class.getName());
		Logger log = Logger.getLogger(Log2.class.getName());
		log.setLevel(Level.ALL);
		//BasicConfigurator.configure();
		log.info("info print");

		log.trace("trace print");
		log.error("error print");
		log.fatal("fatal print");
		log.debug("Deubg Print");

		log.info("infomsg2");
		log.warn("print warn");
		
	}

}
