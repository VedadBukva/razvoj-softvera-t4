package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {
    @Override
    Artikal.izbaciDuplikate()

    public TextArea area1;
    public TextArea area2;
    public Button tipka;

    public void akcija(ActionEvent actionEvent) {
        String izvor = area1.getText();
        String[] artikli = izvor.split("\n");
        ArrayList<Artikal> kanta = new ArrayList<>();
        for(String element : artikli) {
            kanta.add(new Artikal(element));
        }
        String rezultat = "";
        for(Artikal )
        tipka.setOnAction();

    }
}
