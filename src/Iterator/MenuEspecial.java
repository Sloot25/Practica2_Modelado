package Iterator;

import java.util.Hashtable;

import Template.Hamburguesa;
import Template.HamburguesaRes;

public class MenuEspecial {
  Hashtable<String, MenuComponent> hamburguesasEspeciales;
  String name, description;
  public MenuEspecial(String name, String description){
      this.hamburguesasEspeciales = hamburguesasEspeciales;
  }
  @Override 
  public void add(MenuComponent menuComponent){
    this.hamburguesasEspeciales.add(menuComponent.getName(), menuComponent);
  }
  @Override 
  public void remove(MenuComponent menuComponent){
    this.hamburguesasEspeciales.remove(menuComponent.getName());
  }
  @Override
  public String getName(){
    return this.name;
  }
  @Override
  public String getDescription(){
    return this.description;
  }
  public void crearIterador(){
    return this.hamburguesasEspeciales.iterator();
  }
}
