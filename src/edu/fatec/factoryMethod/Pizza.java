package edu.fatec.factoryMethod;

public abstract class Pizza {
   
   public void preparar() {
     System.out.println("Preparando a Pizza");
   }
 
   public void assar() {
     System.out.println("Assando a Pizza");
   }
   public void cortar() {
     System.out.println("Cortando a Pizza");
   }
   
   public void embalar() {
     System.out.println("Embalando a Pizza");
   }
}