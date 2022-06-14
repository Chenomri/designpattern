package Default;

import Model.Containerr;
import Model.LoadingDock;
import Model.Model;
import Model.SeaPort;
import Model.Ship;
import Model.Track;
import View.MainView;
import View.SeaPortView;
import View.TrackView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Model model= new Model("Tel-aviv", "Israel");//Create a new seaport
		model.addShipToPort();
		MainView MainView = new MainView(model, stage);
		
		Controller controller= new Controller(model,MainView);
		
	
		
		
	
		
	}

}
