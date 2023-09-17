package Iterator;

import java.util.ArrayList;

import Template.Hamburguesa;

public class MenuDelDia{
  ArrayList<Hamburguesa> hamburguesasMenuDelDia;
  String name, description;
  public MenuDelDia(String name, String description){
    this.name = name;
    this.description = description;
    this.hamburguesasMenuDelDia = new ArrayList<Hamburguesa>();
  }

  public void add(Hamburguesa hamburguesa){
    hamburguesasMenuDelDia.add(hamburguesa);
  }
  public void remove(Hamburguesa hamburguesa){
    hamburguesasMenuDelDia.remove(hamburguesa);
  }
  @Override 
  public String getName(){
    return this.name;
  }
  @Override 
  public String getDescription(){
    return this.description;
  }
  @Override
  public Iterator crearIterador(){
    return hamburguesasMenuDelDia.iterator();
  }
}
