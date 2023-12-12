/*
 * A class responsible for the user interface and starting the meal.
 * Last update 12/12/23
 */
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class PhilosophersFeastController {

    @FXML
    private ImageView philo4;
    @FXML
    private ImageView philo3;
    @FXML
    private ImageView philo2;
    @FXML
    private ImageView philo1;
    @FXML
    private ImageView philo0;
    @FXML
    private ImageView hun4;
    @FXML
    private ImageView hun3;
    @FXML
    private ImageView hun2;
    @FXML
    private ImageView hun1;
    @FXML
    private ImageView hun0;
    @FXML
    private ImageView s0;
    @FXML
    private ImageView s1;
    @FXML
    private ImageView s3;
    @FXML
    private ImageView s4;
    @FXML
    private ImageView s2;


	public void initialize() {
		startFeast();
	}

	public void startFeast() {
		final int NUM_OF_PHILOS = 5;
		Philosopher[] philosophers = new Philosopher[NUM_OF_PHILOS];
		ImageView[] ss = {s0, s1, s2, s3, s4};
		Sticks stick = new Sticks(NUM_OF_PHILOS, ss);
		ImageView[] huns = {hun0, hun1, hun2, hun3, hun4}; //Status update images for understanding the steps

		for(int i = 0; i < philosophers.length ; i++) {
			philosophers[i] = new Philosopher(i, NUM_OF_PHILOS, stick, huns[i]);	
		}

		for(int i = 0; i < philosophers.length ; i++) { 
			philosophers[i].start();
		}
	}

}
