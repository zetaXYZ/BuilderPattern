package it.unical.mcDonalds;


public class BigTasty extends Hamburger {

   @Override
   public float price() {
      return 5.0f;
   }

   @Override
   public String name() {
      return "BigTasty";
   }
}