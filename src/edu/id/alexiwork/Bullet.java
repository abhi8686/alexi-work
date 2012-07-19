package edu.id.alexiwork;

public class Bullet {
	private double xVel, yVel, xPos, yPos;
	private int lifeTime;

	Bullet()
	{
		xVel = 0.0;
		yVel = 0.0;
		xPos = 0.0;
		yPos = 0.0;
		lifeTime = 0;
	}

	Bullet(double xVel, double yVel, double xPos, double yPos, int lifeTime)
	{
		this.xVel = xVel;
		this.yVel = yVel;
		this.xPos = xPos;
		this.yPos = yPos;
		this.lifeTime = lifeTime;
	}

	public void update(int scrnWidth, int scrnHeight)
	{
		xPos = xPos + xVel;
		yPos = yPos + yVel;
		lifeTime--;		
		if(xPos<0)
			xPos += scrnWidth;
		else if(xPos>scrnWidth) 
			xPos -= scrnWidth; 
		if(yPos<0) 
			yPos += scrnHeight; 
		else if(yPos>scrnHeight) 
			yPos -= scrnHeight; 

	}

	public boolean isDead()
	{
		if (lifeTime <= 0){
			return true;
		}
		else {
			return false;
		}
	}


	public double getxVel() {
		return xVel;
	}

	public int getLifeTime() {
		return lifeTime;
	}

	public void setLifeTime(int lifeTime) {
		this.lifeTime = lifeTime;
	}

	public void setxVel(double xVel) {
		this.xVel = xVel;
	}

	public double getyVel() {
		return yVel;
	}

	public void setyVel(double yVel) {
		this.yVel = yVel;
	}

	public double getxPos() {
		return xPos;
	}

	public void setxPos(double xPos) {
		this.xPos = xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setyPos(double yPos) {
		this.yPos = yPos;
	}

}
