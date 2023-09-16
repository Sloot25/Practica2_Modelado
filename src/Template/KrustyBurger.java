package Template;

public class KrustyBurger extends Hamburguesa{
    public KrustyBurger(){
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
    public void advertencia(){
        System.out.println("ADVERTENCIA. No nos hacemos responsables por cualquier daño a la salud causado por el consumo de esta hamburguesa");
    }
    @Override 
    public void prepararCarne(){
        System.out.println("Preparando carne de dudosa calidad.");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
