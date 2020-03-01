import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ThreeCardPokerGame extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		primaryStage.setTitle("Let's Play Three Card Poker!!!");
		
		Scene scene = new Scene(new HBox(),1200,1200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}


}
