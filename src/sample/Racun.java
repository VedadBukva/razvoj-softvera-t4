package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Racun {
    private class Stavka {
        private Artikal artikal;
        private int kolicina;

        public Stavka(Artikal artikal, int kolicina) {
            this.artikal = artikal;
            this.kolicina = kolicina;
        }

        public Artikal getArtikal() {
            return artikal;
        }

        public void setArtikal(Artikal artikal) {
            this.artikal = artikal;
        }

        public int getKolicina() {
            return kolicina;
        }

        public void setKolicina(int kolicina) {
            this.kolicina = kolicina;
        }

    }

    private ArrayList<Stavka> stavka;

    public Racun() {
        this.stavka = new ArrayList<>();
    }

    public void dodajStavku(Artikal artikal, int kolicina) {
        Stavka stavka = new Stavka(artikal, kolicina);
        this.stavka.add(stavka);
    }


    public double ukupanIznos() {
        double iznos = 0;
        for(Stavka stavka : stavka) {
            iznos += stavka.getArtikal().getCijena()*stavka.getKolicina();
        }
        return iznos;
    }

    @Override
    public String toString() {
        String output = "";
        for(Stavka stavka : stavka) {
            output += stavka.getArtikal().getSifra() + " " + stavka.getKolicina() + " " + stavka.getArtikal().getCijena()*stavka.getKolicina();
        }
        return output ;
    }
}
