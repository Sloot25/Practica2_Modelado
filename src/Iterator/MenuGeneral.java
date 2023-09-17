package Iterator;

import Template.*;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class MenuGeneral implements MenuComponent{
  Hamburguesa[] hamburguesasGeneral;
  String name, description;
  private class IteradorMenuGeneral implements Iterator{
      private int indice;
      public IteradorMenuGeneral(){
        indice = 0;
      }
      public Hamburguesa next() throws NoSuchElementException{
        if(!hasNext())
          throw new NoSuchElementException("No quedan mas elementos");
        Hamburguesa hamburguesa = hamburguesasGeneral[indice];
        indice++;
        return hamburguesa;
      }
      public boolean hasNext(){
        return indice < hamburguesasGeneral.length;
      }
  }

  public MenuGeneral(String name, String description){
    hamburguesasGeneral = new Hamburguesa[3];
    hamburguesasGeneral[0] = new HamburguesaPastor();
    hamburguesasGeneral[1] = new HamburguesaPollo();
    hamburguesasGeneral[2] = new HamburguesaSoya();
    this.name = name; 
    this.description = description;
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
    return new IteradorMenuGeneral();
  }
}
