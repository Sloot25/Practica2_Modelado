/*
 * Estado del robot que se ejecuta cuando utilizan el metodo autodestruir() 
 * en el estado Atendiendo, Caminando, Cocinando y Sirviendo. Para salir 
 * de este estado hay que suspender() para ir al estado Suspendido
 */
package State;

public class AutoDestruido implements EstadoRobot{
    Robot robot;

    public AutoDestruido(Robot robot){
        this.robot = robot;
    }

    /*
     * Este metodo te mantiene en el estado Autodestruido
     */
    public void llamar(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Autodestruido
     */
    public void caminar(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Autodestruido
     */
    public void ordenar(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Autodestruido
     */
    public void cocinar(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Autodestruido
     */
    public void servir(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }

    /*
     * Este metodo te regresa al estado Suspendido
     */
    public void suspender(){
        System.out.println("Solo por ti revivo paps...");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO SUSPENDIDO      *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
        robot.setEstado(robot.getEstadoSuspendido());
    }

    /*
     * Este metodo te mantiene en el estado Autodestruido
     */
    public void autodestruir() {
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }
}
