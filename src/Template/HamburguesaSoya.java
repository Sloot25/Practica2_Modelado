/*
 * Hamburguesa del menu general
 */
package Template;

public class HamburguesaSoya extends Hamburguesa {
    public HamburguesaSoya(){
        this.id = 1003;
        precio = 75.50;
        esVegetariana = true;
        nombre = "Hamburguesa de Soya";
        descripcion = "Una opcion vegana con soya y avena";
    }
    @Override
    public void prepararHamburguesa(){
        ponerPan();
        prepararCarne();
        ponerCarne();
        ponerSalsaSoya();
        ponerAvena();
        ponerMostaza();
        ponerCatsup();
        ponerVegetales();
        ponerPan();
    }

    @Override 
    public void prepararCarne(){
        System.out.println("Preparando hamburguesa de soya");
    }
    public void ponerAvena(){
        System.out.println("Agregando avena");
    }
    public void ponerSalsaSoya(){
        System.out.println("Agregando salsa de soya");
    }
}

