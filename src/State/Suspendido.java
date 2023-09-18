/*
 * Estado del robot que se ejecuta cuando utilizan el metodo suspender()
 * en los estados Caminando, Sirviendo y Autodestruido. Para pasar 
 * al siguiente estado hay que llamar al metodo llamar().
 */
package State;
public class Suspendido implements EstadoRobot {
    Robot robot;
    
    public Suspendido(Robot robot){
        this.robot = robot;
    }

    /*
     * Este metodo te manda al estado Caminando
     */
    public void llamar(){
        System.out.println("¡Bienvenido al restaurante McBurguesas! En un momento estoy contigo.");
        System.out.println("Pasando a modo Caminado...\n");
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*       MODO CAMINANDO       *");
        System.out.println("*                            *");
        System.out.println("******************************\n");
        robot.setEstado(robot.getEstadoCaminando());
    }

    /*
     * Este metodo te mantiene en el estado Suspendido
     */
    public void caminar(){
        System.out.println("No puedo caminar, estoy mimido. Mandame a llamar primero.\n");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO SUSPENDIDO      *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Suspendido
     */
    public void ordenar(){
        System.out.println("No puedo tomar tu orden, estoy mimido. Mandame a llamar primero.\n");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO SUSPENDIDO      *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Suspendido
     */
    public void cocinar(){
        System.out.println("No me voy a poner a cocinar, estoy mimido. Mandame a llamar primero.\n");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO SUSPENDIDO      *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Suspendido
     */
    public void servir(){
        System.out.println("No puedo servir platillo, estoy mimido. Mandame a llamar primero.\n");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO SUSPENDIDO      *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }
   
    /*
     * Este metodo te mantiene en el estado Suspendido
     */
    public void suspender(){
        System.out.println("Ya estoy suspendido, me voy a dormir otro rato. Mandame a llamar primero.\n");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO SUSPENDIDO      *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Suspendido
     */
     public void autodestruir(){
        System.out.println("Si tengo ganas de autodestruirme, pero estoy mimido. Mandame a llamar primero.\n");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO SUSPENDIDO      *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }
    
}

