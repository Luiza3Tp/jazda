package Transport;

import Towar.Kontener;
import Towar.Magazyn;

public class Ciezarowka extends Transport {
    private static final int POJEMNOSC = 90;

    @Override
    public void zaladuj(Kontener kontener) {
        if(kontenery.size() ==POJEMNOSC)
            return;
        kontenery.add(kontener);
    }
    @Override
    public void przetransportuj(Magazyn z, Magazyn dokad, int iloscKontenerow) {
        if(iloscKontenerow > POJEMNOSC){
            System.out.println("za dużo tego co ty robisz?! ");
            return;
        }
        super.przetransportuj(z, dokad, iloscKontenerow);
        System.out.println("Transport odbywa sie ciezarówka <^>");

        for (int i=0; i<iloscKontenerow; i++){
            Kontener kontener = z.wezKontener();
            zaladuj(kontener);
        }


        for(Kontener k: kontenery){
            dokad.dodajKontener(k);
        }
        kontenery.clear();
    }
}
