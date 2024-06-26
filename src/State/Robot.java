/*
 * Clase que recibe los iteradores de los menus y los estados que asumira el robot.
 * Se manda a llamar en el main y se actualiza con los metodos llamar(), caminar(),
 * ordenar(), etc.
 */
package State;
import java.util.Iterator;
import Template.Hamburguesa;

public class Robot implements EstadoRobot {
    EstadoRobot suspendido;
    EstadoRobot caminando;
    EstadoRobot atendiendo;
    EstadoRobot cocinando;
    EstadoRobot sirviendo;
    EstadoRobot autodestruido;
    EstadoRobot estadoActual;
    Iterator iteratorMenus;
    Boolean yaEscogioHamburguesa;
    Hamburguesa hamburguesaSeleccionada;


    public Robot(Iterator iteratorMenus){
      this.iteratorMenus = iteratorMenus;
        suspendido = new Suspendido(this);
        caminando = new Caminando(this);
        atendiendo = new Atendiendo(this);
        cocinando = new Cocinando(this);
        sirviendo = new Sirviendo(this);
        autodestruido = new AutoDestruido(this);
        
        yaEscogioHamburguesa = false; 
        estadoActual = suspendido;
    }

    /*
     * Metodos getters y setters utilizado en las clases Subclases de EstadoRobot  
     * para actualizar el estado del robot dependiendo de la accion que realice.
     */
    public EstadoRobot getEstado(){
        return estadoActual;
    }

    public void setEstado(EstadoRobot estadoRobot){
        estadoActual = estadoRobot;
    }

    /*
     * Metodos getters de cada estado del robot. Se utilizan en las clases 
     * Estado para actualizar el estado del robot dependiendo de la accion que realice.
     * 
     * @return: el estado que indica el nombre del metodo
     */
    public EstadoRobot getEstadoSuspendido(){
        return suspendido;
    }

    public EstadoRobot getEstadoCaminando(){
        return caminando;
    }

    public EstadoRobot getEstadoAtendiendo(){
        return atendiendo;
    }

    public EstadoRobot getEstadoCocinando(){
        return cocinando;
    }

    public EstadoRobot getEstadoSirviendo(){
        return sirviendo;
    }

    public EstadoRobot getEstadoAutodestruido(){
        return autodestruido;
    }

    /*
     * Metodos que seran ejecutados en el Main cuando se instancie la clase Robot
     * Se encargaran de realizar la accion marcada dependiendo del estado actual del robot.
     */

    public void llamar(){
        estadoActual.llamar();
    }

    public void caminar(){
        estadoActual.caminar();
    }

    public void ordenar(){
        estadoActual.ordenar();
    }

    public void cocinar(){
        estadoActual.cocinar();
    }

    public void servir(){
        estadoActual.servir();
    }

    public void suspender(){
        estadoActual.suspender();
    }

    public void autodestruir(){
        estadoActual.autodestruir();
    }
}
