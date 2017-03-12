package service;

import dao.BandDao;
import entity.Band;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Николай on 12.03.2017.
 */
public class BandService {

    @Autowired
    BandDao bandDao;

    public Band findById(Integer id) {
        System.out.println("Method findById from bandService");
        return bandDao.findById(id);
    }

    public List<Band> findAll() {
        return bandDao.findAll();
    }

    public List<Band> findAll(List<Band> bands) {
        return bandDao.findAll(bands);
    }

    public void save(Band band) {
        bandDao.save(band);
    }

    public void save(List<Band> bands) {
        bandDao.save(bands);
    }

    public Boolean exists(Integer id) {
        return bandDao.exists(id);
    }

    public void delete(Integer id) {
        bandDao.delete(id);
    }

    public void delete(Band band) {
        bandDao.delete(band);
    }

    public void delete(List<Band> bands) {
        bandDao.delete(bands);
    }

    public Long count() {
        return bandDao.count();
    }
}
