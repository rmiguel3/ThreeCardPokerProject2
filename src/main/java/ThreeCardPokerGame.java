import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ThreeCardPokerGame extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Three Card Poker!\n");
		System.out.println("Let's start");
		//launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		primaryStage.setTitle("Let's Play Three Card Poker!!!");

		BorderPane defaultScenePane = new BorderPane();

		Menu menu = new Menu("Options");

		MenuItem m1 = new MenuItem("");

		Image card1 = new Image("AH.png", 100, 200, true, true);

		ImageView view1 = new ImageView(card1);

		Image card2 = new Image("AC.png", 100, 200, true, true);

		ImageView view2 = new ImageView(card2);

		BackgroundImage myBI= new BackgroundImage(new Image("green background.jpg",1920,1080,true,true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,  BackgroundSize.DEFAULT);

		HBox hbox = new HBox(100,view1, view2);

		Background background = new Background(myBI);
		hbox.setBackground(background);

		defaultScenePane.setCenter(hbox);

		Scene defaultScene = new Scene(defaultScenePane,1920,1200);

		primaryStage.setScene(defaultScene);
		primaryStage.show();
	}


}
