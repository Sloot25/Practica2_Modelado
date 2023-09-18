package Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public abstract class Hamburguesa{
    Integer id;
    String nombre; 
    double precio;
    String descripcion;
    Boolean tieneQueso;
    Boolean esVegetariana;
    public Integer getId() {
        return id;
    }
    public String getName() {
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
    public Boolean clienteQuiereQueso(){
        System.out.println("¿Le gustaría queso en su hamburguesa? (s/n)");
        String s = obtenerRespuesta();
        if(s.toLowerCase().startsWith("s"))
            return true;
        else
            return false;
    }
    public Boolean esVegetariana() {
        return esVegetariana;
    }
    public String obtenerRespuesta(){
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            s = br.readLine();
        } catch (IOException ioe){
            System.err.println("Hubo un error leyendo la respuesta.");
        }
        if(s == null){
            return "no";
        }
        return s;
    }
    public void prepararHamburguesa(){
    }
    public void ponerPan(){
        System.out.println("Poniendo pan... Asi es.");
    }
    public void ponerMayonesa(){
        System.out.println("Poniendo mayonesa... una buena hamburguesa debe llevar Mayonesa McCormick. Hellmans, Hellmans. Que bruto!");
    }
    public void ponerMostaza(){
        System.out.println("Agregando la mostaza.");
    }
    public abstract void prepararCarne();
    public void ponerCarne(){
        System.out.println("Agregando la carne.");
    }
    public void ponerQueso(){
        System.out.println("Agregando queso.");
    }
    public void ponerVegetales(){
        System.out.println("Poniendo vegetales...Lechuga, tomate, cebolla y pepinillos.");
    }
    public void ponerCatsup(){
        System.out.println("Agregando ketchup... Y Asereje, a, reje, rejeturebeseiyounoubi.");
    }
    public String toString(){
        String s = "";
        s += "Id: "+ String.valueOf(id) + "\n"
            + "Nombre: "+ nombre + "\n" 
            + "Descripcion: " + descripcion + "\n"
            + "Precio: " + "$" + String.valueOf(precio) + "\n";
        if(esVegetariana())
            s += " (Vegetariana) ";
        return s;            
    }
}
