package Iterator;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Hashtable;

import Template.Hamburguesa;

public class MenuEspecial implements MenuComponent{
  Hashtable<Integer, Hamburguesa> hamburguesasEspeciales;
  String name, description;

  /*  Clase Interna del Iterator de nuestro HashTable
   *
   * */

  private class IteratorHashTable implements Iterator{
    private Iterator iterador;
    /*  Constructor del iterator, inicializa un iterator privado a partir de las llaves del HashTable
     *
     * */
    public IteratorHashTable(){
      this.iterador = hamburguesasEspeciales.keySet().iterator();
    }
    /*  Metodo que nos regresa si existe un elemento siguiente en nuestro Iterator
     *  @return True si existe un elemento siguiente, False si no existe
     *
     * */
    public boolean hasNext(){
      return this.iterador.hasNext();
    }

    /*  Metodo que nos regresa el elemento siguiente, si no existe este elemento lanzamos una exception
     *  @return Hamburguesa el elemento siguiente de nuestro HashTable
     *
     * */
    public Hamburguesa next(){
      if(!this.hasNext())
        throw new NoSuchElementException("No quedan mas elementos");
      return hamburguesasEspeciales.get(this.iterador.next());
    }

  }
  /*  Constructor de nuestra clase, inicializa el HashTable, y los String
   *  @param name String que corresponde al nombre del menu
   *  @param description String que corresponde a la descriptcion del menu
   *
   * */
  public MenuEspecial(String name, String description){
      this.hamburguesasEspeciales = new Hashtable<Integer, Hamburguesa>();
    this.name = name;
    this.description = description;
  }

  /*  Metodo para agregar elementos a nuestro HashTable
   *  @param hamburguesa Recibe un Objeto de tipo Hamburguesa para agregar al HashTable
   *
   * */
  public void add(Hamburguesa hamburguesa){
    this.hamburguesasEspeciales.put(hamburguesa.getId(), hamburguesa);
  }
  
  /*  Metodo para eliminar elementos de nuestro HashTable
   *  @param hamburguesa Recibe un Objeto de tipo Hamburguesa para eliminar del HashTable
   *
   * */
  public void remove(Hamburguesa hamburguesa){
    this.hamburguesasEspeciales.remove(hamburguesa.getId());
  }

  /*  Metodo que regresa el nombre del menu
   *  @return String correspondiente al nombre del menu 
   *  
   * */
  @Override
  public String getName(){
    return this.name;
  }

  /*  Metodo que regresa la descripcion del menu
   *  @return String correspondiente al nombre del menu
   *  
   * */
  @Override
  public String getDescription(){
    return this.description;
  }

  /*  Metodo que regresa un Iterator que itera los platillos del menu
   *  @return Iterator que nos regresa las Hamburguesas del HashTable
   *
   * */
  @Override
  public Iterator crearIterador(){
    return new IteratorHashTable();
  }
} 