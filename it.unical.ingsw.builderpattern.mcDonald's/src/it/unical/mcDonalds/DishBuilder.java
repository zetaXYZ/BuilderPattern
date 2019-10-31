package it.unical.mcDonalds;


//Classe che mi costruisce il vassoio in base al menu scelto
public class DishBuilder {

	   public Dish iWantBigTasty(){
	      Dish dish = new Dish();
	      dish.addSelection(new BigTasty());
	      dish.addSelection(new CocaCola());
	      return dish;
	   }   

	   public Dish iWantMcChicken (){
	      Dish dish = new Dish();
	      dish.addSelection(new McChicken());
	      dish.addSelection(new Sprite());
	      return dish;
	   }
	}