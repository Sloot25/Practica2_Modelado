package Template;

public class UltiMeatum extends Hamburguesa{
    public UltiMeatum(){
        this.id = 2002;
        precio = 200;
        esVegetariana = false;
        nombre = "MagnifiCarne";
        descripcion = "La mejor hamburguesa del mundo. Solo se prepara una vez cada mil años. El que no se coma una es un zoquete";
    }
    @Override
    public void prepararHamburguesa(){
        ponerPan();
        prepararCarne();
        ponerCarne();
        ponerQueso();
        ponerCatsup();
        ponerPan();
        ponerCarne();
        ponerQueso();
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
        System.out.println("Agregando hamburguesa de queso adentro de otra hamburguesa de queso");
    }
    @Override
    public void ponerCatsup(){
        System.out.println("Agregando catsup especial traída del Himalaya");
    }
}
