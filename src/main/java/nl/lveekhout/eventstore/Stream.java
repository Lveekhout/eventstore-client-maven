package nl.lveekhout.eventstore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by eekhout.l on 08-12-2015.
 * class Stream
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stream {
    private String title;
    private Entry entries;

    public String getTitle() {
        return title;
    }

    public Entry getEntries() {
        return entries;
    }
}