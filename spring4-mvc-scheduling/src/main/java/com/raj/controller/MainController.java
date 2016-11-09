package com.raj.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles and retrieves main requests
 */
@Controller
public class MainController {

	protected static Logger logger = Logger.getLogger(MainController.class);
	
	/**
	 * Handles and retrieves the common JSP page that everyone can see
	 * 
	 * @return the name of the JSP page
	 */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCommonPage() {
    	logger.info("Received request to show welcome page");
    
    	// Do your work here. Whatever you like
    	// i.e call a custom service to do your business
    	// Prepare a model to be used by the JSP page
    	
    	// This will resolve to /WEB-INF/jsp/welcomepage.jsp
    	return "welcomepage";
	}
   
}
