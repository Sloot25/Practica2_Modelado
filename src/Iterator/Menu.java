package Iterator;
import java.util.Iterator; 
import java.util.Stack;
import java.util.NoSuchElementException;

public class Menu implements MenuComponent {
  String name, description; 
  ArrayList<MenuComponent> listaDeMenus;

  private class IteratorCompuesto implements Iterator{
    Stack<Iterator> stack; 
    public IteratorCompuesto(){
      this.stack = new Stack();
      this.stack.push(listaDeMenus.iterator());
    }
    public boolean hasNext(){
      if(stack.empty()){
        return false;
      } else {
        Iterator iterator =  this.stack.peek();
        if(!iterator.hasNext()){
          stack.pop();
          return hasNext();
        } else{
          return true;
        }
      }
    }
    public Hamburguesa next() throws NoSuchElementException{
      if(!hasNext())
        throw new NoSuchElementException();
      Iterator iterator = stack.peek();
      return (Hamburguesa) iterator.next();
      
    } 
  }
  public Menu(String name, String description){
    this.name = name; 
    this.description = description;
    this.listaDeMenus = new ArrayList<MenuComponent>();
    this.listaDeMenus.add(new MenuDelDia());
    this.listaDeMenus.add(new MenuEspecial());
    this.listaDeMenus.add(new MenuGeneral());
  }
  public void add(MenuComponent menuComponent){
    this.listaDeMenus.add(menuComponent);
  }
  public void remove(MenuComponent menuComponent){
    this.listaDeMenus.remove(menuComponent);
  }
  public String getName(){
    return this.name; 
  }
  public String getDescription(){
    return this.description;
  }
  public MenuComponent getChid(int i ){
    if(i< 0 || if >= listaDeMenus.size())
      throw new UnsupportedOperationException();
    return listaDeMenus[i];
  }
  public void print(){
    System.out.print("\n" + getName());
    System.out.println(", " + getDescription());
    System.out.println("-------------------------------");

    Iterator iterator = new IteratorCompuesto();
    for(MenuComponent menuComponent : this.listaDeMenus)
      System.out.println(menuComponent);
  }
  public Iterator crearIterador(){
    return new IteratorCompuesto();
  }
}
