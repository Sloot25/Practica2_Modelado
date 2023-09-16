package Iterator;

public class Menu extends MenuComponent {
  String name, description; 
  ArrayList<MenuComponent> listaDeMenus;
  public Menu(String name, String description){
    this.name = name; 
    this.description = description;
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

    Iterator iterator = menuComponents.iterator();
    while(iterator.hasNext()){
      MenuComponent menuComponent = (MenuComponent) iterator.next();
      menuComponent.print();
    }
  }
  public Iterator 
}
