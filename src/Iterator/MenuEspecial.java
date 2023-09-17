package Iterator;
import java.util.Iterator;
import java.util.Hashtable;

import Template.Hamburguesa;
import Template.HamburguesaRes;

public class MenuEspecial implements MenuComponent{
  Hashtable<String, Hamburguesa> hamburguesasEspeciales;
  String name, description;
  public MenuEspecial(String name, String description){
      this.hamburguesasEspeciales = new Hashtable<String, Hamburguesa>();
    this.name = name;
    this.description = description;
  }
  public void add(Hamburguesa hamburguesa){
    this.hamburguesasEspeciales.add(hamburguesa.getName(), hamburguesa);
  }
  public void remove(Hamburguesa hamburguesa){
    this.hamburguesasEspeciales.remove(hamburguesa.getName());
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
    return this.hamburguesasEspeciales.iterator();
  }
} 
