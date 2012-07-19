package edu.id.alexiwork;
public class Asteroid {

	private double dx;
	private double dy;
	private double x;
	private double y;
	private double height;
	private double width;
	int numAsteroids;


	public Asteroid(double x,double y,double minVelocity,double maxVelocity,double height, double width){ 
		
		//breaks up into when shot
		//calculates a random direction and a random 
		//velocity between minVelocity and maxVelocity
		double vel=minVelocity + Math.random()*(maxVelocity-minVelocity), 
		dir=2*Math.PI*Math.random(); // random direction
		dx=vel*Math.cos(dir); 
		dy=vel*Math.sin(dir);
		this.height = height;
		this.width = width;
	}
public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setY(double y) {
		this.y = y;
	}
	//66, 103
	public boolean checkCollisions(Bullet bill)
	{
		double billTop = bill.getyPos() + 5;
		double billBottom = bill.getyPos() - 5;
		double billLeft = bill.getxPos() - 5;
		double billRight = bill.getxPos() + 5;
		
		double top = y + 103;
		double bottom = y - 103;
		double left = x - 66;
		double right = x + 66;
		
		if (billBottom < top && billTop > bottom){
			if (billRight < right && billLeft > left){
				return true;
			}
		}
		return false;
	}
	
	public void move(int scrnHeight, int scrnWidth){
		x += dx;
		y += dy;

		if(x<0)
			x+=scrnWidth;
		else if(x>scrnWidth) 
			x-=scrnWidth; 
		if(y<0) 
			y+=scrnHeight; 
		else if(y>scrnHeight) 
			y-=scrnHeight; 
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
	public void split(Asteroid a) {
		a.setWidth(a.getWidth() / 2);
		a.setHeight(a.getHeight() /2);
		
	}
}
