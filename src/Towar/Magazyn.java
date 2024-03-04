package Towar;

import java.util.*;
public class Magazyn {
   private ArrayList<Kontener> magazyn = new ArrayList<>();
   private String miejscowosc;
   public String getMiejscowosc() {
      return miejscowosc;
   }

   public Magazyn(String miejscowosc) {
      this.miejscowosc = miejscowosc;
   }

   public Kontener wezKontener(){
      if(!magazyn.isEmpty())
         return magazyn.removeFirst();
      else
         return null;
   }

   public void  dodajKontener(Kontener k){
      magazyn.add(k);
   }
}
