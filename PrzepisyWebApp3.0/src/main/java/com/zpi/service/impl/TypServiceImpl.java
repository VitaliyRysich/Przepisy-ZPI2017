package com.zpi.service.impl;

import com.zpi.dao.TypDao;
import com.zpi.entity.Typ;
import com.zpi.service.TypService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vitalii on 27.03.2017.
 */
@Service
public class TypServiceImpl implements TypService {
    @Autowired
    private TypDao typDao;

    @Override
    public List<Typ> getAllTyp(){
        return typDao.getAllTyp();
    }

    @Override
    public Typ getTypById(long id) {
        return typDao.getTypById(id);
    }

    @Override
    public List<Typ> getTypByNazwa(String nazwa) {
        return typDao.getTypByNazwa(nazwa);
    }

    @Override
    public Long getIdByNazwa(String nazwa) {
        return typDao.getIdByNazwa(nazwa);
    }


}
