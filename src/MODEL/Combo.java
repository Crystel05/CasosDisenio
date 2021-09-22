package MODEL;

import java.util.ArrayList;

public class Combo implements IPrototype {

        private Comida platoFuerte;
        private ArrayList<Comida> adicionales;
        private ArrayList<Comida> bebidas;

    public Combo(Comida platoFuerte, ArrayList<Comida> adicionales, ArrayList<Comida> bebidas) {
        this.platoFuerte = platoFuerte;
        this.adicionales = adicionales;
        this.bebidas = bebidas;
    }

    //borrar Constructor
    public Combo() {

    }

    public Comida getPlatoFuerte() {
        return platoFuerte;
    }

    public void setPlatoFuerte(Comida platoFuerte) {
        this.platoFuerte = platoFuerte;
    }

    public ArrayList<Comida> getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(ArrayList<Comida> adicionales) {
        this.adicionales = adicionales;
    }

    public ArrayList<Comida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Comida> bebidas) {
        this.bebidas = bebidas;
    }

    //implementar
    @Override
    public Combo clone(){
        return this;
    }

    @Override
    public Combo deepClone(){
        return this;
    }
}
