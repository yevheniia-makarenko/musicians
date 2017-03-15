package entity;

import java.util.Date;
import java.util.List;

/**
 * Created by kowalskiy on 15.03.17.
 */
public class Event {
    private String name;

    private Venue venue;

    private Date date;

    private List<Band> participants;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Venue getVenue() { return venue; }

    public void setVenue(Venue venue) { this.venue = venue; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Band> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Band> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", venue=" + venue +
                ", date=" + date +
                ", participants=" + participants +
                '}';
    }
}
