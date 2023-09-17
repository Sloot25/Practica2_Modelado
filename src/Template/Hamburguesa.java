package Template;

import java.util.Scanner;

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
        System.out.println("Preparandote una hamburguesa estimado cliente");

    }
    public void ponerPan(){
        System.out.println("Poniendo pan. Asi es");
    }
    public void ponerMayonesa(){
        System.out.println("Una buena hamburguesa debe llevar Mayonesa McCormick. Hellmans, Hellmans. Que bruto!");
    }
    public void ponerMostaza(){
        System.out.println("Agregando la mostaza.");
    }
    public abstract void prepararCarne();
    public void ponerCarne(){
        System.out.println("Agregando la carne");
    }
    public void ponerQueso(){
        if(!tieneQueso){
            Scanner scan = new Scanner(System.in);
            System.out.println("¿Le gustaria agregar queso a su hamburguesa estimado cliente?");
            System.out.println("1. Si    2. No  ");
            int i = 0;
            try{
                i = scan.nextInt();
            }
            catch(Exception e){
                System.out.println("No entendi, supongamos que no quieres queso");
            }
            if(i == 1)
                tieneQueso();
            scan.close();
        }
        else
            System.out.println("Agregando queso a tu hamburguesa");
    }
    public void ponerVegetales(){
        System.out.println("Lechuga, tomate, cebolla y pepinillos");
    }
    public void ponerCatsup(){
        System.out.println("Agregando ketchup. Y Asereje, a, reje, rejeturebeseiyounoubianajabeandebugidemajibiriki");
    }
}