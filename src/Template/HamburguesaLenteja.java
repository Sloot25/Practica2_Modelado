/*
 * Hamburguesa del menu del dia
 */
package Template;

public class HamburguesaLenteja extends Hamburguesa{
    public HamburguesaLenteja(){
        this.id = 2003;
        precio = 80;
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
