package com.aspect.service;

import com.aspect.model.Circle;
import com.aspect.model.Triangle;
import com.springAspect.Loggable;

public class ShapeService {

	private Triangle angle;
	private Circle circle;
	public Triangle getAngle() {
		return angle;
	}
	public void setAngle(Triangle angle) {
		this.angle = angle;
	}
	@Loggable
	public Circle getCircle() {
		System.out.println("circle getter is called");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
