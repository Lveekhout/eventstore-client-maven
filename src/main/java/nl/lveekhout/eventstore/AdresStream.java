package nl.lveekhout.eventstore;

/**
 * Created by eekhout.l on 08-12-2015.
 * interface AdresStream
 */
public interface AdresStream {

    void registreerAdres(Adres adres);
    Stream zoekAdressen();
    Adres haalAdres(String url);
}
