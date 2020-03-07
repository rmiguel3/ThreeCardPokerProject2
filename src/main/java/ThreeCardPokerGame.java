import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ThreeCardPokerGame extends Application {

	public static void main(String[] args) {
		//System.out.println("Welcome to Three Card Poker!\n");
		//System.out.println("Let's start");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Spades Image Objects:
		Image spades2 = new Image("2S.png", 90, 150, true, true);
		ImageView spades2View = new ImageView(spades2);

		Image spades3 = new Image("3S.png", 90, 150, true, true);
		ImageView spades3View = new ImageView(spades3);

		Image spades4 = new Image("4S.png", 90, 150, true, true);
		ImageView spades4View = new ImageView(spades4);

		Image spades5 = new Image("5S.png", 90, 150, true, true);
		ImageView spades5View = new ImageView(spades5);

		Image spades6 = new Image("6S.png", 90, 150, true, true);
		ImageView spades6View = new ImageView(spades6);

		Image spades7 = new Image("7S.png", 90, 150, true, true);
		ImageView spades7View = new ImageView(spades7);

		Image spades8 = new Image("8S.png", 90, 150, true, true);
		ImageView spades8View = new ImageView(spades8);

		Image spades9 = new Image("9S.png", 90, 150, true, true);
		ImageView spades9View = new ImageView(spades9);

		Image spades10 = new Image("10S.png", 90, 150, true, true);
		ImageView spades10View = new ImageView(spades10);

		Image spadesJack = new Image("JS.png", 90, 150, true, true);
		ImageView spadesJackView = new ImageView(spadesJack);

		Image spadesQueen = new Image("QS.png", 90, 150, true, true);
		ImageView spadesQueenView = new ImageView(spadesQueen);

		Image spadesKing = new Image("KS.png", 90, 150, true, true);
		ImageView spadesKingView = new ImageView(spadesKing);

		Image spadesAce = new Image("AS.png", 90, 150, true, true);
		ImageView spadesAceView = new ImageView(spadesAce);

		// Hearts Image Objects:
		Image hearts2 = new Image("2H.png", 90, 150, true, true);
		ImageView hearts2View = new ImageView(hearts2);

		Image hearts3 = new Image("3H.png", 90, 150, true, true);
		ImageView hearts3View = new ImageView(hearts3);

		Image hearts4 = new Image("4H.png", 90, 150, true, true);
		ImageView hearts4View = new ImageView(hearts4);

		Image hearts5 = new Image("5H.png", 90, 150, true, true);
		ImageView hearts5View = new ImageView(hearts5);

		Image hearts6 = new Image("6H.png", 90, 150, true, true);
		ImageView hearts6View = new ImageView(hearts6);

		Image hearts7 = new Image("7H.png", 90, 150, true, true);
		ImageView hearts7View = new ImageView(hearts7);

		Image hearts8 = new Image("8H.png", 90, 150, true, true);
		ImageView hearts8View = new ImageView(hearts8);

		Image hearts9 = new Image("9H.png", 90, 150, true, true);
		ImageView hearts9View = new ImageView(hearts9);

		Image hearts10 = new Image("10H.png", 90, 150, true, true);
		ImageView hearts10View = new ImageView(hearts10);

		Image heartsJack = new Image("JH.png", 90, 150, true, true);
		ImageView heartsJackView = new ImageView(heartsJack);

		Image heartsQueen = new Image("QH.png", 90, 150, true, true);
		ImageView heartsQueenView = new ImageView(heartsQueen);

		Image heartsKing = new Image("KH.png", 90, 150, true, true);
		ImageView heartsKingView = new ImageView(heartsKing);

		Image heartsAce = new Image("AH.png", 90, 150, true, true);
		ImageView heartsAceView = new ImageView(heartsAce);

		// Clubs Image Objects:
		Image clubs2 = new Image("2C.png", 90, 150, true, true);
		ImageView clubs2View = new ImageView(clubs2);

		Image clubs3 = new Image("3C.png", 90, 150, true, true);
		ImageView clubs3View = new ImageView(clubs3);

		Image clubs4 = new Image("4C.png", 90, 150, true, true);
		ImageView clubs4View = new ImageView(clubs4);

		Image clubs5 = new Image("5C.png", 90, 150, true, true);
		ImageView clubs5View = new ImageView(clubs5);

		Image clubs6 = new Image("6C.png", 90, 150, true, true);
		ImageView clubs6View = new ImageView(clubs6);

		Image clubs7 = new Image("7C.png", 90, 150, true, true);
		ImageView clubs7View = new ImageView(clubs7);

		Image clubs8 = new Image("8C.png", 90, 150, true, true);
		ImageView clubs8View = new ImageView(clubs8);

		Image clubs9 = new Image("9C.png", 90, 150, true, true);
		ImageView clubs9View = new ImageView(clubs9);

		Image clubs10 = new Image("10C.png", 90, 150, true, true);
		ImageView clubs10View = new ImageView(clubs10);

		Image clubsJack = new Image("JC.png", 90, 150, true, true);
		ImageView clubsJackView = new ImageView(clubsJack);

		Image clubsQueen = new Image("QC.png", 90, 150, true, true);
		ImageView clubsQueenView = new ImageView(clubsQueen);

		Image clubsKing = new Image("KC.png", 90, 150, true, true);
		ImageView clubsKingView = new ImageView(clubsKing);

		Image clubsAce = new Image("AC.png", 90, 150, true, true);
		ImageView clubsAceView = new ImageView(clubsAce);

		// Diamonds Image Objects:
		Image diamonds2 = new Image("2D.png", 90, 150, true, true);
		ImageView diamonds2View = new ImageView(diamonds2);

		Image diamonds3 = new Image("3D.png", 90, 150, true, true);
		ImageView diamonds3View = new ImageView(diamonds3);

		Image diamonds4 = new Image("4D.png", 90, 150, true, true);
		ImageView diamonds4View = new ImageView(diamonds4);

		Image diamonds5 = new Image("5D.png", 90, 150, true, true);
		ImageView diamonds5View = new ImageView(diamonds5);

		Image diamonds6 = new Image("6D.png", 90, 150, true, true);
		ImageView diamonds6View = new ImageView(diamonds6);

		Image diamonds7 = new Image("7D.png", 90, 150, true, true);
		ImageView diamonds7View = new ImageView(diamonds7);

		Image diamonds8 = new Image("8D.png", 90, 150, true, true);
		ImageView diamonds8View = new ImageView(diamonds8);

		Image diamonds9 = new Image("9D.png", 90, 150, true, true);
		ImageView diamonds9View = new ImageView(diamonds9);

		Image diamonds10 = new Image("10D.png", 90, 150, true, true);
		ImageView diamonds10View = new ImageView(diamonds10);

		Image diamondsJack = new Image("JD.png", 90, 150, true, true);
		ImageView diamondsJackView = new ImageView(diamondsJack);

		Image diamondsQueen = new Image("QD.png", 90, 150, true, true);
		ImageView diamondsQueenView = new ImageView(diamondsQueen);

		Image diamondsKing = new Image("KD.png", 90, 150, true, true);
		ImageView diamondsKingView = new ImageView(diamondsKing);


		Image diamondsAce = new Image("AD.png", 90, 150, true, true);
		ImageView diamondsAceView = new ImageView(diamondsAce);

		Image purpleCardBack = new Image("purple_back.png", 90, 150, true, true);
		ImageView purpleCardBackView = new ImageView(purpleCardBack);

		Image purpleCardBack2 = new Image("purple_back.png", 90, 150, true, true);
		ImageView purpleCardBackView2 = new ImageView(purpleCardBack2);

		Image purpleCardBack3 = new Image("purple_back.png", 90, 150, true, true);
		ImageView purpleCardBackView3 = new ImageView(purpleCardBack3);

		Image purpleCardBack4 = new Image("purple_back.png", 90, 150, true, true);
		ImageView purpleCardBackView4 = new ImageView(purpleCardBack4);

		Image purpleCardBack5 = new Image("purple_back.png", 90, 150, true, true);
		ImageView purpleCardBackView5 = new ImageView(purpleCardBack5);

		Image purpleCardBack6 = new Image("purple_back.png", 90, 150, true, true);
		ImageView purpleCardBackView6 = new ImageView(purpleCardBack6);

		Image purpleCardBack7 = new Image("purple_back.png", 90, 150, true, true);
		ImageView purpleCardBackView7 = new ImageView(purpleCardBack7);

		Image purpleCardBack8 = new Image("purple_back.png", 90, 150, true, true);
		ImageView purpleCardBackView8 = new ImageView(purpleCardBack8);

		Image purpleCardBack9 = new Image("purple_back.png", 90, 150, true, true);
		ImageView purpleCardBackView9 = new ImageView(purpleCardBack9);

		primaryStage.setTitle("Let's Play Three Card Poker!!!");

		BorderPane defaultSceneBorderPane = new BorderPane();

		Menu menu = new Menu("Options");

		MenuItem exit = new MenuItem("Exit");
		exit.setOnAction(e -> Platform.exit());
		MenuItem freshStart = new MenuItem("Fresh Start");
		MenuItem newLook = new Menu("New Look");

		menu.getItems().add(exit);
		menu.getItems().add(freshStart);
		menu.getItems().add(newLook);

		MenuBar bar = new MenuBar();

		bar.getMenus().add(menu);

		defaultSceneBorderPane.setTop(bar);


		BackgroundImage myBI= new BackgroundImage(new Image("green background.jpg",1920,1080,true,true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,  BackgroundSize.DEFAULT);

		HBox player1Card1 = new HBox(purpleCardBackView);
		HBox player1Card2 = new HBox(purpleCardBackView2);
		HBox player1Card3 = new HBox(purpleCardBackView3);

		HBox player2Card1 = new HBox(purpleCardBackView4);
		HBox player2Card2 = new HBox(purpleCardBackView5);
		HBox player2Card3 = new HBox(purpleCardBackView6);

		HBox dealerCard1 = new HBox(purpleCardBackView7);
		HBox dealerCard2 = new HBox(purpleCardBackView8);
		HBox dealerCard3 = new HBox(purpleCardBackView9);


		HBox player1 = new HBox(10,player1Card1, player1Card2, player1Card3);
		HBox player2 = new HBox(10,player2Card1, player2Card2, player2Card3);
		HBox dealer = new HBox(10,dealerCard1, dealerCard2, dealerCard3);


		Pane pane = new Pane();
		TextField gameNotes = new TextField();
		gameNotes.setPrefWidth(250);
		defaultSceneBorderPane.setLeft(gameNotes);

		TextField playerOneBet = new TextField();
		TextField playerOnePP = new TextField();
		Button playerOneBtn = new Button();
		Button playerOneBtn2 = new Button();
		playerOneBtn.setText("Ante/Play Bet");
		playerOneBtn2.setText("Pair Plus Bet");
		playerOneBet.setPrefWidth(100);
		playerOnePP.setPrefWidth(100);

		HBox playerOneBets = new HBox(100, playerOneBet, playerOnePP);
		HBox playerOneBtns = new HBox(100, playerOneBtn, playerOneBtn2);
		pane.getChildren().add(playerOneBets);
		pane.getChildren().add(playerOneBtns);
		playerOneBtns.relocate(100,680);
		playerOneBets.relocate(100, 650);

		TextField playerTwoBet = new TextField();
		TextField playerTwoPP = new TextField();
		Button playerTwoBtn = new Button();
		Button playerTwoBtn2 = new Button();
		playerTwoBtn.setText("Ante/Play Bet");
		playerTwoBtn2.setText("Pair Plus Bet");
		playerTwoBet.setPrefWidth(100);
		playerTwoPP.setPrefWidth(100);

		HBox playerTwoBets = new HBox(100, playerTwoBet, playerTwoPP);
		HBox playerTwoBtns = new HBox(100, playerTwoBtn, playerTwoBtn2);
		pane.getChildren().add(playerTwoBets);
		pane.getChildren().add(playerTwoBtns);
		playerTwoBtns.relocate(700,680);
		playerTwoBets.relocate(700, 650);

		pane.getChildren().add(player1);
		pane.getChildren().add(player2);
		pane.getChildren().add(dealer);
		player1.relocate(100,500);
		player2.relocate(700, 500);
		dealer.relocate(400, 100);

		Background background = new Background(myBI);
		pane.setBackground(background);

		defaultSceneBorderPane.setCenter(pane);

		Scene defaultScene = new Scene(defaultSceneBorderPane,1500,1100);

		primaryStage.setScene(defaultScene);
		primaryStage.show();

//		EventHandler<ActionEvent> handler1 = new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//
//			}
//		}
	}


}
