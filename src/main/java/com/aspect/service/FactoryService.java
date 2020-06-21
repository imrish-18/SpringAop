package com.aspect.service;

import com.aspect.model.Circle;
import com.aspect.model.Triangle;

public class FactoryService {

	
	public Object getBean(String beanType)
	{
		if(beanType.equals("shapeService")) return new ShapeService();
		if(beanType.equals("triangle")) return new Triangle();
		if(beanType.equals("circle")) return new Circle();
		return null;
	}
}
