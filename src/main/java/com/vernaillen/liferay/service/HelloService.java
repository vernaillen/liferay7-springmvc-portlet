package com.vernaillen.liferay.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.vernaillen.liferay.model.User;

@Service
public class HelloService {

    private static final Log LOGGER = LogFactory.getLog(HelloService.class);
    
	public void sayHelloToTheLogs(User user) {

		if (user != null) {
			LOGGER.info("Hello " + user.getFirstName());
		}
	}
}
