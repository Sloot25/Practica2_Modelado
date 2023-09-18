/*
 * Estado del robot que se ejecuta cuando utilizan el metodo cocinar()
 * en el estado Atendiendo. Para pasar al siguiente estado hay que 
 * llamar al metodo servir() o bien, autodestruir().
 */

package State;

import java.util.concurrent.TimeUnit;

public class Cocinando implements EstadoRobot {
    Robot robot;
    // Creamos un objeto TimeUnit para las pausas
    TimeUnit time = TimeUnit.SECONDS;

    public Cocinando(Robot robot){
        this.robot = robot;
    }
    
    /*
     * Este metodo te mantiene en el estado Cocinando
     */
    public void llamar(){
        System.out.println("Ya estoy cocinando tu comida. Perame.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Cocinando
     */
    public void caminar(){
        System.out.println("No puedo caminar mientras cocino. Perame.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Cocinando
     */
    public void ordenar(){
        System.out.println("Ya ordenaste tu comida. Perame.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Cocinando
     */
    public void cocinar(){
        System.out.println("Tu comida aun no esta lista. Perame. *Sigue sonando Le Festini de fondo*.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Este metodo te manda al estado Sirviendo
     */
    public void servir(){
        System.out.println("¡Platillo listo!");
        System.out.println("Pasando a modo sirviendo...\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO SIRVIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
        
        try {
            System.out.println("Sirviendo...");
            time.sleep(2);
            System.out.println("...");
            time.sleep(2);
            System.out.println("¡Platillo Servido!\n");     
            }
            catch (InterruptedException e) {
                System.out.println("Que desesperado >:v. Platillo servido.\n");
            }
        robot.yaEscogioHamburguesa = false;
        robot.setEstado(robot.getEstadoSirviendo());
    }

    /*
     * Este metodo te mantiene en el estado Cocinando
     */    
    public void suspender(){
        System.out.println("No puedo suspenderme mientras cocino.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Este metodo te manda al estado Autodestruido
     */
    public void autodestruir() {
        System.out.println("Entonces has elegido el camino de la muerte. Autodestruccion en:");
        try {
            System.out.println("5");
            time.sleep(1); 
            System.out.println("4");
            time.sleep(1);  
            System.out.println("3");
            time.sleep(1);  
            System.out.println("2");
            time.sleep(1);  
            System.out.println("1");
            time.sleep(1);  
            System.out.println("KBOOOOOM");
            time.sleep(1);  
        }
        catch (InterruptedException e) {
            System.out.println("54321....KBOOOOOM");
    }
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
        robot.setEstado(robot.getEstadoAutodestruido());
    }
}
