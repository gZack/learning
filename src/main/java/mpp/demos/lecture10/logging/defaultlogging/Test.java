package mpp.demos.lecture10.logging.defaultlogging;

import java.util.logging.Logger;

public class Test {

	public static void main(String[] args) {
		LogSetup.setup();
		Logger log = Logger.getGlobal();
		log.config("test debug");
		log.info("test filehandler");
		

	}

}
