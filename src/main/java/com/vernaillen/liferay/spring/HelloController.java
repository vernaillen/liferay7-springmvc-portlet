package com.vernaillen.liferay.spring;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.vernaillen.liferay.model.User;
import com.vernaillen.liferay.service.HelloService;
import com.vernaillen.liferay.util.LiferayUtil;

@Controller("liferay7-springmvc-portlet")
@RequestMapping("view")
public class HelloController {

    @Autowired
    private HelloService service;
    
    @RenderMapping
    public ModelAndView handleRenderRequest(RenderRequest request, RenderResponse response) throws PortalException {
    	        
        User user = LiferayUtil.getCurrentUser(request);
        
        service.sayHelloToTheLogs(user);

        ModelAndView model = new ModelAndView("view");
        model.addObject("user", user);
        return model;
    }
}
