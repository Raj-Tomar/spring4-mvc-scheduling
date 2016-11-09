package com.raj.jobs;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * An asynchronous worker
 */
@Component("asyncWorker")
public class AsyncWorker implements Worker {

	protected static Logger logger = Logger.getLogger(AsyncWorker.class);
	
	/**
	 * This method will be wrapped in a proxy so that the method is 
	 * actually invoked by a TaskExecutor instance
	 */
	@Async
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
