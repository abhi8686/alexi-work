package edu.id.alexiwork;

public class Asteroid {
	
	private double speed;
	private double dx;
	private double dy;
	private double x = Math.random() * 1200;
	private double y = Math.random() * 900;
	
	
	
	public Asteroid()
	{
		StdDraw.picture(x, y, "Asteroids.jpg");
		x = Math.random() * 1200;
		y = Math.random() * 900;
	}
	
	public void speedX(double x)
	{
		speed += x;
	}
	public void speedY(double y)
	{
		speed += y;
	}
	
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
}
