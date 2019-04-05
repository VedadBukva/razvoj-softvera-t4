package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {

    public TextArea area1;
    public TextArea area2;
    public Button tipka;
    public ChoiceBox izborArtikla;
    public Spinner spiner;
    public Button tipka2;
    public TextArea finalArea;

    public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> artikal) {
        for(int i = 0; i<artikal.size(); i++) {
            for(int j = i+1; j<artikal.size(); j++) {
                if(artikal.get(i).equals(artikal.get(j))) {
                    artikal.remove(artikal.get(j));
                }
            }
        }
        return artikal;
    }

    ArrayList<Artikal> filter = new ArrayList<>();

    public void akcija(ActionEvent actionEvent) {
        String izvor = area1.getText();
        String[] artikli = izvor.split("\n");
        ArrayList<Artikal> kanta = new ArrayList<>();
        for(String element : artikli) {
            kanta.add(new Artikal(element));
        }
        filter = izbaciDuplikate(kanta);
        String rezultat = "";
        for(Artikal element : filter) {
            rezultat += element + "\n";
        }
        area2.setText(rezultat);
        //String[] izbor = rezultat.split("\n");
        String izlaz = "";
        for(Artikal a : filter) {
            izlaz += a.getSifra() + ", " + a.getNaziv() + ", " + a.getCijena();
            izborArtikla.getItems().add(a.getSifra());
        }

    }

    public void akcija2(ActionEvent actionEvent) {
        int vrijednost = (int) spiner.getValue();
        Artikal trenutniArt = new Artikal();

        for(Artikal a : filter) {
            if(a.getSifra().equals(izborArtikla.getValue())) {
                trenutniArt = a;
            }
        }
        double cijena = trenutniArt.getCijena();
        finalArea.setText(izborArtikla.getValue()+ " " + vrijednost + " " + vrijednost*cijena);
    }

}


