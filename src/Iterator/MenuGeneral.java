package Iterator;

import Template.*;

public class MenuGeneral {
    Hamburguesa[] hamburguesasGeneral;
    public class IteradorMenuGeneral{
        Hamburguesa[] hamburguesasGeneral;
        int i = 0;
        public IteradorMenuGeneral(Hamburguesa[] hamburguesasGeneral){
            this.hamburguesasGeneral = hamburguesasGeneral;
        }
        public Hamburguesa next(){
            return new HamburguesaRes();
        }
        public boolean hasNext(){
            return false;
        }
    }
    public MenuGeneral(Hamburguesa[] hamburguesasGeneral){
        this.hamburguesasGeneral = hamburguesasGeneral;
    }
    public void anadirItem(Hamburguesa hamburguesa){

    }
    public void crearIterador(){

    }
}
