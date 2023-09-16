package Iterator;

import java.util.ArrayList;

import Template.Hamburguesa;

public class MenuDelDia{
  ArrayList<Hamburguesa> hamburguesasMenuDelDia;
  String name, description;
  public MenuDelDia(String name, String description){
    this.name = name;
    this.description = description;
  }

  @Override
  public void add(MenuComponent menuComponent){
    hamburguesasMenuDelDia.add(menuComponent);
  }
  @Override 
  public void remove(MenuComponent menuComponent){
    hamburguesasMenuDelDia.remove(menuComponent);
  }
  @Override 
  public String getName(){
    return this.name;
  }
  @Override 
  public String getDescription(){
    return this.description;
  }
  public Iterator crearIterador(){

  }
}
