package Template;

public class HamburguesaSoya extends Hamburguesa {
    public HamburguesaSoya(){
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
        System.out.println("Preparando hamburguesa de soya");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
