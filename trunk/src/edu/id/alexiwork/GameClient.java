package edu.id.alexiwork;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GameClient {

	public static final double DEG2RAD =  Math.PI/180;
	/**
	 * @param args
	 */
	static ArrayList<Asteroid> Asteroids = new ArrayList();
	static ArrayList<Bullet> Bullets = new ArrayList();


	public static void main(String[] args) {
		StdDraw.setCanvasSize(1200, 900);
		StdDraw.setXscale(0, 900);
		StdDraw.setYscale(0, 1200);

		Bullet b = new Bullet();
		Ship s = new Ship(); 

		boolean spaceBar = false; //because [Space Bar] its not up when we start the program

		double x = 600;
		double y = 450;
		double dx, maxV, minV;
		double speed = 1;
		x += speed;
		y += speed;

		for (int i = 0; i < 5; i++){
			Asteroid a = new Asteroid (10, 10, .5, 2, 132, 206);
			Asteroids.add(a);
		}

		double rotation = 0;

		//	double direction = s.move(rotation);

		int counter = 0;

		while (true) {
			if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
				rotation += 1;
			}else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
				rotation -= 1;
			}else if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
				s.move(rotation, 1200, 900);
			}else if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){
				if (Bullets.size() <= 3) {
					if (!spaceBar) //if its not true or false||it is down
					{
						b = new Bullet(-Math.sin(rotation * DEG2RAD) * 4, Math.cos(rotation * DEG2RAD) * 4, s.getX(), s.getY(), 250); //then make bullet
						Bullets.add(b); //add bullet
						spaceBar = true; //tells program that its already down, and to not go through the loop again
					}
				}else {}
			}else if (!StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) //when space is up
			{
				spaceBar = false; //tells the program that it is up, which allows the loop to be enabled again
			}


			for (int i = 0; i < Asteroids.size(); i++){
				Asteroids.get(i).move(1200, 900);
				for (int j = Bullets.size() - 1; j > -1; j--)
				{
					if (Asteroids.get(i).checkCollisions(Bullets.get(j)) == true){
						Asteroids.get(i).split(Asteroids.get(i));
						Bullets.remove(j);
					}
				}
			}

			StdDraw.clear();
			StdDraw.picture(s.getX(), s.getY(), "Ship1.jpg", rotation);
			for (int i = 0; i < Asteroids.size(); i++){
				StdDraw.picture(Asteroids.get(i).getX(), Asteroids.get(i).getY(), "Asteroids.png", Asteroids.get(i).getHeight(), Asteroids.get(i).getWidth());

			}

			for (int i = Bullets.size() - 1; i > -1; i--) //-1 shifts the array size to 0, count backwards to avoid shifting the whole array
			{
				if (!Bullets.get(i).isDead())
				{
					StdDraw.picture(Bullets.get(i).getxPos(), Bullets.get(i).getyPos(), "Bullet.png");
					Bullets.get(i).update(900, 1200);
				} 
				else {
					Bullets.remove(i);
				}

			}
			rotation %= 360;

			counter ++;
			StdDraw.show(1);
		}
	}
}


