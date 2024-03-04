import Towar.Kontener;
import Towar.Magazyn;
import Towar.Towar;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Magazyn hamburg = new Magazyn("Hamburg");
        Magazyn tokio = new Magazyn("Tokio");
        Magazyn Wrocław = new Magazyn("Wrocław");

        for(int i=0; i<100; i++){
            tokio.dodajKontener(new Kontener(Towar.KONSOLE));
        }
        for(int i=0; i<50; i++){
            tokio.dodajKontener(new Kontener(Towar.BANAY));
        }
        for(int i=0; i<40; i++){
                Wrocław.dodajKontener(new Kontener(Towar.MEBLE));
        }

    }
}