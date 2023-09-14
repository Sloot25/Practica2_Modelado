package State;

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
    MenuGeneral menugeneral;
    MenuDelDia menudeldia;
    MenuEspecial menuespecial;
    public EstadoRobot getEstado(){
        return estadoActual;
    }
    public void setEstado(EstadoRobot estadoRobot){
        estadoActual = estadoRobot;
    }
    public Robot(MenuGeneral menugeneral, MenuDelDia menudeldia, MenuEspecial menuespecial){
        this.menugeneral = menugeneral;
        this.menudeldia = menudeldia;
        this.menuespecial = menuespecial;
    }
    public void llamar(){

    }
    public void caminar(){

    }
    public void ordenar(){

    }
    public void cocinar(){

    }
    public void servir(){

    }
    public void suspender(){

    }
    public void autodestruir(){

    }
    public void publicMenu(){

    }
}
