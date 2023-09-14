package Template;
public abstract class Hamburguesa{
    int id;
    String nombre; 
    double precio;
    String descripcion;
    Boolean tieneQueso;
    Boolean esVegetariana;
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Boolean tieneQueso() {
        return tieneQueso;
    }
    public void clienteQuiereQueso(){
        this.tieneQueso = true;
    }
    public Boolean esVegetariana() {
        return esVegetariana;
    }
    public void prepararHamburguesa(){

    }
    public void ponerPan(){

    }
    public void ponerMayonesa(){

    }
    public void Mostaza(){

    }
    public abstract void prepararCarne();
    public void ponerCarne(){

    }
    public void ponerQueso(){

    }
    public void ponerVegetales(){

    }
    public void ponerCatsup(){

    }

}