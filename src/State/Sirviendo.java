package State;

import java.util.concurrent.TimeUnit;

public class Sirviendo implements EstadoRobot{
    Robot robot;

    // Creamos un objeto TimeUnit para las pausas
    TimeUnit time = TimeUnit.SECONDS;

    public Sirviendo(Robot robot){
        this.robot = robot;
    }
    
    public void llamar(){
        System.out.println("Ya me llamaste. Solo me flata servirte.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO SIRVIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    public void caminar(){
        System.out.println("No puedo caminar. Solo me falta servirte.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO SIRVIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    public void ordenar(){
        System.out.println("¿Quieres mas? :O. Deja primero te sirvo y luego me vuelves a llamar.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO SIRVIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");

    }
    public void cocinar(){
        System.out.println("Ya ordenaste tu comida. Solo me falta servirte.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*        MODO SIRVIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }
    public void servir(){
            System.out.println("Ya te servi paps. Mejor mandame a dormir.");
    }

    
    public void suspender(){
            System.out.println("Gracias por ordenar en tu restaurante favorito Mcburguesas :).");
            System.out.println("Disfrute su comida.\n");
            System.out.println("Pasando a modo suspendido...\n");
            System.out.println("*****************************");
            System.out.println("*                           *");
            System.out.println("*      MODO SUSPENDIDO      *");
            System.out.println("*                           *");
            System.out.println("*****************************\n");
            robot.setEstado(robot.getEstadoSuspendido());
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
