import java.util.Iterator; 
import java.util.Stack;

public class IteratorCompuesto implements Iterator{
  Stack stack; 
  public IteratorCompuesto(Iterator iterator){
    this.stack = new Stack();
    this.stack.push(iterator);
  }
  public boolean hasNext(){
    if(stack.empty()){
      return false;
    } else {
      Iterator iterator = (Iterator) this.stack.peek();
      if(!iterator.hasNext()){
        stack.pop();
        return hasNext();
      } else{
        return true;
      }
    }
  }
}
