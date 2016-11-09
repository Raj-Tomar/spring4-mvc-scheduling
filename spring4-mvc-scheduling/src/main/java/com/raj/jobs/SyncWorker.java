package com.raj.jobs;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * A synchronous worker
 */
@Component("syncWorker")
public class SyncWorker implements Worker {

	protected static Logger logger = Logger.getLogger(SyncWorker.class);

	public void work() {
		String threadName = Thread.currentThread().getName();
		logger.info("   " + threadName + " has began working.");
        try {
        	logger.info("working...");
            Thread.sleep(10000); // simulates work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        logger.info("   " + threadName + " has completed work.");
	}
	
}
