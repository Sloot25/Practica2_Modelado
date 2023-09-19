/*
 * Estado del robot que se ejecuta cuando utilizan el metodo llamar()
 * en el estado Suspendido. Para pasar al siguiente estado hay que 
 * llamar al metodo caminar(), suspender o bien, autodestruir().
 */

package State;

import java.util.concurrent.TimeUnit;

public class Caminando implements EstadoRobot {
    Robot robot;
    // Creamos un objeto TimeUnit para las pausas
    TimeUnit time = TimeUnit.SECONDS;

    public Caminando(Robot robot) {
        this.robot = robot;
    }

    /*
     * Este metodo te mantiene en el estado Caminando
     */
    public void llamar() {
        System.out.println("Ya me llamaste, en un momento estoy contigo.\n");
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*       MODO CAMINANDO       *");
        System.out.println("*                            *");
        System.out.println("******************************\n");
    }

    /*
     * Este metodo te manda al siguiente estado Atendiendo
     */
    public void caminar(){
        try {
            System.out.println("¡Voy en camino!");
            System.out.println("...");
            time.sleep(2);
            System.out.println("Ya casi llego, awanta.");
            System.out.println("...");
            time.sleep(2);
            System.out.println("Solo un poco mas.");
            System.out.println("...");
            time.sleep(2);
            System.out.println("¡He llegado!.\n");        
        }
        catch (InterruptedException e) {
            System.out.println("He llegado, que desesperado >:v\n");
        }
        System.out.println("Pasando a modo Atendiendo...\n");
        robot.setEstado(robot.getEstadoAtendiendo());
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }
    
    /*
     * Este metodo te mantiene en el estado Caminando
     */
    public void ordenar() {
        System.out.println("No puedo tomar tu orden, aun no llego. Perame\n");
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*       MODO CAMINANDO       *");
        System.out.println("*                            *");
        System.out.println("******************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Caminando
     */
    public void cocinar() {
        System.out.println("No puedo cocinar si ando caminando. No manches\n");
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*       MODO CAMINANDO       *");
        System.out.println("*                            *");
        System.out.println("******************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Caminando
     */
    public void servir() {
        System.out.println("¿Que te voy a servir si ni siquiera he llegado?  >:c\n");
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*       MODO CAMINANDO       *");
        System.out.println("*                            *");
        System.out.println("******************************\n");
    }

    /*
     * Este metodo te manda al estado Suspendido
     */
    public void suspender() {
        System.out.println("Ah bueno, ni queria. A mimir.\nPasando a modo suspendido.\n");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO SUSPENDIDO      *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
        robot.setEstado(robot.getEstadoSuspendido());
    }

    /*
     * Este metodo te manda al estado Autodestruido
     */
    public void autodestruir() {
        robot.hamburguesaSeleccionada = null;
        robot.yaEscogioHamburguesa = false;
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
