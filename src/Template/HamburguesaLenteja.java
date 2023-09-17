package Template;

public class HamburguesaLenteja extends Hamburguesa{
    public HamburguesaLenteja(){
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
       System.out.println("Preparando la hamburguesa de lentejas"); 
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
