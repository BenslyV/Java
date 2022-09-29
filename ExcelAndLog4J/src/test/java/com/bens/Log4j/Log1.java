package com.bens.Log4j;

import org.apache.log4j.Logger;

public class Log1 {

	public void main(String... args) {
		Logger log = Logger.getLogger(Log1.class.getName());
		// TODO Auto-generated method stub
		// Logger log = Logger.getLogger("Logger1.class");
		log.info("info print");
		log.trace("trace print");
		log.error("error print");
		log.fatal("fatal print");
		log.debug("Deubg Print");

	}
}
