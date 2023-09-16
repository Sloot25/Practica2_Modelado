import java.util.Iterator; 

public class IteratorNull implements Iterator{
  
  public boolean hasNext(){
    return false; 
  }

  public Object next(){
    return null;
  }
}
