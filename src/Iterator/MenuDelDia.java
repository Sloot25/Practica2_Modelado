package Iterator;
import java.util.Iterator;
import java.util.ArrayList;

import Template.Hamburguesa;

public class MenuDelDia implements MenuComponent{
  ArrayList<Hamburguesa> hamburguesasMenuDelDia;
  String name, description;

  /* Constructor de la clase MenuDelDia, inicializa el ArrayList y asigna valores a nuestros atributos correspondientes a 
   * los nombres y descripcion de nuestro menu
   *
   * */
  public MenuDelDia(){
    this.name = "Menu Diario";
    this.description = "Este menu se actualiza cada dia, No tendras otra oportunidad de probar estas hamburguesas";
    this.hamburguesasMenuDelDia = new ArrayList<Hamburguesa>();
  }

  /*  Metodo para agregar objetos de tipo Hamburguesa a nuestro ArrayList
   *  @param hamburguesa La Hamburguesa a agregar a nuestro Menu
   *
   * */
  public void add(Hamburguesa hamburguesa){
    hamburguesasMenuDelDia.add(hamburguesa);
  }

  /*  Metodo para eliminar objetos de tipo Hamburguesa de nuestro ArrayList
   *  @param hamburguesa La Hamburguesa a quitar de neustro menu
   *
   * */
  public void remove(Hamburguesa hamburguesa){
    hamburguesasMenuDelDia.remove(hamburguesa);
  }

  /*  Metodo para obtener el nombre de nuestro menu
   *  @return String el nombre de nuestro menu
   *
   * */
  @Override 
  public String getName(){
    return this.name;
  }

  /*  Metodo para obtener la description de nuestro Menu
   *  @return String description de nuestro Menu
   *
   * */
  @Override 
  public String getDescription(){
    return this.description;
  }

  /*  Metodo para obtener un Iterator de nuestras Hamburguesas
   *  @return Iterator Regresa el Iterator de nuestro ArrayList
   *
   * */
  @Override
  public Iterator crearIterador(){
    return hamburguesasMenuDelDia.iterator();
  }
}
