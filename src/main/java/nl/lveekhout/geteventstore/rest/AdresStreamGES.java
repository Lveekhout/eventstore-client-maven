package nl.lveekhout.geteventstore.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import nl.lveekhout.eventstore.Adres;
import nl.lveekhout.eventstore.AdresStream;
import nl.lveekhout.eventstore.Entry;
import nl.lveekhout.eventstore.Stream;

import javax.ws.rs.core.MediaType;

/**
 * Created by eekhout.l on 08-12-2015.
 * class AdresStreamGES
 */
public class AdresStreamGES implements AdresStream {

    private String host = null;
    private String stream = null;

    public AdresStreamGES(String host, String stream) {
        this.host = host;
        this.stream = stream;
    }

    @Override
    public void registreerAdres(Adres adres) {
    }

    @Override
    public Stream zoekAdressen() {
        Client client = Client.create(JerseyClientConfig.getClientConfig());
        ClientResponse clientResponse = client
                .resource(String.format("http://%s/streams/%s", host, stream))
                .accept("application/vnd.eventstore.atom+json")
                .get(ClientResponse.class);
        if (clientResponse.getStatus() == 200) {
            return clientResponse.getEntity(Stream.class);
        } else {
            throw new RuntimeException("Ongeldige status: " + clientResponse.getStatus());
        }
    }

    @Override
    public Adres haalAdres(String url) {
        Client client = Client.create(JerseyClientConfig.getClientConfig());
        ClientResponse clientResponse = client
                .resource(url)
                .accept(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
        if (clientResponse.getStatus() == 200) {
            return clientResponse.getEntity(Adres.class);
        } else {
            throw new RuntimeException("Ongeldige status: " + clientResponse.getStatus());
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        Stream stream1 = zoekAdressen();
        builder.append(String.format("%s\n", stream1.getTitle()));
        for (Entry entry : stream1.getEntries()) {
            builder.append(String.format("\t- %s\n", entry.getId()));
            builder.append(String.format("\t\t- %s\n", haalAdres(entry.getId())));
        }

        return builder.toString();
    }
}
