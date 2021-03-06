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

import static javafx.scene.layout.Background.EMPTY;

public class ThreeCardPokerGame extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create the objects needed to play
		Dealer dealer = new Dealer();
		Player player1 = new Player();
		Player player2 = new Player();

		// default card back objects:
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

		// default background:
		Image greenBackground = new Image("green background.jpg",1920,1080,true,true);

		// hallenbeck style background:
		Image cozmoPic = new Image("cozmo.jpg",1920,1080,true,true);

		// card jitsu style background
		Image dojoBackground = new Image("dojo_background.png", 1920, 1080, true,true);

		//Hallenbeck card back image objects:
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

		// card jitsu card back image objects:
		Image fireNinja = new Image("fireNinja.png", 90, 150, true, true);
		ImageView fireNinjaView = new ImageView(fireNinja);

		Image fireNinja2 = new Image("fireNinja.png", 90, 150, true, true);
		ImageView fireNinjaView2 = new ImageView(fireNinja2);

		Image fireNinja3 = new Image("fireNinja.png", 90, 150, true, true);
		ImageView fireNinjaView3 = new ImageView(fireNinja3);

		Image waterNinja = new Image("waterNinja.png", 90, 150, true, true);
		ImageView waterNinjaView = new ImageView(waterNinja);

		Image waterNinja2 = new Image("waterNinja.png", 90, 150, true, true);
		ImageView waterNinjaView2 = new ImageView(waterNinja2);

		Image waterNinja3 = new Image("waterNinja.png", 90, 150, true, true);
		ImageView waterNinjaView3 = new ImageView(waterNinja3);

		Image snowNinja = new Image("snowNinja.png", 90, 150, true, true);
		ImageView snowNinjaView = new ImageView(snowNinja);

		Image snowNinja2 = new Image("snowNinja.png", 90, 150, true, true);
		ImageView snowNinjaView2 = new ImageView(snowNinja2);

		Image snowNinja3 = new Image("snowNinja.png", 90, 150, true, true);
		ImageView snowNinjaView3 = new ImageView(snowNinja3);

		primaryStage.setTitle("Let's Play Three Card Poker!!!");

		BorderPane defaultSceneBorderPane = new BorderPane();

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
		TextArea gameNotes = new TextArea();
		gameNotes.setDisable(true);
		gameNotes.setPrefWidth(250);
		defaultSceneBorderPane.setBottom(gameNotes);

		//setting the textboxes and buttons for player 1
		Text playerOneTxt = new Text(200, 450, "Player 1");
		final Text[] playerOneBalance = {new Text(200, 475, "Balance: $" + player1.getTotalWinnings())};
		playerOneBalance[0].setFill(Color.DARKRED);
		playerOneTxt.setStyle("-fx-font-weight: bold");
		playerOneBalance[0].setStyle("-fx-font-weight: bold");
		playerOneBalance[0].setFont(Font.font ("Verdana", 20));
		playerOneTxt.setFill(Color.DARKRED);
		playerOneBalance[0].setFont(Font.font ("Verdana", 20));
		playerOneTxt.setFont(Font.font ("Verdana", 30));
		TextField playerOneAnteBet = new TextField();
		TextField playerOnePP = new TextField();
		Button playerOneBtn = new Button();
		Button playerOneFold = new Button();
		Button playerOneBtn2 = new Button();
		playerOneAnteBet.setPromptText("Ante Bet!");
		playerOnePP.setPromptText("Pair Plus Bet!");
		playerOneFold.setText("Fold");
		playerOneFold.setPrefWidth(75);
		playerOneBtn.setText("Ante Bet/PP Bet");
		playerOneBtn2.setText("Play Hand");
		playerOneAnteBet.setPrefWidth(100);
		playerOnePP.setPrefWidth(100);

		HBox playerOneAnte = new HBox(45, playerOneAnteBet);
		HBox player1PP = new HBox(45, playerOnePP);
		HBox playerOneBtns = new HBox(35, playerOneBtn);
		HBox player1PlayFoldBtns = new HBox(65,playerOneBtn2, playerOneFold);
		pane.getChildren().add(player1PlayFoldBtns);
		pane.getChildren().add(playerOneAnte);
		pane.getChildren().add(player1PP);
		pane.getChildren().add(playerOneBtns);
		player1PlayFoldBtns.relocate(250, 650);
		playerOneBtns.relocate(100,740);
		player1PP.relocate(100,695);
		playerOneAnte.relocate(100, 650);

		//setting the textboxes and buttons for player 2
		Text playerTwoTxt = new Text(800, 450, "Player 2");
		final Text[] playerTwoBalance = {new Text(800, 475, "Balance: $" + player2.getTotalWinnings())};
		playerTwoBalance[0].setFill(Color.DARKRED);
		playerTwoTxt.setStyle("-fx-font-weight: bold");
		playerTwoBalance[0].setStyle("-fx-font-weight: bold");
		playerTwoBalance[0].setFont(Font.font ("Verdana", 20));
		playerTwoTxt.setFill(Color.DARKRED);
		playerTwoTxt.setFont(Font.font ("Verdana", 30));
		TextField playerTwoBet = new TextField();
		TextField playerTwoPP = new TextField();
		playerTwoBet.setPromptText("Bet!");
		playerTwoPP.setPromptText("PairPlus Bet!");
		Button playerTwoBtn = new Button();
		Button playerTwoBtn2 = new Button();
		Button playerTwoFold = new Button();
		playerTwoFold.setText("Fold");
		playerTwoFold.setPrefWidth(75);
		playerTwoBtn.setText("Ante Bet/PP Bet");
		playerTwoBtn2.setText("Play Hand");
		playerTwoBet.setPrefWidth(100);
		playerTwoPP.setPrefWidth(100);

		HBox playerTwoAnte = new HBox(playerTwoBet);
		HBox player2PP = new HBox(playerTwoPP);
		HBox playerTwoBtns = new HBox(35, playerTwoBtn);
		HBox player2PlayFoldBtns = new HBox(65,playerTwoBtn2, playerTwoFold);
		pane.getChildren().add(playerTwoAnte);
		pane.getChildren().add(playerTwoBtns);
		pane.getChildren().add(player2PP);
		pane.getChildren().add(player2PlayFoldBtns);
		player2PlayFoldBtns.relocate(850, 650);
		player2PP.relocate(700, 695);
		playerTwoBtns.relocate(700,740);
		playerTwoAnte.relocate(700, 650);

		Text dealerTxt = new Text(545, 300, "Dealer");
		dealerTxt.setFont(Font.font ("Verdana", 30));
		dealerTxt.setStyle("-fx-font-weight: bold");
		dealerTxt.setFill(Color.DARKRED);

		//adding the players and dealers cards to the pane
		pane.getChildren().add(player1Cards);
		pane.getChildren().add(player2Cards);
		pane.getChildren().add(dealerCards);
		pane.getChildren().add(playerOneBalance[0]);
		pane.getChildren().add(playerTwoBalance[0]);
		pane.getChildren().add(playerTwoTxt);
		pane.getChildren().add(playerOneTxt);
		pane.getChildren().add(dealerTxt);

		player1Cards.relocate(100,500);
		player2Cards.relocate(700, 500);
		dealerCards.relocate(400, 100);

		// flags to detect which style is active:
		final boolean[] defaultStyleFlag = {true};
		final boolean[] hallenbeckStyleFlag = {false};
		final boolean[] cardJitsuStyleFlag = {false};

		//creating the options drop down menu
		Menu menu = new Menu("Options");

		//adding different types of options
		MenuItem exit = new MenuItem("Exit");
		exit.setOnAction(e -> Platform.exit());

		MenuItem freshStart = new MenuItem("Fresh Start");
		freshStart.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// reset player winnings and the deck:
				player1.setTotalWinnings(0);
				player2.setTotalWinnings(0);
				dealer.getTheDeck().newDeck();

				// set style flags:
				defaultStyleFlag[0] = true;
				hallenbeckStyleFlag[0] = false;
				cardJitsuStyleFlag[0] = false;

				// re-enable player1's buttons and text fields:
				playerOneBtn.setDisable(false);
				playerOneBtn2.setDisable(false);
				playerOneFold.setDisable(false);

				playerOneAnteBet.setDisable(false);
				playerOnePP.setDisable(false);

				// re=enable player2's buttons and text fields:
				playerTwoBtn.setDisable(false);
				playerTwoBtn2.setDisable(false);
				playerTwoFold.setDisable(false);

				playerTwoBet.setDisable(false);
				playerTwoPP.setDisable(false);

				// display player 1's card backs:
				player1Card1.getChildren().clear();
				player1Card2.getChildren().clear();
				player1Card3.getChildren().clear();
				player1Card1.getChildren().add(purpleCardBackView);
				player1Card2.getChildren().add(purpleCardBackView2);
				player1Card3.getChildren().add(purpleCardBackView3);

				// display player 2's card backs:
				player2Card1.getChildren().clear();
				player2Card2.getChildren().clear();
				player2Card3.getChildren().clear();
				player2Card1.getChildren().add(purpleCardBackView4);
				player2Card2.getChildren().add(purpleCardBackView5);
				player2Card3.getChildren().add(purpleCardBackView6);


				// display dealers's card backs
				dealerCard1.getChildren().clear();
				dealerCard2.getChildren().clear();
				dealerCard3.getChildren().clear();
				dealerCard1.getChildren().add(purpleCardBackView7);
				dealerCard2.getChildren().add(purpleCardBackView8);
				dealerCard3.getChildren().add(purpleCardBackView9);

				player1.setTotalWinnings(0);
				pane.getChildren().remove(playerOneBalance[0]);
				playerOneBalance[0] = new Text(200, 475, "Balance: $" + player1.getTotalWinnings());
				playerOneBalance[0].setFont(Font.font("Verdana", 20));
				playerOneBalance[0].setStyle("-fx-font-weight: bold");
				playerOneBalance[0].setFill(Color.DARKRED);
				pane.getChildren().add(playerOneBalance[0]);

				player2.setTotalWinnings(0);
				pane.getChildren().remove(playerTwoBalance[0]);
				playerTwoBalance[0] = new Text(800, 475, "Balance: $" + player2.getTotalWinnings());
				playerTwoBalance[0].setFont(Font.font("Verdana", 20));
				playerTwoBalance[0].setStyle("-fx-font-weight: bold");
				playerTwoBalance[0].setFill(Color.DARKRED);
				pane.getChildren().add(playerTwoBalance[0]);
			}
		});

		Menu newLook = new Menu("New Look");
		MenuItem original = new MenuItem("Default");
		MenuItem cozmo = new MenuItem("Hallenbeck");
		MenuItem cardJitsu = new MenuItem("Club Penguin Card Jitsu");

		menu.getItems().add(exit);
		menu.getItems().add(freshStart);
		menu.getItems().add(newLook);
		newLook.getItems().add(original);
		newLook.getItems().add(cozmo);
		newLook.getItems().add(cardJitsu);

		MenuBar bar = new MenuBar();

		bar.getMenus().add(menu);

		defaultSceneBorderPane.setTop(bar);

		cozmo.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				// set style flags:
				defaultStyleFlag[0] = false;
				hallenbeckStyleFlag[0] = true;
				cardJitsuStyleFlag[0] = false;

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

				pane.getChildren().remove(player1Cards);
				pane.getChildren().add(player1Cards);
				pane.getChildren().remove(player2Cards);
				pane.getChildren().add(player2Cards);
				pane.getChildren().remove(dealerCards);
				pane.getChildren().add(dealerCards);

				pane.setBackground(new Background(cozmoBackgroundImage));
			}
		});

		cardJitsu.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				// set style flags:
				defaultStyleFlag[0] = false;
				hallenbeckStyleFlag[0] = false;
				cardJitsuStyleFlag[0] = true;

				player1Cards.getChildren().clear();
				player2Cards.getChildren().clear();
				dealerCards.getChildren().clear();

				//player 1's card backs
				player1Card1.getChildren().clear();
				player1Card1.getChildren().add(fireNinjaView);
				player1Card2.getChildren().clear();
				player1Card2.getChildren().add(fireNinjaView2);
				player1Card3.getChildren().clear();
				player1Card3.getChildren().add(fireNinjaView3);

				//player 2's card backs
				player2Card1.getChildren().clear();
				player2Card1.getChildren().add(waterNinjaView);
				player2Card2.getChildren().clear();
				player2Card2.getChildren().add(waterNinjaView2);
				player2Card3.getChildren().clear();
				player2Card3.getChildren().add(waterNinjaView3);

				//Dealers's card backs
				dealerCard1.getChildren().clear();
				dealerCard1.getChildren().add(snowNinjaView);
				dealerCard2.getChildren().clear();
				dealerCard2.getChildren().add(snowNinjaView2);
				dealerCard3.getChildren().clear();
				dealerCard3.getChildren().add(snowNinjaView3);

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

				pane.getChildren().remove(player1Cards);
				pane.getChildren().add(player1Cards);
				pane.getChildren().remove(player2Cards);
				pane.getChildren().add(player2Cards);
				pane.getChildren().remove(dealerCards);
				pane.getChildren().add(dealerCards);

				Background background = new Background(dojoBackgroundImage);
				pane.setBackground(background);
			}
		});

		original.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// set style flags:
				defaultStyleFlag[0] = true;
				hallenbeckStyleFlag[0] = false;
				cardJitsuStyleFlag[0] = false;

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

				pane.getChildren().remove(player1Cards);
				pane.getChildren().add(player1Cards);
				pane.getChildren().remove(player2Cards);
				pane.getChildren().add(player2Cards);
				pane.getChildren().remove(dealerCards);
				pane.getChildren().add(dealerCards);

				Background background = new Background(greenFeltBackgroundImage);
				pane.setBackground(background);
			}
		});

		Background background = new Background(greenFeltBackgroundImage);
		pane.setBackground(background);

		defaultSceneBorderPane.setCenter(pane);

		Scene defaultScene = new Scene(defaultSceneBorderPane,1405,1100);

		primaryStage.setScene(defaultScene);
		primaryStage.show();

		final boolean[] player1FoldFlag = {false};
		final boolean[] player2FoldFlag = {false};
		final boolean[] dealerQualifyFlag = {false};

		/* Event loop: */
		// player1 play / ante bet button:
		playerOneBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				//RESETS
				int player1PlayBet = Integer.parseInt(playerOneAnteBet.getText());
				player1.setPlayBet(player1PlayBet);

				if (playerOneAnteBet.getText() != null && player1PlayBet > 4 && player1PlayBet < 26) {
					player1.setAnteBet(player1PlayBet);
					int player1PPBet = Integer.parseInt(playerOnePP.getText());
					player1.setPairPlusBet(player1PPBet);
					player1.setAnteBet(player1.getAnteBet()+player1PlayBet);

					if (playerOnePP.getText() != null && ((player1PPBet > 4 && player1PPBet < 26) || player1PPBet == 0)) {
						gameNotes.setText("Player 1 bet $" + player1.getPlayBet() + " for ante/play bet and $" + player1.getPairPlusBet() + " for pair plus bet");
						// update player1's balance:
						//RESETS
						player1.setTotalWinnings(player1.getTotalWinnings()-player1.getPlayBet()-player1.getPairPlusBet());
						pane.getChildren().remove(playerOneBalance[0]);

						playerOneBalance[0] = new Text(200,475, "Balance: $" + player1.getTotalWinnings());
						playerOneBalance[0].setFont(Font.font ("Verdana", 20));
						playerOneBalance[0].setFill(Color.DARKRED);
						playerOneBalance[0].setStyle("-fx-font-weight: bold");
						playerOneBalance[0].setFont(Font.font ("Verdana", 20));
						pane.getChildren().add(playerOneBalance[0]);

						playerOneBtn.setDisable(true);
						player1.setPairPlusBet(player1PPBet);
						playerOneAnteBet.setDisable(true);
						playerOnePP.setDisable(true);

						player1.setHand(dealer.dealHand());

						PauseTransition twoSecondPause = new PauseTransition(Duration.seconds(2));
						twoSecondPause.setOnFinished(e->{
							//RESETS
							player1Card1.getChildren().clear();
							player1Card1.getChildren().add(new ImageView(new Image("" + player1.getHand().get(0).getValue() + player1.getHand().get(0).getSuit() + ".png", 90, 150, true, true)));
							player1Card2.getChildren().clear();
							player1Card2.getChildren().add(new ImageView(new Image("" + player1.getHand().get(1).getValue() + player1.getHand().get(1).getSuit() + ".png", 90, 150, true, true)));
							player1Card3.getChildren().clear();
							player1Card3.getChildren().add(new ImageView(new Image("" + player1.getHand().get(2).getValue() + player1.getHand().get(2).getSuit() + ".png", 90, 150, true, true)));

						});
						twoSecondPause.play();

						//evaluates Pair Plus and adjusts the balance on the screen for PLayer 1
						//RESETS
						player1.setTotalWinnings(player1.getTotalWinnings() + (ThreeCardLogic.evalPPWinnings(player1.getHand(), player1PPBet)));
						pane.getChildren().remove(playerOneBalance[0]);
						playerOneBalance[0] = new Text(200,475, "Balance: $" + player1.getTotalWinnings());
						playerOneBalance[0].setFont(Font.font ("Verdana", 20));
						playerOneBalance[0].setFill(Color.DARKRED);
						playerOneBalance[0].setStyle("-fx-font-weight: bold");
						playerOneBalance[0].setFont(Font.font ("Verdana", 20));
						pane.getChildren().add(playerOneBalance[0]);
					}
				}
			}
		});

		// player1 fold button:
		playerOneFold.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				gameNotes.setText("Player 1 folded");
				//RESETS
				player1FoldFlag[0] = true;

				player1Card1.getChildren().clear();
				player1Card1.getChildren().add(purpleCardBackView);
				player1Card2.getChildren().clear();
				player1Card2.getChildren().add(purpleCardBackView2);
				player1Card3.getChildren().clear();
				player1Card3.getChildren().add(purpleCardBackView3);

				playerOneFold.setDisable(true);
			}
		});

		// player2 fold button:
		playerTwoFold.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				gameNotes.setText("Player 2 folded");
				//RESETS
				player2FoldFlag[0] = true;

				player2Card1.getChildren().clear();
				player2Card1.getChildren().add(purpleCardBackView4);
				player2Card2.getChildren().clear();
				player2Card2.getChildren().add(purpleCardBackView5);
				player2Card3.getChildren().clear();
				player2Card3.getChildren().add(purpleCardBackView6);

				playerTwoFold.setDisable(true);

				// show dealer's cards:

				/* Evaluate hands: */
					// check if dealer qualifies:
					// display dealer's cards:
					dealerCard1.getChildren().clear();
					dealerCard1.getChildren().add(new ImageView(new Image("" + dealer.getDealersHand().get(0).getValue() + dealer.getDealersHand().get(0).getSuit() + ".png", 90, 150, true, true)));
					dealerCard2.getChildren().clear();
					dealerCard2.getChildren().add(new ImageView(new Image("" + dealer.getDealersHand().get(1).getValue() + dealer.getDealersHand().get(1).getSuit() + ".png", 90, 150, true, true)));
					dealerCard3.getChildren().clear();
					dealerCard3.getChildren().add(new ImageView(new Image("" + dealer.getDealersHand().get(2).getValue() + dealer.getDealersHand().get(2).getSuit() + ".png", 90, 150, true, true)));
					int dealerHandResult = ThreeCardLogic.evalHand(dealer.getDealersHand());

					if (dealerHandResult == 0) {
						for (int i = 0; i < 3; i++) {
							if (dealer.getDealersHand().get(i).getValue() >= 12) {
								dealerQualifyFlag[0] = true; // dealer did qualify, so set flag to true
								break;
							}
						}
					}
				PauseTransition twoSecPause = new PauseTransition(Duration.seconds(2));
				twoSecPause.setOnFinished(e -> {
					// dealer did not qualify, so flip cards over:
					if (dealerQualifyFlag[0] == false) {
						gameNotes.setText("Dealer did not qualify; ante bet is pushed");
						dealerCard1.getChildren().clear();
						dealerCard1.getChildren().add(purpleCardBackView7);
						dealerCard2.getChildren().clear();
						dealerCard2.getChildren().add(purpleCardBackView8);
						dealerCard3.getChildren().clear();
						dealerCard3.getChildren().add(purpleCardBackView9);

						// player1 did not fold, so they get their bet back:
						if (player1FoldFlag[0] == false) {
							gameNotes.setText("Player 1 did not fold, so they receive their money back");
							// update player1 balance:
							player1.setTotalWinnings(player1.getTotalWinnings()+player1.getPlayBet());
							pane.getChildren().remove(playerOneBalance[0]);

							playerOneBalance[0] = new Text(200,475, "Balance: $" + player1.getTotalWinnings());
							playerOneBalance[0].setFont(Font.font ("Verdana", 20));
							pane.getChildren().add(playerOneBalance[0]);
						}
					}
					// dealer did qualify:
					else {
						// evaluate player1 and dealer's hands:
						int player1VsDealer = -1;
						int player2VsDealer = -1;

						if (!player1FoldFlag[0])
							player1VsDealer = ThreeCardLogic.compareHands(dealer.getDealersHand(), player1.getHand()); // 0, 1, or 2 depending on who won

						// tie between player1 and dealer
						if (player1VsDealer == 0) {
							gameNotes.setText("Player 1 and dealer tied");
							player1.setTotalWinnings(player1.getTotalWinnings() + player1.getPlayBet());
							pane.getChildren().remove(playerOneBalance[0]);
							playerOneBalance[0] = new Text(200,475, "Balance: $" + player1.getTotalWinnings());
							playerOneBalance[0].setFont(Font.font ("Verdana", 20));
							pane.getChildren().add(playerOneBalance[0]);

							player2FoldFlag[0] = false;
							dealerQualifyFlag[0] = false;
						}

						// dealer wins over player1:
						if (player1VsDealer == 1) {
							gameNotes.setText("Dealer wins over player 1");

							player1.setTotalWinnings(player1.getTotalWinnings() - player1.getPlayBet() - player1.getAnteBet());
							pane.getChildren().remove(playerOneBalance[0]);
							playerOneBalance[0] = new Text(200,475, "Balance: $" + player1.getTotalWinnings());
							playerOneBalance[0].setFont(Font.font ("Verdana", 20));
							pane.getChildren().add(playerOneBalance[0]);

							if (player2FoldFlag[0] == true)
								player1.setAnteBet(0);
							player2FoldFlag[0] = false;
							dealerQualifyFlag[0] = false;
						}

						// player1 wins:
						if (player1VsDealer == 2) {
							gameNotes.setText("Player 1 wins over dealer");

							player1.setTotalWinnings(player1.getTotalWinnings() + 2*(player1.getPlayBet() + player1.getAnteBet()));
							pane.getChildren().remove(playerOneBalance[0]);
							playerOneBalance[0] = new Text(200,475, "Balance: $" + player1.getTotalWinnings());
							playerOneBalance[0].setFont(Font.font ("Verdana", 20));
							pane.getChildren().add(playerOneBalance[0]);

							if (player2FoldFlag[0] == true)
								player1.setAnteBet(0);
							player2FoldFlag[0] = false;
							dealerQualifyFlag[0] = false;
						}
					}

					// re-enable player1's buttons and text fields:
					playerOneBtn.setDisable(false);
					playerOneBtn2.setDisable(false);
					playerOneFold.setDisable(false);

					playerOneAnteBet.setDisable(false);
					playerOnePP.setDisable(false);

					// re=enable player2's buttons and text fields:
					playerTwoBtn.setDisable(false);
					playerTwoBtn2.setDisable(false);
					playerTwoFold.setDisable(false);

					playerTwoBet.setDisable(false);
					playerTwoPP.setDisable(false);

					// display player 1's card backs:
					player1Card1.getChildren().clear();
					player1Card2.getChildren().clear();
					player1Card3.getChildren().clear();
					if (defaultStyleFlag[0]) {
						player1Card1.getChildren().add(purpleCardBackView);
						player1Card2.getChildren().add(purpleCardBackView2);
						player1Card3.getChildren().add(purpleCardBackView3);
					}
					else if (hallenbeckStyleFlag[0]) {
						player1Card1.getChildren().add(BeckView);
						player1Card2.getChildren().add(BeckView2);
						player1Card3.getChildren().add(BeckView3);
					}
					else {
						player1Card1.getChildren().add(fireNinjaView);
						player1Card2.getChildren().add(fireNinjaView2);
						player1Card3.getChildren().add(fireNinjaView3);
					}

					// display player 2's card backs:
					player2Card1.getChildren().clear();
					player2Card2.getChildren().clear();
					player2Card3.getChildren().clear();
					if (defaultStyleFlag[0]) {
						player2Card1.getChildren().add(purpleCardBackView4);
						player2Card2.getChildren().add(purpleCardBackView5);
						player2Card3.getChildren().add(purpleCardBackView6);
					}
					else if (hallenbeckStyleFlag[0]) {
						player2Card1.getChildren().add(BeckView4);
						player2Card2.getChildren().add(BeckView5);
						player2Card3.getChildren().add(BeckView6);
					}
					else {
						player2Card1.getChildren().add(waterNinjaView);
						player2Card2.getChildren().add(waterNinjaView2);
						player2Card3.getChildren().add(waterNinjaView3);
					}


					// display dealers's card backs
					dealerCard1.getChildren().clear();
					dealerCard2.getChildren().clear();
					dealerCard3.getChildren().clear();

					if (defaultStyleFlag[0]) {
						dealerCard1.getChildren().add(purpleCardBackView7);
						dealerCard2.getChildren().add(purpleCardBackView8);
						dealerCard3.getChildren().add(purpleCardBackView9);
					}
					else if (hallenbeckStyleFlag[0]) {
						dealerCard1.getChildren().add(BeckView7);
						dealerCard2.getChildren().add(BeckView8);
						dealerCard3.getChildren().add(BeckView9);
					}
					else {
						dealerCard1.getChildren().add(snowNinjaView);
						dealerCard2.getChildren().add(snowNinjaView2);
						dealerCard3.getChildren().add(snowNinjaView3);
					}});
				twoSecPause.play();

			}
		});

		// player2 play / ante bet button:
		playerTwoBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				//RESETS
				int player2PlayBet = Integer.parseInt(playerTwoBet.getText());
				player2.setPlayBet(player2PlayBet);

				if (playerTwoBet.getText() != null && player2PlayBet > 4 && player2PlayBet < 26) {
					int player2PPBet = Integer.parseInt(playerTwoPP.getText());
					player2.setPairPlusBet(player2PPBet);
					player2.setAnteBet(player2.getAnteBet()+player2PlayBet);

					if (playerTwoPP.getText() != null && ((player2PPBet > 4 && player2PPBet < 26) || player2PPBet == 0)) {
						gameNotes.setText("Player 2 bet $" + player2.getPlayBet() + " for ante/play bet and $" + player2.getPairPlusBet() + " for pair plus bet");
						// update player2 balance:
						//RESETS
						player2.setTotalWinnings(player2.getTotalWinnings()-player2.getPlayBet()-player2.getPairPlusBet());
						pane.getChildren().remove(playerTwoBalance[0]);

						playerTwoBalance[0] = new Text(800,475, "Balance: $" + player2.getTotalWinnings());
						playerTwoBalance[0].setFont(Font.font ("Verdana", 20));
						playerTwoBalance[0].setFill(Color.DARKRED);
						playerTwoBalance[0].setStyle("-fx-font-weight: bold");
						pane.getChildren().add(playerTwoBalance[0]);

						player2.setAnteBet(player2PlayBet);
						playerTwoBtn.setDisable(true);
						player2.setPairPlusBet(player2PPBet);
						playerTwoBet.setDisable(true);
						playerTwoPP.setDisable(true);
						player2.setHand(dealer.dealHand());

						// show player 2's cards:
						PauseTransition twoSecondPause = new PauseTransition(Duration.seconds(2));
						twoSecondPause.setOnFinished(e -> {
							//RESETS
							player2Card1.getChildren().clear();
							player2Card1.getChildren().add(new ImageView(new Image("" + player2.getHand().get(0).getValue() + player2.getHand().get(0).getSuit() + ".png", 90, 150, true, true)));
							player2Card2.getChildren().clear();
							player2Card2.getChildren().add(new ImageView(new Image("" + player2.getHand().get(1).getValue() + player2.getHand().get(1).getSuit() + ".png", 90, 150, true, true)));
							player2Card3.getChildren().clear();
							player2Card3.getChildren().add(new ImageView(new Image("" + player2.getHand().get(2).getValue() + player2.getHand().get(2).getSuit() + ".png", 90, 150, true, true)));
						});
						twoSecondPause.play();

						// set dealer's hand:
						dealer.dealHand();

						//evaluates Pair Plus and adjusts the balance on the screen for Player 2
						//RESETS
						player2.setTotalWinnings(player2.getTotalWinnings() + (ThreeCardLogic.evalPPWinnings(player2.getHand(), player2PPBet)));
						pane.getChildren().remove(playerTwoBalance[0]);
						playerTwoBalance[0] = new Text(800,475, "Balance: $" + player2.getTotalWinnings());
						playerTwoBalance[0].setFill(Color.DARKRED);
						playerTwoBalance[0].setStyle("-fx-font-weight: bold");
						playerTwoBalance[0].setFont(Font.font ("Verdana", 20));
						pane.getChildren().add(playerTwoBalance[0]);
					}
				}
			}
		});

		// player1 play hand button:
		playerOneBtn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				//RESETS
				player1.setPlayBet(player1.getAnteBet());
				playerOneBtn2.setDisable(true);
			}
		});

		// player2 play hand button:
		playerTwoBtn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				playerTwoBtn2.setDisable(true);
					// display dealer's cards:
					dealerCard1.getChildren().clear();
					dealerCard2.getChildren().clear();
					dealerCard3.getChildren().clear();
					dealerCard1.getChildren().add(new ImageView(new Image("" + dealer.getDealersHand().get(0).getValue() + dealer.getDealersHand().get(0).getSuit() + ".png", 90, 150, true, true)));
					dealerCard2.getChildren().add(new ImageView(new Image("" + dealer.getDealersHand().get(1).getValue() + dealer.getDealersHand().get(1).getSuit() + ".png", 90, 150, true, true)));
					dealerCard3.getChildren().add(new ImageView(new Image("" + dealer.getDealersHand().get(2).getValue() + dealer.getDealersHand().get(2).getSuit() + ".png", 90, 150, true, true)));

				/* Evaluate hands: */

				// check if dealer qualifies:
				int dealerHandResult = ThreeCardLogic.evalHand(dealer.getDealersHand());
				// dealer has high card, so check if at least one card is queen or better and set flag accordingly:
				if (dealerHandResult == 0) {
					for (int i = 0; i < 3; i++) {
						//RESETS
						if (dealer.getDealersHand().get(i).getValue() >= 12) {
							dealerQualifyFlag[0] = true; // dealer did qualify, so set flag to true
							break;
						}
					}
				}
				// dealer has better than high card, so set flag:
				else {
					dealerQualifyFlag[0] = true;
				}
				PauseTransition twoSecPause = new PauseTransition(Duration.seconds(2));
				twoSecPause.setOnFinished(e-> {
					// dealer did not qualify, so flip cards over:
					if (dealerQualifyFlag[0] == false) {
						gameNotes.setText("Dealer did not qualify; ante bet is pushed");

						dealerCard1.getChildren().clear();
						dealerCard1.getChildren().add(purpleCardBackView7);
						dealerCard2.getChildren().clear();
						dealerCard2.getChildren().add(purpleCardBackView8);
						dealerCard3.getChildren().clear();
						dealerCard3.getChildren().add(purpleCardBackView9);

						// player1 did not fold, so they get their bet back:
						if (player1FoldFlag[0] == false) {
							gameNotes.setText("Player 1 did not fold, so they receive their money back");

							// update player1 balance:
							//RESETS
							player1.setTotalWinnings(player1.getTotalWinnings()+player1.getPlayBet());
							pane.getChildren().remove(playerOneBalance[0]);

							playerOneBalance[0] = new Text(200,475, "Balance: $" + player1.getTotalWinnings());
							playerOneBalance[0].setFont(Font.font ("Verdana", 20));
							pane.getChildren().add(playerOneBalance[0]);
						}

						// update player2 balance:
						//RESETS
						player2.setTotalWinnings(player2.getTotalWinnings()+player2.getPlayBet());
						pane.getChildren().remove(playerTwoBalance[0]);

						playerTwoBalance[0] = new Text(800,475, "Balance: $" + player2.getTotalWinnings());
						playerTwoBalance[0].setFont(Font.font ("Verdana", 20));
						pane.getChildren().add(playerTwoBalance[0]);
					}
						// dealer did qualify:
					else{
						//RESETS
							// evaluate player1 and dealer's hands:
							int player1VsDealer = -1;
							int player2VsDealer = -1;

							if (!player1FoldFlag[0])
								player1VsDealer = ThreeCardLogic.compareHands(dealer.getDealersHand(), player1.getHand()); // 0, 1, or 2 depending on who won
							if (!player2FoldFlag[0])
								player2VsDealer = ThreeCardLogic.compareHands(dealer.getDealersHand(), player2.getHand()); // 0, 1 or 2, depending on who won

							// tie between player1 and dealer
							if (player1VsDealer == 0) {
								gameNotes.setText("Player 1 and dealer tied");
								player1.setTotalWinnings(player1.getTotalWinnings() + player1.getPlayBet());
								pane.getChildren().remove(playerOneBalance[0]);
								playerOneBalance[0] = new Text(200, 475, "Balance: $" + player1.getTotalWinnings());
								playerOneBalance[0].setFont(Font.font("Verdana", 20));
								pane.getChildren().add(playerOneBalance[0]);

								player2FoldFlag[0] = false;
								dealerQualifyFlag[0] = false;
							}

							// dealer wins over player1:
							if (player1VsDealer == 1) {
								gameNotes.setText("Dealer wins over player 1");
								player1.setTotalWinnings(player1.getTotalWinnings() - player1.getPlayBet() - player1.getAnteBet());
								pane.getChildren().remove(playerOneBalance[0]);
								playerOneBalance[0] = new Text(200, 475, "Balance: $" + player1.getTotalWinnings());
								playerOneBalance[0].setFont(Font.font("Verdana", 20));
								pane.getChildren().add(playerOneBalance[0]);

								if (player2FoldFlag[0] == true)
									player1.setAnteBet(0);
								player2FoldFlag[0] = false;
								dealerQualifyFlag[0] = false;
							}

							// player1 wins:
							if (player1VsDealer == 2) {
								gameNotes.setText("Player 1 wins over dealer");

								player1.setTotalWinnings(player1.getTotalWinnings() + 2 * (player1.getPlayBet() + player1.getAnteBet()));
								pane.getChildren().remove(playerOneBalance[0]);
								playerOneBalance[0] = new Text(200, 475, "Balance: $" + player1.getTotalWinnings());
								playerOneBalance[0].setFont(Font.font("Verdana", 20));
								pane.getChildren().add(playerOneBalance[0]);

								if (player2FoldFlag[0] == true)
									player1.setAnteBet(0);
								player2FoldFlag[0] = false;
								dealerQualifyFlag[0] = false;
							}

							// tie between player2 and dealer
							if (player2VsDealer == 0) {
								gameNotes.setText("Player 2 and dealer tie");
								player2.setTotalWinnings(player2.getTotalWinnings() + player2.getPlayBet());
								pane.getChildren().remove(playerTwoBalance[0]);
								playerTwoBalance[0] = new Text(800, 475, "Balance: $" + player2.getTotalWinnings());
								playerTwoBalance[0].setFont(Font.font("Verdana", 20));
								pane.getChildren().add(playerTwoBalance[0]);

								player1FoldFlag[0] = false;
								dealerQualifyFlag[0] = false;
							}

							// dealer wins over player2:
							if (player2VsDealer == 1) {
								gameNotes.setText("Dealer wins over player 2");

								player2.setTotalWinnings(player2.getTotalWinnings() - player2.getPlayBet() - player2.getAnteBet());
								pane.getChildren().remove(playerTwoBalance[0]);
								playerTwoBalance[0] = new Text(800, 475, "Balance: $" + player2.getTotalWinnings());
								playerTwoBalance[0].setFont(Font.font("Verdana", 20));
								pane.getChildren().add(playerTwoBalance[0]);

								player2.setAnteBet(0);
								player1FoldFlag[0] = false;
								dealerQualifyFlag[0] = false;
							}

							// player2 wins over dealer:
							if (player2VsDealer == 2) {
								gameNotes.setText("Player 2 wins over dealer");

								player2.setTotalWinnings(player2.getTotalWinnings() + 2 * (player2.getPlayBet() + player2.getAnteBet()));
								pane.getChildren().remove(playerTwoBalance[0]);
								playerTwoBalance[0] = new Text(800, 475, "Balance: $" + player2.getTotalWinnings());
								playerTwoBalance[0].setFont(Font.font("Verdana", 20));
								pane.getChildren().add(playerTwoBalance[0]);

								player2.setAnteBet(0);
								player1FoldFlag[0] = false;
								dealerQualifyFlag[0] = false;
							}
						}

					// re-enable player1's buttons and text fields:
					playerOneBtn.setDisable(false);
					playerOneBtn2.setDisable(false);
					playerOneFold.setDisable(false);

					playerOneAnteBet.setDisable(false);
					playerOnePP.setDisable(false);

					// re=enable player2's buttons and text fields:
					playerTwoBtn.setDisable(false);
					playerTwoBtn2.setDisable(false);
					playerTwoFold.setDisable(false);

					playerTwoBet.setDisable(false);
					playerTwoPP.setDisable(false);

					// display player 1's card backs:
					player1Card1.getChildren().clear();
					player1Card2.getChildren().clear();
					player1Card3.getChildren().clear();
					if (defaultStyleFlag[0]) {
						player1Card1.getChildren().add(purpleCardBackView);
						player1Card2.getChildren().add(purpleCardBackView2);
						player1Card3.getChildren().add(purpleCardBackView3);
					}
					else if (hallenbeckStyleFlag[0]) {
						player1Card1.getChildren().add(BeckView);
						player1Card2.getChildren().add(BeckView2);
						player1Card3.getChildren().add(BeckView3);
					}
					else {
						player1Card1.getChildren().add(fireNinjaView);
						player1Card2.getChildren().add(fireNinjaView2);
						player1Card3.getChildren().add(fireNinjaView3);
					}

					// display player 2's card backs:
					player2Card1.getChildren().clear();
					player2Card2.getChildren().clear();
					player2Card3.getChildren().clear();
					if (defaultStyleFlag[0]) {
						player2Card1.getChildren().add(purpleCardBackView4);
						player2Card2.getChildren().add(purpleCardBackView5);
						player2Card3.getChildren().add(purpleCardBackView6);
					}
					else if (hallenbeckStyleFlag[0]) {
						player2Card1.getChildren().add(BeckView4);
						player2Card2.getChildren().add(BeckView5);
						player2Card3.getChildren().add(BeckView6);
					}
					else {
						player2Card1.getChildren().add(waterNinjaView);
						player2Card2.getChildren().add(waterNinjaView2);
						player2Card3.getChildren().add(waterNinjaView3);
					}


					// display dealers's card backs
					dealerCard1.getChildren().clear();
					dealerCard2.getChildren().clear();
					dealerCard3.getChildren().clear();

					if (defaultStyleFlag[0]) {
						dealerCard1.getChildren().add(purpleCardBackView7);
						dealerCard2.getChildren().add(purpleCardBackView8);
						dealerCard3.getChildren().add(purpleCardBackView9);
					}
					else if (hallenbeckStyleFlag[0]) {
						dealerCard1.getChildren().add(BeckView7);
						dealerCard2.getChildren().add(BeckView8);
						dealerCard3.getChildren().add(BeckView9);
					}
					else {
						dealerCard1.getChildren().add(snowNinjaView);
						dealerCard2.getChildren().add(snowNinjaView2);
						dealerCard3.getChildren().add(snowNinjaView3);
					}
				});
				twoSecPause.play();
			}
		});
	}//end of start method


}
