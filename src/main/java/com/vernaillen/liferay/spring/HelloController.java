package com.vernaillen.liferay.spring;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.vernaillen.liferay.service.HelloService;

@Controller("liferay7-springmvc-portlet")
@RequestMapping("view")
public class HelloController {

    private static final Log LOGGER = LogFactory.getLog(HelloController.class);

    @Autowired
    private HelloService service;
    
    @RenderMapping
    public ModelAndView handleRenderRequest(RenderRequest request, RenderResponse response) {
        LOGGER.info("Hello from the logs");

        ModelAndView model = new ModelAndView("view");
        model.addObject("hello", service.sayHello());        
        return model;
    }
}
