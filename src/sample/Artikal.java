package sample;

import java.util.ArrayList;

public class Artikal {
    private String sifra;
    private String naziv;
    private Double cijena;

    public Artikal() {

    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Double getCijena() {
        return cijena;
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
    }

    public Artikal(String podatak) {
        String[] artikal = podatak.split(",");
        sifra = artikal[0];
        naziv = artikal[1];
        cijena = Double.parseDouble(artikal[2]);
    }

    @Override
    public String toString() {
        return sifra+","+naziv+","+cijena;
    }

    //Object o = new Object();

    @Override
    public boolean equals(Object o) {
        Artikal a = (Artikal) o;
        if (this == o) return true;
        if (!naziv.equals(a.getNaziv())) return false;
        if (!sifra.equals(a.getSifra())) return false;

        if (Double.compare(cijena, a.getCijena()) != 0) return false;
        return true;
    }
    /*public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> artikal) {
        for(int i = 0; i<artikal.size(); i++) {
            for(int j = i+1; j<artikal.size(); j++) {
                if(artikal.get(i).equals(artikal.get(j))) {
                    artikal.remove(artikal.get(j));
                }
            }
        }
        return artikal;
    }*/
}
