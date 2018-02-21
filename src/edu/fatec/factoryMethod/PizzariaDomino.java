package edu.fatec.factoryMethod;

public class PizzariaDomino implements Pizzaria {
  
	@Override
    public Pizza produzPizza(String tipo) {
      Pizza p = null;
       if ("Muzzarela".equals(tipo)) {
           p = new PizzaMuzzarela();
         } else if ("Calabresa".equals(tipo)) {
            p = new PizzaCalabreza();
           }
          if (p != null) {
              p.preparar();
              p.assar();
              p.cortar();
              p.embalar();
          }
           return p;
         }
}
