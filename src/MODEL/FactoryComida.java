package MODEL;

import java.util.ArrayList;

public class FactoryComida {

    public ArrayList<IPrototype> prototipos;

    //implementar
    public IPrototype getItem(){

        return new Combo();
    }

    public void addItem(){

    }

    public ArrayList<IPrototype>getAll(){

        return this.prototipos;
    }

}
