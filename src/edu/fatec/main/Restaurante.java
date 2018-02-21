package edu.fatec.main;

import edu.fatec.factoryMethod.Pizza;
import edu.fatec.factoryMethod.Pizzaria;
import edu.fatec.factoryMethod.PizzariaDomino;

public class Restaurante {
  
  public void preparaPizzas() {
   Pizzaria fabricaPizzaDomino = new PizzariaDomino();
   Pizza p1 = fabricaPizzaDomino.produzPizza("Muzzarela");
   Pizza p2 = fabricaPizzaDomino.produzPizza("Calabresa");
  }
   public static void main(String args[]) {
	   Restaurante r = new Restaurante();
	   r.preparaPizzas();
	   }
  
}
