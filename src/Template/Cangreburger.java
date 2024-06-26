/*
 * Hamburguesa del menu Especial
 */
package Template;

public class Cangreburger extends Hamburguesa{
    public Cangreburger(){
        this.id = 3001;
        precio = 180;
        esVegetariana = true;
        nombre = "Cangreburger";
        descripcion = "La iconica hamburguesa del Crustacio Cascarudo preparada por el cocinero estrella Bob Esponja";
    }

    @Override
    public void prepararHamburguesa(){
        ponerPan();
        ponerMayonesa();
        prepararCarne();
        ponerCarne();
        ponerQueso();
        ponerMostaza();
        ponerCatsup();
        ponerVegetales();
        ponerPan();
        amor();
    }

    @Override 
    public void prepararCarne(){
        System.out.println("Preparando la receta secreta de la cangreburger ");
    }
    
    public void amor(){
        System.out.println("Una buena cangreburger debe ser hecha con amor <3");
    }
}
