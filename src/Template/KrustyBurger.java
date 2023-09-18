package Template;

public class KrustyBurger extends Hamburguesa{
    public KrustyBurger(){
        precio = 185.50;
        this.id = 3002;
        esVegetariana = true;
        nombre = "KrustyBurger";
        descripcion = "La famosa Hamburguesa del Payaso Krusty";
    }
    @Override
    public void prepararHamburguesa(){
        advertencia();
        ponerPan();
        ponerMayonesa();
        prepararCarne();
        ponerCarne();
        if(clienteQuiereQueso())
            ponerQueso();
        ponerTocino();
        salsaSecreta();
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
    public void salsaSecreta(){
        System.out.println("Agregando salsa secreta");
    }
    public void ponerTocino(){
        System.out.println("Agregando tocino");
    }
}
