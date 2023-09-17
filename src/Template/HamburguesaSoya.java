package Template;

public class HamburguesaSoya extends Hamburguesa {
    public HamburguesaSoya(){
        tieneQueso = false;
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
    }
    @Override 
    public void prepararCarne(){
        System.out.println("Preparando hamburguesa de soya");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
