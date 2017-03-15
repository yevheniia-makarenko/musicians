package dao;

import entity.Event;

import java.util.List;

/**
 * Created by admin on 15.03.2017.
 */
public interface EventDao {

    Event findById(int id);

    List<Event> findAll();

    void save(Event event);

    void delete(int id);
}

