package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Background;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;

public class Main extends Application {
	private static Level availableLevel;
	
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		// Create entry pane and entry scene
		Pane entryPane = new Pane();
		entryPane.getStyleClass().add("entryPane");
		GridPane levelPane = new GridPane();
		levelPane.getStyleClass().add("levelPane");
		for (int i = 0; i < 3; i++) {
			levelPane.getColumnConstraints().add(new ColumnConstraints(200));
			levelPane.getRowConstraints().add(new RowConstraints(200));
		}
		Scene entryScene = new Scene(entryPane, 600, 600);
		entryScene.getStylesheets().add("application/application.css");
		Scene levelScene = new Scene(levelPane, 600, 600);
		levelScene.getStylesheets().add("application/application.css");
		
		File level1File = new File("application/LevelFile/level1.txt");
		File level2File = new File("application/LevelFile/level2.txt");
		File level3File = new File("application/LevelFile/level3.txt");
		File level4File = new File("application/LevelFile/level4.txt");
		File level5File = new File("application/LevelFile/level5.txt");
		
	
		Level level1 = new Level(level1File);
		level1.setPreviousLevelPassed(true);
		for (Tile x : level1.getTileList()) {
			System.out.println(x.toString());
		}
		availableLevel = level1;
		// System.out.println("Level1");
		Level level2 = new Level(level2File);
		level2.setPreviousLevelPassed(true);
		for (Tile x : level2.getTileList()) {
			System.out.println(x.toString());
		}
		// System.out.println("Level2");
		Level level3 = new Level(level3File);
		level3.setPreviousLevelPassed(true);
		for (Tile x : level3.getTileList()) {
			System.out.println(x.toString());
		}
		// System.out.println("Level3");
		Level level4 = new Level(level4File);
		level4.setPreviousLevelPassed(true);
		for (Tile x : level4.getTileList()) {
			System.out.println(x.toString());
		}
		// System.out.println("Level4");
		Level level5 = new Level(level5File);
		level5.setPreviousLevelPassed(true);
		for (Tile x : level5.getTileList()) {
			System.out.println(x.toString());
		}
		// System.out.println("Level5");
		
		Pane level1Pane = (Pane) level1.gameBuilder();
			//level1Pane.getStyleClass().add("gamePane");
		Pane level2Pane = (Pane) level2.gameBuilder();
			//level2Pane.getStyleClass().add("gamePane");
		Pane level3Pane = (Pane) level3.gameBuilder();
			//level3Pane.getStyleClass().add("gamePane");
		Pane level4Pane = (Pane) level4.gameBuilder();	
			//level4Pane.getStyleClass().add("gamePane");
		Pane level5Pane = (Pane) level5.gameBuilder();
			//level5Pane.getStyleClass().add("gamePane");
		
		//level1Pane.get
		
		Scene level1Scene = new Scene(level1Pane, 930, 700);
		level1Scene.getStylesheets().add("application/application.css");
		Scene level2Scene = new Scene(level2Pane, 930, 700);
		level2Scene.getStylesheets().add("application/application.css");
		Scene level3Scene = new Scene(level3Pane, 930, 700);
		level3Scene.getStylesheets().add("application/application.css");
		Scene level4Scene = new Scene(level4Pane, 930, 700);
		level4Scene.getStylesheets().add("application/application.css");
		Scene level5Scene = new Scene(level5Pane, 930, 700);
		level5Scene.getStylesheets().add("application/application.css");
		
		Image hintLevel1 = new Image(Level.class.getResourceAsStream("Images/hintLevel1.jpeg"));
		ImagePattern hintLevel11 = new ImagePattern(hintLevel1);
		Image hintLevel2 = new Image(Level.class.getResourceAsStream("Images/hintLevel2.jpeg"));
		ImagePattern hintLevel22 = new ImagePattern(hintLevel2);
		Image hintLevel3 = new Image(Level.class.getResourceAsStream("Images/hintLevel3.jpeg"));
		ImagePattern hintLevel33 = new ImagePattern(hintLevel3);
		Image hintLevel4 = new Image(Level.class.getResourceAsStream("Images/hintLevel4.jpeg"));
		ImagePattern hintLevel44 = new ImagePattern(hintLevel4);
		Image hintLevel5 = new Image(Level.class.getResourceAsStream("Images/hintLevel5.jpeg"));
		ImagePattern hintLevel55 = new ImagePattern(hintLevel5);
				
				
				
			
		
