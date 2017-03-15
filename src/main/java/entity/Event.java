package entity;

import java.util.Date;
import java.util.List;

/**
 * Created by kowalskiy on 15.03.17.
 */
public class Event {
    private String name;

    private String address;

    private Date date;

    private List<Artist> participants;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Artist> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Artist> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                ", participants=" + participants +
                '}';
    }
}
