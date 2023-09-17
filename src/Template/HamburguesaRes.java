package Template;

public class HamburguesaRes extends Hamburguesa{
    public HamburguesaRes(){
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
        System.out.println("La clasica hamburguesa de res, ya lista para cocinar");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
