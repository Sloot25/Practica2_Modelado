package Template;

public class HamburguesaPollo extends Hamburguesa {
    public HamburguesaPollo(){
        esVegetariana = false;
        nombre = "Hamburguesa de Pollo";
        descripcion = "Un poco de Pollito ";
    }
    @Override
    public void prepararHamburguesa(){
        ponerPan();
        ponerMayonesa();
        prepararCarne();
        ponerCarne();
        if(clienteQuiereQueso())
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
}
