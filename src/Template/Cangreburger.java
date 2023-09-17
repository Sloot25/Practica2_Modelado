package Template;

public class Cangreburger extends Hamburguesa{
    public Cangreburger(){
        tieneQueso = true; 
        esVegetariana = true;
        prepararHamburguesa();
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
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
