package it.unical.mcDonalds;



public class MainBuilder {
	
	   public static void main(String[] args) {
	   
	      DishBuilder dishBuilder = new DishBuilder();

	      Dish BigTasty = dishBuilder.iWantBigTasty();
	      System.out.println("BigTasty");
	      BigTasty.showItems();
	      System.out.println("Total Cost: " + BigTasty.getCost());

	      Dish McChicken = dishBuilder.iWantMcChicken();
	      System.out.println("McChicken");
	      McChicken.showItems();
	      System.out.println("Total Cost: " + McChicken.getCost());
	   }
	}