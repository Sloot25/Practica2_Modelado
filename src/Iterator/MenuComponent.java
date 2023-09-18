package Iterator;
import java.util.Iterator;
/* Interface que sera implementada por nuestros Menus
 *
 * */
public interface MenuComponent{
  public String getName();
  public String getDescription();
  public Iterator crearIterador();
}
