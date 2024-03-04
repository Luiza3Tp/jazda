package Transport;

import Towar.Kontener;
import Towar.Magazyn;

import java.util.ArrayList;

public abstract class Transport {

    protected ArrayList<Kontener> kontenery = new ArrayList<>();


    public void przetransportuj(Magazyn z, Magazyn dokad, int iloscKontenerow){


    }
    public abstract void zaladuj(Kontener kontener);
}
//uguygjii