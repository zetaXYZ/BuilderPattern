package it.unical.mcDonalds;

public abstract class Beverage implements Selection {

	@Override
	public Packaging packaging() {
       return new Glass();
	}

	@Override
	public abstract float price();
}