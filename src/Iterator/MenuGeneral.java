package Iterator;

import Template.*;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class MenuGeneral implements MenuComponent{
  Hamburguesa[] hamburguesasGeneral;
  String name, description;
  /*  Clase Interna para crear el Iterator
   *
   * */
  private class IteradorMenuGeneral implements Iterator{
      private int indice;

    /*  Constructor de la clase interna, inicializa un indice en 0
     *
     * */
      public IteradorMenuGeneral(){
        indice = 0;
      }
    /*  Metodo que nos regresa el siguiente elemento, si no existe lanza una exception
     *  @return Hamburguesa regresa la siguiente Hamburguesa de nuestra estructura
     *
     * */
      public Hamburguesa next() throws NoSuchElementException{
        if(!hasNext())
          throw new NoSuchElementException("No quedan mas elementos");
        Hamburguesa hamburguesa = hamburguesasGeneral[indice];
        indice++;
        return hamburguesa;
      }

    /*  Metodo que nos regresa True si hay siguiente elemento en el Iterator o false si no lo hay
     *  @return boolean correspondiente a si hay o no siguiente elemento
     *
     * */
      public boolean hasNext(){
        return indice < hamburguesasGeneral.length;
      }
  }

  /*  Constructor de la clase, inicializa el arreglo y les asigna sus correspondientes elementos, al igual que 
   *  inicializa los String con sus correspondientes valores dependiendo del menu
   *
   * */
  public MenuGeneral(){
    this.hamburguesasGeneral = new Hamburguesa[]{new HamburguesaPastor(), new HamburguesaPollo(), new HamburguesaSoya()};
    this.name = "Menu general"; 
    this.description = "Platillos de todos los dias, para el cliente casual";
  }

  /*  Metodo que regresa el nombre del menu
   *  @return String correspondiente al nombre del menu
   *
   * */
  @Override 
  public String getName(){
    return this.name;
  }
  
  /*  Metodo que regresa la description del menu
   *  @return String correspondiente a la descripcion del menu
   *
   * */
  @Override 
  public String getDescription(){
    return this.description;
  } 
  
  /*  Metodo que regresa un Iterator que itera sobre los platillos de nuestro menu
   *  @return Iterator correspondiente al arreglo del menu
   *
   * */
  @Override
  public Iterator crearIterador(){
    return new IteradorMenuGeneral();
  }
}
