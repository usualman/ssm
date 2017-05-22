package com.wkzf.service;

import com.wkzf.dao.DaoNF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gavin on 2017/5/22.
 */
@Service
public class TestService {
    @Autowired
    DaoNF daoNF;

    public String serviceQuery(){
        return daoNF.queryLineCount()+"";
    }
}
