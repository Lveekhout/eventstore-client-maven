package nl.lveekhout.eventstore;

/**
 * Created by eekhout.l on 08-12-2015.
 * class AdresEvent
 */
public class AdresEvent extends Entry {
    private String eventId;
    private String eventType;
    private Adres data;

    public AdresEvent(String eventId, String eventType, Adres data) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.data = data;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Adres getData() {
        return data;
    }

    public void setData(Adres data) {
        this.data = data;
    }
}
