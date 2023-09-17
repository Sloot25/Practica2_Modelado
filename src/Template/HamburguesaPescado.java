package Template;
public class HamburguesaPescado extends Hamburguesa{
    public HamburguesaPescado(){
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
        System.out.println("Gatito gusta pescadito");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}