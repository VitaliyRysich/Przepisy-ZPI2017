package com.zpi.service;

import com.zpi.dto.NewDBRecords;
import com.zpi.entity.Przepis;

/**
 * Created by dima on 3/30/17.
 */
public interface PrzepisService {

    Przepis getPrzepisById(long id);
    void insertPrzepis(NewDBRecords newDBRecords);
}
