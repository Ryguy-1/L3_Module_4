package threads;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		
		Robot r1 = new Robot(400,300);
		Robot r2 = new Robot(600,600);
		Robot r3 = new Robot(800,300);
		Robot r4 = new Robot(1000,600);
		Robot r5 = new Robot(1200,300);
	new Thread(()->{
		
		r1.penDown();
		r1.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			r1.move(4);
			r1.turn(1);
		}
	}).start();
	new Thread(()->{
		
		r2.penDown();
		r2.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			r2.move(4);
			r2.turn(1);
		}
	}).start();
	new Thread(()->{
		
		r3.penDown();
		r3.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			r3.move(4);
			r3.turn(1);
		}
	}).start();
	new Thread(()->{
		
		r4.penDown();
		r4.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			r4.move(4);
			r4.turn(1);
		}
	}).start();
	new Thread(()->{
		
		r5.penDown();
		r5.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			r5.move(4);
			r5.turn(1);
		}
	}).start();
}
}

