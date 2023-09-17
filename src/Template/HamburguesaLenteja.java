package Template;

public class HamburguesaLenteja extends Hamburguesa{
    public HamburguesaLenteja(){
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
       System.out.println("Preparando la hamburguesa de lentejas"); 
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
