package it.unical.mcDonalds;

import java.util.ArrayList;
import java.util.List;

public class Dish {
   private List<Selection> selections = new ArrayList<Selection>();	

   public void addSelection(Selection selection){
      selections.add(selection);
   }

   public float getCost(){
      float cost = 0.0f;
      
      for (Selection selection : selections) {
         cost += selection.price();
      }		
      return cost;
   }

   public void showItems(){
   
	   for (Selection selection : selections) {
         System.out.print("Selection : " + selection.name());
         System.out.print(", Package : " + selection.packaging().packaging());
         System.out.println(", Price : " + selection.price());
      }		
   }	
}