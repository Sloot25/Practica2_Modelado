/*
 * Hamburguesa del menu del dia
 */
package Template;
public class HamburguesaPescado extends Hamburguesa{
    public HamburguesaPescado(){
        this.id = 2001;
        precio = 110;
        esVegetariana = false;
        nombre = "Hamburguesa de pescado";
        descripcion = "Rico Rico Pescadito";
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
        System.out.println("Gatito gusta pescadito");
    }
}