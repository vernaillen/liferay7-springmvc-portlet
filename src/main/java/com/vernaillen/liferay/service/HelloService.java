package com.vernaillen.liferay.service;

import org.springframework.stereotype.Service;

import com.vernaillen.liferay.model.Hello;

@Service
public class HelloService {

	public Hello sayHello() {

        Hello hello = new Hello();
        hello.setMessage("Hello from model object");
        
        return hello;
	}
}
