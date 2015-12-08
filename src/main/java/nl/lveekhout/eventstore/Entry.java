package nl.lveekhout.eventstore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by eekhout.l on 08-12-2015.
 * class Entry
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id='" + id + '\'' +
                '}';
    }
}
