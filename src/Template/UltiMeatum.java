package Template;

public class UltiMeatum extends Hamburguesa{
    public UltiMeatum(){
        tieneQueso = true;
        esVegetariana = false;
        prepararHamburguesa();
        ponerPan();
        prepararCarne();
        ponerCarne();
        ponerQueso();
        ponerCatsup();
        ponerPan();
        ponerCarne();
        ponerQueso();
        ponerCatsup();
        ponerPan();
        hamburguesaAdentroDeOtra();
        ponerCarne();
        ponerQueso();
        ponerPan();
    }
    @Override 
    public void prepararCarne(){
        System.out.println("Preparando toda la carne");
    }
    public void hamburguesaAdentroDeOtra(){
        System.out.println("La UltiMeatum lleva ... Una hamburguesa con queso adentro de una hamburguesa con queso");
    }
    @Override
    public void ponerCatsup(){
        System.out.println("Agregando catsup especial traída del Himalaya");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
