package edu.id.alexiwork;
import java.awt.event.KeyEvent;


public class Test {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(1000, 900);
        StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 400);
       
     //   Ship moveShip = new Ship(); 
        
		
		double x = 300;
		double y = 200;
		
		double dx = 0;
		double dy = 0;
		double speed = 1;
		
		 speed = speed + dx;

	      x += speed;
	      y += dy;
		
		double DEG2RAD =  Math.PI/180;
		
		double rotation = 0;
		
		double direction;
		
		//double eX = sin(rotation);
		
		/*
		while (rotation <= 90 && rotation >= 0) {
			rotation -= 90;
		}
*/

		while (true) {
			if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
				rotation += 1;
				//x -= 1;
			}else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
				rotation -= 1;
				//x += 1;
			}else if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
				System.out.println(x + ", " + y);
				y += Math.cos(rotation * DEG2RAD);
				x -= Math.sin(rotation * DEG2RAD);
			}

			StdDraw.clear();
			StdDraw.picture(x, y, "Ship1.jpg", rotation );
			rotation %= 360;
			StdDraw.show(1);
		}
	}
	
		while (true) {
			
			StdDraw.clear();
			StdDraw.picture(x, y, "Ship1.jpg", rotation );
			StdDraw.show(1);
			
		}
	/*public double move()
		{
			x = dx += speed;
			y = 
		}
*/
}
