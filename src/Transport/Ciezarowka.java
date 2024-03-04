package Transport;

import Towar.Kontener;

public class Ciezarowka extends Transport {
    private static final int POJEMNOSC = 90;

    @Override
    public void zaladuj(Kontener kontener) {
        if(kontenery.size() ==POJEMNOSC)
            return;
        kontenery.add(kontener);
    }
}
