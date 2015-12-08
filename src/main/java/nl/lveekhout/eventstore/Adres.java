package nl.lveekhout.eventstore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by eekhout.l on 08-12-2015.
 * class Adres
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Adres {
    private String naam;
    private String straatnaam;
    private String huisnummer;
    private String woonplaats;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "naam='" + naam + '\'' +
                ", straatnaam='" + straatnaam + '\'' +
                ", huisnummer=" + huisnummer +
                ", woonplaats='" + woonplaats + '\'' +
                '}';
    }
}
