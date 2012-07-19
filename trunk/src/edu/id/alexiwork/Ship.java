package edu.id.alexiwork;
import java.awt.event.KeyEvent;


public class Ship {
	public static final double DEG2RAD =  Math.PI/180;
	
	public static void main(String [] args){
		
	}
	
	private double x;
	private double y;
	private double rotation = 0;
	private double posX;
	
	public void move(double rotation)
	{
		this.y += Math.cos(rotation * DEG2RAD);
		this.x -= Math.sin(rotation * DEG2RAD);
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
	/*public void setX(double x)
	{
		x = getX();
	}*/

}
