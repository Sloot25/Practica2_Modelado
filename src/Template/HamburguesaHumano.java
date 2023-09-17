package Template;

public class HamburguesaHumano extends Hamburguesa{
    public HamburguesaHumano(){
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
        System.out.println("Preparando la carne donada 'voluntariamente' por el ultimo cliente. Tenia que pagar su comida de alguna manera");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
