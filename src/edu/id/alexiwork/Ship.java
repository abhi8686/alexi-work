package edu.id.alexiwork;

import java.awt.event.KeyEvent;


public class Ship {
	public static final double DEG2RAD =  Math.PI/180;
	
	private double x;
	private double y;
	private double rotation = 0;
	private double posX;
	private double velX, velY;
	
	public void move(double rotation, int scrnHeight, int scrnWidth)
	{
		
		this.y += Math.cos(rotation * DEG2RAD);
		this.x -= Math.sin(rotation * DEG2RAD);
		if(x<0)
		    x+=scrnWidth;
		else if(x>scrnWidth) 
		    x-=scrnWidth; 
		if(y<0) 
		    y+=scrnHeight; 
		else if(y>scrnHeight) 
		    y-=scrnHeight; 
	}
	public double getRotation()
	{
		return rotation;
	}
	public double getX() 
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getVelX() {
		return velX;
	}
	public void setVelX(double velX) {
		this.velX = velX;
	}
	public double getVelY() {
		return velY;
	}
	public void setVelY(double velY) {
		this.velY = velY;
	}
}
