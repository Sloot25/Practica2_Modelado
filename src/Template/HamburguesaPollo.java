package Template;

public class HamburguesaPollo extends Hamburguesa {
    public HamburguesaPollo(){
        tieneQueso = false;
        esVegetariana = false;
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
       System.out.println("Aguanta en lo que voy a matar a la gallina");
       System.out.println("Quieto, no me estes picoteando. AAAAAAAA");
       System.out.println("Ya tenemos a la gallina lista para cocinar");

    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
