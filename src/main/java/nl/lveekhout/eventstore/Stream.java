package nl.lveekhout.eventstore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by eekhout.l on 08-12-2015.
 * class Stream
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stream {
    private String title;
    private List<Entry> entries;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "title='" + title + '\'' +
                ", entries=" + entries +
                '}';
    }
}