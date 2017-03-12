package dao;

import entity.Band;

import java.util.List;

/**
 * Created by Николай on 12.03.2017.
 */
public interface BandDao {

    Band findById (Integer id);

    List<Band> findAll();

    List<Band> findAll(List<Band> bands);

    void save(Band band);

    void save(List<Band> bands);

    Boolean exists(Integer id);

    void delete(Integer id);

    void delete (Band band);

    void delete (List<Band> bands);

    Long count();


}
