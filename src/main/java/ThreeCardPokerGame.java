import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
import javafx.util.Duration;

public class ThreeCardPokerGame extends Application {

	public static void main(String[] args) {
		//System.out.println("Welcome to Three Card Poker!\n");
		//System.out.println("Let's start");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// S Image Objects:
		Image S2 = new Image("2S.png", 90, 150, true, true);
		ImageView S2View = new ImageView(S2);

		Image S3 = new Image("3S.png", 90, 150, true, true);
		ImageView S3View = new ImageView(S3);

		Image S4 = new Image("4S.png", 90, 150, true, true);
		ImageView S4View = new ImageView(S4);

		Image S5 = new Image("5S.png", 90, 150, true, true);
		ImageView S5View = new ImageView(S5);

		Image S6 = new Image("6S.png", 90, 150, true, true);
		ImageView S6View = new ImageView(S6);

		Image S7 = new Image("7S.png", 90, 150, true, true);
		ImageView S7View = new ImageView(S7);

		Image S8 = new Image("8S.png", 90, 150, true, true);
		ImageView S8View = new ImageView(S8);

		Image S9 = new Image("9S.png", 90, 150, true, true);
		ImageView S9View = new ImageView(S9);

		Image S10 = new Image("10S.png", 90, 150, true, true);
		ImageView S10View = new ImageView(S10);

		Image S11 = new Image("11S.png", 90, 150, true, true);
		ImageView S11View = new ImageView(S11);

		Image S12 = new Image("12S.png", 90, 150, true, true);
		ImageView S12View = new ImageView(S12);

		Image S13 = new Image("13S.png", 90, 150, true, true);
		ImageView S13View = new ImageView(S13);

		Image S14 = new Image("14S.png", 90, 150, true, true);
		ImageView S14View = new ImageView(S14);

		// H Image Objects:
		Image H2 = new Image("2H.png", 90, 150, true, true);
		ImageView H2View = new ImageView(H2);

		Image H3 = new Image("3H.png", 90, 150, true, true);
		ImageView H3View = new ImageView(H3);

		Image H4 = new Image("4H.png", 90, 150, true, true);
		ImageView H4View = new ImageView(H4);

		Image H5 = new Image("5H.png", 90, 150, true, true);
		ImageView H5View = new ImageView(H5);

		Image H6 = new Image("6H.png", 90, 150, true, true);
		ImageView H6View = new ImageView(H6);

		Image H7 = new Image("7H.png", 90, 150, true, true);
		ImageView H7View = new ImageView(H7);

		Image H8 = new Image("8H.png", 90, 150, true, true);
		ImageView H8View = new ImageView(H8);

		Image H9 = new Image("9H.png", 90, 150, true, true);
		ImageView H9View = new ImageView(H9);

		Image H10 = new Image("10H.png", 90, 150, true, true);
		ImageView H10View = new ImageView(H10);

		Image H11 = new Image("11H.png", 90, 150, true, true);
		ImageView H11View = new ImageView(H11);

		Image H12 = new Image("12H.png", 90, 150, true, true);
		ImageView H12View = new ImageView(H12);

		Image H13 = new Image("13H.png", 90, 150, true, true);
		ImageView HKingView = new ImageView(H13);

		Image H14 = new Image("14H.png", 90, 150, true, true);
		ImageView HAceView = new ImageView(H14);

		// C Image Objects:
		Image C2 = new Image("2C.png", 90, 150, true, true);
		ImageView C2View = new ImageView(C2);

		Image C3 = new Image("3C.png", 90, 150, true, true);
		ImageView C3View = new ImageView(C3);

		Image C4 = new Image("4C.png", 90, 150, true, true);
		ImageView C4View = new ImageView(C4);

		Image C5 = new Image("5C.png", 90, 150, true, true);
		ImageView C5View = new ImageView(C5);

		Image C6 = new Image("6C.png", 90, 150, true, true);
		ImageView C6View = new ImageView(C6);

		Image C7 = new Image("7C.png", 90, 150, true, true);
		ImageView C7View = new ImageView(C7);

		Image C8 = new Image("8C.png", 90, 150, true, true);
		ImageView C8View = new ImageView(C8);

		Image C9 = new Image("9C.png", 90, 150, true, true);
		ImageView C9View = new ImageView(C9);

		Image C10 = new Image("10C.png", 90, 150, true, true);
		ImageView C10View = new ImageView(C10);

		Image C11 = new Image("11C.png", 90, 150, true, true);
		ImageView C11View = new ImageView(C11);

		Image C12 = new Image("12C.png", 90, 150, true, true);
		ImageView C12View = new ImageView(C12);

		Image C13 = new Image("13C.png", 90, 150, true, true);
		ImageView C13View = new ImageView(C13);

		Image C14 = new Image("14C.png", 90, 150, true, true);
		ImageView C14View = new ImageView(C14);

		// D Image Objects:
		Image D2 = new Image("2D.png", 90, 150, true, true);
		ImageView D2View = new ImageView(D2);

		Image D3 = new Image("3D.png", 90, 150, true, true);
		ImageView D3View = new ImageView(D3);

		Image D4 = new Image("4D.png", 90, 150, true, true);
		ImageView D4View = new ImageView(D4);

		Image D5 = new Image("5D.png", 90, 150, true, true);
		ImageView D5View = new ImageView(D5);

		Image D6 = new Image("6D.png", 90, 150, true, true);
		ImageView D6View = new ImageView(D6);

		Image D7 = new Image("7D.png", 90, 150, true, true);
		ImageView D7View = new ImageView(D7);

		Image D8 = new Image("8D.png", 90, 150, true, true);
		ImageView D8View = new ImageView(D8);

		Image D9 = new Image("9D.png", 90, 150, true, true);
		ImageView D9View = new ImageView(D9);

		Image D10 = new Image("10D.png", 90, 150, true, true);
		ImageView D10View = new ImageView(D10);

		Image D11 = new Image("11D.png", 90, 150, true, true);
		ImageView D11View = new ImageView(D11);

		Image D12 = new Image("12D.png", 90, 150, true, true);
		ImageView D12View = new ImageView(D12);

		Image D13 = new Image("13D.png", 90, 150, true, true);
		ImageView D13View = new ImageView(D13);

		Image D14 = new Image("14D.png", 90, 150, true, true);
		ImageView D14View = new ImageView(D14);


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

		Image greenBackground = new Image("green background.jpg",1920,1080,true,true);

		Image cozmoPic = new Image("cozmo.jpg",1920,1080,true,true);

		Image dojoBackground = new Image("dojo_background.png", 1920, 1080, true,true);

		//Hallenbeck images
		Image Beck = new Image("HallenBeck.JPG", 90, 150, true, true);
		ImageView BeckView = new ImageView(Beck);

		Image Beck2 = new Image("HallenBeck.JPG", 90, 150, true, true);
		ImageView BeckView2 = new ImageView(Beck2);

		Image Beck3 = new Image("HallenBeck.JPG", 90, 150, true, true);
		ImageView BeckView3 = new ImageView(Beck3);

		Image Beck4 = new Image("HallenBeck.JPG", 90, 150, true, true);
		ImageView BeckView4 = new ImageView(Beck4);

		Image Beck5 = new Image("HallenBeck.JPG", 90, 150, true, true);
		ImageView BeckView5 = new ImageView(Beck5);

		Image Beck6 = new Image("HallenBeck.JPG", 90, 150, true, true);
		ImageView BeckView6 = new ImageView(Beck6);

		Image Beck7 = new Image("HallenBeck.JPG", 90, 150, true, true);
		ImageView BeckView7 = new ImageView(Beck7);

		Image Beck8 = new Image("HallenBeck.JPG", 90, 150, true, true);
		ImageView BeckView8 = new ImageView(Beck8);

		Image Beck9 = new Image("HallenBeck.JPG", 90, 150, true, true);
		ImageView BeckView9 = new ImageView(Beck9);

		primaryStage.setTitle("Let's Play Three Card Poker!!!");

		BorderPane defaultSceneBorderPane = new BorderPane();
		PauseTransition pause = new PauseTransition(Duration.seconds(2));

		//creating the options drop down menu
		Menu menu = new Menu("Options");

		//adding different types of options
		MenuItem exit = new MenuItem("Exit");
		exit.setOnAction(e -> Platform.exit());

		MenuItem freshStart = new MenuItem("Fresh Start");

		Menu newLook = new Menu("New Look");
		MenuItem cozmo = new MenuItem("Hallenbeck");
		MenuItem original = new MenuItem("Default");

		menu.getItems().add(exit);
		menu.getItems().add(freshStart);
		menu.getItems().add(newLook);
		newLook.getItems().add(cozmo);
		newLook.getItems().add(original);

		MenuBar bar = new MenuBar();

		bar.getMenus().add(menu);

		defaultSceneBorderPane.setTop(bar);

		// background images to be used:
		BackgroundImage greenFeltBackgroundImage= new BackgroundImage(greenBackground, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,  BackgroundSize.DEFAULT);
		BackgroundImage cozmoBackgroundImage= new BackgroundImage(cozmoPic, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,  BackgroundSize.DEFAULT);
		BackgroundImage dojoBackgroundImage= new BackgroundImage(dojoBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,  BackgroundSize.DEFAULT);

		//player 1's card backs
		HBox player1Card1 = new HBox(purpleCardBackView);
		HBox player1Card2 = new HBox(purpleCardBackView2);
		HBox player1Card3 = new HBox(purpleCardBackView3);

		//player 2's card backs
		HBox player2Card1 = new HBox(purpleCardBackView4);
		HBox player2Card2 = new HBox(purpleCardBackView5);
		HBox player2Card3 = new HBox(purpleCardBackView6);

		//Dealers's card backs
		HBox dealerCard1 = new HBox(purpleCardBackView7);
		HBox dealerCard2 = new HBox(purpleCardBackView8);
		HBox dealerCard3 = new HBox(purpleCardBackView9);

		//Adding the cards to each of their respected HBox
		HBox player1Cards = new HBox(55, player1Card1, player1Card2, player1Card3);
		HBox player2Cards = new HBox(55,player2Card1, player2Card2, player2Card3);
		HBox dealerCards = new HBox(55,dealerCard1, dealerCard2, dealerCard3);


		Pane pane = new Pane();
		TextField gameNotes = new TextField();
		gameNotes.setPrefWidth(250);
		defaultSceneBorderPane.setLeft(gameNotes);

		//setting the textboxes and buttons for player 1
		Text playerOneTxt = new Text(200, 450, "Player 1");
		playerOneTxt.setFont(Font.font ("Verdana", 30));
		TextField playerOneBet = new TextField();
		TextField playerOnePP = new TextField();
		Button playerOneBtn = new Button();
		Button playerOneFold = new Button();
		Button playerOneBtn2 = new Button();
		playerOneFold.setText("Fold");
		playerOneFold.setPrefWidth(100);
		playerOneBtn.setText("Ante/Play Bet");
		playerOneBtn2.setText("Pair Plus Bet");
		playerOneBet.setPrefWidth(100);
		playerOnePP.setPrefWidth(100);

		HBox playerOneBets = new HBox(10, playerOneBet, playerOnePP);
		HBox playerOneBtns = new HBox(35, playerOneBtn, playerOneBtn2, playerOneFold);
		pane.getChildren().add(playerOneBets);
		pane.getChildren().add(playerOneBtns);
		playerOneBtns.relocate(100,680);
		playerOneBets.relocate(100, 650);

		//setting the textboxes and buttons for player 2
		Text playerTwoTxt = new Text(800, 450, "Player 2");
		playerTwoTxt.setFont(Font.font ("Verdana", 30));
		TextField playerTwoBet = new TextField();
		TextField playerTwoPP = new TextField();
		Button playerTwoBtn = new Button();
		Button playerTwoBtn2 = new Button();
		Button playerTwoFold = new Button();
		playerTwoFold.setText("Fold");
		playerTwoFold.setPrefWidth(100);
		playerTwoBtn.setText("Ante/Play Bet");
		playerTwoBtn2.setText("Pair Plus Bet");
		playerTwoBet.setPrefWidth(100);
		playerTwoPP.setPrefWidth(100);

		HBox playerTwoBets = new HBox(10, playerTwoBet, playerTwoPP);
		HBox playerTwoBtns = new HBox(35, playerTwoBtn, playerTwoBtn2, playerTwoFold);
		pane.getChildren().add(playerTwoBets);
		pane.getChildren().add(playerTwoBtns);
		playerTwoBtns.relocate(700,680);
		playerTwoBets.relocate(700, 650);

		Text dealerTxt = new Text(500, 300, "Dealer");
		dealerTxt.setFont(Font.font ("Comic Sans", 30));

		//adding the players and dealers cards to the pane
		pane.getChildren().add(player1Cards);
		pane.getChildren().add(player2Cards);
		pane.getChildren().add(dealerCards);
		pane.getChildren().add(playerTwoTxt);
		pane.getChildren().add(playerOneTxt);
		pane.getChildren().add(dealerTxt);

		player1Cards.relocate(100,500);
		player2Cards.relocate(700, 500);
		dealerCards.relocate(400, 100);

		cozmo.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				player1Cards.getChildren().clear();
				player2Cards.getChildren().clear();
				dealerCards.getChildren().clear();

				//player 1's card backs
				player1Card1.getChildren().clear();
				player1Card1.getChildren().add(BeckView);
				player1Card2.getChildren().clear();
				player1Card2.getChildren().add(BeckView2);
				player1Card3.getChildren().clear();
				player1Card3.getChildren().add(BeckView3);

				//player 2's card backs
				player2Card1.getChildren().clear();
				player2Card1.getChildren().add(BeckView4);
				player2Card2.getChildren().clear();
				player2Card2.getChildren().add(BeckView5);
				player2Card3.getChildren().clear();
				player2Card3.getChildren().add(BeckView6);

				//Dealers's card backs
				dealerCard1.getChildren().clear();
				dealerCard1.getChildren().add(BeckView7);
				dealerCard2.getChildren().clear();
				dealerCard2.getChildren().add(BeckView8);
				dealerCard3.getChildren().clear();
				dealerCard3.getChildren().add(BeckView9);

				//Adding the cards to each of their respective HBox
				player1Cards.getChildren().clear();
				player1Cards.getChildren().addAll(player1Card1, player1Card2, player1Card3);
				player2Cards.getChildren().clear();
				player2Cards.getChildren().addAll(player2Card1, player2Card2, player2Card3);
				dealerCards.getChildren().clear();
				dealerCards.getChildren().addAll(dealerCard1,dealerCard2, dealerCard3);


				player1Cards.relocate(100,500);
				player2Cards.relocate(700, 500);
				dealerCards.relocate(400, 100);

				pane.getChildren().add(player1Cards);
				pane.getChildren().add(player2Cards);
				pane.getChildren().add(dealerCards);

				Background background = new Background(cozmoBackgroundImage);
				pane.setBackground(background);
			}
		});

		EventHandler<ActionEvent> startOfGame = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				player1Cards.getChildren().clear();
				player2Cards.getChildren().clear();
				dealerCards.getChildren().clear();

				// display player 1's cards
				player1Card1.getChildren().clear();
				player1Card1.getChildren().add(purpleCardBackView);
				player1Card2.getChildren().clear();
				player1Card2.getChildren().add(purpleCardBackView2);
				player1Card3.getChildren().clear();
				player1Card3.getChildren().add(purpleCardBackView3);

				//player 2's card backs
				player2Card1.getChildren().clear();
				player2Card1.getChildren().add(purpleCardBackView4);
				player2Card2.getChildren().clear();
				player2Card2.getChildren().add(purpleCardBackView5);
				player2Card3.getChildren().clear();
				player2Card3.getChildren().add(purpleCardBackView6);

				//Dealers's card backs
				dealerCard1.getChildren().clear();
				dealerCard1.getChildren().add(purpleCardBackView7);
				dealerCard2.getChildren().clear();
				dealerCard2.getChildren().add(purpleCardBackView8);
				dealerCard3.getChildren().clear();
				dealerCard3.getChildren().add(purpleCardBackView9);

				//Adding the cards to each of their respected HBox
				player1Cards.getChildren().clear();
				player1Cards.getChildren().addAll(player1Card1, player1Card2, player1Card3);
				player2Cards.getChildren().clear();
				player2Cards.getChildren().addAll(player2Card1, player2Card2, player2Card3);
				dealerCards.getChildren().clear();
				dealerCards.getChildren().addAll(dealerCard1,dealerCard2, dealerCard3);


				player1Cards.relocate(100,500);
				player2Cards.relocate(700, 500);
				dealerCards.relocate(400, 100);

				pane.getChildren().add(player1Cards);
				pane.getChildren().add(player2Cards);
				pane.getChildren().add(dealerCards);

				Background background = new Background(greenFeltBackgroundImage);
				pane.setBackground(background);
			}
		};
		original.setOnAction(startOfGame);

		Background background = new Background(greenFeltBackgroundImage);
		pane.setBackground(background);

		defaultSceneBorderPane.setCenter(pane);

		Scene defaultScene = new Scene(defaultSceneBorderPane,1500,1100);

		primaryStage.setScene(defaultScene);
		primaryStage.show();

