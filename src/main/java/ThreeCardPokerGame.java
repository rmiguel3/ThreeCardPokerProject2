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

		//creating the options drop down menu
		Menu menu = new Menu("Options");

		//adding different types of options
		MenuItem exit = new MenuItem("Exit");
		exit.setOnAction(e -> Platform.exit());

		MenuItem freshStart = new MenuItem("Fresh Start");

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
		final Text[] playerOneBalance = {new Text(200, 475, "Balance: $" + player1.getTotalWinnings())};
		playerOneBalance[0].setFont(Font.font ("Verdana", 20));
		playerOneTxt.setFont(Font.font ("Verdana", 30));
		TextField playerOneBet = new TextField();
		TextField playerOnePP = new TextField();
		Button playerOneBtn = new Button();
		Button playerOneFold = new Button();
		Button playerOneBtn2 = new Button();
		playerOneBet.setPromptText("Bet!");
		playerOnePP.setPromptText("PairPlus Bet!");
		playerOneFold.setText("Fold");
		playerOneFold.setPrefWidth(75);
		playerOneBtn.setText("Ante Bet/PP Bet");
		playerOneBtn2.setText("Play Hand");
		playerOneBet.setPrefWidth(100);
		playerOnePP.setPrefWidth(100);

		HBox playerOneAnte = new HBox(45, playerOneBet);
		HBox player1PP = new HBox(45, playerOnePP);
		HBox playerOneBtns = new HBox(35, playerOneBtn);
		HBox player1PlayFoldBtns = new HBox(65,playerOneBtn2, playerOneFold);
		pane.getChildren().add(player1PlayFoldBtns);
		pane.getChildren().add(playerOneAnte);
		pane.getChildren().add(player1PP);
		pane.getChildren().add(playerOneBtns);
		player1PlayFoldBtns.relocate(250, 650);
		playerOneBtns.relocate(100,700);
		player1PP.relocate(100,675);
		playerOneAnte.relocate(100, 650);

		//setting the textboxes and buttons for player 2
		Text playerTwoTxt = new Text(800, 450, "Player 2");
		final Text[] playerTwoBalance = {new Text(800, 475, "Balance: $" + player2.getTotalWinnings())};
		playerTwoBalance[0].setFont(Font.font ("Verdana", 20));
		playerTwoTxt.setFont(Font.font ("Verdana", 30));
		TextField playerTwoBet = new TextField();
		TextField playerTwoPP = new TextField();
		playerTwoBet.setPromptText("Bet!");
		playerTwoPP.setPromptText("PairPlus Bet!");
		Button playerTwoBtn = new Button();
		Button playerTwoBtn2 = new Button();
		Button playerTwoFold = new Button();
		playerTwoFold.setText("Fold");
		playerTwoFold.setPrefWidth(100);
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
		player2PP.relocate(700, 675);
		playerTwoBtns.relocate(700,700);
		playerTwoAnte.relocate(700, 650);

		Text dealerTxt = new Text(500, 300, "Dealer");
		dealerTxt.setFont(Font.font ("Comic Sans", 30));

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

		cardJitsu.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
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

				pane.getChildren().add(player1Cards);
				pane.getChildren().add(player2Cards);
				pane.getChildren().add(dealerCards);

				Background background = new Background(dojoBackgroundImage);
				pane.setBackground(background);
			}
		});

		original.setOnAction(new EventHandler<ActionEvent>() {
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
		});

		Background background = new Background(greenFeltBackgroundImage);
		pane.setBackground(background);

		defaultSceneBorderPane.setCenter(pane);

		Scene defaultScene = new Scene(defaultSceneBorderPane,1500,1100);

		primaryStage.setScene(defaultScene);
		primaryStage.show();

		final int[] player1Bet = new int[1];
		final int[] player1PairBet = new int[1];
		final int[] player2Bet = new int[1];
		final int[] player2PairBet = new int[1];

		// event loop:
		playerOneBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int player1PlayBet = Integer.parseInt(playerOneBet.getText());
				player1Bet[0] = player1PlayBet;
				if (playerOneBet.getText() != null && player1PlayBet > 4 && player1PlayBet < 26) {
					player1.setAnteBet(player1PlayBet);
					playerOneBet.clear();
					playerOneBtn.setDisable(true);


					int player1PPBet = Integer.parseInt(playerOnePP.getText());
					player1PairBet[0] = player1PPBet;
					if (playerOnePP.getText() != null && ((player1PPBet > 4 && player1PPBet < 26) || player1PPBet == 0)) {
						player1.setPairPlusBet(player1PPBet);
						playerOnePP.clear();
					}
					player1.setHand(dealer.dealHand());
					PauseTransition twoSecondPause = new PauseTransition(Duration.seconds(2));
					twoSecondPause.setOnFinished(e->{
						player1Card1.getChildren().clear();
						player1Card1.getChildren().add(new ImageView(new Image("" + player1.getHand().get(0).getValue() + player1.getHand().get(0).getSuit() + ".png", 90, 150, true, true)));
						player1Card2.getChildren().clear();
						player1Card2.getChildren().add(new ImageView(new Image("" + player1.getHand().get(1).getValue() + player1.getHand().get(1).getSuit() + ".png", 90, 150, true, true)));
						player1Card3.getChildren().clear();
						player1Card3.getChildren().add(new ImageView(new Image("" + player1.getHand().get(2).getValue() + player1.getHand().get(2).getSuit() + ".png", 90, 150, true, true)));

					});
					twoSecondPause.play();
				}
			}
		});

		playerTwoBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int player2PlayBet = Integer.parseInt(playerTwoBet.getText());
				player2Bet[0] = player2PlayBet;
				if (playerTwoBet.getText() != null && player2PlayBet > 4 && player2PlayBet < 26) {
					player2.setAnteBet(player2PlayBet);
					playerTwoBet.clear();
					playerTwoBtn.setDisable(true);

					int player2PPBet = Integer.parseInt(playerTwoPP.getText());
					player2PairBet[0] = player2PPBet;
					if (playerTwoPP.getText() != null && ((player2PPBet > 4 && player2PPBet < 26) || player2PPBet == 0)) {
						player2.setPairPlusBet(player2PPBet);
						playerTwoPP.clear();
						player2.setHand(dealer.dealHand());
					}

					player2.setHand(dealer.dealHand());
					PauseTransition twoSecondPause = new PauseTransition(Duration.seconds(2));
					twoSecondPause.setOnFinished(e->{
						player2Card1.getChildren().clear();
						player2Card1.getChildren().add(new ImageView(new Image("" + player2.getHand().get(0).getValue() + player2.getHand().get(0).getSuit() + ".png", 90, 150, true, true)));
						player2Card2.getChildren().clear();
						player2Card2.getChildren().add(new ImageView(new Image("" + player2.getHand().get(1).getValue() + player2.getHand().get(1).getSuit() + ".png", 90, 150, true, true)));
						player2Card3.getChildren().clear();
						player2Card3.getChildren().add(new ImageView(new Image("" + player2.getHand().get(2).getValue() + player2.getHand().get(2).getSuit() + ".png", 90, 150, true, true)));

					});
					twoSecondPause.play();
					dealer.dealHand();
				}
			}
		});

		playerTwoBtn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				PauseTransition twoSecondPause = new PauseTransition(Duration.seconds(2));
				twoSecondPause.setOnFinished(e->{


					dealerCard1.getChildren().clear();
					dealerCard1.getChildren().add(new ImageView(new Image("" + dealer.getDealersHand().get(0).getValue() + dealer.getDealersHand().get(0).getSuit() + ".png", 90, 150, true, true)));
					dealerCard2.getChildren().clear();
					dealerCard2.getChildren().add(new ImageView(new Image("" + dealer.getDealersHand().get(1).getValue() + dealer.getDealersHand().get(1).getSuit() + ".png", 90, 150, true, true)));
					dealerCard3.getChildren().clear();
					dealerCard3.getChildren().add(new ImageView(new Image("" + dealer.getDealersHand().get(2).getValue() + dealer.getDealersHand().get(2).getSuit() + ".png", 90, 150, true, true)));

				});
				twoSecondPause.play();
			}
		});

		playerOneFold.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				player1Card1.getChildren().clear();
				player1Card1.getChildren().add(purpleCardBackView);
				player1Card2.getChildren().clear();
				player1Card2.getChildren().add(purpleCardBackView2);
				player1Card3.getChildren().clear();
				player1Card3.getChildren().add(purpleCardBackView3);

				playerOneFold.setDisable(true);

				player1.setTotalWinnings(player1.getTotalWinnings()-player1Bet[0]-player1PairBet[0]);
				pane.getChildren().remove(playerOneBalance[0]);

				playerOneBalance[0] = new Text(200,475, "Balance: $" + player1.getTotalWinnings());
				playerOneBalance[0].setFont(Font.font ("Verdana", 20));
				pane.getChildren().add(playerOneBalance[0]);
			}
		});

		playerTwoFold.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				player2Card1.getChildren().clear();
				player2Card1.getChildren().add(purpleCardBackView4);
				player2Card2.getChildren().clear();
				player2Card2.getChildren().add(purpleCardBackView5);
				player2Card3.getChildren().clear();
				player2Card3.getChildren().add(purpleCardBackView6);

				playerTwoFold.setDisable(true);

				player2.setTotalWinnings(player2.getTotalWinnings()-player2Bet[0]-player2PairBet[0]);
				pane.getChildren().remove(playerTwoBalance[0]);

				playerTwoBalance[0] = new Text(800,475, "Balance: $" + player2.getTotalWinnings());
				playerTwoBalance[0].setFont(Font.font ("Verdana", 20));
				pane.getChildren().add(playerTwoBalance[0]);
			}
		});






	}//end of start method


}
