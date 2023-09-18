package Iterator;
import java.util.Iterator; 
import java.util.ArrayList;
import Template.Hamburguesa;
import java.util.Stack;
import java.util.NoSuchElementException;
/*  Clase con referencia hacia los Menus, proporciona un Iterator para iterar a nuestros diversos Menus
 *
 * */
public class Menu implements MenuComponent {
  String name, description; 
  ArrayList<MenuComponent> listaDeMenus;
  
  /*  Constructor de la clase Menu 
   *  @param name El parametro numero de items recibe el nombre del Restaurante 
   *  @param description El parametro description recibe una pequeña description del restaurante en cuestion
   * */
  public Menu(String name, String description){
    this.name = name; 
    this.description = description;
    this.listaDeMenus = new ArrayList<MenuComponent>();
  }

  /*  Metodo que agrega nuevos menus a nuestro ArrayList 
   *  @param menuComponent Recibe un objeto de tipo MenuComponent, pensando en ser un Menu a agregar a nuestra estuctura
   *
   * */
  public void add(MenuComponent menuComponent){
    this.listaDeMenus.add(menuComponent);
  }

  /*  Metodo que elimina menus de nuestro ArrayList
   *  @param menuComponent Recibe el objeto de tipo MenuComponent, pensando en ser eliminado un Menu de nuestra estructura 
   *
   * */
  public void remove(MenuComponent menuComponent){
    this.listaDeMenus.remove(menuComponent);
  }

  /*  Metodo que regresa el String correspondiente al nombre del menu
   *  @return String correspondiente al nombre del menu
   *
   * */
  @Override
  public String getName(){
    return this.name; 
  }

  /*  Metodo que regresa el String correspondiente a la descripcion del menu
   *  @return String correspondiente a la description del menu
   *
   * */
  @Override
  public String getDescription(){
    return this.description;
  }

  /*  Regresa un objeto de nuestro ArrayList
   *  @param  int i Recibe un entero correspondiente a la posicion en nuestro ArrayList
   *  @return Regresa un objeto de menuComponent
   * */
  public MenuComponent getChid(int i ){
    if(i< 0 || i >= listaDeMenus.size())
      throw new UnsupportedOperationException();
    return listaDeMenus.get(i);
  }

  /*  Regresa un objeto de tipo Iterator que itera sobre el ArrayList
   *  @return Regresa un objeto de tipo Iterator
   *
   * */
  @Override
  public Iterator crearIterador(){
    return this.listaDeMenus.iterator();
  }
}
