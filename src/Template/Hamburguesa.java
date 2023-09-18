/*
 * Clase padre de las hamburguesas. Contiene la mayoria de los metodos
 * de las hamburguesas donde se agregan los ingredientes y los metodos
 * getters para acceder a sus atributos que seran utilizados cuando se 
 * impriman los menus con el detalle de las hamburguesas
 */

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

    /*
     * Metodos getters
     */
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

    public Boolean esVegetariana() {
        return esVegetariana;
    }

    /*
     * Metodo hook ya que en vase a su resultado, algunas hamburguesas
     * se les puede o no mandar a llamar el metodo ponerQueso()
     * 
     * @return: true se pone queso, false no se pone queso
     */
    public Boolean clienteQuiereQueso(){
        System.out.println("¿Le gustaría queso en su hamburguesa? (s/n)");
        String s = obtenerRespuesta();
        if(s.toLowerCase().startsWith("s"))
            return true;
        else
            return false;
    }

    /*
     * Metodo para leer la respuesta del usuario,. 
     * 
     * @return: en caso de que ponga "n" o noponga nada, se pondra "no"
     *          En caso contrario retornara la respuesta del usuario
     */
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

    /*
     * Metodos que se mandan a llamar en el metodo prepararHamburguesa()
     */
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

    /*
     * Imprime los atributos de cada hamburguesa cuando se manda a llamar
     * a traves de los iteradores usados en la clase Atendiendo
     * 
     * @return s string que tiene las caracteristicas de la hamburguesa
     */
    public String toString(){
        String s = "";
        s += "Id: "+ String.valueOf(getId()) + "\n"
            + "Nombre: "+ getName() + "\n" 
            + "Descripcion: " + getDescripcion() + "\n"
            + "Precio: " + "$" + String.valueOf(getPrecio()) + "\n";
        if(esVegetariana())
            s += " (Vegetariana) ";
        return s;            
    }
}
