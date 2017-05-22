package com.wkzf.dao;

import com.wkzf.model.ModelCountry;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelCountryMapper {
    int insert(ModelCountry record);

    int insertSelective(ModelCountry record);
}