package Template;

public class Cangreburger extends Hamburguesa{
    public Cangreburger(){

    }
    @Override 
    public void prepararCarne(){
        System.out.println("Preparando la receta secreta de la cangreburger ");
    }
    @Override
    public void clienteQuiereQueso(){
        tieneQueso = true;
    }
}
