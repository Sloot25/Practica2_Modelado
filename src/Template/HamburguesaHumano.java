package Template;

public class HamburguesaHumano extends Hamburguesa{
    public HamburguesaHumano(){
        esVegetariana = false;
        nombre = "Hamburguesa de Humano";
        descripcion = "Hamburguesa preparado con la carne de los clientes que se van sin pagar";
    }
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
        System.out.println("Preparando la carne donada 'voluntariamente' por el ultimo cliente. Tenia que pagar su comida de alguna manera");
    }
}
