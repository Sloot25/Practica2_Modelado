package Iterator;

import Template.*;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class MenuGeneral extends MenuComponent{
  Hamburguesa[] hamburguesasGeneral;
  String name, description;
  public class IteradorMenuGeneral implements Iterator{
      private int indice;
      public IteradorMenuGeneral(){
        indice = 0;
      }
      public Hamburguesa next() throws NoSuchElementException{
        if(!hasNext())
          throw new NoSuchElementException("No quedan mas elementos");
        return hamburguesasGeneral[indice++];
      }
      public boolean hasNext(){
        return indice < hamburguesasGeneral.length-1;
      }
  }

  public MenuGeneral(String name, String description){
    hamburguesasGeneral = new Hamburguesa[3];
    hamburguesasGeneral[0] = new ;
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
  
  @Override 
  public MenuComponent getChild(int i){
    if(i < 0 || i >= hamburguesasGeneral.length)
      throw new UnsupportedOperationException();
    return hamburguesasGeneral[i];
  }
  public Iterator crearIterador(){
    return new IteradorMenuGeneral();
  }
}
