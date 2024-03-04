package Transport;

import Towar.Kontener;
import Transport.Transport;

public class Statek extends Transport {
    private static final int POJEMNOSC = 90;

    @Override
    public void zaladuj(Kontener kontener) {
        if(kontenery.size() ==POJEMNOSC)
            return;
        kontenery.add(kontener);

    }
}
