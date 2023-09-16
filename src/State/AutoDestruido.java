package State;

public class AutoDestruido implements EstadoRobot{
    Robot robot;

    public AutoDestruido(Robot robot){
        this.robot = robot;
    }

    public void llamar(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }
    public void caminar(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }
    public void ordenar(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }
    public void cocinar(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
    }
    public void servir(){
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");

    }
    public void suspender(){
        System.out.println("Solo por ti revivo paps...");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO SUSPENDIDO      *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
        robot.setEstado(robot.getEstadoSuspendido());
    }
    public void autodestruir() {
        System.out.println("No puedo, estoy morido. Suspendeme o meteme en arroz.");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      AUTODESTRUIDO XP     *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");

    }
}
