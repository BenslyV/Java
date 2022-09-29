package com.bens.Log4j;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4jXML {
	private static final Logger log =LogManager.getLogger(Log4jXML.class);
	public static void main(String[] args) {
		
		System.out.println("Execution started for log 4j Xml");
		log.info("info print");

		log.trace("trace print");
		log.error("error print");
		log.fatal("fatal print");
		log.debug("Deubg Print");

		log.info("infomsg2");
		log.warn("print warn");
		System.out.println("Execution Done");
	}

}
