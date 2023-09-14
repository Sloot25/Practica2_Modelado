package Iterator;

import java.util.Hashtable;

import Template.Hamburguesa;
import Template.HamburguesaRes;

public class MenuEspecial {
    Hashtable<Hamburguesa,String> hamburguesasEspeciales;
    public class IteradorMenuGeneral{
        Hashtable<Hamburguesa, String> hamburguesasEspeciales;
        int i = 0;
        public IteradorMenuGeneral(Hashtable<Hamburguesa, String> hamburguesasEspeciales){
            this.hamburguesasEspeciales = hamburguesasEspeciales;
        }
        public Hamburguesa next(){
            return new HamburguesaRes();
        }
        public boolean hasNext(){
            return false;
        }
    }
    public MenuEspecial(Hashtable<Hamburguesa, String> hamburguesasEspeciales){
        this.hamburguesasEspeciales = hamburguesasEspeciales;
    }
    public void anadirItem(Hamburguesa hamburguesa){

    }
    public void crearIterador(){

    }
}
