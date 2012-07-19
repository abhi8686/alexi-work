package edu.id.alexiwork;
import java.awt.event.KeyEvent;


public class GameClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StdDraw.setCanvasSize(1200, 900);
		StdDraw.setXscale(0, 900);
		StdDraw.setYscale(0, 1200);

		Ship s = new Ship(); 
		Asteroid a = new Asteroid();

		double x = 600;
		double y = 450;

		double speed = 1;
		x += speed;
		y += speed;


		double rotation = 0;

		double direction;

		int counter = 0;

		while (true) {
			if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
				rotation += 1;
			}else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
				rotation -= 1;
			}else if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){

				s.move(rotation);
			}

			StdDraw.clear();
			StdDraw.picture(s.getX(), s.getY(), "Ship1.jpg", rotation);
			rotation %= 360;

			StdDraw.picture(x += speed, y += speed, "Asteroids.jpg", rotation );

			if (counter % 50 == 0) {
				Asteroid b = new Asteroid();
				
			}
			counter ++;

			StdDraw.show(0);


		}

	}




}


