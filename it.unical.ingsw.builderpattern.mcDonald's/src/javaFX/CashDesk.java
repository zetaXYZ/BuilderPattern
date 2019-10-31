package javaFX;

import java.io.IOException;
import javax.swing.JPanel;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CashDesk extends Application{

		@Override
		public void start(Stage primaryStage){
			try {
				Parent root = FXMLLoader.load(getClass().getResource("cashDesk.fxml"));			
				Scene scene = new Scene(root, 515, 400);
				//scene.getStylesheets().add(getClass().getResource("mcDonalds.css").toExternalForm());
				primaryStage.setTitle("Cassa Automatica");
				primaryStage.setScene(scene);
				primaryStage.show();


			}catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void main(String[] args) {
			launch(args);
		}	
	}
