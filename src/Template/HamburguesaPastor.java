package Template;

public class HamburguesaPastor extends Hamburguesa {

    public HamburguesaPastor(){
        esVegetariana = false;
        nombre = "Hamburguesa de Pastor";
        descripcion = "Especial Mexicana por el dia de la independencia";
    }
    @Override
    public void prepararHamburguesa(){
        ponerPan();
        ponerMayonesa();
        prepararCarne();
        ponerCarne();
        ponerPina();
        if(clienteQuiereQueso())
            ponerQueso();
        ponerMostaza();
        ponerCatsup();
        if(clienteQuiereSalsa())
            ponerSalsaQuePica();
        else    
            ponerSalsaQueNoPica();
        ponerVegetales();
        ponerPan();

    }
    @Override 
    public void prepararCarne(){
        System.out.println("Asi es, una buena hamburguesa al pastor");
    }
    public void ponerPina(){
        System.out.println("Debe llevar piña, asi es");
    }
    public Boolean clienteQuiereSalsa(){
        System.out.println("¿Le gustaría salsa de la que si pica, o salsa de la que no pica? (s/n)");
        String s = obtenerRespuesta();
        if(s.toLowerCase().startsWith("s"))
            return true;
        else
            return false;
    }
    public void ponerSalsaQuePica(){
        System.out.println("ESOOO, ahi va la salsa de la que si pica");
    }
    public void ponerSalsaQueNoPica(){
        System.out.println("Bueno, ahi va la salsa que no pica");
    }
}
