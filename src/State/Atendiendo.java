/*
 * Estado del robot que se ejecuta cuando utilizan el metodo
 * llamar() en el estado Suspendido. Para avanzar al siguiente estado
 * debe ordenar(), seleccionar una hamburguesa y despues mandar a cocinar() 
 */

package State;
import Iterator.MenuComponent;
import Template.*;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Atendiendo implements EstadoRobot{
    Robot robot;
    Scanner entrada = new Scanner(System.in);
    Hamburguesa hamburguesa;
    String menu;
    // Creamos un objeto TimeUnit para las pausas
    TimeUnit time = TimeUnit.SECONDS;

    public Atendiendo(Robot robot){
        this.robot = robot;
        menu = "";
    }

    /*
     * Este metodo te mantiene en el estado Atendiendo
     */
    public void llamar(){
        System.out.println("Ya estoy contigo. Pa que me llamas.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Atendiendo
     */
    public void caminar(){
        System.out.println("¿Para que quiere que camine? Si ya estoy aqui papito.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Metodo que utiliza los iteradores creados en el Iterator para 
     * mostrar el menu al usuario y pedirle el ID de la hamburguesa a pedir. 
     * Guarda esto en la variable robot.hamburguesaSeleccionada y cambia 
     * la variable robot.yaEscogioHamburguesa = true que seran usados en 
     * el metodo cocinar()
     */

    public void ordenar(){
        System.out.println("Sale pues, te muestro el menu:");
        while(this.robot.iteratorMenus.hasNext()){
            MenuComponent menus = (MenuComponent) this.robot.iteratorMenus.next();
            Iterator iterator = menus.crearIterador();
            menu += "-------------------------------------------------------------------------\n";
            menu += menus.getName() + "\n";
            menu += "-------------------------------------------------------------------------\n";
            menu += menus.getDescription() + "\n";
            menu += "-------------------------------------------------------------------------\n";
            while(iterator.hasNext()){
                menu += iterator.next() + "\n";
                menu += "\n";
            }
        } 
        System.out.println(menu);
        System.out.println("¿Indique el Id de la hamburguesa que desea ordenar?");
  
        while(robot.yaEscogioHamburguesa == false){
            String opcionUsuario = entrada.nextLine();
            int opcion; 
            try {
                opcion = Integer.parseInt(opcionUsuario);
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero. Intente nuevamente.");
                continue;
            }
            switch(opcion){
                case 1001:
                    robot.hamburguesaSeleccionada = new HamburguesaPastor();
                    robot.yaEscogioHamburguesa = true;
                    break;

                case 1002:
                    robot.hamburguesaSeleccionada = new HamburguesaPollo();
                    robot.yaEscogioHamburguesa = true;
                    break;

                case 1003:
                    robot.hamburguesaSeleccionada = new HamburguesaSoya();
                    robot.yaEscogioHamburguesa = true;
                    break;

                case 2001:
                    robot.hamburguesaSeleccionada = new HamburguesaPescado();
                    robot.yaEscogioHamburguesa = true;
                    break;

                case 2002:
                    robot.hamburguesaSeleccionada = new UltiMeatum();
                    robot.yaEscogioHamburguesa = true;
                    break;

                case 2003:
                    robot.hamburguesaSeleccionada = new HamburguesaLenteja();
                    robot.yaEscogioHamburguesa = true;
                    break;

                case 3001:
                    robot.hamburguesaSeleccionada = new Cangreburger();
                    robot.yaEscogioHamburguesa = true;
                    break;

                case 3002:
                    robot.hamburguesaSeleccionada = new KrustyBurger();
                    robot.yaEscogioHamburguesa = true;
                    break;
                
                case 3003:
                    robot.hamburguesaSeleccionada = new HamburguesaHumano();
                    robot.yaEscogioHamburguesa = true;
                    break;

                default:
                    System.out.println("El Id que selecciono no se encuentra en el menu. Favor de intentarlo nuevamente ");
                }
        }
        
        System.out.println("\nHamburguesa seleccionada correctamente. Mandame a cocinar para preparar tu hamburguesa.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Metodo que te manda al estado Cocinando siempre y cuando el usuario 
     * haya escogido la hamburguesa. Tambien muestra en pantalla como
     * se prepara la hamburguesa.
     */
    public void cocinar(){
    
        if (robot.yaEscogioHamburguesa){
            System.out.println("Pasando a modo Cocinando...");
            System.out.println("*Suena Le Festini de fondo*\n");
            System.out.println("*****************************");
            System.out.println("*                           *");
            System.out.println("*      MODO COCINANDO       *");
            System.out.println("*                           *");
            System.out.println("*****************************\n");
            robot.hamburguesaSeleccionada.prepararHamburguesa();
            robot.setEstado(robot.getEstadoCocinando());
        }
        else{
            System.out.println("Primero escoge tu hamburguesa y luego ya vemos si cocinamos.");
            System.out.println("*******************************");
            System.out.println("*                             *");
            System.out.println("*       MODO ATENDIENDO       *");
            System.out.println("*                             *");
            System.out.println("*******************************\n");
        } 
    }

    /*
     * Este metodo te mantiene en el estado Atendiendo
     */
    public void servir(){
        System.out.println("¿Que te voy a servir si ni siquiera has pedido?  >:c\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Este metodo te mantiene en el estado Atendiendo
     */
    public void suspender(){
        System.out.println("Nel, no puedo dormir, ya estoy aqui.\n");
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*       MODO ATENDIENDO       *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");
    }

    /*
     * Metodo que te manda directamente al estado Autodestruido
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

