<<<<<<< HEAD
/*
 * The class represents all the sticks in the meal.
 * Last update 12/12/23
 */
import javafx.scene.image.ImageView;

public class Sticks {

	private boolean[] used;
	private int numOfSticks;
	private ImageView[] sticks; //An array of images for each stick

	//constructor
	public Sticks(int numOfSticks,  ImageView[] sticks) {
		this.numOfSticks = numOfSticks;
		used = new boolean[this.numOfSticks];
		this.sticks = sticks;
	}
	//Gets a philosopher number and a stick number and connects them
	public synchronized void catchStick(int pId, int stickNum) {
		drawChange(pId, stickNum, 100); //Moves the stick towards the philosopher, for illustration
		while (used[stickNum]==true) { //The specific stick in use
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//The specific stick was released	
		used[stickNum] = true; //The specific stick is caught again
	}

	//Gets a philosopher number and a stick number and releases them
	public synchronized void releaseSticks(int pId, int stick1, int stick2) {
		drawChange(pId, stick1, -100);//Moves the stick towards the philosopher, for illustration
		drawChange(pId, stick2, -100);

		used[stick1] = false;
		notifyAll();


		used[stick2] = false;
		notifyAll();

	}

	//Moves the stick in the direction of the philosopher, according to a calculation I thought up with my own eyes.
	private synchronized void drawChange(int pId, int stickNum, int size) {
		double x = sticks[stickNum].getX(),y = sticks[stickNum].getY(); //default values
		switch (pId) {
		case 0: {
			if (stickNum == 0) x+=size;
			if (stickNum == 1) y-=size;			
			break;
		}
		case 1: {
			if (stickNum == 2) y-=size;
			if (stickNum == 1) y+=size;			
			break;
		}
		case 2: {
			if (stickNum == 3) x+=size;
			if (stickNum == 2) y+=size;			
			break;
		}
		case 3: {
			if (stickNum == 3) x-=size;
			if (stickNum == 4) y+=size;			
			break;
		}
		case 4: {
			if (stickNum == 0) x-=size;
			if (stickNum == 4) y-=size;			
			break;
		}
		}

		sticks[stickNum].setX(x);
		sticks[stickNum].setY(y);		
	}

}
=======
/*
 * The class represents all the sticks in the meal.
 * Last update 12/12/23
 */
import javafx.scene.image.ImageView;

public class Sticks {

	private boolean[] used;
	private int numOfSticks;
	private ImageView[] sticks; //An array of images for each stick

	//constructor
	public Sticks(int numOfSticks,  ImageView[] sticks) {
		this.numOfSticks = numOfSticks;
		used = new boolean[this.numOfSticks];
		this.sticks = sticks;
	}
	//Gets a philosopher number and a stick number and connects them
	public synchronized void catchStick(int pId, int stickNum) {
		drawChange(pId, stickNum, 100); //Moves the stick towards the philosopher, for illustration
		while (used[stickNum]==true) { //The specific stick in use
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//The specific stick was released	
		used[stickNum] = true; //The specific stick is caught again
	}

	//Gets a philosopher number and a stick number and releases them
	public synchronized void releaseSticks(int pId, int stick1, int stick2) {
		drawChange(pId, stick1, -100);//Moves the stick towards the philosopher, for illustration
		drawChange(pId, stick2, -100);

		used[stick1] = false;
		notifyAll();


		used[stick2] = false;
		notifyAll();

	}

	//Moves the stick in the direction of the philosopher, according to a calculation I thought up with my own eyes.
	private synchronized void drawChange(int pId, int stickNum, int size) {
		double x = sticks[stickNum].getX(),y = sticks[stickNum].getY(); //default values
		switch (pId) {
		case 0: {
			if (stickNum == 0) x+=size;
			if (stickNum == 1) y-=size;			
			break;
		}
		case 1: {
			if (stickNum == 2) y-=size;
			if (stickNum == 1) y+=size;			
			break;
		}
		case 2: {
			if (stickNum == 3) x+=size;
			if (stickNum == 2) y+=size;			
			break;
		}
		case 3: {
			if (stickNum == 3) x-=size;
			if (stickNum == 4) y+=size;			
			break;
		}
		case 4: {
			if (stickNum == 0) x-=size;
			if (stickNum == 4) y-=size;			
			break;
		}
		}

		sticks[stickNum].setX(x);
		sticks[stickNum].setY(y);		
	}

}
>>>>>>> 86ea214af2bb1679b4414d0f940cb01828ecc034
