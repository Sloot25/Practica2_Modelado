package State;
import java.util.Iterator;
import Iterator.MenuDelDia;
import Iterator.MenuEspecial;
import Iterator.MenuGeneral;

public class Robot {
    EstadoRobot suspendido;
    EstadoRobot caminando;
    EstadoRobot atendiendo;
    EstadoRobot cocinando;
    EstadoRobot sirviendo;
    EstadoRobot autodestruido;
    EstadoRobot estadoActual;
    Iterator iteratorMenus;
    int pasosServirPlatillo = 1;


    /*
     * Constructor temporal para correr la parte de State solamente
     */
    public Robot(Iterator iteratorMenus){
      this.iteratorMenus = iteratorMenus;
        suspendido = new Suspendido(this);
        caminando = new Caminando(this);
        atendiendo = new Atendiendo(this);
        cocinando = new Cocinando(this);
        sirviendo = new Sirviendo(this);
        autodestruido = new AutoDestruido(this);

        estadoActual = suspendido;
    }


    /*
     * Metodo que nos ayudara como contador cuando el robot este sirviendo
     * ya que requerimos que el usuario seleccione servir al menos una vez
     * para avanzar.
     */
    public void reducirPasosServirPlatillo(){
        pasosServirPlatillo = pasosServirPlatillo - 1;
    }


    /*
     * Metodos getter utilizado en las clases Subclases de EstadoRobot para 
     * actualizar el estado del robot dependiendo de la accion que realice.
     */
    public EstadoRobot getEstado(){
        return estadoActual;
    }

    public void setEstado(EstadoRobot estadoRobot){
        estadoActual = estadoRobot;
    }

    /*
     * Metodos getters de cada estado del robot. Se utilizan en las clases 
     * Estado para actualizar el estado robot dependiendo de la accion que realice.
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

    public void publicMenu(){

    }
}
