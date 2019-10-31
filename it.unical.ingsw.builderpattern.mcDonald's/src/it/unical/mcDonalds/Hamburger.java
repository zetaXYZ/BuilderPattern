package it.unical.mcDonalds;

public abstract class Hamburger implements Selection {

   @Override
   public Packaging packaging() {
      return new Bag();
   }

   @Override
   public abstract float price();
}