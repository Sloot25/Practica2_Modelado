package Template;

public class Cangreburger extends Hamburguesa{
    public Cangreburger(){
        prepararHamburguesa();
        ponerPan();
        ponerMayonesa();
        prepararCarne();
        ponerCarne();
        if(tieneQueso())
            ponerQueso();
        ponerMostaza();
        ponerCatsup();
        ponerVegetales();
        ponerPan();
    }
    @Override 
    public void prepararCarne(){
        System.out.println("Preparando la receta secreta de la cangreburger ");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
