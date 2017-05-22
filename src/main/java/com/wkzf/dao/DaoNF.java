package com.wkzf.dao;

import com.wkzf.model.ModelCountry;
import org.springframework.stereotype.Repository;

/**
 * Created by gavin on 2017/5/22.
 */
@Repository
public interface  DaoNF {
    int queryLineCount();

    int insert(ModelCountry record);

    int insertSelective(ModelCountry record);
}

