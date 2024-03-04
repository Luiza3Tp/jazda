package Transport;

import Towar.Kontener;

public class Pociąg extends Transport {
    private static final int POJEMNOSC =20;

    @Override
    public void zaladuj(Kontener kontener) {
        if(kontenery.size() ==POJEMNOSC)
            return;
        kontenery.add(kontener);
    }
}
