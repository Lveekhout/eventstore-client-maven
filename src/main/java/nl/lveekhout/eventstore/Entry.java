package nl.lveekhout.eventstore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by eekhout.l on 08-12-2015.
 * class Entry
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    private String id;
}