//		EventHandler<ActionEvent> start = new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//              player1Cards.getChildren().clear();
//				player2Cards.getChildren().clear();
//				dealerCards.getChildren().clear();
//
//				//player 1's card backs
//				HBox player1Card1 = new HBox(purpleCardBackView);
//				HBox player1Card2 = new HBox(purpleCardBackView2);
//				HBox player1Card3 = new HBox(purpleCardBackView3);
//
//				//player 2's card backs
//				HBox player2Card1 = new HBox(purpleCardBackView4);
//				HBox player2Card2 = new HBox(purpleCardBackView5);
//				HBox player2Card3 = new HBox(purpleCardBackView6);
//
//				//Dealers's card backs
//				HBox dealerCard1 = new HBox(purpleCardBackView7);
//				HBox dealerCard2 = new HBox(purpleCardBackView8);
//				HBox dealerCard3 = new HBox(purpleCardBackView9);
//
//				//Adding the cards to each of their respected HBox
//				HBox player1Cards = new HBox(55,player1Card1, player1Card2, player1Card3);
//				HBox player2Cards = new HBox(55,player2Card1, player2Card2, player2Card3);
//				HBox dealerCards = new HBox(55,dealerCard1, dealerCard2, dealerCard3);
//
//
//				player1Cards.relocate(100,500);
//				player2Cards.relocate(700, 500);
//				dealerCards.relocate(400, 100);
//
//				pane.getChildren().add(player1Cards);
//				pane.getChildren().add(player2Cards);
//				pane.getChildren().add(dealerCards);
//
//				BackgroundImage myBI= new BackgroundImage(greenBackground, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,  BackgroundSize.DEFAULT);
//				Background background = new Background(myBI);
//				pane.setBackground(background);
//			}
//		}
	}//end of start method


}
