import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
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
		//System.out.println("Welcome to Three Card Poker!\n");
		//System.out.println("Let's start");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		primaryStage.setTitle("Let's Play Three Card Poker!!!");

		BorderPane defaultScenePane = new BorderPane();

		Menu menu = new Menu("Options");

		MenuItem exit = new MenuItem("Exit");
		MenuItem freshStart = new MenuItem("Fresh Start");
		MenuItem newLook = new Menu("New Look");

		menu.getItems().add(exit);
		menu.getItems().add(freshStart);
		menu.getItems().add(newLook);

		MenuBar bar = new MenuBar();

		bar.getMenus().add(menu);

		defaultScenePane.setTop(bar);

		// Spades Image Objects:
		Image spades2 = new Image("2S.png", 125, 225, true, true);
		ImageView spades2View = new ImageView(spades2);

		Image spades3 = new Image("3S.png", 125, 225, true, true);
		ImageView spades3View = new ImageView(spades3);

		Image spades4 = new Image("4S.png", 125, 225, true, true);
		ImageView spades4View = new ImageView(spades4);

		Image spades5 = new Image("5S.png", 125, 225, true, true);
		ImageView spades5View = new ImageView(spades5);

		Image spades6 = new Image("6S.png", 125, 225, true, true);
		ImageView spades6View = new ImageView(spades6);

		Image spades7 = new Image("7S.png", 125, 225, true, true);
		ImageView spades7View = new ImageView(spades7);

		Image spades8 = new Image("8S.png", 125, 225, true, true);
		ImageView spades8View = new ImageView(spades8);

		Image spades9 = new Image("9S.png", 125, 225, true, true);
		ImageView spades9View = new ImageView(spades9);

		Image spades10 = new Image("10S.png", 125, 225, true, true);
		ImageView spades10View = new ImageView(spades10);

		Image spadesJack = new Image("JS.png", 125, 225, true, true);
		ImageView spadesJackView = new ImageView(spadesJack);

		Image spadesQueen = new Image("QS.png", 125, 225, true, true);
		ImageView spadesQueenView = new ImageView(spadesQueen);

		Image spadesKing = new Image("KS.png", 125, 225, true, true);
		ImageView spadesKingView = new ImageView(spadesKing);

		Image spadesAce = new Image("AS.png", 125, 225, true, true);
		ImageView spadesAceView = new ImageView(spadesAce);

		// Hearts Image Objects:
		Image hearts2 = new Image("2H.png", 125, 225, true, true);
		ImageView hearts2View = new ImageView(hearts2);

		Image hearts3 = new Image("3H.png", 125, 225, true, true);
		ImageView hearts3View = new ImageView(hearts3);

		Image hearts4 = new Image("4H.png", 125, 225, true, true);
		ImageView hearts4View = new ImageView(hearts4);

		Image hearts5 = new Image("5H.png", 125, 225, true, true);
		ImageView hearts5View = new ImageView(hearts5);

		Image hearts6 = new Image("6H.png", 125, 225, true, true);
		ImageView hearts6View = new ImageView(hearts6);

		Image hearts7 = new Image("7H.png", 125, 225, true, true);
		ImageView hearts7View = new ImageView(hearts7);

		Image hearts8 = new Image("8H.png", 125, 225, true, true);
		ImageView hearts8View = new ImageView(hearts8);

		Image hearts9 = new Image("9H.png", 125, 225, true, true);
		ImageView hearts9View = new ImageView(hearts9);

		Image hearts10 = new Image("10H.png", 125, 225, true, true);
		ImageView hearts10View = new ImageView(hearts10);

		Image heartsJack = new Image("JH.png", 125, 225, true, true);
		ImageView heartsJackView = new ImageView(heartsJack);

		Image heartsQueen = new Image("QH.png", 125, 225, true, true);
		ImageView heartsQueenView = new ImageView(heartsQueen);

		Image heartsKing = new Image("KH.png", 125, 225, true, true);
		ImageView heartsKingView = new ImageView(heartsKing);

		Image heartsAce = new Image("AH.png", 125, 225, true, true);
		ImageView heartsAceView = new ImageView(heartsAce);

		// Clubs Image Objects:
		Image clubs2 = new Image("2C.png", 125, 225, true, true);
		ImageView clubs2View = new ImageView(clubs2);

		Image clubs3 = new Image("3C.png", 125, 225, true, true);
		ImageView clubs3View = new ImageView(clubs3);

		Image clubs4 = new Image("4C.png", 125, 225, true, true);
		ImageView clubs4View = new ImageView(clubs4);

		Image clubs5 = new Image("5C.png", 125, 225, true, true);
		ImageView clubs5View = new ImageView(clubs5);

		Image clubs6 = new Image("6C.png", 125, 225, true, true);
		ImageView clubs6View = new ImageView(clubs6);

		Image clubs7 = new Image("7C.png", 125, 225, true, true);
		ImageView clubs7View = new ImageView(clubs7);

		Image clubs8 = new Image("8C.png", 125, 225, true, true);
		ImageView clubs8View = new ImageView(clubs8);

		Image clubs9 = new Image("9C.png", 125, 225, true, true);
		ImageView clubs9View = new ImageView(clubs9);

		Image clubs10 = new Image("10C.png", 125, 225, true, true);
		ImageView clubs10View = new ImageView(clubs10);

		Image clubsJack = new Image("JC.png", 125, 225, true, true);
		ImageView clubsJackView = new ImageView(clubsJack);

		Image clubsQueen = new Image("QC.png", 125, 225, true, true);
		ImageView clubsQueenView = new ImageView(clubsQueen);

		Image clubsKing = new Image("KC.png", 125, 225, true, true);
		ImageView clubsKingView = new ImageView(clubsKing);

		Image clubsAce = new Image("AC.png", 125, 225, true, true);
		ImageView clubsAceView = new ImageView(clubsAce);

		// Diamonds Image Objects:
		Image diamonds2 = new Image("2D.png", 125, 225, true, true);
		ImageView diamonds2View = new ImageView(diamonds2);

		Image diamonds3 = new Image("3D.png", 125, 225, true, true);
		ImageView diamonds3View = new ImageView(diamonds3);

		Image diamonds4 = new Image("4D.png", 125, 225, true, true);
		ImageView diamonds4View = new ImageView(diamonds4);

		Image diamonds5 = new Image("5D.png", 125, 225, true, true);
		ImageView diamonds5View = new ImageView(diamonds5);

		Image diamonds6 = new Image("6D.png", 125, 225, true, true);
		ImageView diamonds6View = new ImageView(diamonds6);

		Image diamonds7 = new Image("7D.png", 125, 225, true, true);
		ImageView diamonds7View = new ImageView(diamonds7);

		Image diamonds8 = new Image("8D.png", 125, 225, true, true);
		ImageView diamonds8View = new ImageView(diamonds8);

		Image diamonds9 = new Image("9D.png", 125, 225, true, true);
		ImageView diamonds9View = new ImageView(diamonds9);

		Image diamonds10 = new Image("10D.png", 125, 225, true, true);
		ImageView diamonds10View = new ImageView(diamonds10);

		Image diamondsJack = new Image("JD.png", 125, 225, true, true);
		ImageView diamondsJackView = new ImageView(diamondsJack);

		Image diamondsQueen = new Image("QD.png", 125, 225, true, true);
		ImageView diamondsQueenView = new ImageView(diamondsQueen);

		Image diamondsKing = new Image("KD.png", 125, 225, true, true);
		ImageView diamondsKingView = new ImageView(diamondsKing);

		Image diamondsAce = new Image("AD.png", 125, 225, true, true);
		ImageView diamondsAceView = new ImageView(diamondsAce);


		BackgroundImage myBI= new BackgroundImage(new Image("green background.jpg",1920,1080,true,true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,  BackgroundSize.DEFAULT);

		HBox hbox = new HBox(100,heartsAceView, spadesAceView);

		Background background = new Background(myBI);
		hbox.setBackground(background);

		defaultScenePane.setCenter(hbox);

		Scene defaultScene = new Scene(defaultScenePane,1920,1200);

		primaryStage.setScene(defaultScene);
		primaryStage.show();
	}


}
