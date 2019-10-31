package javaFX;

import it.unical.mcDonalds.Dish;
import it.unical.mcDonalds.DishBuilder;
import it.unical.mcDonalds.Selection;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class DishController extends Application implements EventHandler<ActionEvent> {

	@FXML
	private Label nomePanino;

	@FXML
	private Label nomeBevanda;

	@FXML
	private Label prezzo;

	public void bigTastyMenu(ActionEvent event) {

		DishBuilder dishBuilder = new DishBuilder();

		Dish BigTasty = dishBuilder.iWantBigTasty();
		System.out.println("BigTasty");
		
		BigTasty.showItems();
		System.out.println("Total Cost: " + BigTasty.getCost());
		
		nomePanino.setText("Big Tasty Menù");
		nomeBevanda.setText("Coca Cola");
		prezzo.setText("8€");
	}
	
	public void mcChickenMenu(ActionEvent event) {

		DishBuilder dishBuilder = new DishBuilder();

		Dish mcChicken = dishBuilder.iWantMcChicken();
		System.out.println("McChicken");
		
		mcChicken.showItems();
		System.out.println("Total Cost: " + mcChicken.getCost());
		
		nomePanino.setText("McChicken Menù");
		nomeBevanda.setText("Sprite");
		prezzo.setText("7,5€");
	}


	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

	}

}

