package com.mphasis.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// load the dispatcher servlet
public class AppDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("get servlet config classes");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("get servlet mapping");
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
