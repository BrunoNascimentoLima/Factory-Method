package edu.fatec.factoryMethod;

public class PizzaCalabreza extends Pizza {
 
@Override	
 public void preparar() {
 System.out.println("Preparando a Pizza Calabreza");
 }
 @Override
public void assar() {
 System.out.println("Assando a Pizza Calabreza");
  }
@Override
public void cortar() {
  System.out.println("Cortando a Pizza Calabreza");
  }
@Override
public void embalar() {
 	 System.out.println("Embalando a Pizza Calabreza");
 
 }
}