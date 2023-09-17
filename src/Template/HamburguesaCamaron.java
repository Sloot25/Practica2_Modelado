package Template;

public class HamburguesaCamaron extends Hamburguesa{
    public HamburguesaCamaron(){
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
        System.out.println("Tu me pides camaron y yo te lo voy a dar. \n Yo te quiero corazon, por ti lo voy a pescar");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
