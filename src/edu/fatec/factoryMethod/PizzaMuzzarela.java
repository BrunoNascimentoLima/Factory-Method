package edu.fatec.factoryMethod;

public class PizzaMuzzarela extends Pizza {

	@Override
	public void preparar() {
     System.out.println("Preparando a Pizza Muzzarela");
    }
     
	@Override
    public void assar() {
     System.out.println("Assando a Pizza Muzzarela");
    }

     @Override
     public void cortar() {
   System.out.println("Cortando a Pizza Muzzarela");
  }

    @Override
     public void embalar() {
   System.out.println("Embalando a Pizza Muzzarela");
 }
}
