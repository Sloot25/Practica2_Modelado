package Iterator;
import java.util.Iterator;
import java.util.Hashtable;

import Template.Hamburguesa;

public class MenuEspecial implements MenuComponent{
  Hashtable<Integer, Hamburguesa> hamburguesasEspeciales;
  private class IteratorHashTable implements Iterator{
    private Iterator iterador;
    public IteratorHashTable(){
      this.iterador = hamburguesasEspeciales.keySet().iterator();
    }
    public boolean hasNext(){
      return this.iterador.hasNext();
    }
    public Hamburguesa next(){
      return hamburguesasEspeciales.get(this.iterador.next());
    }

  }
  String name, description;
  public MenuEspecial(String name, String description){
      this.hamburguesasEspeciales = new Hashtable<Integer, Hamburguesa>();
    this.name = name;
    this.description = description;
  }
  public void add(Hamburguesa hamburguesa){
    this.hamburguesasEspeciales.put(hamburguesa.getId(), hamburguesa);
  }
  public void remove(Hamburguesa hamburguesa){
    this.hamburguesasEspeciales.remove(hamburguesa.getId());
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
    return new IteratorHashTable();
  }
} 