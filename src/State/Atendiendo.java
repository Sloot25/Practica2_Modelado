package State;
import Iterator.MenuComponent;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Atendiendo implements EstadoRobot{
    Robot robot;

    // Creamos un objeto TimeUnit para las pausas
    TimeUnit time = TimeUnit.SECONDS;

    public Atendiendo(Robot robot){
        this.robot = robot;
    }

    public void llamar(){
        System.out.println("Ya estoy contigo. Pa que me llamas.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    public void caminar(){
        System.out.println("¿Para que quiere que camine? Si ya estoy aqui papito.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    public void ordenar(){
        System.out.println("Sale pues, te muestro el menu:");
        //System.out.println(".\n.\n.\n.\n.\n");           // aqui nos peleamos con colocar el menu y almacenar la hamburguesa que pide
      while(this.robot.iteratorMenus.hasNext()){
        MenuComponent menus = (MenuComponent) this.robot.iteratorMenus.next();
        Iterator iterator = menus.crearIterador();
      System.out.println("-------------------------------------------------------------------------");
        System.out.println(menus.getName());
      System.out.println("-------------------------------------------------------------------------");
      System.out.println(menus.getDescription());
      System.out.println("-------------------------------------------------------------------------");
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
      }
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    public void cocinar(){
        /*
         *  if (yaEscogioHamburguesa){
         *      cambiar a estadoCocinando
         * }
         *  else{
         *      System.out.println("Primero escoge tu hamburguesa y luego ya vemos si cocinamos.");
         * }
         */
        System.out.println("Pasando a modo Cocinando...");
        System.out.println("*Suena Le Festini de fondo*\n");
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*      MODO COCINANDO       *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");
        robot.setEstado(robot.getEstadoCocinando());
    }

    public void servir(){
        System.out.println("¿Que te voy a servir si ni siquiera has pedido?  >:c\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }
   
    public void suspender(){
        System.out.println("Nel, no puedo dormir, ya estoy aqui.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
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

