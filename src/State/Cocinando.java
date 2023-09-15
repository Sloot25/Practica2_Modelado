package State;

import java.util.concurrent.TimeUnit;

public class Cocinando implements EstadoRobot {
    Robot robot;
    // Creamos un objeto TimeUnit para las pausas
    TimeUnit time = TimeUnit.SECONDS;

    public Cocinando(Robot robot){
        this.robot = robot;
    }
    
    public void llamar(){
        System.out.println("Ya estoy cocinando tu comida. Perame.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    public void caminar(){
        System.out.println("No puedo caminar mientras cocino. Perame.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    public void ordenar(){
        System.out.println("Ya ordenaste tu comida. Perame.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");

    }
    public void cocinar(){
        System.out.println("No estas viendo que ya estoy cocinado tu comida. *Sigue sonando Le Festini de fondo*. Perame.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }
    public void servir(){
        System.out.println("¡Platillo listo!");
        System.out.println("Pasando a modo sirviendo...\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO SIRVIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
        System.out.println("Favor de dar en Servir nuevamente :), sino no te sirvo.\n");
        robot.setEstado(robot.getEstadoSirviendo());
    }

    
    public void suspender(){
        System.out.println("No puedo suspenderme mientras cocino.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO COCINANDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }
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
