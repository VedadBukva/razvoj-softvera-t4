package sample;

import java.util.ArrayList;

public class Artikal {
    private String sifra;
    private String naziv;
    private Double cijena;

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

    public Artikal(String sifra, String naziv, Double cijena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Artikal{" +
                "sifra='" + sifra + '\'' +
                ", naziv='" + naziv + '\'' +
                ", cijena=" + cijena +
                '}';
    }

    Object o = new Object();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikal artikal = (Artikal) o;
        return sifra.equals(artikal.sifra) &&
                naziv.equals(artikal.naziv) &&
                cijena.equals(artikal.cijena);
    }
    Artikal artikal = (Artikal) o;

    public static izbaciDuplikate(ArrayList<String> artikal) {
        for(int i = 0; i<artikal.size(); i++) {
            for(int j = 0; j<artikal.size(); j++) {
                if(artikal.get(i).equals(artikal.get(j))) {
                    artikal.remove(i);
                }
            }
        }
    }
}
