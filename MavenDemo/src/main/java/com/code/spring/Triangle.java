package com.code.spring;

import java.util.List;

public class Triangle {
	private Point pointA;
	private List<Point> points;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw(){
		System.out.println("PointA: ("+pointA.getX() +","+pointA.getY()+")");
		System.out.println("PointB: ("+points.get(0).getX()+","+points.get(0).getY()+")");
		System.out.println("PointC: ("+points.get(1).getX()+","+points.get(1).getY()+")");		
		
	}
}
