/*
 * A class responsible for the user interface and starting the meal.
 * Last update 12/12/23
 */
import java.util.Random;
import javafx.scene.image.ImageView;

public class Philosopher  extends Thread {

	private final int TIME = 10 * 1000; //Maximum time for a meal - 10 seconds
	private int id;
	private int numOfPhilosophers;
	private Sticks sticks;
	private ImageView ps;



	public Philosopher(int id, int numOfPhilosophers, Sticks sticks, ImageView ps) {
		this.id = id;
		this.numOfPhilosophers = numOfPhilosophers;
		this.sticks = sticks;
		this.ps = ps;
	}

	@Override
	public void run() {
		super.run();
		int stick1 = id, stick2 = (id+1) % numOfPhilosophers;
		if (stick1>stick2) {
			int temp = stick1;
			stick1 = stick2;
			stick2 = temp;
		}
			
		while (true) {
			startEating(stick1, stick2);
            System.out.println(id + "ate");
            finishEating(stick1, stick2);
            System.out.println(id + "released sticks");
            waitForTime(); //Thinking
            System.out.println(id + "stopped thinjing");	
		}	
	}

	private void startEating(int stick1, int stick2) {
		ps.setVisible(true);
		sticks.catchStick(id, stick1);
        System.out.println(id + "יhas 1 stick");
		sticks.catchStick(id, stick2);
        System.out.println(id + "יhas 2 sticks");
		waitForTime();
	}
	
	private void finishEating(int stick1, int stick2) {
		ps.setVisible(false);
		sticks.releaseSticks(id, stick1, stick2);	
	}
	
	public void waitForTime() {
		Random r = new Random();
		int MIN_TIME = 3 * 1000; //min time - 3 seconds
		
		try {
			sleep(r.nextInt(TIME + MIN_TIME));
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
}