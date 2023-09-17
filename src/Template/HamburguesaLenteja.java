package Template;

public class HamburguesaLenteja extends Hamburguesa{
    public HamburguesaLenteja(){
        esVegetariana = true;
        nombre = "Hamburguesa de Lentejas";
        descripcion = "Opcion saludable y nutritiva";
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
       System.out.println("Preparando la hamburguesa de lentejas"); 
    }
    @Override
    public void ponerVegetales(){
        System.out.println("Zanahoria, pimiento, cebolla");
    }
}