		EventHandler<MouseEvent> backButtonEvent = new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				primaryStage.setScene(levelScene);
			}
			
		};
		
		Button hintButton = new Button("HINT");
		hintButton.getStyleClass().add("hintButton");
		hintButton.setMinHeight(180);
		hintButton.setMinWidth(180);
		hintButton.setOnMousePressed(e -> {
			Rectangle rect = new Rectangle(180,180);
			rect.setTranslateX(700);
			rect.setTranslateY(465);
			rect.setFill(hintLevel11);
			level1Pane.getChildren().add(rect);
		});
		
		Button hintButton2 = new Button("HINT");
		hintButton2.getStyleClass().add("hintButton");
		hintButton2.setMinHeight(180);
		hintButton2.setMinWidth(180);
		hintButton2.setOnMousePressed(e -> {
			Rectangle rect = new Rectangle(180,180);
			rect.setTranslateX(700);
			rect.setTranslateY(465);
			rect.setFill(hintLevel22);
			level2Pane.getChildren().add(rect);
		});
		
		Button hintButton3 = new Button("HINT");
		hintButton3.getStyleClass().add("hintButton");
		hintButton3.setMinHeight(180);
		hintButton3.setMinWidth(180);
		hintButton3.setOnMousePressed(e -> {
			Rectangle rect = new Rectangle(180,180);
			rect.setTranslateX(700);
			rect.setTranslateY(465);
			rect.setFill(hintLevel33);
			level3Pane.getChildren().add(rect);
		});
		
		Button hintButton4 = new Button("HINT");
		hintButton4.getStyleClass().add("hintButton");
		hintButton4.setMinHeight(180);
		hintButton4.setMinWidth(180);
		hintButton4.setOnMousePressed(e -> {
			Rectangle rect = new Rectangle(180,180);
			rect.setTranslateX(700);
			rect.setTranslateY(465);
			rect.setFill(hintLevel44);
			level4Pane.getChildren().add(rect);
		});
		
		Button hintButton5 = new Button("HINT");
		hintButton5.getStyleClass().add("hintButton");
		hintButton5.setMinHeight(180);
		hintButton5.setMinWidth(180);
		hintButton5.setOnMousePressed(e -> {
			Rectangle rect = new Rectangle(180,180);
			rect.setTranslateX(700);
			rect.setTranslateY(465);
			rect.setFill(hintLevel55);
			level5Pane.getChildren().add(rect);
		});
		

		hintButton.setTranslateX(700);
		hintButton.setTranslateY(260);
		
		hintButton2.setTranslateX(700);
		hintButton2.setTranslateY(260);
		
		hintButton3.setTranslateX(700);
		hintButton3.setTranslateY(260);
		
		hintButton4.setTranslateX(700);
		hintButton4.setTranslateY(260);
		
		hintButton5.setTranslateX(700);
		hintButton5.setTranslateY(260);
		
		Button backButton = new Button("BACK");
		backButton.getStyleClass().add("backButton");
		backButton.setMinHeight(180);
		backButton.setMinWidth(180);
		backButton.setOnMousePressed(backButtonEvent);
		
		backButton.setTranslateX(700);
		backButton.setTranslateY(50);
		
		
		Button backButton2 = new Button("BACK");
		backButton2.getStyleClass().add("backButton");
		backButton2.setMinHeight(180);
		backButton2.setMinWidth(180);
		backButton2.setOnMousePressed(backButtonEvent);
		
		backButton2.setTranslateX(700);
		backButton2.setTranslateY(50);
		
		
		Button backButton3 = new Button("BACK");
		backButton3.getStyleClass().add("backButton");
		backButton3.setMinHeight(180);
		backButton3.setMinWidth(180);
		backButton3.setOnMousePressed(backButtonEvent);
		
		backButton3.setTranslateX(700);
		backButton3.setTranslateY(50);
		
		
		Button backButton4 = new Button("BACK");
		backButton4.getStyleClass().add("backButton");
		backButton4.setMinHeight(180);
		backButton4.setMinWidth(180);
		backButton4.setOnMousePressed(backButtonEvent);
		
		backButton4.setTranslateX(700);
		backButton4.setTranslateY(50);
		
		Button backButton5 = new Button("BACK");
		backButton5.getStyleClass().add("backButton");
		backButton5.setMinHeight(180);
		backButton5.setMinWidth(180);
		backButton5.setOnMousePressed(backButtonEvent);
		
		backButton5.setTranslateX(700);
		backButton5.setTranslateY(50);
		
		
		level1Pane.getChildren().addAll(backButton, hintButton);
		level2Pane.getChildren().addAll(backButton2, hintButton2);
		level3Pane.getChildren().addAll(backButton3, hintButton3);
		level4Pane.getChildren().addAll(backButton4, hintButton4);
		level5Pane.getChildren().addAll(backButton5, hintButton5);
		
		Image temp1 = level1.getTileList().get(0).getImage();
		Image temp2 = level1.getTileList().get(1).getImage();
		
		
		Text headerText = new Text(220, 140, "Find the Way");
		headerText.setFill(Color.BLACK);
		headerText.setStyle("-fx-font-size: 25; -fx-font-weight: bold;");

		Rectangle header = new Rectangle(80, 100, 440, 70);
		header.setFill(Color.rgb(231, 231, 231));
		
		
		header.setStroke(Color.rgb(85, 85, 85));
		header.setStrokeType(StrokeType.OUTSIDE);
		header.setStrokeWidth(1);

		// Create start button and exit button and place it in the entry scene
		Button startButton = new Button("START");
		startButton.setLayoutX(245);
		startButton.setLayoutY(230);
		startButton.getStyleClass().add("startButton");
		startButton.setOnMousePressed(e -> {
			primaryStage.setScene(levelScene);
		});
		Button exitButton = new Button("EXIT");
		exitButton.setLayoutX(245);
		exitButton.setLayoutY(302);
		exitButton.getStyleClass().add("exitButton");
		exitButton.setOnMousePressed(e -> {
			System.exit(1);
		});

		entryPane.getChildren().addAll(header, headerText, startButton, exitButton);
		/**************************************************
		 * -LEVELSCENE-
		 ********************************************************************/
		Button level1Button = new Button("1");
		level1Button.getStyleClass().add("levelButton");
		levelPane.add(level1Button, 0, 0);
		level1Button.setOnMousePressed(e -> {
			if (level1.isPreviousLevelPassed()) {
				primaryStage.setScene(level1Scene);
			}
		});
		Button level2Button = new Button("2");
		level2Button.getStyleClass().add("levelButton");
		levelPane.add(level2Button, 1, 0);
		level2Button.setOnMousePressed(e -> {
			if (level2.isPreviousLevelPassed()) {
				primaryStage.setScene(level2Scene);
			}
		});
		Button level3Button = new Button("3");
		level3Button.getStyleClass().add("levelButton");
		levelPane.add(level3Button, 2, 0);
		level3Button.setOnMousePressed(e -> {
			if (level3.isPreviousLevelPassed()) {
				primaryStage.setScene(level3Scene);
			}
		});
		Button level4Button = new Button("4");
		level4Button.getStyleClass().add("levelButton");
		levelPane.add(level4Button, 0, 1);
		level4Button.setOnMouseClicked(e -> {
			if (level4.isPreviousLevelPassed()) {
				primaryStage.setScene(level4Scene);
			}
		});
		Button level5Button = new Button("5");
		level5Button.getStyleClass().add("levelButton");
		levelPane.add(level5Button, 1, 1);
		level5Button.setOnMousePressed(e -> {
			if (level5.isPreviousLevelPassed()) {
				primaryStage.setScene(level5Scene);
			}
		});

		Button exitButton2 = new Button("EXIT");
		exitButton2.getStyleClass().add("exitButton");
		exitButton2.setOnMousePressed(e -> {
			System.exit(1);
		});
		levelPane.add(exitButton2, 2, 2);

		GridPane.setHalignment(level1Button, HPos.CENTER);
		GridPane.setHalignment(level2Button, HPos.CENTER);
		GridPane.setHalignment(level3Button, HPos.CENTER);
		GridPane.setHalignment(level4Button, HPos.CENTER);
		GridPane.setHalignment(level5Button, HPos.CENTER);
		GridPane.setHalignment(exitButton2, HPos.CENTER);
		GridPane.setHalignment(backButton, HPos.CENTER);
		GridPane.setValignment(backButton, VPos.CENTER);
		level1.placeEventOnTiles(level1.getTileList(), level1Pane);
		level2.placeEventOnTiles(level2.getTileList(), level2Pane);
		level3.placeEventOnTiles(level3.getTileList(), level3Pane);
		level4.placeEventOnTiles(level4.getTileList(), level4Pane);

		primaryStage.setScene(entryScene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
