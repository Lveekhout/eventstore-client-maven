package nl.lveekhout.geteventstore.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import nl.lveekhout.eventstore.Adres;
import nl.lveekhout.eventstore.AdresStream;
import nl.lveekhout.eventstore.Stream;

import javax.ws.rs.core.MediaType;

/**
 * Created by eekhout.l on 08-12-2015.
 * class AdresStreamGES
 */
public class AdresStreamGES implements AdresStream {

    private String stream = null;

    public AdresStreamGES(String stream) {
        this.stream = stream;
    }

    @Override
    public void registreerAdres(Adres adres) {
    }

    @Override
    public Stream zoekAdressen() {
        Client client = Client.create(JerseyClientConfig.getClientConfig());
        ClientResponse clientResponse = client
                .resource("http://localhost:2113/streams/" + stream)
                .accept(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
        if (clientResponse.getStatus() == 200) {
            return clientResponse.getEntity(Stream.class);
        } else {
            throw new RuntimeException("Ongeldige status: " + clientResponse.getStatus());
        }
    }

    @Override
    public Adres haalAdres() {
        return null;
    }
}
