package it.unical.mcDonalds;

public class McChicken extends Hamburger {

   @Override
   public float price() {
      return 4.5f;
   }

   @Override
   public String name() {
      return "McChicken";
   }
}