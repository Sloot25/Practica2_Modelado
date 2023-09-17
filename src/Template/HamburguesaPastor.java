package Template;

public class HamburguesaPastor extends Hamburguesa {

    public HamburguesaPastor(){
        prepararHamburguesa();
        ponerPan();
        ponerMayonesa();
        prepararCarne();
        ponerCarne();
        ponerPina();
        if(tieneQueso())
            ponerQueso();
        ponerMostaza();
        ponerCatsup();
        ponerVegetales();
        ponerPan();
    }
    @Override 
    public void prepararCarne(){
        System.out.println("Asi es, una buena hamburguesa al pastor");
    }
    public void ponerPina(){
        System.out.println("Debe llevar piña, asi es");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
