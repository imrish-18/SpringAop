package com.springAspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspect.service.FactoryService;
import com.aspect.service.ShapeService;

public class AspectDemo {

	public static void main(String[] args) {
		/*
		 * ApplicationContext ctx=new ClassPathXmlApplicationContext("aspect.xml");
		 * ShapeService service=ctx.getBean("shapeService",ShapeService.class);
		 */
		FactoryService facatoryService=new FactoryService();
		ShapeService service=(ShapeService) facatoryService.getBean("shapeService");
 //service.getAngle().setName("rish")	;
service.getCircle();
/*.setNameAndReturn("jason roy");*/
 //System.out.println(service.getAngle().getName());
// System.out.println(service.getCircle().getName());
	}

}




